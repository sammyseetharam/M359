package Unit6_Arrays.TriviaGame;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TriviaGame{
    public Question[] allQuestions;
    //Static variables to keep track of points and streak.
    public static int totalPts = 0;
    public static int currStreak = 0;

    //Creates the triviaGame object based of the fillArray method
    public TriviaGame() throws FileNotFoundException {
        allQuestions = fillArray();
    }

    public Question[] getAllQuestions() {
        return allQuestions;
    }

    public void setAllQuestions(Question[] allQuestions) {
        this.allQuestions = allQuestions;
    }

    /**
     * This method is intended to read in all the information from a text file to an array
     * @return the filled array with a question object at every index
     */
    public Question[] fillArray() throws FileNotFoundException {
        File questionData = new File("Trivia.txt");
        //Start reading the data
        Scanner readMe = new Scanner(questionData);

        Question[] problems = new Question[12];
        for (int i = 0; i < 12; i++) {
            Question myNewQuestion = new Question(
                    readMe.nextLine(), //question
                    readMe.nextLine(), //choice a
                    readMe.nextLine(), //choice b
                    readMe.nextLine(), //choice c
                    readMe.nextLine(), //choice d
                    readMe.nextLine(), // pt val
                    readMe.nextLine()); // correct answer

            /*
            if(readMe.hasNextLine()){
                readMe.nextLine();
            }*/
            problems[i] = myNewQuestion;
        }
        return(problems);
    }
}
