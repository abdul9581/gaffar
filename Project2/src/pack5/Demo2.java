package pack5;
import java.util.HashMap;


public class Demo2 {

	public static void main(String[] args) 
	{
		HashMap<String, String> h = new HashMap<String, String>();
        
        h.put("s1", "java");
        h.put("s2", "phython");
        h.put("s3","selinium");
        System.out.println(h);
        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s5", "azure");
        subMap.put("s4", "aws");
        h.putAll(subMap);
        System.out.println(h);

	}

}
