import java.util.Scanner;

public class OddAndEven {
	public static void checkOddEven(int num) {
			if(num % 2 == 0) {
				System.out.println("The number is Even");
			}
			else {
				System.out.println("The number is odd");
			}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		checkOddEven(n);
		
	}

}
