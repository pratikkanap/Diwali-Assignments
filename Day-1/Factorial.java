import java.util.Scanner;

public class Factorial {
    public static int Fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("The factorial are : ");
        System.out.println(Fact(n));
    }
}
