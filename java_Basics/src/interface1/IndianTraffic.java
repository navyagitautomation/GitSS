package interface1;

public class IndianTraffic implements CentralTraffic,ContinentalInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a=new IndianTraffic();
		a.GreenGo();
		a.redStop();
		IndianTraffic b=new IndianTraffic();
		b.Walking();
		ContinentalInterface c=new IndianTraffic();
		c.flashingYellow();
		

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop signal implemented");
		
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("Go signal implemented");
		
	}
	public void Walking()
	{
		System.out.println("Walking signal implemented");
	}

	@Override
	public void flashingYellow() {
		// TODO Auto-generated method stub
		System.out.println("wait  signal implemented");
		
	}

}
