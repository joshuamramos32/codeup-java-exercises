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

    public boolean yesNo() {
        String input = this.getString();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int input;
        do {
            input = this.getInt();
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
        } while (input < min || input > max);
        return input;
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }
}
