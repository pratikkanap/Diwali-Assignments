import java.util.Scanner;

public class Pallindrome{
    public static boolean isPalin(int num) {
        int org = num;
        int rev = 0;

        while (num != 0) {
            int digit = num%10;       
            rev = rev*10+digit;  
            num = num/10;               
        }

        return org == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if (isPalin(num)) {
            System.out.println("number is Palindrome");
        } else {
            System.out.println("number is not a Palindrome.");
        }
    }
}
