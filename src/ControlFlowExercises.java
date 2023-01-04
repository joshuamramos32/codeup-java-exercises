import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
//      1a.  While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15
//        int i =5;
//        while (i <= 15) {
//            System.out.println(+ i);
//            i++;}
//      1.b  Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        int i = 1;
//        do{
//            System.out.println(i*2);
//            i++;
//        }while (i <= 50);

//        int i = 20;
//        do{
//            System.out.println(i*5);
//            i--;
//        }while (i >= -2);

//        long i = 2;
//        do{
//            System.out.println(i);
//            i*= i;
//        }while (i < 1000000);

//       1.c For
//
//        Refactor the previous two exercises to use a for loop instead.
//        for(int i = 5; i <= 15; i++ ){
//        System.out.println(+i);
//        }
//        for(int i = 1; i <=50; i++){
//            System.out.println(i*2);
//        }
//        for(int i = 20; i>= -2;i--){
//            System.out.println(i*5);
//        }
//        for(long i = 2; i<1000000; i*=i){
//            System.out.println(i);
//        }
        //2. Fizzbuzz

        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for(int i =1; i<=100; i++) {
////            System.out.println(i);
//            if( i % 3 == 0  && i % 5 == 0){
//                System.out.println("fizzbuzz");
//            } else if(i % 5 == 0){
//                System.out.println("buzz");
//            }else if ( i % 3 == 0 ){
//                System.out.println("fizz");
//            }else{
//                System.out.println(i);
//            }
//        }
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What number would you like to go up to ? ");
//        int userInput = scanner.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("Number | Squared | Cubed");
//        System.out.print("------ | ------ | ------");
//        for(int i = 1; i <= userInput; i++){
//            int userSquared = (int) Math.pow(i,2);
//            int userCubed = (int) Math.pow(i,3);
//            String message = "\n" + i +"      | " + userSquared +"      | " + userCubed;
//            System.out.print(message);
//
//        }
        System.out.println(" Please enter a numerical grade from 0 - 100 ?");
        int userGrade = scanner.nextInt();
        char grade = 'A';
        String userResponse ="";

        do {
            if (userGrade <= 100 && userGrade >= 90) {
                grade = 'A';
            } else if (userGrade <= 90 && userGrade >= 80) {
                grade = 'B';
            } else if (userGrade <= 80 && userGrade >= 70) {
                grade = 'C';
            } else if (userGrade <= 70 && userGrade >= 60) {
                grade = 'D';
            } else if (userGrade <= 60 && userGrade >= 0) {
                grade = 'F';
            } else {
                System.out.println("Not a valid input");
            }
            System.out.println("Your grade is an " + grade);
            System.out.println("Do you want to continue y/n?");
            userResponse = scanner.next();

        }while(Objects.equals(userResponse, "y"));
    }
}


