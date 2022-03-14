package Unit9_Inheritance.WorkoutLab;

public class Wellness extends Workout{
    private int numStretches;
    private int calsBurned;
    public Wellness(String name, int workoutNum, int duration, int numStretches) {
        super(name, workoutNum, duration);
        this.numStretches = numStretches;
    }

    public int StartExercise(){
        int random = (int)(Math.random() * 6) + 5;
        calsBurned = random * numStretches;
        return calsBurned;
    }

    public int getCalsBurned() {
        return calsBurned;
    }

    public int getNumStretches() {
        return numStretches;
    }

    public void setNumStretches(int numStretches) {
        this.numStretches = numStretches;
    }
}
