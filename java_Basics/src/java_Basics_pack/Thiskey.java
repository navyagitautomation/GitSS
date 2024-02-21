package java_Basics_pack;

public class Thiskey {

	int a=7;
	final public void getdata()
	{
		int a=11;
		System.out.println(this.a);
	}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int c=2;
	
		
		
		Thiskey a=new Thiskey();
		a.getdata();
	}

}
