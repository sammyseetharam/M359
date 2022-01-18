package Unit7_ArrayList.TicketMasterLab;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> list;

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

    public void citySearch(){
        ArrayList<Show> displayVenue = new ArrayList<>();

        Scanner askSearch = new Scanner(System.in);
        System.out.println("City Search: ");
        String askInput = askSearch.nextLine();

        for(int i = 0; i  < list.size(); i++){
            if((list.get(i).getCity()).equalsIgnoreCase(askInput)){
                displayVenue.add(list.get(i));
            }
        }
        System.out.println(displayVenue.toString());
    }

    public void performerSort(){
        ArrayList<Show> displayArtist = new ArrayList<>();

        Scanner ask = new Scanner(System.in);
        System.out.println("Which performer would you like to see?");
        String output = ask.nextLine();
    }

    public void sortByPrice(){
        ArrayList<Double> sortUp= new ArrayList<Double>();

        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) ){

            }
        }

    }



    public String toString(){
        String result = "";
        for (Show b: list) {
            result += b;
        }
        return result;
    }

}
