package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
// for inheritance and polymorphism
//    protected double length;
//    protected double width;

//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//    public double getArea() {
//        return length * width;
//    }
//    public double getPerimeter() {
//        return 2 * length + 2 * width;
//    }

}
