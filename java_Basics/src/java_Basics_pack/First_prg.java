package java_Basics_pack;

public class First_prg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Hello World");
		
		int a[]= {12,34,67,43,11,2,12};
		
		
		int min=a[0];// 12
		System.out.println("minimum");
		for(int i=0;i<a.length;i++)// 0 <7 1<7 2<7 3<7 4<7  5<7 6<7 7<7
		{
			System.out.println(a[i]);   // 12  34  67 43 11 2 12
			
			
			if(a[i]<min)  // 12 <12    34<12  67<12 43<12 11<12   2<11  12<2
			{
				min=a[i]; //min=11   min=2
			}
			
		}
		
		System.out.println(" to print max value");
		int max=a[0];
		for(int i=0;i<a.length;i++)// 0 <7 1<7 2<7 3<7 4<7  5<7 6<7 7<7
		{
			System.out.println(a[i]);   // 12  34  67 43 11 2 12
			
			
			if(a[i]>min)  // 12 <12    34<12  67<12 43<12 11<12   2<11  12<2
			{
				min=a[i]; //min=11   min=2
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println(" minimum value=  " +min);
		
		String fruits[]= {"apple","banana","mango","kiwi"};
		System.out.println(fruits[3]); 
		for(int i=0;i<fruits.length;i++)
		{
			System.out.println(fruits[i]); 
			
		}
		
		
		
		
		
		
		
		
		
	}

}
