package Unit6_Arrays.TriviaGame;

import Unit6_Arrays.CourseExample.Student;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TriviaGame{
    private Question[] allQuestions;
    private static int totalPts = 0;
    private static int currStreak = 0;

    public TriviaGame() {
    }


    public void fillArray(String txtFile) throws FileNotFoundException {
        File questionData = new File(txtFile);
        //Start reading the data
        Scanner readMe = new Scanner(questionData);

        Question[] problems = new Question[9];
        for (int i = 0; i < 9; i++) {
            Question myNewQuestion = new Question(
                    readMe.nextLine(), //question
                    readMe.nextLine(), //choice a
                    readMe.nextLine(), //choice b
                    readMe.nextLine(), //choice c
                    readMe.nextLine(), //choice d
                    readMe.nextInt(), // pt val
                    readMe.nextLine()); // correct answer

            if (readMe.hasNextLine()) {
                readMe.nextLine();
            }
            problems[i] = myNewQuestion;
        }
        allQuestions = problems;
        System.out.println(allQuestions);
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
