package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class comparable implements Comparable<comparable>
{
	int id;
	String name;
	int age;
	private ArrayList<comparable> al;

	public comparable(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comparable c1=new comparable(8,"swathi",26);
		comparable c2=new comparable(3,"rishi",7);
		comparable c3=new comparable(1,"sunny",2);
		comparable c4=new comparable(6,"sathwik",12);
		
		ArrayList<comparable> al = new ArrayList<comparable>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		
		Collections.sort(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			comparable obj=(comparable)itr.next();
			System.out.println(obj.id+" "+obj.name+" "+obj.age);
		}
	}

	public int compareTo(comparable obj) {
		// TODO Auto-generated method stub
		return this.id-obj.id;
	}


	}
