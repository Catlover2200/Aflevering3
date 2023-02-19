package A;

import java.util.Random;

public class RandomNr {
    public static void exA() {

        Random randomNumber = new Random();

        for(int i =0; i < 100; i++) {

        int answer = randomNumber.nextInt(10) + 1;
        System.out.println(answer);
        }
    }
}
