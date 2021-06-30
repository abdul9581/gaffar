package pack5;

import java.util.Iterator;
import java.util.ArrayList;

public class IteratorDemo 
{

	public static void main(String[] args) 
	{
		
	
	ArrayList<Integer> v= new 	ArrayList<Integer>();
	
	for(int i=0;i<=10;i++)
	{
		v.add(i);
	}
	System.out.println(v);
	Iterator<Integer>  val=v.iterator();
	while(val.hasNext())
	{
		Integer var=val.next();
		if(var%2==0);
		System.out.println(var);
			
			val.remove();
	}
	System.out.println(v);

}
}