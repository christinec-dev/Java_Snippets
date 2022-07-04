// Parameterized Constructor

// Class 1
class SomeClass {
    // data members of the class.
    String name;
    int num;
 
    // Constructor would initialize data members
    // With the values of passed arguments while
    // Object of that class created
    SomeClass(String name, int num)
    {
        this.name = name;
        this.num = num;
    }
}

class ParameterizedCon {
    public static void main(String[] args)
    {
        SomeClass someclass = new SomeClass("christine", 12);
        
        System.out.println("Name :" + someclass.name + " and Number :" + someclass.num);
    }
}
