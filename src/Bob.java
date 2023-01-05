import java.util.Objects;
import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        boolean confirmation = true;
//      
           do {
               System.out.println("What do you want to say to Bob?");
              String response = scanner.nextLine();

               if (response.equals("")) {
                   System.out.println("Fine. Be that way!");

               } else if (response.endsWith("?")) {
                   System.out.println("Sure");

               } else if (response.endsWith("!")) {
                   System.out.println("Whoa. chill out!");

               }   else if (response.equalsIgnoreCase("bye")) {
                   confirmation = false;
               } else {
                   System.out.println("Whatever");
               }

           }while(confirmation);
//       do{
//           System.out.println("Want to speak to Jeeves?");
//           String answer = scanner.nextLine();
//           if(answer.equalsIgnoreCase("Yes")) {
//               System.out.println("Jeeves at your service!");
//           } else if (answer.equalsIgnoreCase("How are you ?")) {
//               System.out.println("Fine! do you need assistance?");
//           } else if (answer.equalsIgnoreCase("No")) {
//               System.out.println("Then Good day!");
//                 confirmation = false;
//           } else{
//               System.out.println("Goodbye!");
//           }
//       }while(confirmation);

    }
}


