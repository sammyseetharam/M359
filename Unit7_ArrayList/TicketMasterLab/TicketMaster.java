package Unit7_ArrayList.TicketMasterLab;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMaster {
    public ArrayList<Show> list;

    public TicketMaster() {
        this.list = new ArrayList<Show>();
    }

    public TicketMaster(ArrayList list) {
        this.list = list;
    }

    public void fillArrayList() throws FileNotFoundException {
        File showData = new File("showData.txt");
        Scanner readMe = new Scanner(showData);

        while(readMe.hasNext()){
            String date = readMe.next();
            double price = readMe.nextDouble();
            int qty = readMe.nextInt();
            String finder = readMe.nextLine();
            int comma =  finder.indexOf(",");
            String name = finder.substring(0, comma);
            String venue = finder.substring(comma + 2);
            Show enter = new Show(date, price, qty,name, venue);
            list.add(enter);
        }
    }

    public String toString(){
        String result = "";

        for (Show b: list) {
            result += b + "\n";
        }
        return result;
    }

}
