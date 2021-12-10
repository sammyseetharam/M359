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

        if(wantToPlay.equalsIgnoreCase("y")){
                System.out.println("Excellent, so here is your first question:");
                System.out.println();
                questionChecker();
            }else{
                System.out.println("Ur kinda weird dawg the quiz is lit.");
            }
    }

    public static void questionChecker() throws FileNotFoundException{
        TriviaGame myNewGame = new TriviaGame();
        Question[] questions = myNewGame.getAllQuestions();

        boolean isDone = true;
        while (isDone) {

            int randomIncrement = 12;
            int random = (int) (Math.random() * randomIncrement) + 1;
            int prevRandom = random;

            Question ask = questions[random];

            Scanner ans1 = new Scanner(System.in);
            System.out.println(ask);
            System.out.println(ask.getCorrect());
            String response = ans1.nextLine();

                if(response.equalsIgnoreCase(ask.getCorrect())) {
                    TriviaGame.currStreak++;
                    TriviaGame.totalPts += ask.getPtVal();
                    System.out.println("Nice you got it right, that's +" + ask.getPtVal() + " points.");
                    System.out.println("You have earned: " + TriviaGame.totalPts + " so far.");
                    System.out.println("You have a " + TriviaGame.currStreak + " question answer streak so far.");
                }else{
                    TriviaGame.totalPts -= ask.getPtVal();
                    TriviaGame.currStreak = 0;
                    System.out.println("Oh no, you got it wrong, that's -" + ask.getPtVal() + " points.");
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
