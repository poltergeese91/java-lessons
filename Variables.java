// 2 types of variables: static and instance
// variables use camelCase
// constants use uppercase

class Student 
{
    String studentName; // instance variable belongs to object
    static int studentCount = 0; // static variable belongs to class
    static final String SCHOOL_NAME = "CSAEA"; // final variable cannot be changed

    Student(String n) 
    {
        studentName = n;
        System.out.println("This students name is " + n);
        studentCount++;
        System.out.println("There are " + studentCount + " students.");
    }   

}

public class Variables 
{
    public static void main(String[] args) 
    {
        
        new Student("George");
    }
    
}
