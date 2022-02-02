package main;
import java.util.Scanner;

public class findArray
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		//declaration
		int []a=new int[size];
		
		//initialization
		
		//input
		for(int i=0;i<size;i++)
		{
		 a[i]=sc.nextInt();
		 }

		int x =sc.nextInt();
		
		//output
		for(int i=0;i<size;i++)
		{
			if(a[i]==x) {
				System.out.println("the matching value of x is at "+i);
				
			}
		}
		
		
}
}
	
