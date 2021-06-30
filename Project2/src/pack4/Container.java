package pack4;

import java.util.ArrayList;

public class Container 

{

	public static void main(String[] args) 
	{
	ArrayList<String>	a= new ArrayList<String> (); 
	
	a.add("honey");
	a.add("is");
	a.add("the");
	a.add("best");
	
	ArrayList<String>	a2= new ArrayList<String> (); 
	a2.add("honey");
	a2.add("is");

System.out.println("does array contain all elements:"+a.containsAll(a2));

ArrayList<String>	a3= new ArrayList<String> (); 
a3.add("worst");
System.out.println("does array contain all elements:"+a.containsAll(a3));




	}

}
