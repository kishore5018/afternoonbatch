package Map;
import java.util.*;
public class Mapex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		
		m.put(3,"java");
		m.put(8, "testing");
		m.put(1, "dotnet");
		m.putAll(m);
		//Traversing Map  
		
		Set s=m.entrySet();//Converting to Set so that we can traverse  
		Iterator itr=s.iterator();  
		while(itr.hasNext()){  
			
			//Converting to Map.Entry so that we can get key and value separately  

			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" "+entry.getValue());  
		}  
	}  
}  

