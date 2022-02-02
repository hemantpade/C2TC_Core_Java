package Inheritance;
class College {
	void name() {
	System.out.println("phcet");
	}
}
class EE extends College {
	void Elec() {
	System.out.println("60 students");
	}
}
class Extc extends College{
	void EXTC() {
	System.out.println("120 students");
	}
}
class IT extends College{
	void It() {
	System.out.println("125 students");
	}
}


public class MLInheritance
{

	public static void main(String[] args)
	{
		College obj = new College();
		//obj.Elec();
		obj.name();
		//obj.EXTC();
		//obj.It();

	}
}



