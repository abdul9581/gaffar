package pack5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo7 {

	public static void main(String[] args) 
	{
		HashMap<String, String> hm = new HashMap<String, String>();
	     
        hm.put("cartoon network", "dragon ball");
        hm.put("pogo", "shinchan");
        hm.put("jetix","Power rangers");
        System.out.println(hm);
        Set<Entry<String,String>> entries=hm.entrySet();
for(Entry<String,String> ent: entries)
{
	System.out.println(ent.getKey()+"----->>"+ent.getValue());
}
	}

}
