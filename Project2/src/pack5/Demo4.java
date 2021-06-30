package pack5;

import java.util.ArrayList;
import java.util.Set;
import java.util.ListIterator;

public class Demo4 {

	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<String>();
		s.add("java");
		s.add("python");
		s.add("java script");
		s.add("azure");
		System.out.println(s);
		ListIterator<String> var=s.listIterator();
		while(var.hasNext())
		{
		String val=var.next();
		if(val.contains("java"));
			
			
					var.remove();
				}
				
					

		System.out.println(s);
		
		}
		
		
		
	

	}


