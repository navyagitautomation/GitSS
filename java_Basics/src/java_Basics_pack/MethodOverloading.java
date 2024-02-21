package java_Basics_pack;

public class MethodOverloading {

	public void getdata()
	{
		System.out.println(" getdata 1"); 
	}
	public void getdata(int a)
	{
		System.out.println(" getdata 1" +a); 
	}
	public void getdata(String c)
	{
		System.out.println(" getdata 1" + c); 
	}
	public void getdata(int a,int b)
	{
		System.out.println(" getdata 1" +a +""+ b); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading a=new MethodOverloading();
		a.getdata();
		a.getdata(4);
		a.getdata("hello");
		a.getdata(2, 1);

	}

}
