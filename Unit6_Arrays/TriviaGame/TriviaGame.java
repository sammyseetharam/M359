package Unit6_Arrays.TriviaGame;

import Unit6_Arrays.CourseExample.Student;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TriviaGame{
    public Question[] allQuestions;
    public static int totalPts = 0;
    public static int currStreak = 0;

    public TriviaGame() throws FileNotFoundException {
        allQuestions = fillArray();
    }

    public Question[] getAllQuestions() {
        return allQuestions;
    }

    public void setAllQuestions(Question[] allQuestions) {
        this.allQuestions = allQuestions;
    }

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

    public static void printAllQuestions(Question[] allQuestions){
        for (Question q:allQuestions) {
            if(q != null){
                System.out.println(q);
                System.out.println();
            }
        }
    }
}
