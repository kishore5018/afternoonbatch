package list;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();//it is generic collection
		al.add("swathi");
		al.add("rishi");
		al.add("sunny");
		al.add("sathwik");

		for(String s:al)//in collections two ways to iterate the elements
		{                               // 1:foreach(enhanced)
			System.out.println(s);       //2.iterator
		}
		Iterator itr=al.iterator();  
		while(itr.hasNext())
							{  
			System.out.println(itr.next());  


		}

	}
}
