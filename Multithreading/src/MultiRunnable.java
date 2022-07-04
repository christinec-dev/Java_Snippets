// Implements built-in Runnable interface to create multithreading
// Why use Runnable?
// If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.

class MultiThreadDemo implements Runnable {
    public void run() {
        try {            
            // Displaying the thread that is running
            System.out.println(Thread.currentThread().getId());
        } 
        catch (Exception e)
        {
            System.out.println("Exception caught");
        }
    }
}

public class MultiRunnable {
    public static void main(String[] args) throws Exception {
        int n = 8;  // Number of threads
        for (int i = 0; i < n; i++)
        {
            Thread multiThreadDemo = new Thread(new MultiThreadDemo()); 
            multiThreadDemo.start();
        }
    }
}

