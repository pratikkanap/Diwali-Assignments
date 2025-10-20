import java.util.Scanner;
public class ReverseNum{
    public static int revNum(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;          
            rev= rev * 10 + digit;  
            n = n / 10;                  
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int rev = revNum(num);
        System.out.println("Reverse number: " + rev);
    }
}
