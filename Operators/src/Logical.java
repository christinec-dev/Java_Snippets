// && || !
class LogicalAnd {
    public void And() {
        // initializing variables
        int a = 10, b = 20, c = 20, d = 0;

        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);

        // using logical AND to verify two constraints
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
        {
            System.out.println("False conditions");
        }
    } 
}

class LogicalOr {
    public void Or() {
         // initializing variables
         int a = 10, b = 20, c = 20, d = 0;

         // Displaying a, b, c
         System.out.println("Var1 = " + a);
         System.out.println("Var2 = " + b);
         System.out.println("Var3 = " + c);
 
         // using logical OR to verify one constraint
         if ((a < b) || (b == c)) {
             d = a + b + c;
             System.out.println("The sum is: " + d);
         }
         else
         {
             System.out.println("False conditions");
         }
    } 
}

class LogicalNot {
    public void Not() 
        {
            // initializing variables
            int a = 10, b = 1;

            // Displaying a, b, c
            System.out.println("Var1 = " + a);
            System.out.println("Var2 = " + b);
        
            // Using logical NOT operator
            System.out.println("!(a < b) = " + !(a < b));
            System.out.println("!(a > b) = " + !(a > b));
    }
}

class Logical {   
    public static void main(String[] args)
    {
        LogicalAnd logicalAnd = new LogicalAnd();
        LogicalOr logicalOr = new LogicalOr();
        LogicalNot logicalNot = new LogicalNot();

        logicalAnd.And();
        logicalOr.Or();
        logicalNot.Not();
    }
}
