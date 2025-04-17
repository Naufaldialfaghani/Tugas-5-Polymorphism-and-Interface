/* Naufaldi Alfaghani - 245150707111034
 _   _              __      _     _ _ 
| \ | |            / _|    | |   | (_)
|  \| | __ _ _   _| |_ __ _| | __| |_ 
| . ` |/ _` | | | |  _/ _` | |/ _` | |
| |\  | (_| | |_| | || (_| | | (_| | |
\_| \_/\__,_|\__,_|_| \__,_|_|\__,_|_|
 */

package praktic.geometry.mains;

 // Import semua bentuk dan interface yang dibutuhkan
import praktic.geometry.shapes.*;
import praktic.geometry.interfaces.*;
import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
         // Kode warna 
         String BLUE = "\033[0;34m";   // Biru
         String WHITE = "\u001B[0m";   // Putih
         String GREEN = "\u001B[32m";  // Hijau
         String RED = "\u001B[31m";    // Merah

        Scanner egel = new Scanner(System.in);

         // Header program
        System.out.println(GREEN + "======================================" + BLUE);
        System.out.println("Shape Calculator");
        System.out.println("NAUFALDI ALFAGHANI");
        System.out.println("245150707111034");
        System.out.println(GREEN + "======================================" + WHITE);

         // Input dan output untuk Circle
        System.out.println("2D Circle");
        System.out.println(GREEN + "======================================" + WHITE);
        System.out.print("Enter radius    : ");
        double circleRadius = egel.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println(GREEN + "======================================" + WHITE);
        circle.printInfo();
        System.out.println(GREEN + "======================================" + WHITE);

         // Input dan output untuk Square
        System.out.println("2D Square");
        System.out.println(GREEN + "======================================" + WHITE);
        System.out.print("Enter side      : ");
        double squareSide = egel.nextDouble();
        Square square = new Square(squareSide);
        System.out.println(GREEN + "======================================" + WHITE);
        square.printInfo();
        System.out.println(GREEN + "======================================" + WHITE);

         // Input dan output untuk Cube
        System.out.println("3D Weightable Cube");
        System.out.println(GREEN + "======================================" + WHITE);
        System.out.print("Enter edge      : ");
        double cubeEdge = egel.nextDouble();
        System.out.print("Enter mass      : ");
        double cubeMass = egel.nextDouble();
        Cube cube = new Cube(cubeEdge, cubeMass);
        System.out.println(GREEN + "======================================" + WHITE);
        cube.printInfo();
        System.out.println(GREEN + "======================================" + WHITE);

         // Input dan output untuk Sphere
        System.out.println("3D Weightable Sphere");
        System.out.println(GREEN + "======================================" + WHITE);
        System.out.print("Enter radius    : ");
        double sphereRadius = egel.nextDouble();
        System.out.print("Enter mass      : ");
        double sphereMass = egel.nextDouble();
        Sphere sphere = new Sphere(sphereRadius, sphereMass);
        System.out.println(GREEN + "======================================" + WHITE);
        sphere.printInfo();
        System.out.println(GREEN + "======================================" + WHITE);

         // Demonstrasi polymorphism dan penggunaan interface
        System.out.println(RED + "Volume of Cube and Sphere");
        System.out.println("POLYMORPHISM: INTERFACE");
        System.out.println("======================================");
        System.out.print("Enter edge      : ");
        double e = egel.nextDouble();
        System.out.print("Enter radius    : ");
        double r = egel.nextDouble();
        System.out.print("Enter mass      : ");
        double m = egel.nextDouble();

         // Menggunakan interface HasVolume & Weightable
        HasVolume cubePoly = new Cube(e, m);
        HasVolume spherePoly = new Sphere(r, m);
        Weightable wSphere = new Sphere(r, m);

         // Output volume dan berat menggunakan interface
        System.out.println("======================================");
        System.out.println("Cube's volume   : " + cubePoly.getVolume());
        System.out.println("Sphere's volume : " + spherePoly.getVolume());
        System.out.println("Weight          : " + wSphere.getWeight());
        System.out.println("======================================");

        egel.close();
    }
}
