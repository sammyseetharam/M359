package Unit9_Inheritance.WorkoutLab;

public class Strength extends Workout{
    //weight in lbs
    private int weight;
    private double calsBurned;

    public Strength(String name, int workoutNum, int duration, int weight) {
        super(name, workoutNum, duration);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getCals() {
        return calsBurned;
    }

    public double startExercise(){
        int random = (int)(Math.random() * 3) + 1;
        this.calsBurned = random * weight;
        return calsBurned;
    }
}
