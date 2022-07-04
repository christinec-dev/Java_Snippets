//via overriding

class Parent {
    void Print() 
    {
        System.out.println("parent class");
    }
}

class Child extends Parent {
    void Print() 
    {
        System.out.println("child class");
    }
}

class Sibling extends Parent {
 
    // Method
    void Print()
    {
 
        // Print statement
        System.out.println("sibling class");
    }
}

public class RuntimePoly {
    public static void main(String[] args)
    {
 
        // Creating object of class 1
        Parent a;
 
        // Now we will be calling print methods
        // inside main() method
        a = new Child();
        a.Print();
        
        a = new Sibling();
        a.Print();
    }
}
