package Unit9_Inheritance.WorkoutLab;

public class Cardio extends Workout{
    private double distance;
    private double speed;
    private double calsBurned;

    public Cardio(String name, int workoutNum, int duration, double speed) {
        super(name, workoutNum, duration);
        this.distance = speed * duration;
    }

    /**
     * This method is for the amount of calories burned during cardio
     * @return The calculation of calories burned per mile multiplied by a distance
     */
    public double startExercise(){
        int burnedPerMile = (int)(Math.random() * 61) + 80;
        this.calsBurned = (burnedPerMile * distance) / 60;
        return calsBurned;
    }

}
