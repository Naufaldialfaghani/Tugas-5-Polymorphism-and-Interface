package praktic.geometry.shapes;

import praktic.geometry.bases.TwoDimensionalShape;

public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Name            : " + name);
        System.out.println("Area            : " + getArea());
        System.out.println("Perimeter       : " + getPerimeter());
    }
}
