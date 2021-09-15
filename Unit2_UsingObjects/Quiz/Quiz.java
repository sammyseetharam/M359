package Unit2_UsingObjects.Quiz;

public class Quiz
{
    //Made by: Sammy Seetharam
    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the quiz name, number of MC's,
    // and extra credit status
    private String theName;
    private int numMC;
    private boolean ec;


    // *** WRITE CODE HERE ***
    // Part B
    // Create a default Quiz constructor that sets the name
    // to "M359 Pop Quiz", has 3 MC's, and offers no extra credit
    public Quiz(){
        theName = "M359 Pop Quiz";
        numMC = 3;
        ec = false;
    }

    // *** WRITE CODE HERE ***
    // Part C
    // Create a full Quiz constructor that accepts each instance
    // variable as a parameter
    public Quiz(String aName, int theMC, boolean ifEC){
        theName = aName;
        numMC = theMC;
        ec = ifEC;
    }

    /*
     / *** WRITE CODE HERE ***
     / Part D
     / Create a printInfo method that prints a nicely formatted
     / summary to the console with the following information:
     /      QUIZ NAME
     /          Number MC's:    #
     /          Has EC:         true/false
     */

    public void printInfo(){
        System.out.println("QUIZ NAME: " + theName);
        System.out.println("\tNumber MC's:\t" + numMC);
        System.out.println("\tHas EC:\t\t\t" + ec);

    }



    // *** WRITE CODE HERE ***
    // Part E
    // Create an addMC method that accepts the number of MC questions
    // you are adding to this quiz as an input parameter, and updates
    // an appropriate instance variable.  This method does not return
    // anything

    public void addMC(int setMC){
        numMC += setMC;
    }


    // *** WRITE CODE HERE ***
    // Part F
    // Create a calcExtraCredit method that returns a random integer
    // between the range of [2,6]

    public int calcExtraCredit(){
        int random = (int)(Math.random()*5) + 2;
        return random;
    }


    // *** WRITE CODE HERE ***
    // Part G
    // Create a calcTotal method that accepts the point value for
    // each MC on the quiz and returns the total point value of quiz
    public int calcTotal(int numPtsPerQuestion){
        return numMC * numPtsPerQuestion;

    }


    // *** WRITE CODE HERE ***
    // Part H
    // Create all getter and setter methods
    public void setTheName(String setTheName){
        theName = setTheName;
    }
    public void setNumMC(int setTheMC){
        numMC = setTheMC;

    }
    public void setEc(boolean setTheEC){
        ec = setTheEC;
    }
    //Getters
    public String getTheName(){
        return theName;
    }
    public int getNumMC(){
        return numMC;
    }
    public boolean getec(){
        return ec;
    }


    // *** EXTRA CREDIT ***
    // Create a method named returnLastName that accepts a single parameter
    // (in the form of "FirstName LastName") and returns only the last name
    // Ex:  returnLastName("Mark Langer") would return "Langer"

}
