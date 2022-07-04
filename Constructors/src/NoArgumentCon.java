// no-argument constructor
class SomeClass {
    int num;
    String name;
 
    //Constructor without args (name, num)
    //this would be invoked while an objectof that class is created.
    SomeClass() { 
        System.out.println("Constructor called"); 
    }
}

public class NoArgumentCon {
    public static void main(String[] args) throws Exception {
        SomeClass someclass = new SomeClass();
 
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(someclass.name);
        System.out.println(someclass.num);
    }
}
