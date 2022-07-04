import java.io.*;

class Distance {
    public double DistanceConvert () throws IOException{
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
                        
        // Asking for input from user
        System.out.println("Enter Valuer of Inch : ");
                    
        // Double reading internally
        double inch = Double.parseDouble(bfn.readLine());
                        
        // Converting Degree
        double meters = inch *  0.0254;   

        return meters; 
    }
}

public class DistanceConverter {
    public static void main(String[] args) throws Exception {
        Distance distance = new Distance();
        double result = distance.DistanceConvert();

        System.out.println("This is equal to " + result + " meters");
    }
}
