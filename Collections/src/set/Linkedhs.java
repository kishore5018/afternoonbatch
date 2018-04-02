package set;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> al=new LinkedHashSet<String>();//it is generic collection
		al.add("swathi");
		al.add("rishi");
		al.add("sunny");
		al.add("sathwik");
		al.add("rishi");

		for(String s:al)
		{                               
			System.out.println(s);      
		}
		System.out.println("*****");
		Iterator itr=al.iterator();  
		while(itr.hasNext())
							{  
			
			System.out.println(itr.next());  
		}
		System.out.println("*****");
		System.out.println(al);
		System.out.println(al.toString());
	}

		
	}

