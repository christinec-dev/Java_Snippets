// Extends built-in Thread class to create multithreading
// Why use Thread?
// We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.

class MultiThreadDemo extends Thread {
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


public class MultiThread {
    public static void main(String[] args) throws Exception {
        int n = 8;  // Number of threads
        for (int i = 0; i < n; i++)
        {
            MultiThreadDemo multiThreadDemo = new MultiThreadDemo();
            multiThreadDemo.start();
        }
    }
}
