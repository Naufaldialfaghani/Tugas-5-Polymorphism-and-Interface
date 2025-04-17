package praktic.geometry.bases;

// Kelas abstrak untuk bentuk 2 dimensi, turunan dari Shape
public abstract class TwoDimensionalShape extends Shape {

    // Konstruktor untuk mengatur nama bentuk
    public TwoDimensionalShape(String name) {
        super(name);
    }

    // Method abstrak untuk menghitung luas
    public abstract double getArea();

    // Method abstrak untuk menghitung keliling
    public abstract double getPerimeter();
}
