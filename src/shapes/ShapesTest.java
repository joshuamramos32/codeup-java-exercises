package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println("This is box1 " + box1.getArea());
        System.out.println(box1.getPerimeter());
        System.out.println("   ");
        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println("This is box2 " + box2.getPerimeter());


    }
}
