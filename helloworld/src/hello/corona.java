package hello;
import java.util.Scanner;
public class corona {

	public static void main(String[] args) {
		System.out.println("enter your name");
		String Name;
		String Symptoms;
		String input="yes";
        Scanner s=new Scanner(System.in);
        Name=s.next();
        System.out.println("Do you have highfever,cough and headache");
        Symptoms=s.next();
        
        if(Symptoms.equals(input)) {
        	throw new covid ("you cant participate");
        	
        }
        else {
        	System.out.println("you can participate happily" +"  ,"+"thank you");
        }
	}

}
class covid extends RuntimeException {
	covid(String msg)
	{
		super(msg);
	}
}
