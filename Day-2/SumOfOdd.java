import java.util.Scanner;

public class SumOfOdd{
    public static int sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 2 * i - 1; 
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sum = sumOfOdd(n);
        System.out.println("Sum of  odd numbers is: " + sum);
    }
}
