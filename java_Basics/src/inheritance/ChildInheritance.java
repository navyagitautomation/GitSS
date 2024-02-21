package inheritance;

public class ChildInheritance extends Parentinheritance {
	
	public void setdata()
	{
		System.out.println("This is setdata in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInheritance a=new ChildInheritance();
		a.setdata();
		a.getdata();
		
	}

}
