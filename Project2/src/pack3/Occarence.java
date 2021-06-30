package pack3;

public class Occarence
{

	public static void main(String[] args) 
	{
		        String s = "i said again and again ";
		 
		        char c = 'a';
		 
		        int count = s.length() - s.replace("a", "").length();
		 
		        System.out.println("Number of occurances of 'a' in: "+s+" = "+count);
		    }
	
	

}
