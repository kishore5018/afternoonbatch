package Map;
import java.util.HashMap;
import java.util.Map;

class Student {
	int id;
	String name;
	String pswd;
	
	public Student(int id, String name, String pswd) {
		super();
		this.id = id;
		this.name = name;
		this.pswd = pswd;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", pswd=" + pswd + "]";
	}
	
	
	}
	public class HmEx1
	{
		public static void main(String[] args)
		{
			Map<Integer,Student> m=new HashMap<Integer,Student>();
			Student s1=new Student(3,"siri","gjhj");
			Student s2=new Student(7,"sana","gsdkiu");
			Student s3=new Student(1,"sasi","ttrt");
			
			m.put(1,s1);
			m.put(2,s2);
			m.put(3,s3);
			
			for(Map.Entry e:m.entrySet())
			{
				/*int key=(int) entry.getKey();  
		        Student s=(Student) entry.getValue();  
		       
		        System.out.println(s.id+" "+s.name+" "+s.pswd+"");   */
		      
				System.out.println(e.getKey());
				System.out.println(e.getValue());
			}
			}
	}
			
		