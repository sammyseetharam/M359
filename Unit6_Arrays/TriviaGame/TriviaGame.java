package Unit6_Arrays.TriviaGame;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TriviaGame{
    private Question[] allQuestions;
    private static int totalPts = 0;
    private static int currStreak = 0;

    public TriviaGame(Question[] allQuestions) {
        this.allQuestions = allQuestions;
    }

    public static Question[] fillArray() throws FileNotFoundException {
        File questionData = new File("Trivia.txt");
        //Start reading the data
        Scanner readMe = new Scanner(questionData);

        int questionCount = readMe.nextInt();
        readMe.nextLine();
        System.out.println("There are this many questions in this quiz" + questionCount);

        TriviaGame[] allQuestions = new TriviaGame[questionCount];

        Question[] problems = new Question[10];

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
         allQuestions[questionCount] = new TriviaGame(problems);
         questionCount ++;
    }

    
}
