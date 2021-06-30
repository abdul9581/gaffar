package pack5;

public class Emloyee
{
	private int eno=1000;
	private String ename="gaffar";
	

	public int getEno() {
		return eno;
	}


	public void setEno(int eno) {
		this.eno = eno;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public static void main(String[] args)
	
	{
		Emloyee e1=new Emloyee();
		System.out.println("Eno:"+e1.eno);
		System.out.println("Ename:"+e1.ename);
		

	}

}
