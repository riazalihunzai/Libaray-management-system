import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Issue_book extends Operation_book{
   private Member_info my_member_info; 
   private Book_info my_book_info;
   public int date;
	Issue_book(String bn,int id,String mn,int r,int isdate)
{
	super(bn,id);
	my_member_info =new Member_info(mn,r);
	my_book_info=new Book_info(bn,id);
	date=isdate;
}
boolean check=false;

public boolean get_book()
{  Member m1=my_member_info.Display_Memberdata();
	if(my_member_info.status())
{	
	
	if(m1.getissuedbook()!=1)
	{
		if (status())
		{ 
			Book b=my_book_info.Display_bookdata();
			if (!b.get_issuestatus())
			{

				FileWriter fw = null; 
				BufferedWriter bw = null;
				PrintWriter pw = null; 
				 
				try {
					fw = new FileWriter("bookissued.txt", true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw);
				pw.println();
				pw.println(m1.getreg()+" "+bookid +" "+date +"\n" );
				
				pw.flush();  
               try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				check=true;
			}
			
			
		}
	}
	
}	
	return check;
}



}
