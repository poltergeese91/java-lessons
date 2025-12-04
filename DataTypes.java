//java is a strongly types language, 
//when you define or declare a variable, you must also define the data type 

class DataTypeExamples 
{
    int myInt = 60;
    double my2b = 57.88;
    char myChar = 'A';
    boolean trfl = false;


}

public class DataTypes
{
public static void main(String[] args) 
    {
        DataTypeExamples dt = new DataTypeExamples();
        System.out.println("myInteger: " + dt.myInt);
        System.out.println("myDouble: " + dt.my2b);
        System.out.println("myCharacter: " + dt.myChar);
        System.out.println("myBoolean: " + dt.trfl);

    

    }
}