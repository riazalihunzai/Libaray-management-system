
public class Book {
	private String bookname;
	private int bookid;
	private boolean issuestatus;
	private int issuedate;
	
	Book(String n,int bid,boolean s,int is)
	{
		bookname=n;
		bookid=bid;
		issuestatus=s;
		 issuedate=is;
	}
	public void set_bookname(String n)
	{
		
		bookname=n;
		
	}
	public void set_bookid(int i)
	{
		bookid=i;
		
	}
	public void set_issuestatus(boolean s)
	{
		issuestatus=s;
	}
	public void set_issuedate(int is)
	{
	issuedate=is;
	}
	public String get_bookname()
	{
		return bookname;
	}
	public int get_bookid()
	{
		return bookid;
	}
	public boolean get_issuestatus()
	{
		
		return issuestatus;
	}
	public int get_issuedate()
	{
	return issuedate;
	}
}
