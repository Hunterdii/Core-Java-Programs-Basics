import java.util.Scanner;

public class ShapeArea {

    // Area of square
    double calculateArea(int side) {
        return side * side;
    }

    // Area of rectangle
    double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Area of triangle
    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Area of circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeArea shapeArea = new ShapeArea();

        System.out.println("Enter side of square: ");
        int side = scanner.nextInt();
        System.out.println("Area of square: " + shapeArea.calculateArea(side));

        System.out.println("Enter length and breadth of rectangle: ");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        System.out.println("Area of rectangle: " + shapeArea.calculateArea(length, breadth));

        System.out.println("Enter base and height of triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Area of triangle: " + shapeArea.calculateArea(base, height));

        System.out.println("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle: " + shapeArea.calculateArea(radius));
    }
}