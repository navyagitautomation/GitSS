package java_Basics_pack;

public class ChildInterface implements ParentInterfae1,NewInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ParentInterfae1 a=new ChildInterface();
		a.getdata1();
		a.getdata2();
		a.getdata3();
		
		ChildInterface b=new ChildInterface();
		b.childgetdata();
		
		NewInterface c=new ChildInterface();
		c.setdata();

	}

	public void childgetdata()
	{
		System.out.println("This is in class");
	}
	
	
	@Override
	public void getdata1() {
		// TODO Auto-generated method stub
		System.out.println(" Interface getdata1");
	}

	@Override
	public void getdata2() {
		// TODO Auto-generated method stub
		System.out.println(" Interface getdata2");
	}

	@Override
	public void getdata3() {
		// TODO Auto-generated method stub
		System.out.println(" Interface getdata2");
	}

	@Override
	public void setdata() {
		// TODO Auto-generated method stub
		System.out.println(" from new interface");
	}

}
