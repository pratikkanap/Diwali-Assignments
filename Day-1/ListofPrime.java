import java.util.Scanner;

public class ListofPrime {
	
 public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2 ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println("The of all prime number are :");
		for(int i =2;i<num;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
