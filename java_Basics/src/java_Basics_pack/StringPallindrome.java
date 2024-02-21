package java_Basics_pack;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Madam"; // madaM
		// to check pallindrome first reverse the string
		// reverse
		String d="";
		for(int i=s.length()-1;i>=0;i--)
		{
			d=d+s.charAt(i);
		}
		System.out.println("REVERSE STRING IS  =    "+d);
		
		// to check string is pallindrome compare given string and reverse string
		if(s.equalsIgnoreCase(d))// s==d
		{
			System.out.println("Given string is pallindrome");
		}
		else
		{
			System.out.println("Given string is not pallindrome");
		}
		
	}

}
