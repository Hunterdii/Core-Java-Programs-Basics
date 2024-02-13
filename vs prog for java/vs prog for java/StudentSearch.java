import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSearch {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("JISHNU MB" , 101));
        students.add(new Student("JENITH SONI", 102));
        students.add(new Student("JATIN (JESTER) PATEL", 103));
        students.add(new Student("GAJJAR HARSHIL", 104));
        students.add(new Student("KULDIP SINH", 105));
        students.add(new Student("DHRUMIL MEHTA", 106));
        students.add(new Student("KAVISH SONI", 107));
        students.add(new Student("HET PATEL", 108));
        students.add(new Student("JAY PATEL", 109));
        students.add(new Student("NIL PATEL", 110));
        students.add(new Student("AMAN PRAJAPATI", 111));
        students.add(new Student("JAYRUTH GOHIL", 112));
        students.add(new Student("KITARTH PATEL", 113));
        students.add(new Student("CHARMI PATEL", 114));
        students.add(new Student("KRISHA", 115));
        students.add(new Student("KHUSHI MOJERDRA", 116));
        students.add(new Student("KRIYA PATEL", 117));
        students.add(new Student("LIZA MODI", 118));
        students.add(new Student("PHUSTI SHAH", 119));
        students.add(new Student("KRINA PATEL", 120));
        students.add(new Student("RUTU PATEL", 121));
        students.add(new Student("SHAKSI SHARMA", 122));
        students.add(new Student("RANE AKSHIT", 123));
        students.add(new Student("DHRUVIL PATEL", 124));
        students.add(new Student("PRAJAPATI DHAIRYA", 125));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the roll number to search: ");
        int rollNumberToSearch = scanner.nextInt();

        Student foundStudent = searchByRollNumber(students, rollNumberToSearch);

        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent.getName());
        } else {
            System.out.println("Student not found.");
        }
    }

    public static Student searchByRollNumber(List<Student> students, int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null; 
    }

    static class Student {
        private String name;
        private int rollNumber;

        public Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        public String getName() {
            return name;
        }

        public int getRollNumber() {
            return rollNumber;
        }
    }
}
