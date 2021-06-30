package com.loans.personalloans;

public class Operations 
{
	int a,b,c;
	
	
	public Operations(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void add()
	{
		c=a+b;
		System.out.println("add:"+c);
	}
	public void sub()
	{
		c=a-b;
		
		System.out.println("sub"+c);
	}

	public static void main(String[] args) {
		Operations obj=new Operations(100,200);
		obj.add();
		obj.sub();

	}

}
