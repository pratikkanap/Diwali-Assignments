import java.util.Scanner;

public class GCDLCM {
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int LCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter second number : ");
        int b = scanner.nextInt();

        int gcd = GCD(a, b);
        int lcm = LCM(a, b, gcd);

        System.out.println("GCD is : " + gcd);
        System.out.println("LCM is : " + lcm);
    }
}
