package inheritance;

public class BlueVehicle extends RedVehicle{ // multilevel inheritance
	public void color()
	{
		System.out.println("Blue color code implemented");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlueVehicle a=new BlueVehicle();
		a.breaksystem();
		a.enginesystem();
		a.gearsystem();
		a.color();
		
	}

}
