package pack2;

public class TwodimwnsionalArray {


	public static void main(String[] args) 
	{
		int[][] arr= {{1,2,3,4},{8,2,6,5},{6,8,2,8}};
		System.out.println("array is: ");
		display(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				sum=sum+arr[i][j];
		}
			
		}
			
	System.out.println("Row  Sum is "+sum);
			sum=0;
			

		}

			private static void display(int[][] arr) 
			{
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[0].length;j++)
					{
						System.out.printf("%3d",arr[i][j]);
					}
					System.out.println();
				}
			}

		

	}

