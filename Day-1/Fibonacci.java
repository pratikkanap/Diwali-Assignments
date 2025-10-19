import java.util.Scanner;

public class Fibonacci {

    public static void Fib(int num) {
        int first = 0;
        int second = 1;
        int sum;

        System.out.print("Fibonacci are : ");

        for (int i = 1; i <= num; i++) {
            System.out.print(first+"  ");
            sum = first + second;
            first = second;
            second = sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        Fib(n);
    }
}
