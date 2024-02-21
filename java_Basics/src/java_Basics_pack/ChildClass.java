package java_Basics_pack;

public class ChildClass extends ParentClass {

	public void getdata()
	{
		super.getdata();
		System.out.println("This is child class getdata"); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass a=new ChildClass();
		a.getdata();
		
	}

}
