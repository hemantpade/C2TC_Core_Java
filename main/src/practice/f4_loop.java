package practice;
import java.util.Scanner;
public class f4_loop {

	public static void main(String[] args) {
		//print prime numbers
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int sum;
			sum=n+i;
			
			System.out.println(sum);
		}
		
	}

}
