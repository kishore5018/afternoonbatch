import java.util.Comparator;
import java.util.TreeSet;

import Comparator.comparator;

public class comparator1 implements Comparator<comparator1>{

	int id;
	String name;
	int age;
	public comparator1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comparator1 c1=new comparator1(6,"bunty",12);
		comparator1 c2=new comparator1(2, "kutti", 14);
		comparator1 c3=new comparator1(8,"chunty",24);
		TreeSet<comparator1> ts=new TreeSet<comparator1>();
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		
		
		
		
	}





	@Override
	public int compare(comparator1 obj1, comparator1 obj2) {
		// TODO Auto-generated method stub
		return obj1.name.compareTo(obj2.name);
	}

}
