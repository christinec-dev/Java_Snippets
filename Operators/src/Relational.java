// == != > < >= <=

class Equal {
    public void Eq() {
         // Initializing variables
         int var1 = 5, var2 = 10, var3 = 5;
 
         // Displaying var1, var2, var3
         System.out.println("Var1 = " + var1);
         System.out.println("Var2 = " + var2);
         System.out.println("Var3 = " + var3);
  
         // Comparing var1 and var2 and
         // printing corresponding boolean value
         System.out.println("var1 == var2: " + (var1 == var2));
  
         // Comparing var1 and var3 and
         // printing corresponding boolean value
         System.out.println("var1 == var3: " + (var1 == var3));
    } 
}

class NotEqual  {
    public void NE() {
      // Initializing variables
      int var1 = 5, var2 = 10, var3 = 5;
 
      // Displaying var1, var2, var3
      System.out.println("Var1 = " + var1);
      System.out.println("Var2 = " + var2);
      System.out.println("Var3 = " + var3);

      // Comparing var1 and var2 and
      // printing corresponding boolean value
      System.out.println("var1 == var2: "+ (var1 != var2));

      // Comparing var1 and var3 and
      // printing corresponding boolean value
      System.out.println("var1 == var3: " + (var1 != var3));
    } 
}

class GreaterThan {
    public void GT() 
        {
         // Initializing variables
         int var1 = 30, var2 = 20, var3 = 5;
 
         // Displaying var1, var2, var3
         System.out.println("Var1 = " + var1);
         System.out.println("Var2 = " + var2);
         System.out.println("Var3 = " + var3);
  
         // Comparing var1 and var2 and
         // printing corresponding boolean value
         System.out.println("var1 > var2: " + (var1 > var2));
  
         // Comparing var1 and var3 and
         // printing corresponding boolean value
         System.out.println("var3 > var1: " + (var3 >= var1));
    }
}

class LessThan {
    public void LE() 
    {
        // Initializing variables
        int var1 = 10, var2 = 20, var3 = 5;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 < var2: " + (var1 < var2));
 
        // Comparing var2 and var3 and
        // printing corresponding boolean value
        System.out.println("var2 < var3: " + (var2 < var3));
    }
}

class GreaterEqual {
    public void GE() 
    {
      // Initializing variables
      int var1 = 20, var2 = 20, var3 = 10;
 
      // Displaying var1, var2, var3
      System.out.println("Var1 = " + var1);
      System.out.println("Var2 = " + var2);
      System.out.println("Var3 = " + var3);

      // Comparing var1 and var2 and
      // printing corresponding boolean value
      System.out.println("var1 >= var2: " + (var1 >= var2));

      // Comparing var2 and var3 and
      // printing corresponding boolean value
      System.out.println("var2 >= var3: " + (var3 >= var1));
    }
}

class LessEqual {
    public void LE() 
    {
      // Initializing variables
      int var1 = 20, var2 = 20, var3 = 10;
 
      // Displaying var1, var2, var3
      System.out.println("Var1 = " + var1);
      System.out.println("Var2 = " + var2);
      System.out.println("Var3 = " + var3);

      // Comparing var1 and var2 and
      // printing corresponding boolean value
      System.out.println("var1 <= var2: " + (var1 >= var2));

      // Comparing var2 and var3 and
      // printing corresponding boolean value
      System.out.println("var2 <= var3: " + (var3 >= var1));
    }
}
  
public class Relational {
    public static void main(String[] args) throws Exception {
        Equal equal = new Equal();
        NotEqual notEqual = new NotEqual();
        GreaterThan greaterThan = new GreaterThan();
        LessThan lessThan = new LessThan();
        GreaterEqual greaterEqual = new GreaterEqual();
        LessEqual lessEqual = new LessEqual();

        equal.Eq();
        notEqual.NE();
        greaterThan.GT();
        lessThan.LE();
        greaterEqual.GE();
        lessEqual.LE();
    }
}
