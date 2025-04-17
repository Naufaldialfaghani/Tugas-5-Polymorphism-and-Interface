package praktic.geometry.bases;

// Kelas abstrak untuk bentuk 3 dimensi, turunan dari Shape
public abstract class ThreeDimensionalShape extends Shape {

    // Konstruktor untuk mengatur nama bentuk
    public ThreeDimensionalShape(String name) {
        super(name);
    }

    // Method abstrak untuk luas permukaan
    public abstract double getSurfaceArea();

    // Method abstrak untuk volume
    public abstract double getVolume();
}
