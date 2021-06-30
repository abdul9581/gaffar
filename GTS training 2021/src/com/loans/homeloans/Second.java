package com.loans.homeloans;

public class Second
{
	int eno;
	String sname;
	
	public Second()
	{
		System.out.println("this is deafult constructor");
		
	}

	public Second(int eno, String sname) {
		super();
		this.eno = eno;
		this.sname = sname;
	}

	public static void main(String[] args)
	{
		Second s1=new Second();
		System.out.println(s1.eno);
		System.out.println(s1.sname);
		Second s2=new Second(858,"abdul");
		System.out.println(s2.eno);
		System.out.println(s2.sname);
		

	}

}
