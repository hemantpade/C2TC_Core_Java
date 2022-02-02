package Inheritance;
class s {
	   public void display() {
	      System.out.println("Inside display");
	   }
	}
	class r extends s {
	   public void area() {
	      System.out.println("Inside area");
	   }
	}
	class Cube extends r{
		public void volume() {
			System.out.println("Inside volume");
		}
	}

public class Practice {

	public static void main(String[] args) {
		Cube c=new Cube();
		c.display();
		c.area();
		c.display();
		
	}

}
