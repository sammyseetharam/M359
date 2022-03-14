package Unit9_Inheritance.WorkoutLab;

import java.sql.Array;

public class WorkoutPlan {
    private int compWorkouts;
    private int skipWorkouts;
    private Workout[] week;
    private int nextNum = 0;
    private double totalCals;
    private int totalMins;
    private Workout[][] allWorkouts;
    //each row represents 1 week of workouts

    public WorkoutPlan(int numWeeks) {
        allWorkouts = new Workout[numWeeks][7];
    }

    private void fillWeek(Workout[][] allWorkouts) {
        int randomOne = (int) (Math.random() * 3) + 1;

        for (int i = 0; i < allWorkouts.length; i++) {
            for (int k = 0; k < allWorkouts[0].length; k++) {
                if (randomOne == 1) {
                    int time = (int) (Math.random() * 31) + 10;
                    int speed = (int) (Math.random() * 7) + 1;
                    Cardio c = new Cardio("Running", 0, time, speed);
                    totalMins += time;
                    totalCals += c.StartExercise();
                    allWorkouts[i][k] = c;
                }

                if (randomOne == 2) {
                    int time = (int) (Math.random() * 46) + 15;
                    int weight = (int) (Math.random() * 131) + 95;
                    Strength s = new Strength("Lifting", 0, time, weight);
                    totalMins += time;
                    totalCals += s.StartExercise();
                    allWorkouts[i][k] = s;
                }

                if (randomOne == 3) {
                    int time = (int) (Math.random() * 31) + 30;
                    int numStretches = (int) (Math.random() * 5) + 8;
                    Wellness w = new Wellness("Stretching", 0, time, numStretches);
                    totalMins += time;
                    totalCals += w.StartExercise();
                    allWorkouts[i][k] = w;
                }
            }
        }
        nextNum++;
    }

    public void workoutNextWeek() {
        compWorkouts++;
        int chanceSkip = (int) (Math.random() * 5) + 1;
        if (chanceSkip == 1) {
            int random = (int) (Math.random() * 7) + 1;
            System.out.println("You skipped workout#" + random);
            skipWorkouts++;
            totalCals -= allWorkouts[nextNum][random].getCals();
            totalMins -= allWorkouts[nextNum][random].getDuration();
        }


        public String printProgress () {
            String output = "*** CURRENT PROGRESS ***" + "\n";
            output += "Number of workouts completed: " + "\t" + compWorkouts;
            output += "\nNumber of workouts skipped: " + "\t" + skipWorkouts;
            output += "\nTotal minutes of exercise: " + "\t" + totalMins;
            output += "\nTotal calories burned: " + "\t" + totalCals;
            return output;
        }
    }
}
