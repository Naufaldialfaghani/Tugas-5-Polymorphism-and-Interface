package praktic.geometry.shapes;

import praktic.geometry.bases.TwoDimensionalShape;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 22 * radius * radius / 7;
    }

    @Override
    public double getPerimeter() {
        return 2 * 22 * radius / 7;
    }

    @Override
    public void printInfo() {
        System.out.println("Name            : " + name);
        System.out.println("Area            : " + getArea());
        System.out.println("Perimeter       : " + getPerimeter());
    }
}
