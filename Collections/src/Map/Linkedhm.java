package Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Linkedhm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  

		hm.put(15,"ahks");  
		hm.put(11,"Vjhdk");  
		hm.put(12,"Ruiak");
		hm.put(1,"geetha");
		hm.remove(11);

		for(Entry<Integer, String> m:hm.entrySet())
		{  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
	}  
}  

