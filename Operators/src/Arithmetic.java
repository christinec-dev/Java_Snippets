// * / % + -

class Addition {
    public void Add() {
        // initializing variables
        int num1 = 10, num2 = 20, sum = 0;
        
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // adding num1 and num2
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    } 
}

class Subtraction  {
    public void Sub() {
        // initializing variables
        int num1 = 20, num2 = 10, sub = 0;
  
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
  
        // subtracting num1 and num2
        sub = num1 - num2;
        System.out.println("Subtraction = " + sub);
    } 
}

class Multiplication {
    public void Multi() 
        {
        // initializing variables
        int num1 = 20, num2 = 10, mult = 0;
  
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
  
        // Multiplying num1 and num2
        mult = num1 * num2;
        System.out.println("Multiplication = " + mult);
    }
}

class Division {
    public void Div() 
    {
        // initializing variables
        int num1 = 20, num2 = 10, div = 0;
  
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
  
        // Dividing num1 and num2
        div = num1 / num2;
        System.out.println("Division = " + div);
    }
}

class Modulus {
    public void Mod() 
    {
        // initializing variables
        int num1 = 5, num2 = 2, mod = 0;
  
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
  
        // Remaindering num1 and num2
        mod = num1 % num2;
        System.out.println("Remainder = " + mod);
    }
}

public class Arithmetic {
    public static void main(String[] args) throws Exception {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Modulus modulus = new Modulus();

        addition.Add();
        subtraction.Sub();
        multiplication.Multi();
        division.Div();
        modulus.Mod();
    }
}
