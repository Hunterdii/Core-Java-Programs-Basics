class vehicle {
    private String make;
    private String color;
    private int year;
    private String model;

    public vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year of manufacture: " + year);
        System.out.println("Model name: " + model);
    }
}

class car extends vehicle {
    private String bodyStyle;

    public car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);
        this.bodyStyle = bodyStyle;
    }

    public void carDetails() {
        printDetails();
        System.out.println("Body style: " + bodyStyle);
    }
}

public class cars {
    public static void main(String[] args) {
        car bhugati = new car("veyron", "gold white", 2017, "cope", "body style");
        bhugati.printDetails();
        bhugati.carDetails();
    }
}
