//base class
class one {
    public void print_data()
    {
        System.out.println("Hello World! ");
    }
} 

//subclass
class two extends one {
    public void print_more() { 
        System.out.println("Are you ready?"); 
    }
}

//Driver class
public class SingleInheritance {
    public static void main(String[] args)
    {
        two output = new two();
        output.print_data();
        output.print_more();
        output.print_data();
    }
}
