package pack4;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {

	public static void main(String[] args) 
	{
Vector<Integer> v= new Vector<Integer>();
	
for(int i=0;i<=10;i++)
{
	v.add(i);
}
System.out.println(v);
Enumeration<Integer>  val=v.elements();
while(val.hasMoreElements())
{
	Integer var=val.nextElement();
	if(var%2==0);
	System.out.println(var);
	}

}
}