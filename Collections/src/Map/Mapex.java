package Map;
import java.util.*;
import java.util.Map.Entry;//  generic(new)
public class Mapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map=new HashMap<Integer,String> ();
		map.put(1,"geetha");
		map.put(5,"swa");
		map.put(3,"supraja");
		 for(Map.Entry m:map.entrySet())
		 {  
			   System.out.println(m.getKey()+" "+m.getValue());

}
	}
}
