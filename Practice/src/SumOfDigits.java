import java.io.*;

class Digits {
    public double SumOfDigitsCalc () throws IOException{
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
                        
        // Asking for input from user
        System.out.println("Input an integer between 0 and 1000: ");
                    
        // Integer reading internally
        int num = Integer.parseInt(bfn.readLine());
                        
        // Calculation
        int firstDigit = num % 10;
        int remainingNumber = num / 10;

        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;

        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;

        int fourthDigit = remainingNumber % 10;

        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        return sum;
    }
}

public class SumOfDigits {
    public static void main(String[] args) throws Exception {
        Digits digits = new Digits();
        double result = digits.SumOfDigitsCalc();

        System.out.println("The sum of all digits is " + result);
    }
}
