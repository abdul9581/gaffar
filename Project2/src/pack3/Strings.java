package pack3;

public class Strings {

	public static void main(String[] args)
	{
		
String s1="abdul gaffar";
System.out.println(s1);
/*
 * String s2=new String("abdul"); System.out.println(s2);
 */
System.out.println(s1.isEmpty());
System.out.println(s1.length());
System.out.println(s1.hashCode());
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.startsWith("gaffar"));
String s2= new String("abdul");
System.out.println(s1+s2);
System.out.println(s1.concat(s2));
String s3=new String("gaffar");
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.toLowerCase().equals(s3));
String s4="abdul";
System.out.println(s1.contains(s4));
System.out.println(s1.charAt(0));
System.out.println(s1.indexOf('f'));
System.out.println(s1.substring(5,9));


	}

}
