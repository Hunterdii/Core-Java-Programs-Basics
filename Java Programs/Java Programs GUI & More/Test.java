class Animal{
    String name1;
    Animal(String name1){
        this.name1 = name1;
    }

    void walk(){
        System.out.println(name1 + " is walking");
    } 

    void eat(){
        System.out.println(name1 +" is eating");
    }

    void sleep(){
        System.out.println(name1 +" is sleeping");
    }
}

class Dog extends Animal{
    Dog(String name1) {
        super(name1);
    }

    void bark(){
        System.out.println(name1 +" is Barking.");
    }
}
class Cat extends Animal{
    Cat(String name1) {
        super(name1);
        }

        void meow(){
            System.out.println(name1+" is Meowing.");
        }
}
class Labradon extends Dog{
    Labradon(String name1){
        super(name1);
    }
    void guard(){
        System.out.println(name1 + " Guarding the house");
    }
}



public class Test {
    public static void main (String[] args){
        Labradon labra=new Labradon("Labsy");
        labra.guard();
        labra.walk();
        labra.eat();
        labra.sleep();
        labra.bark();
        Cat catty=new Cat("meo");
        catty.walk();
        catty.eat();
        catty.sleep();
        catty.meow();

        }
    }

