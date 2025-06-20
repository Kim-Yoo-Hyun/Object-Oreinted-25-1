package Week10;

public class TypeCompatibility {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.writeOutput();

        Person p2 = new Person("Yoo Hyun");
        p2.writeOutput();

        p1.setName("Kim");
        System.out.println("p1.getName(): " + p1.getName());
        System.out.println("p1.hasSameName(p2) " + p1.hasSameName(p2));
        
        System.out.println("---------------------------");

        Student s = new Student();
        s.writeOutput();

        Student s1 = new Student();
        s1.writeOutput();

        Student s2 = new Student("Yoo Han", 12345);
        s2.writeOutput();

        s1.reset("Kum", 23456);
        System.out.println("s1.getName(): " + s1.getName());            
        System.out.println("s1.getStudentNumber(): " + s1.getStudentNumber());  

        s1.setStudentNumber(34567);
        System.out.println("s1.getStudentNumber() after set: " + s1.getStudentNumber()); 

        System.out.println("s1.equals(s2) " + s1.equals(s2)); 

        System.out.println("---------------------------");

        Undergraduate u1 = new Undergraduate();
        u1.writeOutput();

        Undergraduate u2 = new Undergraduate("Kom", 45678, 3);
        u2.writeOutput();

        u2.setLevel(4);
        System.out.println("u2.getLevel(): " + u2.getLevel());  

        u1.reset("Yoo Hun", 56789, 2);
        System.out.println("u1 after reset:");
        System.out.println("  Name: " + u1.getName());              
        System.out.println("  Student Number: " + u1.getStudentNumber());  
        System.out.println("  Level: " + u1.getLevel());             

        System.out.println("u1.equals(u2) " + u1.equals(u2)); 
        u1.writeOutput();

        System.out.println("---------------------------");
        System.out.println("Type Compatibility Test");

        Student s3  = new Student("TestStudent", 678910);
        Undergraduate u3 = new Undergraduate("TestUndergrad", 00000, 2);

        Person pStudent = s3; 
        Person pUndergraduate = u3; 

        System.out.println("pStudent: " + pStudent.getName());
        System.out.println("pUndergraduate: " + pUndergraduate.getName());

        Person pNewStudent = new Student("NewStudent", 11111);
        Person pNewUndergraduate = new Undergraduate("NewUndergraduate", 22222, 3);

        pNewStudent.writeOutput();    
        pNewUndergraduate.writeOutput(); 

        // Illegal Assignments
        // Student illegal1 = new Person();        // ILLEGAL!
        // Undergraduate illegal2 = new Person();     // ILLEGAL!
        // Undergraduate illegal3 = new Student();    // ILLEGAL!
        if (pNewUndergraduate instanceof Undergraduate) {
            Undergraduate Successug = (Undergraduate) pNewUndergraduate;
            System.out.println("Success Downcast: " + Successug.getLevel());
        }
        else{
            Undergraduate Failug = (Undergraduate) pStudent;
            Failug.writeOutput();
        }
    }   
}

