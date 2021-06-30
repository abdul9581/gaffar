package pack3;

import java.util.Scanner;

public class UserDefinedException extends Exception
{

	public static void main(String[] args)
	{
	String str;
	Scanner scr=new Scanner(System.in);
	
	
	while (true)
	{
		System.out.println("enter string 10 char");
		str=scr.nextLine();
		try {
			if (str.length() != 10) {
				throw new UserDefinedException();

			} else {
				System.out.println(str);
			}
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
}