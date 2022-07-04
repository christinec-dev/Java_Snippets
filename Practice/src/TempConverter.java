import java.io.*;

class Converter{
    public double Conversion () throws IOException{
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
                        
        // Asking for input from user
        System.out.println("Enter Degree in Farhenheit : ");
                    
        // Integer reading internally
        int farhenheit = Integer.parseInt(bfn.readLine());
                        
        // Converting Degree
        int celcius = (int)((farhenheit - 32) / 1.8);   

        return celcius; 
    }
}


public class TempConverter {
    public static void main(String[] args) throws Exception {
        Converter converter = new Converter();
        double result = converter.Conversion();

        System.out.println("This is equal to " + result + " degrees celcius");
    }
}
