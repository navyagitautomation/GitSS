package methods2;

public class Arithematic2 {
	public void mul()
	{
		int a=9;
		int b=12;
		int mul=a*b;
		System.out.println(mul);
	}

	public static void main(String[] args) {
		
		Addtion a=new Addition();
		Subt b=new Subt();
		Multi c=new Multi();
		
		a.sum();
		b.sub();
		c.pro();
		
	}

}
