package abstraction;

public class ChildVehicleA extends ParentVehicleA{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildVehicleA a=new ChildVehicleA();
		a.breaksys();
		a.Enginesys();
		a.gearsys();
		a.color();

	}

	@Override
	public void gearsys() {
		// TODO Auto-generated method stub
		System.out.println("Gear code");
	}

	@Override
	public void breaksys() {
		// TODO Auto-generated method stub
		System.out.println("break code");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("red color code");
	}

}
