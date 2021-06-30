package pack3;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args)
	
	{
	
int nr=100;
int dr=0,result;
Scanner scr=new Scanner(System.in);

while (true)
{
	System.out.println("enter the numerator value");
	nr=scr.nextInt();
	System.out.println("enter the demoninator value");
	dr=scr.nextInt();
	try 
	{
		result = nr / dr;
		System.out.println(result);
		break;
	} 
	
	catch (Exception e) 
	{
		
		System.out.println("i am catch block");
		e.printStackTrace();
	} 
}
	}

}