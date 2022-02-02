package main;

public class outer {
	static int a=10;
	static int b=100;
	
	static class inner
	{
		 static void methode_demo() {
		System.out.println("I am inner class");
		System.out.println(b);
		System.out.println(a);
		 }
	}
    
	public static void main(String[] args) {
		outer.inner obj=new outer.inner();
		obj.methode_demo();
	}

}
