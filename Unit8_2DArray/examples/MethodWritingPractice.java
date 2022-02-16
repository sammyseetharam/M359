package Unit8_2DArray.examples;

public class MethodWritingPractice {
    public static void main(String[] args) {
        int[][] myNums = {{9, 7, 23, 5},
                {29, 8, 22, 20},
                {15, 19, 21, 7}};

        showArray(myNums);

        double avg = getAvg(myNums);

        System.out.println("Average: " + avg);

        int count = getEvenRowCount(myNums);
        System.out.println("Number of rows: " + count) ;
    }

    //function to print out all elements in two nested regular for loops
    public static void showArray(int[][] arr) {
        System.out.println("Formatted Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double getAvg(int[][] arr) {
        double total = 0.0;
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                total += arr[i][j];
                count++;
            }
        }
        return total / count;
    }

    public static int getEvenRowCount(int[][] arr) {
        int count = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
            if (count > 0) {
                total++;
                count = 0;
            }
        }
        return total;
    }

    public static int getColumnCount(int[][] arr){
        int count = 0;
        int total = 0;
        int rowPos = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                    rowPos = j;
                }
            }
            if (count > 0) {
                total++;
                count = 0;
            }
        }
        return total;
    }
}
