package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }
//    public String getString(String prompt){
//        System.out.println(prompt);
//        return this.scanner.nextLine();
//    }

    public boolean yesNo() {
        String input = this.getString();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int input;
        do {
            input = this.getInt();
            if (input < min || input > max) {
                System.out.println("Invalid number please enter a new number between" + min + "and" + max + ".");
            }
        } while (input < min || input > max);
        return input;
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            input = this.getDouble();
            if (input < min || input > max) {
                System.out.println("Invalid decimal number please enter a number between" + min + " and" + "max" + ".");
            }
        } while (input < min || input > max);
        return input;
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }
}

    //below is from walk through

//    public int getInt(int min, int max) {
//        int input;
//        try {
//            System.out.println("Enter a number between " + min + " and " + max + ".");
//            input = Integer.parseInt(getString(""));
//            if (input < min || input > max) {
//                throw new Exception("Value is out of provided range of: " + min + " to " + max +".");
//            }
//            System.out.println("Input acceptable");
//            return input;
//        } catch (NumberFormatException nfe) {
//            System.out.println("User failed to input a number.");
//            return getInt(min, max);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return getInt(min, max);
//        }
//    }
//
//    public int getInt(String prompt, int min, int max) {
//        int input;
//        do {
//            System.out.println(prompt);
//            input = this.scanner.nextInt();
//            if (input < min || input > max) {
//                System.out.println("Input invalid");
//            }
//        } while (input < min || input > max);
//        System.out.println("Input acceptable");
//        return input;
//    }
//
//    public int getIntegerSecret(int min, int max) {
//        int input;
//        try {
//            System.out.println("Enter a number between " + min + " and " + (max - 1) + ".");
//            input = Integer.parseInt(getString(""));
//            if (input < min || input > max) {
//                throw new Exception("Value is out of provided range of: " + min + " to " + (max - 1) +".");
//            }
//            System.out.println("Input acceptable");
//            return input;
//        } catch (NumberFormatException nfe) {
//            System.out.println("User failed to input a number.");
//            return getIntegerSecret(min, max);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return getIntegerSecret(min, max);
//        }
//    }
//
//    public int getInt() {
//        System.out.println("Input number...");
//        try {
//            int userInput = Integer.valueOf(this.scanner.nextLine());
//            System.out.println("Input acceptable");
//            return userInput;
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid. Input not an integer. Try again.");
//            return getInt();
//        }
//    }
//
//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        try {
//            int userInput = Integer.valueOf(this.scanner.nextLine());
//            System.out.println("Input acceptable");
//            return userInput;
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid. Input not an integer. Try again.");
//            return getInt(prompt);
//        }
//    }
//
//    public double getDouble(double min, double max) {
//        double input;
//        do {
//            System.out.println("Enter a number between " + min + " and " + max + ".");
//            input = this.scanner.nextDouble();
//            if (input < min || input > max) {
//                System.out.println("Input invalid");
//            }
//        } while (input < min || input > max);
//        System.out.println("Input acceptable");
//        return input;
//    }
//
//    public double getDouble() {
//        System.out.println("Input number...");
//        try {
//            double userInput = Double.valueOf(getString());
//            System.out.println("Input acceptable");
//            return userInput;
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid. Input not an double. Try again.");
//            return getDouble();
//        }
//    }
//
//    public double getDouble(String prompt) {
//        System.out.println(prompt);
//        while (true) {
//            try {
//                double userInput = Double.valueOf(getString());
//                System.out.println("Input acceptable");
//                return userInput;
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid. Input not an double. Try again.");
//            }
//        }
//    }
//
//    public long getHex() {
//        System.out.println("Input hexadecimal number");
//        while (true) {
//            try {
//                long hex =  Long.valueOf(scanner.next(), 16);
//                System.out.println("Input acceptable");
//                return hex;
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid. Input not a hexadecimal. Try again.");
//            }
//        }
//    }
//
//    public long getBinary() {
//        System.out.println("Input binary number");
//        while (true) {
//            try {
//                long bin = Long.valueOf(scanner.nextLine(), 2);
//                System.out.println("Input acceptable");
//                return bin;
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid. Input not in binary. Try again.");
//            }
//        }
//    }
//
//}