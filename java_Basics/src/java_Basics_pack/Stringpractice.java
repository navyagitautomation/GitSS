package java_Basics_pack;

public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="madaM";  // madam   madam  mom mom dad
		// Reverse a string
		
		
		String d="";
		
		for(int i=a.length()-1;i>=0;i--) //11 10 9   0 -1
		{
			//System.out.print(a.charAt(i));//12   a v a j gninrael
			d=d+a.charAt(i);
			
		}
		System.out.println("reverse string = "+d);
		// pallindrome    
		// madaM 
		// madam
		if(a.equalsIgnoreCase(d)) // a==d
		{
			System.out.println("given string is pallindrome");
		}
		else
		{
			System.out.println("given string is not a pallindrome"); 
		}
		
		
		
		
		
		
		
	}

}
