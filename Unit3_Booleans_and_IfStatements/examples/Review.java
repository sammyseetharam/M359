package Unit3_Booleans_and_IfStatements.examples;

public class Review {
    private String name;
    private String businessName;
    private int rating;

    public Review(String reviewName, String bizName, int restRating){
        name = reviewName;
        businessName = bizName;
        rating = restRating;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    //Getters
    public String getName() {
        return name;
    }

    public String getBusinessName() {
        return businessName;
    }

    public int getRating() {
        return rating;
    }
/*
    public String toString(){

    }
  */


}

