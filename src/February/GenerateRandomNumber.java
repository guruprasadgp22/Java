package February;

import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random ran = new Random();
        int random = ran.nextInt(0,255);
        System.out.println((char)random + " : " + random);
        
    }
}
