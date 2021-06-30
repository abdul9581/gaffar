package pack3;

import java.util.Scanner;

public class Count 
{

	public static void main(String[] args)
	{
	
		        System.out.println("Enter the string");
		 
		        Scanner scr = new Scanner(System.in);
		 
		        String s=scr.nextLine();
		 
		        String[] words = s.trim().split(" ");
		 
		        System.out.println("Number of words in the string = "+words.length);
		    }
		
	}


