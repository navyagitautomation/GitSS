package inheritance;

public class RedVehicle extends parentVehicle {
	
	public void colorcode()
	{
		System.out.println("Red color code implemented");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedVehicle a=new RedVehicle();
		a.enginesystem();
		a.breaksystem();
		a.gearsystem();
		a.color();
		
		
	}

}
