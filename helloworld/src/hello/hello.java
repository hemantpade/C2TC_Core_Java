package hello;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		String question ="what is your fav colour?";
		String choiceOne="blue";
		String choiceTwo="black";
		String choiceThree="green";
		
		String correctAns=choiceTwo;
		
		
		System.out.println("choose one of the following :");
		System.out.println(choiceOne);
		System.out.println(choiceTwo);
		System.out.println(choiceThree);
		
		Scanner Scanner=new Scanner(System.in);
		String input=Scanner.next();
		if(correctAns.equals(input)) {
			System.out.println("congrats,your ans is correct");
		}
		else {
			System.out.println("your incorrect,the correct ans is choiceTwo");
		}
	}

}
