package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What is the radius of your Circle?");
        double radius = input.getDouble();
        Circle userCircle = new Circle(radius);
        System.out.println("The circumference of your circle is: " + userCircle.getCircumference() + ".");
        System.out.println("The area of your circle is:" + userCircle.getArea() + ".");
    }
}
