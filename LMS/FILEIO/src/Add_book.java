import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Add_book extends Operation_book {

	Add_book(String n,int r)
	{   
		super(n,r);
		
	}
	boolean check=false;
	public boolean Add_bk()
	{
		if(!status())
		{
			FileWriter fw = null; 
			BufferedWriter bw = null;
			PrintWriter pw = null; 
			 
			try {
				fw = new FileWriter("book.txt", true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.println();
			pw.println(bookid+" "+ bookname +"\n" );
			
			pw.flush();  

			
			
			check=true;
		}
		return check;
		
	}
		
		
	}

