import java.io.*;

class BMI {
    public double BMICalc () throws IOException{
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
                        
        // Asking for input from user
        System.out.println("Input weight in pounds : ");
        double weight = Double.parseDouble(bfn.readLine());

        System.out.println("Input height in inches : ");
        double height = Double.parseDouble(bfn.readLine());
                        
        // Converting Degree
        double bmi = (weight / (Math.pow(height, 2)) * 703);   

        return bmi; 
    }
}

public class BMICalculator {
    public static void main(String[] args) throws Exception {
        BMI bmi = new BMI();
        double result = bmi.BMICalc();

        System.out.println("Body Mass Index is " + result);
    }
}

