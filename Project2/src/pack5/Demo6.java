package pack5;

import java.util.TreeMap;

public class Demo6 {

	public static void main(String[] args)
	
	{
		TreeMap<String,String> s=new TreeMap<String,String>();
		s.put("java","devlopers");
		s.put("python","developmet");
		
		s.put("java script","develop");
		s.put("azure","admin");
		System.out.println(s);
		TreeMap<String,String> sm=new TreeMap<String,String>();
sm.put("aws","admin");
sm.put("c","dev");
sm.putAll(s);
System.out.println(sm);
		

	}

}
