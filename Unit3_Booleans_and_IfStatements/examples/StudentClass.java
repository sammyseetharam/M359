package Unit3_Booleans_and_IfStatements.examples;

public class StudentClass {
    private String fName;
    private String lName;
    private int idNum;

    public StudentClass(String fName, String lName, int idNum) {
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public boolean equals(StudentClass other){
        return (this.fName.equals(other.fName) && this.lName.equals(other.lName));
    }

    public int compareTo(StudentClass other){
        int areTheySame = (this.lName.compareTo(other.lName));
            if(areTheySame == 0) {
                return this.fName.compareTo(other.fName);
                }
            return areTheySame;

            
        }
    }

