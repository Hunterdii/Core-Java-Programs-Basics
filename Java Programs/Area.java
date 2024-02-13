class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color of the shape is: " + color);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void displayArea() {
        displayColor();
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public void displayArea() {
        displayColor();
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}

public class Area {
    public static void main(String[] args) {
        Circle c = new Circle("red", 10.0);
        c.displayArea();
        Rectangle r = new Rectangle("blue", 4, 4);
        r.displayArea();
    }
}
