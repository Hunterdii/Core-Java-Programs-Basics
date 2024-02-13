import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", grade='" + grade + '\'' +
                '}';
    }
}

class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(name, rollNumber, grade);
        students.add(student);
        System.out.println("Student added successfully.\n");
    }

    public void removeStudent() {
        System.out.print("Enter the roll number of the student to remove: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        boolean removed = students.removeIf(student -> student.getRollNumber() == rollNumber);
        if (removed) {
            System.out.println("Student removed successfully.\n");
        } else {
            System.out.println("Student not found.\n");
        }
    }

    public void searchStudent() {
        System.out.print("Enter the roll number of the student to search: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student found:\n" + student + "\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    public void displayAllStudents() {
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}

public class Main1 {
    public static void main(String[] args) {
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    studentManagementSystem.addStudent();
                    break;
                case 2:
                    studentManagementSystem.removeStudent();
                    break;
                case 3:
                    studentManagementSystem.searchStudent();
                    break;
                case 4:
                    studentManagementSystem.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting the Student Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose a valid option.\n");
            }
        }
    }
}
