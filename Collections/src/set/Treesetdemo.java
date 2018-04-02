package set;
import java.util.Iterator;
import java.util.TreeSet;

public class Treesetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts=new TreeSet<String>();
		ts.add("s");
		ts.add("r");
		ts.add("s");
		ts.add("sony");
		//ts.size(ts);
		//ts.addAll(ts);
		//ts.removeAll(ts);


		ts.isEmpty();

		for(String s:ts)
		{                              
			System.out.println(s);       		
		}

		Iterator itr=ts.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  


		}

	}

}


