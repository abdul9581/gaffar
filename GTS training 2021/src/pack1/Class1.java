package pack1;


public class Class1
{

int a,b,c;


public Class1(int a, int b) {
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
	Class1 c1=new Class1(100,200);
	c1.add();
	c1.sub();

}
}



