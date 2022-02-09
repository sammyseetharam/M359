package Unit7_ArrayList.examples;

import java.util.ArrayList;

/**
 * In this java file we will explore these key algorithms with ArrayLists
 * Determine a minimum or maximum value
 * Compute a sum, average, or mode
 * Determine if at least one element has a particular property
 * Determine if all elements have a particular property
 * Access all consecutive pairs of elements
 * Determine the presence or absence of duplicate elements
 * Determine the number of elements meeting specific criteria
 * (already did this last lesson with evens)
 * Shift or rotate elements left or right
 * Reverse the order of the elements
 */
public class Examples_7_4 {
    public static void main(String[] args) {

        // Define ArrayLists to be used for testing the methods
        ArrayList<Integer> numsNoRepeats = new ArrayList<>();
        numsNoRepeats.add(2);
        numsNoRepeats.add(5);
        numsNoRepeats.add(3);
        numsNoRepeats.add(8);
        numsNoRepeats.add(9);
        numsNoRepeats.add(1);


        ArrayList<Integer> numsRepeats = new ArrayList<>();
        numsRepeats.add(2);
        numsRepeats.add(5);
        numsRepeats.add(1);
        numsRepeats.add(2);
        numsRepeats.add(6);
        numsRepeats.add(8);


        ArrayList<Integer> orderedNums = new ArrayList<>();
        orderedNums.add(2);
        orderedNums.add(3);
        orderedNums.add(8);
        orderedNums.add(11);
        orderedNums.add(15);
        orderedNums.add(19);


        ArrayList<String> names = new ArrayList<>();
        names.add("Mya");
        names.add("Adi");
        names.add("Kim");
        names.add("Sanjana");
        names.add("Adi");
        names.add("Noah");

        System.out.println("No repeats: " + numsNoRepeats);
        System.out.println("Repeats" + numsRepeats);
        System.out.println("Ordered" + orderedNums);
        System.out.println("Names" + names);

        System.out.println("Min: " + findMin(numsNoRepeats));
        System.out.println("Max: " + findMax(numsNoRepeats));
        System.out.println("Sum: " + findSum(numsNoRepeats));
        System.out.println("Avg: " + findAverage(numsNoRepeats));
        System.out.println("Increase: " + isIncreasing(numsNoRepeats));
        System.out.println("Increase: " + isIncreasing(orderedNums));
        System.out.println("duplicate: " + hasDuplicates(names));
        System.out.println("Reverse: " + revArrayList(names));

        System.out.println("Before: " + names);
        shiftLeft(names);
        System.out.println("After: " + names);

        System.out.println("Before: " + names);
        shiftRight(names);
        System.out.println("After: " + names);

    }

    /**
     * Finds the smallest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMin(ArrayList<Integer> list) {
        int benjamin = list.get(0);

        for(int i = 1; i < list.size(); i++){
            if(list.get(i) < benjamin){
                benjamin = list.get(i);
            }
        }
        return benjamin;
    }

    /**
     * Finds the largest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMax(ArrayList<Integer> list) {
        int bigbodybenz = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) > bigbodybenz){
                bigbodybenz = list.get(i);
            }
        }
        return bigbodybenz;
        }

    /**
     * Finds the sum of all values in the ArrayList
     * @param list
     * @return returns the int value for the sum
     */
    public static int findSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    /**
     * Finds the average as a double of all Integer values
     * @param list
     * @return double average value
     */
    public static double findAverage(ArrayList<Integer> list) {
         int find = findSum(list);

         return (double)find / list.size();
    }

    /**
     * Determines if all values are in increasing order
     * @param list
     * @return true or false if increasing
     */
    public static boolean isIncreasing(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i+1) < list.get(i)){
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if any values within the ArrayList are repeated anywhere else
     * in the ArrayList
     * @param list
     * @return true if any values are repeated, false otherwise
     */
    public static boolean hasDuplicates(ArrayList<String> list) {
        boolean check = false;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    check = true;
                }
            }
        }
        if(check == true){
            return check;
        }
        return check;
    }

    /**
     * Creates a new ArrayList of Strings that is equal to the original ArrayList
     * in reverse order.  Original ArrayList is unchanged.
     * @param list
     * @return new ArrayList of Strings in reverse order
     */
    public static ArrayList<String> revArrayList(ArrayList<String> list) {
        ArrayList<String> rev = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            rev.add(list.get(i));
        }
        return rev;
    }


    /**
     * Shifts all values in list to the Left and the value at index 0 is moved
     * to index list.size() - 1.
     * @param list
     */
    public static void shiftLeft(ArrayList<String> list) {
        String special = list.get(list.size()-1);
        list.set(list.size() - 1, list.get(0));

        for (int i = 0; i < list.size() -1; i++) {
            list.set(i, list.get(i + 1));
        }
        list.set(list.size()-2, special);
    }


    public static void shiftRight(ArrayList<String> list){
            //make temp variable to hold last element
            String temp = list.get(list.size()-1);

            //make a loop to run through the array list
            for(int i = list.size()-1; i > 0; i--)
            {
                //set the last element to the value of the 2nd to last element
                list.set(i,list.get(i-1));

                //set the first element to be the last element
                list.set(0, temp);
            }


    }

}
