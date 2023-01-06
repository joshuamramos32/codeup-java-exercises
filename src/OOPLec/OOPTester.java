package OOPLec;

import java.util.Scanner;

public class OOPTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//constructor method.
        System.out.println(Person.breathes);
        Person david = new Person("David","6 foot","Teacher");//Person() is a constructor method
        System.out.println(david.getName());
        System.out.println(david.job);
        System.out.println(david.getHeight());
        System.out.println(david.getHeight());
        Person ana = new Person("Ana","5 Foot 7 inches","Teacher");
        System.out.println(ana.getName());
        System.out.println(ana.getHeight());
        System.out.println(ana);
    }
}
