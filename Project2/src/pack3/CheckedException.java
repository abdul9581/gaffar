package pack3;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedException {

	public static void  m1() throws Exception
	{
		BufferedReader b=new BufferedReader(new FileReader("c://abc.txt"));
	}
	public static void main(String[] args) throws Exception 
	{
		
m1();
	}

}
