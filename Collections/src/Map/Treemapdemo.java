package Map;
import java.util.*;

public class Treemapdemo {

	public static void main(String[] args) {


		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();  

		tm.put(5,"Ammu");  
		tm.put(1,"bujji");  
		tm.put(1,"pandu");  
		tm.put(0,"chinni");

             
		for(Map.Entry m:tm.entrySet())
		{  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
	}

	
}
