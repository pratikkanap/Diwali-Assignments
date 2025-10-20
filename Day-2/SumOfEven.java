import java.util.Scanner;

public class SumOfEven{
    public static int sumofEven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 2 * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        
        int sum = sumofEven(n);
        System.out.println("Sum of even numbers is : " + sum);
        
        
    }
}
