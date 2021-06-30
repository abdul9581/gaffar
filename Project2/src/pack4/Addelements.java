package pack4;

import java.util.ArrayList;
import java.util.List;

public class Addelements {

	public static void main(String[] args)
	
	{
		ArrayList<String> a = new ArrayList<String>();
        
        a.add("charan");
        a.add("rayudu");
        a.add("ravi");
        a.add("srinu");
        System.out.println("Actual ArrayList:"+a);
        List<String> list = new ArrayList<String>();
        list.add("gaffar");
        list.add("bhanu");
        a.addAll(list);
        System.out.println("After Copy: "+a);

	}

}
