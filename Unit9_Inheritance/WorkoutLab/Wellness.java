package Unit9_Inheritance.WorkoutLab;

public class Wellness extends Workout{
    private int numStretches;
    private int calsBurned;
    public Wellness(String name, int workoutNum, int duration, int numStretches) {
        super(name, workoutNum, duration);
        this.numStretches = numStretches;
    }

    public double startExercise(){
        int random = (int)(Math.random() * 6) + 5;
        this.calsBurned = random * numStretches;
        return calsBurned;
    }

    public double getCals() {
        return calsBurned;
    }

    public String toString(){
        String output = "Workout #" + super.getWorkoutNum() + ":";
        output += "\t" + super.getName() + "\t" + super.getDuration();
        return output;
    }

    public int getNumStretches() {
        return numStretches;
    }

    public void setNumStretches(int numStretches) {
        this.numStretches = numStretches;
    }
}
