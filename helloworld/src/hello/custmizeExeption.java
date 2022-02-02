package hello;
import java.util.Scanner;
public class custmizeExeption {
	
public static void main(String[] args) 
	{
		
		 System.out.println("Enter your age");
		    int age;
		  Scanner s = new Scanner(System.in);
		    age= s.nextInt();
		    
		    if(age<18)  {
		    throw new CantDrive ("You can't drive");
		      }
		    else{
		      System.out.println("You can drive");
		     } 
   }
}
		   
		  class CantDrive extends RuntimeException
		  {
		    CantDrive (String S)
		    {
		    super(S);
		    
		    }
		    
	}


