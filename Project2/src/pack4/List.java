package pack4;

import java.util.ArrayList;

public class List {

	public static void main(String[] args)
	
	{
		ArrayList a= new ArrayList();
        a.add(10);
        a.add("raji");
        a.add(10.23F);
        a.add(10);
        a.add(20);
        System.out.println(a);
System.out.println(a.get(2));   
System.out.println(a.indexOf("raji"));
 System.out.println(a.isEmpty()); 
 System.out.println(a.size());
a.add("gaffar");
System.out.println(a);
a.add(2, "class");
System.out.println(a);
a.set(2, "abdul");
System.out.println(a);
	}

}
