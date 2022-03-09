package Unit9_Inheritance.WorkoutLab;

public class Strength extends Workout{
    private int weight;

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

    public int StartExercise(){
        int random = (int)(Math.random() * 3) + 1;
        return random * weight;
    }
}
