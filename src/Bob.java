import java.util.Objects;
import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to talk to bob the teenager?");
        String usersResponse = "";
        usersResponse = scanner.next();
        String bob = "";
//
        do {
            if (usersResponse.equals("yes")) {
                bob = "Hey...";

            } else {
                System.out.println("Ok bye");
            }

        }while(usersResponse.equals(""));
    }
}

