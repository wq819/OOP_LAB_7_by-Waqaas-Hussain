public class Dog extends Animal {
    Dog(String name, int age){
        super(name,age);
    }


    void display(){
System.out.println("Dog name: " + name + ", Age: " + age);
    }
}
