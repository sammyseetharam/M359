package Unit6_Arrays.TriviaGame;
import java.io.File;
import java.io.FileNotFoundException;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException{
        TriviaGame myNewGame = new TriviaGame();
        Question[] questions = myNewGame.getAllQuestions();

        for (Question s: questions) {
            System.out.println(s);
        }
    }


}

