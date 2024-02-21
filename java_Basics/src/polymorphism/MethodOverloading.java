package polymorphism;

public class MethodOverloading {

	public void getdata()
	{
		System.out.println("Getdata 1"); 
	}
	public void getdata(int a)
	{
		System.out.println("Getdata 1" +a); 
	}
	public void getdata(String a)
	{
		System.out.println("Getdata 1" +a); 
	}
	public void getdata(int a,int b)
	{
		System.out.println("Getdata a= "+a +" b=  "+b ); 
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.getdata();
		obj.getdata(23);
		obj.getdata("Hello");
		obj.getdata(21, 8);
	}

}
