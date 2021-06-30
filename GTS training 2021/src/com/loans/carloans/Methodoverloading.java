package com.loans.carloans;

public class Methodoverloading {
	
	public void m1(int x)
	{
		System.out.println(x);
	}
	public void m1(float x)
	{
		System.out.println(x);
	}
	public void m1(String x)
	{
		System.out.println(x);
	}
	public void m1(Number x)
	{
		System.out.println(x);
	}
	public void m1(Integer x)
	{
		System.out.println(x);
	}
	public void m1(Object x)
	{
		System.out.println(x);
	}
	

	public static void main(String[] args) {
		
		Methodoverloading obj= new Methodoverloading();
		obj.m1(100);
		obj.m1(11.24f);
		obj.m1("raji");
		obj.m1(1000);
		obj.m1(125.6f);
		obj.m1("gaffar");
	}

}
