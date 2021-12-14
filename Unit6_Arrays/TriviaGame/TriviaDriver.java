package Unit6_Arrays.TriviaGame;
import javax.swing.table.TableRowSorter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException{
        welcomeToTheQuiz();


        /*
        TriviaGame myNewGame = new TriviaGame();
        Question[] questions = myNewGame.allQuestions;
        for (Question s: questions) {
            System.out.println(s);
        }
            */

    }

    public static void addDivider(){
        System.out.println("--------------");
    }

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

    public static void welcomeToTheQuiz() throws FileNotFoundException{
        System.out.println("**** WELCOME TO SAMMY'S EPIC NFL QUIZ! ****");
        System.out.println();
        Scanner nameInput = new Scanner(System.in);
        System.out.println("What's your name young slatty slimeski?");
        String userName = nameInput.nextLine();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey "+ userName + ", do you want to play my quiz? (Type Y or N)");
        String wantToPlay = userInput.nextLine();

        if(wantToPlay.equalsIgnoreCase("y")){
                gameInstructions();
                System.out.println("Excellent, so here is your first question:");
                System.out.println();

                TriviaGame myNewGame = new TriviaGame();
                Question[] questions = myNewGame.getAllQuestions();
                questionChecker(myNewGame, questions);
            }else{
                System.out.println("Ur kinda weird dawg the quiz is lit.");
            }
    }

    public static void questionChecker(TriviaGame newGame, Question[] questions) throws FileNotFoundException{
        int count = 1;
        int correct = 0;
        int randomIncrement = 11;
        int random = (int) (Math.random() * randomIncrement) + 0;
        int prevRandom = random;


        boolean isDone = true;
        while (isDone) {

            Question ask = questions[random];
            //Controls user input of the game.
            Scanner ans1 = new Scanner(System.in);
            System.out.println(ask);
            String response = ans1.nextLine();
            String right = ask.getCorrect();

            if(response.equalsIgnoreCase(right)) {
                    correct++;
                    TriviaGame.currStreak++;
                    //Converts the integer
                    TriviaGame.totalPts += Integer.valueOf(ask.getPtVal());
                    System.out.println("Nice you got it right, that's +" + ask.getPtVal() + " points.");
                    System.out.println("You have earned: " + TriviaGame.totalPts + " so far.");
                    System.out.println("You have a " + TriviaGame.currStreak + " question answer streak so far.");
                }else{
                    TriviaGame.totalPts -= Integer.valueOf(ask.getPtVal());
                    TriviaGame.currStreak = 0;
                    System.out.println("Oh no, you got it wrong, that's -" + ask.getPtVal() + " points.");
                    System.out.println("You have earned: " + TriviaGame.totalPts + " so far.");
                    System.out.println("You have a " + TriviaGame.currStreak + " question answer streak so far.");
                }

                if(count == 12){
                    System.out.println("Nice, you have finished all the questions in the quiz!");
                    isDone = false;
                }

                Scanner next = new Scanner(System.in);
                System.out.println("Do you want to continue or end? (Y or N)");
                String nextInput = next.nextLine();

                if(nextInput.equalsIgnoreCase("y")){
                    random = (int) (Math.random() * randomIncrement) + 0;
                        count++;

                        if(random != prevRandom){
                            prevRandom = random;
                        }

                }else{
                    System.out.println("Total points earned: " + TriviaGame.totalPts + ".");
                    System.out.println("You answered " + correct + " questions correctly.");
                    double percentage = (double) correct/ count;
                    System.out.println("You answered " + (int)percentage * 100 + "% questions correctly.");
                    //do the restarting thing. 
                    isDone = false;
                    }
            }
        }
    }

