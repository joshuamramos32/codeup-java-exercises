

import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        boolean confirm = true;
        do {
            System.out.println("Pick a number between 1-100?");
            int userNum = scanner.nextInt();
            if(userNum < 1 || userNum > 100){
                System.out.println("Invalid number. PLease enter a number between 1 - 100.");
            }
            if (randomNum == userNum) {
                confirm = false;
                System.out.println("Good Guess");
            } else if (userNum < randomNum) {
                System.out.println("higher");
            } else {
                System.out.println("lower");
            }
    }while (confirm);
    }
}
