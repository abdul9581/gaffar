package pack5;

import java.util.HashMap;


public class Demo8 {

	public static void main(String[] args) 
	{
		HashMap<String,String> s=new HashMap<String,String>();
		s.put("java","devlopers");
		s.put("python","developmet");
		
		s.put("java script","develop");
		s.put("azure","admin");
		System.out.println("My Hash Map---:"+s);  
		System.out.println("clearing HashMap");
		s.clear();
		System.out.println(s);
		

	}

}
