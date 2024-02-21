package java_Basics_pack;

import java.util.ArrayList;
import java.util.Iterator;

public class Constructor1 {

	
	public static void main(String[] args) {
		
		int a[]= {7,4,6,7};
		// Arraylist 
		ArrayList<String> b=new ArrayList<String>();
		b.add("Hachion");
		b.add("shipra");
		b.add("Navya");
		b.add("Hachion");
		b.add("shipra");
		b.add("Navya");
		System.out.println(b.get(2));
		//b.remove(0);
		b.set(2, "New data");
		System.out.println(b.get(2));
		System.out.println(b);
		System.out.println(b.contains("navya"));
		System.out.println(b);
		b.set(1, "New");
		
		Iterator <String> i=b.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		System.out.println(a[2]);
		
		
	}

}
