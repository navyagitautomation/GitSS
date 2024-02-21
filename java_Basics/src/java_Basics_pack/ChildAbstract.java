package java_Basics_pack;

public class ChildAbstract extends ParentAbstract {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstract a=new ChildAbstract();
		a.Carbreak();
		a.Carcolour();
		a.CarEngine();

	}

	@Override
	public void Carcolour() {
		// TODO Auto-generated method stub
		System.out.println("  colour code implemented");
	}

}
