package Inheritance;
class Shape {
	    void display() {
	      System.out.println("I am parent class");
	   }
	}
	class Rectangle extends Shape {
	   void area() {
	      System.out.println("I am child class");
	   }
	}

public class Inheritance {

	public static void main(String[] args) {
	Rectangle s=new Rectangle();
	
   s.display();
   s.area();
	}

}
