package Unit7_ArrayList.examples;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class selectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(3);
        test.add(4);
        test.add(1);
        test.add(6);
        test.add(2);

        selectionSort(test);
        System.out.println(test);
    }

    public static void selectionSort(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j) < list.get(minIndex)){
                    minIndex = j;
                }
            }

            //swap values at i and min index
            Integer temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}
