package java_Basics_pack;

public  class NewChildVehicle extends AbstractVehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewChildVehicle a=new NewChildVehicle();
		a.breaksystem();
		a.enginesystem();
		a.gearsystem();
		a.colour();
	}

	@Override
	public void gearsystem() {
		// TODO Auto-generated method stub
		System.out.println("gear system code implemented"); 
	}

	@Override
	public void breaksystem() {
		// TODO Auto-generated method stub
		System.out.println("break system code implemented"); 
	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("colour system code implemented"); 
	}

	

}
