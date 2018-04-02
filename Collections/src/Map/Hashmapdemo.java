package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();

		hm.put(3,"friend");

		hm.put(2, "friend");
		hm.put(1, "gds");
		hm.put(1, "gdf");
		hm.remove(3);

		for(Map.Entry m:hm.entrySet())

		{
			System.out.println(m.getKey()+" "+m.getValue());

		}
	}

}
