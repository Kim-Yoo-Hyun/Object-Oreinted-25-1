package Week10;

public class TypeTesting {

    public static void main(String[] args) {
        Person p = new Person("Kim");
        Student s = new Student("Yoo",      0001);
        Undergraduate u = new Undergraduate("Hyun", 0002, 3);

        Object[] objects = { p, s, u };

        for (Object obj : objects) {
            System.out.println("Testing " + obj.getClass().getSimpleName());
            System.out.println("instanceof Person: " + (obj instanceof Person));
            System.out.println("instanceof Student: " + (obj instanceof Student));
            System.out.println("instanceof Undergraduate: " + (obj instanceof Undergraduate));
            System.out.println();
        }
    }
}

