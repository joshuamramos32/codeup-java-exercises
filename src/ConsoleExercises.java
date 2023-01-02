import java.net.SocketOption;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f." , pi);
        Scanner scanner = new Scanner(System.in);

//        System.out.print("How old are you? ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.print("Please enter three words?");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//
//       System.out.println(firstWord);
//       System.out.println(secondWord);
//       System.out.println(thirdWord);

//        System.out.print("Please enter a sentence?");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

        System.out.print("What is the length of your room?");
        int length = scanner.nextInt();
        System.out.print("What is the width of your room?");
        int width = scanner.nextInt();
        int perimeter = length * width;
        System.out.println("The area of your room is " + perimeter*2);
        System.out.println("The perimeter of your room is " + perimeter);


    }
}
