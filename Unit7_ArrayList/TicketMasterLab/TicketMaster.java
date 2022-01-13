package Unit7_ArrayList.TicketMasterLab;
import Unit6_Arrays.TriviaGame.Question;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMaster {
    public static ArrayList<Show> list = new ArrayList<Show>();

    public TicketMaster(ArrayList list) {
        this.list = list;
    }

    public static Show fillArrayList() throws FileNotFoundException {
        File showData = new File("showData.txt");

        Scanner readMe = new Scanner(showData);
        

    }

}
