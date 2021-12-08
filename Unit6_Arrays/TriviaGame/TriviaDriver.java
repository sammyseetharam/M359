package Unit6_Arrays.TriviaGame;
import javax.swing.table.TableRowSorter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException{

        welcomeToTheQuiz();
        /*for (Question s: questions) {
            System.out.println(s);
        }*/


    }

    public static void addDivider(){
        System.out.println("--------------");
    }

    public static void welcomeToTheQuiz() throws FileNotFoundException{
        System.out.println("**** WELCOME TO SAMMY'S EPIC NFL QUIZ! ****");
        System.out.println();
        Scanner nameInput = new Scanner(System.in);
        System.out.println("What's your name young slime?");
        String userName = nameInput.nextLine();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey "+ userName + ", do you want to play my quiz? (Type Y or N)");
        String wantToPlay = userInput.nextLine();

        boolean isDone = true;



        while(isDone){
            if(wantToPlay.equalsIgnoreCase("y")){
                System.out.println("Excellent, so here is your first question:");
                System.out.println();
                questionChecker();
                questionChecker();
            }else{
                System.out.println("Ur kinda weird dawg the quiz is lit.");
            }
        }


    }

    public static void questionChecker() throws FileNotFoundException{
        TriviaGame myNewGame = new TriviaGame();
        Question[] questions = myNewGame.getAllQuestions();

        int randomIncrement = 11;
        int random = (int) Math.random() * randomIncrement + 1;
        int prevRandom = random;

        Question question = questions[random];
        Scanner ans1 = new Scanner(System.in);
        System.out.println(question);
        String response = ans1.nextLine();

        boolean isDone = true;
        while (isDone) {
                if(response.equalsIgnoreCase(question.getCorrect())) {
                    TriviaGame.currStreak++;
                    TriviaGame.totalPts += question.getPtVal();
                    System.out.println("Nice you got it right, that's +" + question.getPtVal() + " points.");
                    System.out.println("You have earned: " + TriviaGame.totalPts + " so far.");
                    System.out.println("You have a " + TriviaGame.currStreak + " question answer streak so far.");
                }else{
                    TriviaGame.totalPts -= question.getPtVal();
                    TriviaGame.currStreak = 0;
                    System.out.println("Oh no, you got it wrong, that's -" + question.getPtVal() + " points.");
                    System.out.println("You have earned: " + TriviaGame.totalPts + " so far.");
                    System.out.println("You have a " + TriviaGame.currStreak + " question answer streak so far.");
                }
                    Scanner next = new Scanner(System.in);
                    System.out.println("Do you want to continue? (Y or N)");
                    String nextInput = next.nextLine();

                    if(nextInput.equalsIgnoreCase("y")){
                        randomIncrement--;
                        random = (int) Math.random() * randomIncrement + 1;
                        while(random != prevRandom){
                            prevRandom = random;
                            Scanner nextQuestion = new Scanner(System.in);
                            System.out.println(questions[random]);
                            response = nextQuestion.nextLine();
                            random = prevRandom;
                        }
                    }else{
                        isDone = false;
                    }
            }
        }
    }

