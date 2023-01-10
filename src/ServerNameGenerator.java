import jdk.dynalink.beans.StaticClass;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
   public static String[] adjectives = {"Deadpan","Berserk","Jumpy","Cloistered","Voracious","Resonant","Naughty","Luxuriant","Wiry","Giant"
};

    public static String[] nouns ={"Wax", "Sock", "Hate","Cherry","Lumber","Eggs","Agreement","Word", "Beef", "Condition"};
    public static String randomWord(String[]array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }




    public static void main(String[] args) {
    String adjective = randomWord(adjectives);
    String noun = randomWord(nouns);
    System.out.println("Here is your server name: \n" + adjective + " " + noun);




    }

}
