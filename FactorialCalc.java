import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number to calculate its factorial: ");
        int userNum = scanner.nextInt();
        
        int factorial = 1;
        
        // Calculate factorial
        for (int i = userNum; i > 0; i--) {
            factorial *= i;
        }
        
        // Display answer
        System.out.println("Factorial of " + userNum + " is: " + factorial);
        
        scanner.close();
    }
}
