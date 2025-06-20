// Dog.java
package Week10;

public class Dog extends Animal {

    public void speak() {
        System.out.println("WOOF");
    }
    public static void main(String[] args) {
        Animal d = new Dog();
        d.speak();
    }
}
