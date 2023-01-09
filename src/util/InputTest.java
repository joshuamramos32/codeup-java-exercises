package util;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter something?");
        String stringInput = input.getString();
        System.out.println("User entered: "+ stringInput);
        System.out.println("Enter Y/N:");
        boolean yesNoInput = input.yesNo();
        System.out.println("User entered:" + yesNoInput);
        System.out.println("Enter a number between 1 - 10");
        int userInt =input.getInt(1,10);
        System.out.println("User entered: " + userInt);
        System.out.println("Enter a decimal number ");
        double userDouble = input.getDouble(1,10);
        System.out.println("User entered: " + userDouble);
    }
}
