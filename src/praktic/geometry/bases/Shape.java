package praktic.geometry.bases;

// Kelas abstrak sebagai dasar untuk bentuk-bentuk
public abstract class Shape {
    // Nama bentuk
    protected String name;

    // Konstruktor untuk mengatur nama
    public Shape(String name) {
        this.name = name;
    }

    // Method abstrak untuk menampilkan info bentuk
    public abstract void printInfo();
}