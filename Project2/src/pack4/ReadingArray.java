package pack4;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadingArray 
{

	public static void main(String[] args)
	
	{
	  ArrayList<String> a= new ArrayList<String> ();
        a.add("gopal");
        a.add("guru");
        a.add("chiru");
        a.add("pawan");
        Iterator<String> itr = a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

	}

	}
}