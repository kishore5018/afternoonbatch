package set;

import java.util.*;
import java.lang.*;
class Ex
{
	int id;
	String name;
	String pswd;
	public Ex(int id, String name, String pswd) {
		super();
		this.id = id;
		this.name = name;
		this.pswd = pswd;
	}

}


public class Nongenerichs
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new  HashSet();
		Ex e1=new Ex(2,"geetha","nanna");
		Ex e2=new Ex(6,"swathi","amma");	
		hs.add(e1);
		hs.add(e2);

		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Ex e = (Ex) itr.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.pswd);
		}
		/*for(Ex e:hs)
		{
			System.out.println(id+" "+name+" "+pswd);		
		}*/

	}


}
