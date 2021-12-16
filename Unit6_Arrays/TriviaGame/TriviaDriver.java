package Unit6_Arrays.TriviaGame;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TriviaDriver {

    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE


    //Simple and efficient main method
    public static void main(String[] args) throws FileNotFoundException{
        welcomeToTheQuiz();
    }

    /**
     * This method welcomes prints out the game information for the user.
     * @return It doesn't return anything, just prints
     */
    public static void gameInstructions(){
        System.out.println();
        System.out.println();
        System.out.println("****INSTRUCTIONS****");
        System.out.println("To play my game press a letter A, B, C, or D to indicate which answer you would like to select.");
        System.out.println("Once you've selected an answer, it will be checked and if correct, the points will be added to your total as well as updating your answer streak.");
        System.out.println("You can exit the game anytime you want and re - play.");
        System.out.println("Have Fun!!!");
        System.out.println();
    }

    /**
     * This method controls a lot of the intro gameplay and gets the user started.
     * @return It doesn't return anything, just prints
     */
    public static void welcomeToTheQuiz() throws FileNotFoundException{
        System.out.println("**** WELCOME TO SAMMY'S EPIC NFL QUIZ! ****");
        System.out.println();
        Scanner nameInput = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = nameInput.nextLine();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey "+ userName + ", do you want to play my quiz? (Type Y or N)");
        System.out.println();
        String wantToPlay = userInput.nextLine();

        if(wantToPlay.equalsIgnoreCase("y")){
            gameInstructions();
            System.out.println("Excellent, so here is your first question:");
            System.out.println();

            TriviaGame myNewGame = new TriviaGame();
            Question[] questions = myNewGame.getAllQuestions();
            questionChecker(questions);
        }else{
            System.out.println("Okay then, have a nice day!");
        }
    }

    /**
     * This method is the backbone of the class and is responsible for randomizing, marking as used, and checking questions.
     * @param questions: Name of the questions array being tested
     * @return It doesn't return anything, just prints information about each questions and updates to the user's point values.
     */
    public static void questionChecker( Question[] questions) throws FileNotFoundException{
        int count = 1;
        int correct = 0;
        int randomIncrement = 12;
        int random = (int) (Math.random() * randomIncrement) + 0;


        boolean isDone = true;
        while (isDone) {

            System.out.println();
            Question ask = questions[random];
            //Controls user input of the game.
            Scanner ans1 = new Scanner(System.in);
            System.out.println(ask);
            String response = ans1.nextLine();
            String right = ask.getCorrect();
            ask.setUsed(true);

            if(response.equalsIgnoreCase(right)) {
                correct++;
                TriviaGame.currStreak++;
                //Converts the integer
                TriviaGame.totalPts += Integer.valueOf(ask.getPtVal());
                System.out.println();
                String output = ("Nice " + response.toUpperCase(Locale.ROOT) + ", is right. That would be +" + ask.getPtVal() + " points.");
                System.out.println(GREEN + output);
                System.out.println("****Current Score****");
                System.out.println("You have earned: " + TriviaGame.totalPts + " so far.");
                System.out.println("You have a " + TriviaGame.currStreak + " question answer streak so far." + RESET);
            }else{
                TriviaGame.totalPts -= Integer.valueOf(ask.getPtVal());
                TriviaGame.currStreak = 0;
                System.out.println();
                System.out.println(RED + "Oh no, you got it wrong, " + right.toUpperCase() + " is the right answer" + " that's -" + ask.getPtVal() + " points.");
                System.out.println("****Current Score****");
                System.out.println("You have earned: " + TriviaGame.totalPts + " so far.");
                System.out.println("You have a " + TriviaGame.currStreak + " question answer streak so far." + RESET);
            }

            if(count == 12){
                endGameSummary(count, correct);
                isDone = false;
                break;
            }

            System.out.println();
            Scanner next = new Scanner(System.in);
            System.out.println("Do you want to continue or end? (Yes or End)");
            String nextInput = next.nextLine();

            //Catches the input when the user does not type yes or no
            if(nextInput.equalsIgnoreCase("yes") != true && nextInput.equalsIgnoreCase("End") != true){
                System.out.println("Oh no, looks like you mis-typed, Retype your choice:");
                nextInput = next.nextLine();
            }

            if(nextInput.equalsIgnoreCase("yes")){
                random = (int) (Math.random() * randomIncrement) + 0;
                count++;
                while(questions[random].isUsed() == true) {
                    random = (int) (Math.random() * randomIncrement) + 0;
                }
                // at this point, random is guaranteed to be good
            }else{
                endGameSummary(count, correct);
                //do the restarting thing.
                isDone = false;
                break;
            }
        }
    }


    /**
     * This method is a summary of the users point values at the end when they stop playing
     * @param count
     * @param correct
     * @return this doesn't return but instead prints out the total points earned, # of correctly answered questions, a final percentage.
     */
    public static void endGameSummary(int count, int correct){
        System.out.println();
        System.out.println(YELLOW+ "****Final Score****");
        System.out.println("Total points earned: " + TriviaGame.totalPts + ".");
        System.out.println("You answered " + correct + "/" + count + " questions correctly.");
        double percentage = (double) correct/ count;
        System.out.println("You answered " + (int)(percentage * 100) + "% questions correctly." + RESET);
    }

}

