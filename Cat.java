public class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }


    void display() {
        System.out.println("Cat Name: " + name +  ", Age: " + age);
    }
}