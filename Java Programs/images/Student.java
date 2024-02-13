public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor with no parameters
    public Student() {
        this.id = 0;
        this.name = ""; // Corrected: set name to an empty string
        this.age = 0;
    }

    // Constructor with two parameters (id and name)
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.age = 0; // Assuming age is not provided, set it to 0.
    }

    // Constructor with three parameters (id, name, and age)
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and setters (omitted for brevity)
    // ...

    // A method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        Student student1 = new Student(); // Calls the constructor with no parameters
        Student student2 = new Student(101, "Jester"); // Calls the constructor with two parameters
        Student student3 = new Student(102, "Hunter", 20); // Calls the constructor with three parameters

        // Display student details
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
