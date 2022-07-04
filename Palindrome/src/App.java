import java.util.Scanner;  // Import the Scanner class

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object  
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter strinf");
        // Read user input
        String str = myObj.nextLine();
        //check if palindrome
        System.out.println(Palindrome.isPalindrome(str));   }
}
