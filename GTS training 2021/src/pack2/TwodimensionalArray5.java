package pack2;

public class TwodimensionalArray5 {

	public static void main(String[] args) 
	{
		String[][] str= {
				{"hello","welcome","world"},
				{"this","is","chitti"},
				{"chitti","the","robot"}};
			System.out.println("string array is: ");
			for(int i=0;i<str.length;i++)
			{
				for(int j=0;j<=str[0].length;j++)
				{
					System.out.printf("%10s",str[i][j]);
				}
				System.out.println();
			}
		}
		

	}


