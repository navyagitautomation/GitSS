package constructors;

public class Constructors {

	public void getdata()
	{
		System.out.println("This is a method");
	}
	
	public  Constructors()
	{
		System.out.println("THis is a CONSTRUCTOR");
	}
	public  Constructors(int a)
	{
		System.out.println("THis is a CONSTRUCTOR" +a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors a=new Constructors();// default  OR no-args Constructor
		Constructors b=new Constructors(1);//Parameterized
		
	}

}
