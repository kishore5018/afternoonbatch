package list;
import java.util.ArrayList;
import java.util.Iterator;

public class Nongenericarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();//it is generic collection
		al.add("swathi");
		al.add("rishi");
		al.add("sunny");
		al.add("sathwik");

		System.out.println(al);
		System.out.println(al.toString());
	
		/*for(String s:al) in nongeneric foreach loop is not working
		  {
			System.out.println(s);       
		}*/

		Iterator itr=al.iterator();  
		while(itr.hasNext())
							{  
			System.out.println(itr.next());  


		}

	}
}
