import java.net.SocketOption;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        // 1.Copy this code into your main method:
//        double pi = 3.14159;
        // Write some Java code that uses the variable pi to output the following:
//        System.out.format("The value of pi is approximately %.2f." , pi);
        Scanner scanner = new Scanner(System.in);
//          1. Prompt a user to enter a integer and store that value in an            int variable using the nextInt method.

//        System.out.print("How old are you? ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        System.out.print("Please enter three words?");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();

//       System.out.println(firstWord);
//       System.out.println(secondWord);
//       System.out.println(thirdWord);

        //3.Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        System.out.print("Please enter a sentence?");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

        //1.Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).

        System.out.print("What is the length of your room?");
        int length = scanner.nextInt();
        System.out.print("What is the width of your room?");
        int width = scanner.nextInt();
        int perimeter = length * width;

        //2.Display the area and perimeter of that classroom.

        System.out.println("The area of your room is " + perimeter*2);
        System.out.println("The perimeter of your room is " + perimeter);


    }
}
