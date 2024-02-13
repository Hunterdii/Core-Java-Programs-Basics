import java.util.ArrayList;
import java.util.Scanner;

public class Student1 {
    private String name;
    private int rollNumber;
    private String grade;

    public Student1(String name, int rollNumber, String grade) {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

public class StudentManagementSystem {
    private ArrayList<Student> students;
    private Scanner s;
}
    public StudentManagementSystem() {
        students = new ArrayList<>();
        s = new Scanner(System.in);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void run() {
        while (true) {
            System.out.println("Student Management System");
            System.out.println("Choose 1 for Add Student");
            System.out.println("Choose 2 for Remove Student");
            System.out.println("Choose 3 for Search Student");
            System.out.println("Choose 4 for Display All Students");
            System.out.println("Choose 5 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Enter name:");
                    String name = s.next();
                    System.out.print("Enter roll number:");
                    int rollNumber = s.nextInt();
                    System.out.print("Enter grade:");
                    String grade = s.next();
                    Student1 newStudent = new Student1(name, rollNumber, grade);
                    addStudent(newStudent);
                    System.out.println("Student added successfully");
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter roll number of the student to be removed:");
                    int rollNumberToRemove = s.nextInt();
                    removeStudent(rollNumberToRemove);
                    System.out.println("Student removed successfully");
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Enter roll number of the student to be searched:");
                    int rollNumberToSearch = s.nextInt();
                    Student searchedStudent = searchStudent(rollNumberToSearch);
                    if (searchedStudent != null) {
                        System.out.println("Student found: " + searchedStudent);
                    } else {
                        System.out.println("Student not found");
                    }
                    System.out.println("");
                    break;

                case 4:
                    displayAllStudents();
                    System.out.println("");
                    break;

                case 5:
                    System.exit(0);
         }
        }