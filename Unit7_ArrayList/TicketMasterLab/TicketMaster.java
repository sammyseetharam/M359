package Unit7_ArrayList.TicketMasterLab;

import jdk.nashorn.internal.runtime.SharedPropertyMap;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMaster {
    private static ArrayList<Show> list;

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

    public static ArrayList<Show> citySearch(){
        ArrayList<Show> displayVenue = new ArrayList<>();

        Scanner askSearch = new Scanner(System.in);
        System.out.println("Choose a city: ");
        String askInput = askSearch.nextLine();

        for(int i = 0; i  < list.size(); i++){
            if((list.get(i).getCity()).equalsIgnoreCase(askInput)){
                displayVenue.add(list.get(i));
            }
        }
        return displayVenue;
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
            //if(list.get(i) ){

            }
        }

   // }

    public static void selectionSort(ArrayList<Show> list){
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < list.size(); j++){

                if(list.get(j).getPerformer().indexOf(list.get(j).getPerformer().substring(0,1))
                        < list.get(minIndex).getPerformer().indexOf(list.get(minIndex).getPerformer().substring(0,1))){
                    minIndex = j;
                }
            }

            //swap values at i and min index
            Integer temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
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
