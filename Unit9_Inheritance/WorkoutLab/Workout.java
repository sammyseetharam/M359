package Unit9_Inheritance.WorkoutLab;

public class Workout {
    private String name;
    private int workoutNum;
    private int duration;
    private double cals;

    public Workout(){
        this.name = "No name";
        this.workoutNum = 0;
        this.duration = 0;
    }
    public Workout(String name, int workoutNum, int duration) {
        this.name = name;
        this.workoutNum = workoutNum;
        this.duration = duration;
    }

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

    public double startExercise(){
        System.out.println("Starting a workout");
        return 0;
    }

    public double getCals() {
        return cals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkoutNum() {
        return workoutNum;
    }

    public void setWorkoutNum(int workoutNum) {
        this.workoutNum = workoutNum;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
