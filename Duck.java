// Duck.java
package Week10;

public class Duck extends Animal {
    public void speak(){
        System.out.println("QUACK");
    }

    public static void main(String[] args) {
        Animal u = new Duck();
        u.speak();
    }
}

