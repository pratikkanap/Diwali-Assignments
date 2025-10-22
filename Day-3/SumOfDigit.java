import java.util.Scanner;
public class SumOfDigit{
    public static int sumofdig(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;  
            n = n/10;        
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an num : ");
        int n = scanner.nextInt();
        int res = sumofdig(n);
        System.out.println("Sum of digit are : " + res);
    }
}
