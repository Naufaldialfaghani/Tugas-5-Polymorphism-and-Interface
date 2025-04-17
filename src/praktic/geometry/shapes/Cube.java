package praktic.geometry.shapes;

import praktic.geometry.bases.ThreeDimensionalShape;
import praktic.geometry.interfaces.HasVolume;
import praktic.geometry.interfaces.Weightable;

public class Cube extends ThreeDimensionalShape implements Weightable, HasVolume {
    private double edge;
    private double mass;

    public Cube(double edge, double mass) {
        super("Cube");
        this.edge = edge;
        this.mass = mass;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    @Override
    public double getWeight() {
        return getVolume() * mass;
    }

    @Override
    public void printInfo() {
        System.out.println("Name            : " + name);
        System.out.println("Surface area    : " + getSurfaceArea());
        System.out.println("Volume          : " + getVolume());
        System.out.println("Weight          : " + getWeight());
    }
}
