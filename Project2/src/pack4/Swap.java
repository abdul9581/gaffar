package pack4;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {


	public static void main(String[] args)
	{
	ArrayList<String> list=new ArrayList<String>();
	list.add("vihan");
	list.add("is");
	list.add("clay");
	list.add("playing");
	list.add("volleyball");
	list.add("in ground");
	Collections.swap(list, 2, 5);
		System.out.println("swapping result:");
		
		 for(String str: list)
		{
			System.out.println(str);
		}
		
	}

}
