class parent
{
    final void display()
    {
        System.out.println("Parent class method");
    }
}
class Child extends parent{
    @Override // overriding the base-class's function with a new implementation
    void display(){
        System.out.println("Child class method");
    }
}

final class Men{


}
//cannot inherit from a final class
/*
public class Women extends Men{}
*/
