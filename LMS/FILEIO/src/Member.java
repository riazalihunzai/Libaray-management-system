
public class Member {
	private String name;
	private int reg;
	private int bookissued;
	private String book1;
	private int issuedate;
	Member(String n,int r,int max,String b1,int isu)
	{
		name=n;
		reg=r;
		bookissued=max;
		book1=b1;
		issuedate=isu;
		
	}
	public void setname(String n1)
	{
		
		 name=n1;;
	}
	public void setreg(int r1)
	{
		
		 reg=r1;
	}
	public void setissuedbook(int m1)
	{
		
		 bookissued=m1;
	}
	public void setbook1(String bn1)
	{
		
	 book1=bn1;
	}
	public void setissuedate(int is)
	{
		
		issuedate=is;
	}
	
public String getname()
{
	
	return name;
}
public int getreg()
{
	
	return reg;
}
public int getissuedbook()
{
	
	return bookissued;
}
public String getbook1()
{
	
	return book1;
}
public int getissuedate()
{
	
	return issuedate;
}

}

