package polymorphism;

public class ChildOverriding extends ParentOverriding {
	
	public void getdata()
	{
		System.out.println("CHild getdata ");
		super.getdata();// super- reffers to parent class
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildOverriding a=new ChildOverriding();
		a.getdata();
		a.setdata();
		
		
	}

}
