import java.io.*;
import java.util.*;

class Student7 implements Serializable {
    private String name;
    private int rollNumber;
    private String grade;

    public Student7(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public Student findStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void saveStudentsToFile(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadStudentsFromFile(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (List<Student>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

public class StudentManagementSystemApp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        String fileName = "students.ser"; // Serialized file to store student data

        int choice;
        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Find Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Save Students to File");
            System.out.println("6. Load Students from File");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(system);
                    break;
                case 2:
                    removeStudent(system);
                    break;
                case 3:
                    findStudent(system);
                    break;
                case 4:
                    system.displayAllStudents();
                    break;
                case 5:
                    system.saveStudentsToFile(fileName);
                    System.out.println("Students saved to file: " + fileName);
                    break;
                case 6:
                    system.loadStudentsFromFile(fileName);
                    System.out.println("Students loaded from file: " + fileName);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void addStudent(StudentManagementSystem system) {
        System.out.println("\nEnter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Grade: ");
        String grade = scanner.nextLine();

        // Input validation
        if (name.isEmpty() || grade.isEmpty()) {
            System.out.println("Name and grade cannot be empty. Please try again.");
        } else {
            system.addStudent(new Student(name, rollNumber, grade));
            System.out.println("Student added successfully.");
        }
    }

    private static void removeStudent(StudentManagementSystem system) {
        System.out.print("\nEnter roll number of student to remove: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        system.removeStudent(rollNumber);
        System.out.println("Student with roll number " + rollNumber + " removed.");
    }

    private static void findStudent(StudentManagementSystem system) {
        System.out.print("\nEnter roll number of student to find: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student student = system.findStudent(rollNumber);
        if (student != null) {
            System.out.println("Student found:");
            System.out.println(student);
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }
}
