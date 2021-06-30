package pack4;

import java.util.ArrayList;

public class Arraylisttoarray {

	public static void main(String[] args)
	
	{
ArrayList<String> a = new ArrayList<String>();
        
        a.add("charan");
        a.add("rayudu");
        a.add("ravi");
        a.add("srinu");
        System.out.println("Actual ArrayList:"+a);
        String[] st=new String[a.size()]; 
       a.toArray(st);
       System.out.println("created  array :" );
       for(String str:st)
       {
System.out.println(st);  
	}

}
}
