package Abstractlecture;

public class Test {
    public static void main(String[] args) {
        // ERROR!
//        Employee tim = new Employee();
// okay
//        Employee bob = new Accountant();
//        System.out.println(bob.work());
        Employee frank = new Developer("Frank", "Innovation team");
        System.out.println(frank.getName());
        Employee Jim = new Manager("Jim", "Quality");
        System.out.println("Jim.work() = " + Jim.work());
    }
}
