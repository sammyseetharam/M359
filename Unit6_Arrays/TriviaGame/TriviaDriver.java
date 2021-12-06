package Unit6_Arrays.TriviaGame;
import java.io.File;
import java.io.FileNotFoundException;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException{
        Question test = new Question("Whats my name?", "Joe", "Jim", "Bob", "Sammy", 1, "Sammy");
        System.out.println(test);

        TriviaGame myNewGame = new TriviaGame();
        myNewGame.fillArray("Trivia.txt");

    }
}
