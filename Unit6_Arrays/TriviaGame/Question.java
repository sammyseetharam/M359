package Unit6_Arrays.TriviaGame;

public class Question {
    private String questionTxt;
    private String a;
    private String b;
    private String c;
    private String d;
    private String correct;
    private String ptVal;
    private String placeHolder;
    //made in order to keep track of if a question was used or not
    private boolean used;


    //Constructor for a completely customized question
    public Question(String questionTxt, String a, String b, String c, String d, String ptVal, String correct) {
        this.questionTxt = questionTxt;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.ptVal = ptVal;
        this.correct = correct;
        this.used = true;
    }

    public String getQuestionTxt() {
        return questionTxt;
    }

    public void setQuestionTxt(String questionTxt) {
        this.questionTxt = questionTxt;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public String getPtVal() {
        return ptVal;
    }

    public void setPtVal(String ptVal) {
        this.ptVal = ptVal;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    /**
     * This method is used to print out every question in a nicely ordered format.
     * @return This method returns all the information about a question (text, pt value, answer choices)
     */
    public String toString(){
        return          "Question: " + questionTxt
                        + "\n" + "Point Value: " + ptVal
                        + "\n" + "\t" + a
                        + "\n" + "\t" + b
                        + "\n" + "\t" + c
                        + "\n" + "\t" + d + "\n";
    }
}
