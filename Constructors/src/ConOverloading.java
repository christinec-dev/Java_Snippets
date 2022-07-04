
import java.io.*;

class SomeClass
{
    // constructor with one argument
    SomeClass(String name)
    {
        System.out.println("Constructor with one " + "argument - String : " + name);
    }
 
    // constructor with two arguments
    SomeClass(String name, int age)
    {
 
        System.out.println("Constructor with two arguments : " + " String and Integer : " + name + " "+ age);
 
    }
 
    // Constructor with one argument but with different type than previous..
    SomeClass(long id)
    {
        System.out.println("Constructor with one argument : " + "Long : " + id);
    }
}


class ConOverloading {
    public static void main(String[] args)
    {
        // Creating the objects of the class named 'SomeClass' by passing different arguments
 
        // Invoke the constructor with one argument of type 'String'.
        SomeClass someClass2 = new SomeClass("Christine");
 
        // Invoke the constructor with two arguments
        SomeClass someClass3 = new SomeClass("Coomans", 23);
 
        // Invoke the constructor with one argument of type 'Long'.
        SomeClass someClass4 = new SomeClass(1234546789);
    }
}
