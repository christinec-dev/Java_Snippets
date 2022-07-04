public class Palindrome {
    public static boolean isPalindrome(String str)
    {
        StringBuilder stringBuilder = new StringBuilder(str);

        //reverse string
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();

        //check if palindrome when reverssed
        if(str.equals(reverse)){
            return true;
        } 
        else {
            return false;
        }
    }
}
