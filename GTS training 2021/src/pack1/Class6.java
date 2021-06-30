package pack1;

import java.util.Scanner;

public class Class6 {

	public static void main(String[] args)
	{
		int[] ar;
		int sum=0;
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter the size of array:  ");
int n=scr.nextInt();
ar=new int[n];
   for(int i=0; i<n ; i++)
{
	System.out.println("Enter array["  +  i  +   "]:  ");
	ar[i]=scr.nextInt();
	sum=sum+ar[i];
	
}
	System.out.println("The sum of all elements in an array is "+sum);	
		scr.close();
	}


}
