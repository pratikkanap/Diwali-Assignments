import java.util.Scanner;

public class Armstrong{

    public static boolean isArmstr(int n) {
        int org = n;
        int sum = 0;
        int num = 0;
        int temp = n;
        while (temp != 0) {
            num++;
            temp = temp/10;
        }
        temp = n;
        while (temp != 0) {
            int d = temp % 10;
            sum += Math.pow(d, num);
            temp /= 10;
        }

        return sum == org;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isArmstr(num)) {
            System.out.println("num is an Armstrong");
        } else {
            System.out.println("num is not Armstrong");
        }
    }
}
