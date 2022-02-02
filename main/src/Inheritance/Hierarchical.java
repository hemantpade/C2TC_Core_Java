package Inheritance;
class Shape {
	   public void display() {
	      System.out.println("Inside display");
	   }
	}
	class Rectangle extends Shape {
	   public void area() {
	      System.out.println("Inside area");
	   }
	}
	class Cube extends Shape{
		public void volume() {
			System.out.println("Inside volume");
		}
	}
public class Hierarchical {

	public static void main(String[] args) {
		Cube c=new Cube();
		c.display();
		c.volume();
		c.area();
	}

}
