package main;
import java.util.Scanner;

class Array2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int colm=sc.nextInt();
		
		//declaration
		int[][] a=new int[row][colm];
		
		//input
		//row
		for(int i=0;i<row;i++) {
			for(int j=0;j<colm;j++) {
				//columns
				a[i][j]=sc.nextInt();
			}
		}
		int x=sc.nextInt();
		//output
		for(int i=0;i<row;i++) {
			for(int j=0;j<colm;j++) {
				if(a[i][j]==x) {
				System.out.println("x found at location is"+i+","+j);
				}
			}
		}
		//System.out.println();
	}

}
