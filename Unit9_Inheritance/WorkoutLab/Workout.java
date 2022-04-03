package Unit9_Inheritance.WorkoutLab;

public class Workout {
    private String name;
    private int workoutNum;
    private int duration;

    public Workout(String name, int workoutNum, int duration) {
        this.name = name;
        this.workoutNum = workoutNum;
        this.duration = duration;
    }

    /**
     * This method is formats the output of each week
     * @return This method fixes and discontinuities in spacing and is not overidden later
     */

    public String toString(){
        String output = "Workout #" + workoutNum + ":";
        if(workoutNum > 9) {
        output += "\t";
        }else{
        output += "\t\t";
        }
        if(name.length() == 7){
            output += name + "\t\t" ;
        }else{
            output += name + "\t";
        }
        output += duration;
        return output;
    }

    /**
     * This method is meant to be a starting method for the program
     * @return This method returns a 0 to indicate the start of an exercise, overidden later
     */
    public double startExercise(){
        System.out.println("Starting a workout");
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

}
