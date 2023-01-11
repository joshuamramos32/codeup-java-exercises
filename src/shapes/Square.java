package shapes;

public class Square extends Quadrilateral {
    public Square (double side) {
        super(side,side);
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
//// for inheritance and polymorphism
//    public Square(double side) {
//        super(side, side);
//    }
//
//
//    public double getArea() {
//        double side = this.width;
//        return side * side;
//    }
//
//
//    public double getPerimeter() {
//        double side = this .width;
//        return 4 * side;
//
//    }

}
