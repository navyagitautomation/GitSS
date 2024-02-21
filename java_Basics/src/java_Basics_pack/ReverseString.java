package java_Basics_pack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello" ; // olleh
		
// using FORMULA   d=d+str.charAt(i)
				
		String d="";
		for(int i=str.length()-1;i>=0;i--)
		{
			d=d+str.charAt(i);
		
		System.out.println("reverse string=  "+d);
		
		// PRINT GIVEN STRING IS PALLINDROME OR NOT
		// MADAM   MADAM   MOM MOM 
		
		if(str.equals(d))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println(" Not Pallindrome");
				
		}
	}

	}}
