package pack5;

import java.util.HashMap;

public class Demo3 {

	public static void main(String[] args) 
	{
		
		  HashMap<String, String> hm = new HashMap<String, String>();
	     
	        hm.put("cartoon network", "dragon ball");
	        hm.put("pogo", "shinchan");
	        hm.put("jetix","Power rangers");
	        System.out.println(hm);
	        if(hm.containsKey("cartoon network")){
	            System.out.println("The hashmap contains key cartoon");
	        } else {
	            System.out.println("The hashmap does not contains key cartoon");
	        }
	        if(hm.containsKey("qushi tv")){
	            System.out.println("The hashmap contains key qushi tv");
	        } else {
	            System.out.println("The hashmap does not contains key qushi tv");
	        }
		
		
		
		
		
		
		
		
		
		
	}

}
