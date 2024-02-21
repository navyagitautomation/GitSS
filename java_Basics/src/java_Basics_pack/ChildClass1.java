package java_Basics_pack;

public class ChildClass1  extends parentClass1{

	public void Childgetdata()
	{
		System.out.println("this is in child getdata"); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ChildClass1 a=new ChildClass1();
		a.Childgetdata();
		parentClass1 b=new parentClass1();
		b.parentgatdata();*/
		ChildClass1 a=new ChildClass1();
		a.Childgetdata();
		a.parentgatdata();
		a.getdata2();
		
	}

}
