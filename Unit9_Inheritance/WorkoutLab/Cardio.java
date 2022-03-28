package Unit9_Inheritance.WorkoutLab;

public class Cardio extends Workout{
    private double distance;
    private double speed;
    private double calsBurned;

    public Cardio(String name, int workoutNum, int duration, double speed) {
        super(name, workoutNum, duration);
        this.distance = speed * duration;
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCals() {
        return calsBurned;
    }

    public String toString(){
        String output = "Workout #" + super.getWorkoutNum() + ":";
        output += "\t" + super.getName() + "\t\t" + super.getDuration();
        return output;
    }

    public double startExercise(){
        int burnedPerMile = (int)(Math.random() * 61) + 80;
        this.calsBurned = (burnedPerMile * distance) / 60;
        return calsBurned;
    }

}
