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

    //Constructor for a completely customized question
    public Question(String questionTxt, String a, String b, String c, String d, String ptVal, String correct) {
        this.questionTxt = questionTxt;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.ptVal = ptVal;
        this.correct = correct;
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

    public String toString(){
        return          "Question: " + questionTxt
                        + "\n" + "Point Value: " + ptVal
                        + "\n" + "\t" + a
                        + "\n" + "\t" + b
                        + "\n" + "\t" + c
                        + "\n" + "\t" + d + "\n";
    }
}
