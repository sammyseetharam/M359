package Unit9_Inheritance.WorkoutLab;

import java.sql.Array;

public class WorkoutPlan {
    private int compWorkouts;
    private int skipWorkouts;
    private int nextNum = 0;
    private double totalCals;
    private int totalMins;
    private Workout[][] allWorkouts;
    //each row represents 1 week of workouts

    public WorkoutPlan(int numWeeks) {
        allWorkouts = new Workout[numWeeks][7];
        fillWeek(allWorkouts);
    }

    /**
     * This method is header to organize output
     * @param num represents the number of weeks
     */
    public void header(int num){
        String output = "*** WEEK #" + num + " ***" + "\n";
        output += "WORKOUT NUM" + "\t\t" + "NAME" + "\t\t" + "MINUTES";
        System.out.println(output);
    }

    /**
     * @param allWorkouts The total number of workouts spread out through weeks in a 2D array
     * This method is like the spine of the program and controls a lot of the very important functionality.
     * It randomizes the chances of each workout and also creates objects based on the numbers set. After this it fills
     * the array and prints our each workout.
     */
    private void fillWeek(Workout[][] allWorkouts) {
        int num = 1;
        int weekCount = 1;
        int randomOne;

        for (int i = 0; i < allWorkouts.length; i++) {
            header(weekCount);
            for (int k = 0; k < allWorkouts[0].length; k++) {
                randomOne = (int)(Math.random() * 3) + 1;
                if (randomOne == 1) {
                    int time = (int)(Math.random() * 31) + 10;
                    int speed = (int)(Math.random() * 7) + 1;
                    Cardio c = new Cardio("Running", num, time, speed);
                    num++;
                    System.out.println(c);
                    allWorkouts[i][k] = c;
                }

                if (randomOne == 2) {
                    int time = (int) (Math.random() * 46) + 15;
                    int weight = (int) (Math.random() * 131) + 95;
                    Strength s = new Strength("Lifting", num, time, weight);
                    num++;
                    System.out.println(s);
                    allWorkouts[i][k] = s;
                }

                if (randomOne == 3) {
                    int time = (int) (Math.random() * 31) + 30;
                    int numStretches = (int) (Math.random() * 5) + 8;
                    Wellness w = new Wellness("Stretching", num, time, numStretches);
                    num++;
                    System.out.println(w);
                    allWorkouts[i][k] = w;
                }
            }
            System.out.println();
            weekCount++;
        }
    }

    /**
     * @param count Keeps track of the workout to use when applying the randomizer
     * This method is super important because it randomizes the chances of skipping each workout and also displays a
     * count at the end of each week.
     */
    public void workoutNextWeek(int count) {
        int column = 0;
        boolean check = false;
        int chanceSkip;
        String output = "";

        for(int i = count * 7; i < (count * 7) + 7; i++) {
            chanceSkip = (int)(Math.random() * 6) + 1;
            column = i % 7;
            if (chanceSkip == 1) {
                check = true;
                output += "You skipped workout #" + (i + 1) + "\n";
                skipWorkouts++;
            }else{
                totalCals += (allWorkouts[nextNum][column]).startExercise();
                totalMins += allWorkouts[nextNum][column].getDuration();
                compWorkouts++;
            }
        }
        if(check == true){
            System.out.println();
            System.out.println("Skipped Workouts: ");
            System.out.println(output);
        }else{
            System.out.println();
            System.out.println("Skipped Workouts: ");
            System.out.println("No workouts were skipped :)");
        }
        nextNum++;
    }

    /**
     * @return This method returns a summary of the different data points at the end of each week.
     */
        public String printProgress() {
            String output = "*** CURRENT PROGRESS ***" + "\n";
            output += "Number of workouts completed: " + "\t" + compWorkouts;
            output += "\nNumber of workouts skipped: " + "\t" + skipWorkouts;
            output += "\nTotal minutes of exercise:    " + "\t" + totalMins;
            output += "\nTotal calories burned:       " + "\t" + (int)totalCals;
            return output;
        }
    }
