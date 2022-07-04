import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int firstNum, secondNum, max, step, lcm = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNum = scanner.nextInt();

        System.out.println("Enter second number: ");
        secondNum = scanner.nextInt();

        if(firstNum > secondNum)
        {
            max =  step = firstNum;
        }
        else 
        {
            max = step = secondNum;
        }

        while(firstNum != 0)
        {
            if (max % firstNum == 0 && max % secondNum ==0)
            {
                lcm = max;
                break;
            }
            max += step;
        }
        System.out.println("The Lowest Common Multiple of the given numbers is: " + lcm);
    }
}
