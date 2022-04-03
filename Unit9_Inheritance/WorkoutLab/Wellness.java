package Unit9_Inheritance.WorkoutLab;

public class Wellness extends Workout{
    private int numStretches;
    private int calsBurned;

    public Wellness(String name, int workoutNum, int duration, int numStretches) {
        super(name, workoutNum, duration);
        this.numStretches = numStretches;
    }

    /**
     * This method is for the amount of calories burned during stretching
     * @return The calculation of calories burned per stretch based on the multiplier
     */
    public double startExercise(){
        int random = (int)(Math.random() * 6) + 5;
        this.calsBurned = random * numStretches;
        return calsBurned;
    }
}
