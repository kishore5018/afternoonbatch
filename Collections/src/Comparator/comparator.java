package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class comparator {

	int id;
	String name;
	int age;
	public comparator(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}




	public static void main(String[] args) throws Exception
	{

		comparator c1=new comparator(6,"bunty",12);
		comparator c2=new comparator(2, "kutti", 14);
		comparator c3=new comparator(8,"chunty",24);

	ArrayList<comparator> al=new ArrayList<comparator>();
		
		al.add(c1);
		//al.add(null);
		al.add(c2);
		al.add(c3);

		//id comparison***

		Comparator<comparator> i = new Comparator<comparator>()
		{
			public int compare(comparator ob1, comparator ob2) {
				return ob1.id-ob2.id;
			}
		};

		Collections.sort(al,i);
		Iterator itr =al.iterator();
		while(itr.hasNext())
		{
			comparator o = (comparator) itr.next();
			System.out.println(o.id+" "+o.name+" "+o.age);
		}


		System.out.println();


		//name comparison***

		Comparator<comparator> n = new Comparator<comparator>() {


			public int compare(comparator ob1, comparator ob2) {
				// TODO Auto-generated method stub
				return ob1.name.compareTo(ob2.name);
			}

		};

		Collections.sort(al,n);
		Iterator itr1 =al.iterator();
		while(itr1.hasNext())
		{
			comparator o = (comparator) itr1.next();
			System.out.println(o.id+" "+o.name+" "+o.age);
		}
		System.out.println();

		//age comaparison***

		Comparator<comparator> a = new Comparator<comparator>()
		{
			public int compare(comparator ob1, comparator ob2) {
				return ob1.age-ob2.age;
			}
		};

		Collections.sort(al,a);
		Iterator itr2 =al.iterator();
		while(itr2.hasNext())
		{
			comparator o = (comparator) itr2.next();
			System.out.println(o.id+" "+o.name+" "+o.age);
		}


		
	}
}

