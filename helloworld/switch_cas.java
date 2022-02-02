package practice;
import java.util.Scanner;
public class switch_cas {

	public static void main(String[] args) {
		char button ;
		 Scanner sc=new Scanner(System.in);
		// button=sc.next().charAt(0);
		System.out.println("Input a charactor");
		 button=sc.next().charAt(0);
		switch(button) {
		case 'a':
			System.out.println("hello");
			break;
		case 'b':
			System.out.println("namaste");
			break;
		case 'c':
			System.out.println("hola");
			break;
			default:
				System.out.println("I am still learning");
				break;
	}

}}
