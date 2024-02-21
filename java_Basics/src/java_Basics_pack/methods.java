package java_Basics_pack;

public class methods {

	
	// Methods : block of code 
	public void methoddefnition()
	{
		System.out.println( "This is a method"); 
		System.out.println( "Block of code is called as method"); 
			
	}
	
	public void addition()
	{
		int a=1;
		int b=3;
		int sum=a+b;
		System.out.println("Sum"+sum); 
	}
	public void sub()
	{
		int a=12;
		int b=22;
		int sub=a-b;
		System.out.println("sub= "+ sub);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an object for class methods
		// Classname objectname =new Classname();
		// classname --> methods 
		methods a=new methods();
		a.addition();
		a.sub();
		a.methoddefnition();
		a.addition();

	}

}
