package B;

import java.util.Scanner;

public class ValidCPR {

    public static void exB(){
    System.out.println(exerciseB());
}

    public static boolean exerciseB() {

        Scanner enterCPR = new Scanner(System.in);
        System.out.println("Enter your CPR number");

        String CPR = enterCPR.next();

        if (CPR.length() != 10) {
            return false; }

        int firstDigs = Integer.parseInt(CPR.substring(0,1));
        if (firstDigs > 31) {
            return false;
        }

        int middleDigs = Integer.parseInt(CPR.substring(2,3));
        return middleDigs <= 12;
    }
}
