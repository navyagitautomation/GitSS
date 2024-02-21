package java_Basics_pack;

public class IntefaceChild implements ParentInterface ,Parent2interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentInterface a=new IntefaceChild();
		a.getdata3();
		a.getdata2();
		
		Parent2interface b=new IntefaceChild();
		
		
	}

	
	public void getdata1() {
		// TODO Auto-generated method stub
		System.out.println(" interface 1"); 
	}


	public void getdata2() {
		// TODO Auto-generated method stub
		System.out.println(" interface 2"); 
	}

	
	public void getdata3() {
		// TODO Auto-generated method stub
		System.out.println(" interface 3"); 
	}


	@Override
	public void getdata21() {
		// TODO Auto-generated method stub
		System.out.println(" parent 2"); 
	}

}
