import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Operation_book {
    protected String bookname;
	protected int bookid;

	Operation_book (String n,int b)
	{
		bookname=n;
		bookid=b;
	}
Book mybook=new Book(bookname,bookid,false,0);
	boolean check=false;
	public boolean status() 
	{   
		File my_file=new File("book.txt");
		 String reg=Integer.toString(bookid);
		 try {
			Scanner input = new Scanner(my_file);
			while(input.hasNext())
			{  
				String search_for=input.next();
				if(search_for.equals(null))
				{
					search_for="";
				}
				
				if(search_for.equalsIgnoreCase(reg))
				{
					mybook.set_bookname(input.next());
						mybook.set_bookid(bookid);
					check=true;
				}
			
			}	
			input.close();
	} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	return check;
	}
}
