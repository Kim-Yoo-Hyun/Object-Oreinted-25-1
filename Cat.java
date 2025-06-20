package Week10;

public class Cat extends Animal {
    public void speak() {
        System.out.println("MEW");
    }
    public static void main(String[] args) {
        Animal c = new Cat();
        c.speak();
    }
}
