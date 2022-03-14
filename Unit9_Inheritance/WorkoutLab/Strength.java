package Unit9_Inheritance.WorkoutLab;

public class Strength extends Workout{
    //weight in lbs
    private int weight;
    private int calsBurned;

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

    public int getCalsBurned() {
        return calsBurned;
    }

    public int StartExercise(){
        int random = (int)(Math.random() * 3) + 1;
        calsBurned = random * weight;
        return calsBurned;
    }
}
