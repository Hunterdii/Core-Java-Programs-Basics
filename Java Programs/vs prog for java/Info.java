class Student{
    private String name;
    private int age;
    private int rollnumber;

    public Student(String name, int age,int rollnumber){
        this.name=name;
        this.age=age;
        this.rollnumber=rollnumber;
    }

    public void show(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("roll number = "+rollnumber);
    }
    

}
public class Info {
    public static void main(String[] args) {
        Student het= new Student("Hunter",19,68);
        het.show();
    }
}