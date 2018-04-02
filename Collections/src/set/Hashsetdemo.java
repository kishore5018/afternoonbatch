package set;
import java.util.*;
public class Hashsetdemo {
	
public static void main(String[] args) {
				
		HashSet<String> set=new HashSet<String>();  
		  set.add("R");  
		  set.add("V");  
		  set.add("R");  
		  set.add("f");  
		  
		  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		 	  
		  }
		  
		  for(String s:set)
		  {
			  System.out.println(s);
		  }
		  
}  
		
	
}

