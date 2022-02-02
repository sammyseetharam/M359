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

    public static ArrayList<Show> citySearch(String choice){
        ArrayList<Show> displayVenue = new ArrayList<>();
        int count = 0;

        for(int i = 0; i  < list.size(); i++){
            if((list.get(i).getCity()).equalsIgnoreCase(choice)){
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

    public void insertionSortH_L(){
        for (int i = 0; i < list.size(); i++) {
            Show valueToSort = list.get(i);

            int pos = i;
            while (pos > 0 && list.get(pos - 1).getPrice() > valueToSort.getPrice()){
                list.set(pos, list.get(pos - 1)); //shift right
                pos--; //be able to answer how many times does this statement run?
            }

            // means we found the correct position (pos) for valueToInsert
            list.set(pos, valueToSort);
        }
    }

    public void insertionSortL_H(){
        for (int i = 0; i < list.size(); i++) {
            Show valueToSort = list.get(i);

            int pos = i;
            while (pos > 0 && list.get(pos - 1).getPrice() < valueToSort.getPrice()){
                list.set(pos, list.get(pos - 1)); //shift right
                pos--; //be able to answer how many times does this statement run?
            }

            // means we found the correct position (pos) for valueToInsert
            list.set(pos, valueToSort);
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
