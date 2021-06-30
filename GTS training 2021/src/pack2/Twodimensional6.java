package pack2;

public class Twodimensional6 {

	public static void main(String[] args)
	{
int[][] a= {{1,2,3,4},{8,2,6,5},{6,8,2,8}};
System.out.println("array is: ");
display(a);
int sum=0;
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[0].length;j++)
	{
		sum=sum+a[i][j];
}
}
	System.out.println("Sum is"+sum);
	

}

	private static void display(int[][] a) 
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
		
}	
