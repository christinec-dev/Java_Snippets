public class Variables {
    //Instance variables 
    public int age;

    //Static Variables
    public static String name = "Christine"; 

    // Initializing Instance Variable
    public Variables()
    { 
        this.age = 43; 
    }

    public static void main(String[] args) throws Exception {
        //object creation to call instance variable 
        Variables instance = new Variables();
        
        //local variables
        int var = 10;

        System.out.println(instance.age);
        System.out.println(name);
        System.out.println(var);
    }
}
