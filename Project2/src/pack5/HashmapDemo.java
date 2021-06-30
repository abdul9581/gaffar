package pack5;

import java.util.HashMap;
import java.util.Set;


public class HashmapDemo {

	public static void main(String[] args) 
	
	{
		HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
		
		h.put(10, 100);
		h.put(20, 200);
		h.put(10, 300);
		h.put(40, 400);
		System.out.println(h);
		System.out.println(h.get(40));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		Set<Integer> keys=h.keySet();
		for(Integer k:keys)
		{
			System.out.println(k + "------" + h.get(k));
		}
		
	}

}
