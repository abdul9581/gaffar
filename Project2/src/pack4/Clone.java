package pack4;

import java.util.ArrayList;

public class Clone 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a= new ArrayList<String> ();
        a.add("sand");
        a.add("wound");
        a.add("found");
        a.add("pond");
        System.out.println("Actual array list:"+a);
		ArrayList<String> c= (ArrayList<String>)a.clone ();
		System.out.println("clone array list:"+c);


	}

}
