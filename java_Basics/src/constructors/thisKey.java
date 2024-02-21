package constructors;

public class thisKey {
	
	int a=2;
	public void getdata()
	{
		int a=87;
		System.out.println("The value of a= "+a);
		System.out.println("value of a outside method is "+this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKey b=new thisKey();
		b.getdata();
	}

}
