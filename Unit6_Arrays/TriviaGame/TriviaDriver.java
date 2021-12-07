package Unit6_Arrays.TriviaGame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException{
        TriviaGame myNewGame = new TriviaGame();
        Question[] questions = myNewGame.getAllQuestions();

        System.out.println("welcome to the party it gon be lit!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want a question?");
        int lol = 0;
        System.out.println(questions[lol]);
        /*for (Question s: questions) {
            System.out.println(s);
        }*/


    }

    public static void welcomeToTheQuiz(){
        System.out.println("**** WELCOME TO SAMMY'S EPIC NFL QUIZ! ****");
        System.out.println();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you want to play? (Type Y or N)");
        String wantToPlay = userInput.nextLine();

        boolean isDone = true;

        while(isDone){
            if(wantToPlay.equalsIgnoreCase("y")){
                
            }else{
                System.out.println("Ur kinda weird dawg the quiz is lit.");
            }
        }


    }





}

