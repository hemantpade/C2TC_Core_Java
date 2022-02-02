package hello;
import java.util.Scanner;

   public class practice
   
   {
	   String name;
	   int age;
	   int roll;
	   practice(){
		   this.name=name;
		   this.age=age;
		   this.roll=roll;
		   System.out.println("i am constructor");
		   }
	 
	   
	public static void main(String[] args)  
	{
		
		//constructor
		String name;
		   int age;
		   int roll;
		Scanner input =new Scanner(System.in);
		name=input.nextLine();
		age=input.nextInt();
		roll=input.nextInt();
		
		
		practice s1= new practice();
		practice s2= new practice();
		practice s3= new practice();
		practice s4= new practice();
		
		System.out.println("name " +s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		}
   }


