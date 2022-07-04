public class ForLoops {
    public static void main(String[] args) throws Exception {
        //normal loop
        int sum = 0;
 
        // for loop begins and runs till x <= 20
        for (int x = 1; x <= 20; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);
        
        //infinite loop
        for (int i = 1; i >= 1; i++) {
            System.out.println("Infinite Loop " + i);
        }
    }
}
