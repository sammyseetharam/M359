package Unit3_Booleans_and_IfStatements.examples;

public class CompoundBooleanExample {
    public static void main(String[] args) {
        String day = "Monday";
        int numAssignments = 2;

        //1. Person plays video games on saturdays or if she doesn't have hw

        if (day.equals("Saturday") || numAssignments == 0) {
            System.out.println("Yay, video games!");
        } else {
            System.out.println("No video games, go study Java! ");
        }

        //2. Bob only goes to coding club is the day is monday, and he only goes if has has 2 or less than two hw assignments

        if (day.equals("Monday") && numAssignments <= 2) {
            System.out.println("Yay, coding club");
        } else {
            System.out.println("I'll have to wait");
        }

        //3. Carol always exercises on the weekends, on the weekends she exercises if shes not exerices

        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("Exercise");

        }else{

            int prob = (int) (Math.random() * 10) + 1;

            if (numAssignments == 0) {
                    if (prob <= 8) {
                        System.out.println("Exercise");
                    }else{
                        System.out.println("No exercise");
                    }
            }else{
                    if(prob <= 3) {
                        System.out.println("Exercise");
                    }else{
                        System.out.println("No exercise");
                }
            }
        }
    }


 }


