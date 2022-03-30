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

    public void header(int num){
        String output = "*** WEEK #" + num + " ***" + "\n";
        output += "WORKOUT NUM" + "\t\t" + "NAME" + "\t\t" + "MINUTES";
        System.out.println(output);
    }

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
            System.out.println("Skipped Workouts: ");
            System.out.println(output);
        }else{
            System.out.println("Skipped Workouts: ");
            System.out.println("No workouts were skipped :)");
        }
        nextNum++;
    }

        public String printProgress() {
            String output = "*** CURRENT PROGRESS ***" + "\n";
            output += "Number of workouts completed: " + "\t" + compWorkouts;
            output += "\nNumber of workouts skipped: " + "\t" + skipWorkouts;
            output += "\nTotal minutes of exercise:    " + "\t" + totalMins;
            output += "\nTotal calories burned:       " + "\t" + (int)totalCals;
            return output;
        }
    }
