package Unit7_ArrayList.TicketMasterLab;

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
        int count = 0;
        Scanner askSearch = new Scanner(System.in);
        System.out.println("Choose a city: ");
        String askInput = askSearch.nextLine();

        for(int i = 0; i  < list.size(); i++){
            if((list.get(i).getCity()).equalsIgnoreCase(askInput)){
                displayVenue.add(list.get(i));
                count ++;
            }
        }
        if(count != 0) {
            return displayVenue;
        }else{
            System.out.println("There were no cities in the area :(");
            return displayVenue;
        }
    }

    public void selectionSortA_Z(){
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j).getPerformer().compareTo(list.get(minIndex).getPerformer()) < 0){
                    minIndex = j;
                }
            }
            //swap values at i and min index
            Show temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);

        }
    }

    public void selectionSortZ_A(){
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j).getPerformer().compareTo(list.get(minIndex).getPerformer()) > 0){
                    minIndex = j;
                }
            }
            //swap values at i and min index
            Show temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }

    public void insertionSortL_H(){
        for (int j = 1; j < list.size(); j++)
        {
            Show temp = list.get(j);
            int possibleIndex = j;

            while (possibleIndex > 0 && temp.getPrice() < list.get(j-1).getPrice())
            {
                list.set(possibleIndex,list.get(possibleIndex -1));
                possibleIndex--;
            }
            list.set(possibleIndex,temp);
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
