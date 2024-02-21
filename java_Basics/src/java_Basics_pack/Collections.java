package java_Basics_pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Java ArrayList class uses a dynamic array for storing the elements. 
		 * It is like an array, 
		 * but there is no size limit. We can add or remove elements anytime.
		 * The ArrayList in Java can have the duplicate elements 
		 **/
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      //Printing the arraylist object   
	      System.out.println(list); 
	      //Traversing list through Iterator  
	      Iterator itr=list.iterator();//getting the Iterator  
	      while(itr.hasNext()){//check if iterator has the elements  
	       System.out.println(itr.next());//printing the element and move to next 
	      }
	      
	    //accessing the element    
	      System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0  
	      //changing the element  
	      list.set(1,"Dates");  
	      
	      System.out.println(list); 
	     
	}

}
