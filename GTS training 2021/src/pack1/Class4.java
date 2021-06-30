package pack1;

import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) 
	{ 
		int n;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		n=scr.nextInt();
		scr.nextLine();
		String[] ar=new String[n];
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Array[" + i +  "]:  ");
				ar[i]=scr.nextLine()	;
			}
			System.out.println("The array elements are: ");
			{
				for(int i=0;i<ar.length;i++)
				{
					System.out.println("Array["  + i +  "]   "+ar[i]);
				}
				scr.close();
		}
		
		
	}

}
