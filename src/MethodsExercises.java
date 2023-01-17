import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    //TODO 1.Basic Arithmetic
//Create four separate methods. Each will perform an arithmetic operation:
//Addition
//Subtraction
//Multiplication
//Division
//Each function needs to take two parameters/arguments so that the operation can be performed.
//Test your methods and verify the output.
//Add a modulus method that finds the modulus of two numbers.
//Food for thought: What happens if we try to divide by zero? What should happen?
    public static Scanner scanner = new Scanner(System.in);

//    public static Integer add(int a, int b) {
//        return a + b;
//    }
//
//    public static int subtract(int a, int b) {
//        return a - b;
//    }
//
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//
//    public static int divide(int a, int b) {
//        return a / b;
//    }
//
//    public static int modulus(int a, int b) {
//        return a % b;
//    }
//TODO. 2.Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
//The method signature should look like this:
//Copied to clipboard
//public static int getInteger(int min, int max);
//and is used like this:
//Copied to clipboard
//System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);
//If the input is invalid, prompt the user again.
    public static int getInteger(int min, int max) {
        int userInput = scanner.nextInt();
        if (userInput > min && userInput < max) {
            return userInput;
        } else {
            System.out.print("Enter a integer between " + min + " and " + max + " ?");
            return getInteger(min, max);
        }
    }

//TODO. 3.Calculate the factorial of a number.
// Prompt the user to enter an integer from 1 to 10.
//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex:
//1! = 1               = 1
//2! = 1 x 2           = 2
//3! = 1 x 2 x 3       = 6
//4! = 1 x 2 x 3 x 4   = 24
//Bonus
//Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//Use recursion to implement the factorial.
//    public static void getFactorial() {
////        String confirm = "";
//        System.out.println("Please enter a number 1-10");
//        int userNum = getInteger(1, 10);
//        long factorial = 1;
//        String output = "! = 1";
//        System.out.printf("1%s\n", output);
//        for (int i = 2; i <= userNum; i++) {
//            factorial *= i;
//            output += "x" + i;
//            System.out.printf("%d%s = %d\n", i, output, factorial);
//        }
//        System.out.println("Would you like to continue y/n?");
//        String userConfirm = "";
//        userConfirm = scanner.next();
//        if (userConfirm.equalsIgnoreCase("y"))
//            getFactorial();
//
//    }

    //TODO. 4.Create an application that simulates dice rolling.
//Ask the user to enter the number of sides for a pair of dice.
//Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//Use static methods to implement the method(s) that generate the random numbers.
//Use the .random method of the java.lang.Math class to generate random numbers.
    public static void diceRoll() {
        boolean keepRolling = true;
        while (keepRolling) {
            System.out.println("Would you like to roll the dice y/n?");
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase("y")) {
                System.out.println("Enter the number of sides for a pair of dice?");
                int userSides = scanner.nextInt();
                if (userSides > 6) {
                    userSides = 6;
                }

                int roll1 = (int) (Math.random() * userSides) + 1;
                int roll2 = (int) (Math.random() * userSides) + 1;
                System.out.println("You rolled a " + roll1 + " and " + roll2 + " . ");
            } else {
                keepRolling = false;

            }
        }
    }


    public static void main(String[] args) {
//            System.out.println(add(9, 1));
//            System.out.println(subtract(10, 5));
//            System.out.println(multiply(2, 5));
//            System.out.println(divide(10, 2));
//            System.out.println(modulus(101, 8));
            System.out.print("Enter a integer between 1 and 10 ? ");
            int userInput = getInteger(1, 10);
            System.out.println("Valid input: " + userInput);
//            getFactorial();
            diceRoll();


    }

}

