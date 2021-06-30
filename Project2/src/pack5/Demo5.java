package pack5;

import java.util.HashMap;
import java.util.Set;

public class Demo5 {

	public static void main(String[] args) 
	{
		HashMap<String, String> hm = new HashMap<String, String>();
	     
        hm.put("cartoon network", "dragon ball");
        hm.put("pogo", "shinchan");
        hm.put("jetix","Power rangers");
        System.out.println(hm);
        Set<String> Keys =hm.keySet();
        for(String key:Keys)
        {
        	System.out.println(key);
        }
	}

}
