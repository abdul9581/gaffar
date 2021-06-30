package pack3;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) 
	{
		
		Scanner scr = new Scanner(System.in);
        
        System.out.println("Enter input string to be cleaned from white spaces...!");
         
        String inputString = scr.nextLine();
         
        String stringWithoutSpaces = inputString.replaceAll("\s+", "");
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
         
        scr.close();
		
		
	}

}
