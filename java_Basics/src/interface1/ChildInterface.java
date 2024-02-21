package interface1;

public class ChildInterface   implements parentinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentinterface a=new ChildInterface();
		a.getdata();
		a.setdata();
	}

	@Override
	public void getdata() {
		// TODO Auto-generated method stub
		
		System.out.println("Getdata method ");
	}

	@Override
	public void setdata() {
		// TODO Auto-generated method stub
		System.out.println("Setdata method ");
	}

}
