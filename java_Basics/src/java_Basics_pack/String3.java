package java_Basics_pack;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String 
		String a=new String("Java learning");
		
		//
		String b="Java learning basics";
		
		
		System.out.println(b.charAt(0));
		System.out.println(b.indexOf("e"));
		System.out.println(b.substring(5)); 
		System.out.println(b.substring(5, 10));
		System.out.println(b.concat("Started"));
		System.out.println(b.equals("Java"));
		
		if(a.equals(b))
		{
			System.out.println("a and b are equal");
		}
		else 
		{
			System.out.println("a and b are not equal");
		}
		
		
	}

}
