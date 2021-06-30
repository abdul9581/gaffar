package pack2;

import java.util.Scanner;

public class TwoDimensionalArray3 {

	public static void main(String[] args)
	{
		int row,column;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter row length:  ");
		row=scr.nextInt();
		System.out.println("Enter column length:  ");
		column=scr.nextInt();
		int[][] a=new int[row][column];
for(int i=0;i<row;i++)
{
	for(int j=0;j<column;j++)
	{
	System.out.println("Enter array["  +i+   "]["   +j+   "]  :");
}
}
System.out.println("Array is:  ");
display(a);
scr.close();
}

	private static void display(int[][] a) {
	for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a.length;j++)
	{
		System.out.printf("%3d",a[i][j]);
	}
	System.out.println();

	}
System.out.println();
}
}