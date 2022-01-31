package Unit7_ArrayList.examples;

import java.util.ArrayList;

public class inserstionSort {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(6);
        nums.add(4);

        insertionSort(nums);
        System.out.println(nums);
    }

    public static void insertionSort(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            Integer valueToSort = list.get(i);

            int pos = i;
            while (pos > 0 && list.get(pos - 1) > valueToSort){
                list.set(pos, list.get(pos - 1)); //shift right
                pos--; //be able to answer how many times does this statement run?
            }

            // means we found the correct position (pos) for valueToInsert
            list.set(pos, valueToSort);
        }
    }
}
