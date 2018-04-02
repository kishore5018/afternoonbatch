package list;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String> ();
		list.add("mother");
		list.add("father");
		list.add("sisters");
		list.add("family");

		for(String s: list)
		{
			System.out.println(s);
		}
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
	}
}