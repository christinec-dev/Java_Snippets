// = += -= *=

class Equal {
    public void Eq() {
        int num;
        String name;
 
        // Assigning values
        num = 10;
        name = "Christine";
 
        // Displaying the assigned values
        System.out.println("num is assigned: " + num);
        System.out.println("name is assigned: " + name);
    } 
}

class PlusEqual  {
    public void Add() {
        // Declaring variables
        int num1 = 10, num2 = 20;
 
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // Adding & Assigning values
        num1 += num2;
 
        // Displaying the assigned values
        System.out.println("num1 = " + num1);
    } 
}

class MinusEqual {
    public void Sub() 
        {
         // Declaring variables
         int num1 = 10, num2 = 20;
 
         System.out.println("num1 = " + num1);
         System.out.println("num2 = " + num2);
  
         // Subtracting & Assigning values
         num1 -= num2;
  
         // Displaying the assigned values
         System.out.println("num1 = " + num1);
    }
}

class TimesEqual {
    public void Multi() 
    {
        // Declaring variables
        int num1 = 10, num2 = 20;
 
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // Multiplying & Assigning values
        num1 *= num2;
 
        // Displaying the assigned values
        System.out.println("num1 = " + num1);
    }
}

class DivEqual {
    public void Div() 
    {
        // Declaring variables
        int num1 = 10, num2 = 20;
 
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // Dividing & Assigning values
        num1 /= num2;
 
        // Displaying the assigned values
        System.out.println("num1 = " + num1);
    }
}

class ModEqual {
    public void Mod() 
    {
        // Declaring variables
        int num1 = 10, num2 = 20;
 
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // Modulus & Assigning values
        num1 %= num2;
 
        // Displaying the assigned values
        System.out.println("num1 = " + num1);
    }
}

public class Assignment {
    public static void main(String[] args) throws Exception {
        Equal equal = new Equal();
        PlusEqual plusEqual = new PlusEqual();
        MinusEqual minusEqual = new MinusEqual();
        TimesEqual timesEqual = new TimesEqual();
        DivEqual divEqual = new DivEqual();
        ModEqual modEqual = new ModEqual();

        equal.Eq();
        plusEqual.Add();
        minusEqual.Sub();
        timesEqual.Multi();
        divEqual.Div();
        modEqual.Mod();
    }
}
    
