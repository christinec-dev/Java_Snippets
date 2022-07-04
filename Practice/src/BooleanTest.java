import java.io.*;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
                        
        // Asking for input from user
        System.out.println("Enter a Whole Number : ");
                    
        // Double reading internally
        int num = Integer.parseInt(bfn.readLine());
                        
        // Checking if its positive or negatice
        if (num >= 0)
        {
            System.out.println("The number is Positive");
        }  
        else {
            System.out.println("The number is Negative");
        }   
    }
}
