package main;

public class triangle {
	Double base ;
	Double height;
	Double sidelenOne;
	Double sidelenTwo;
	Double sidelenThree;
	
	public triangle(Double base,Double height,	Double sidelenOne,Double sidelenTwo,Double sidelenThree) {
		
		this.base=base;
		this.height=height;
		this.sidelenOne=sidelenTwo;
		this.sidelenThree=sidelenThree;
	}
    public double findArea(){
    	return (this.base*this.height)/2;
    	
    	  
    }
	public static void main(String[] args) {
		triangle triangleA= new triangle(15.1,2.5,15.0,8.1,17.2);
		triangle triangleB= new triangle(12.0,7.1,13.0,8.0,9.1);
		
		Double triangleAArea=triangleA.findArea();
		System.out.println(triangleAArea);
	}

}
