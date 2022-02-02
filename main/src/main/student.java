package main;

public class student {
	String firstName;
	String lastName;
	int yearofGraduation;
	Double GPA;
	
	

	public student(String firstName,String lastName,int yearofGraduation,Double GPA) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.yearofGraduation=yearofGraduation;
		this.GPA=GPA;
		
	}
	public  void incrementyearofGraduation() {
		this.yearofGraduation=this.yearofGraduation+1;
	}

	public static void main(String[] args) {
		student studentA= new student("hemant","pade",2022,9.0);
        student studentB=new student("shivam","singh",2021,8.5);
        
        studentA.incrementyearofGraduation();
        System.out.println(studentA.yearofGraduation);
	}

}
