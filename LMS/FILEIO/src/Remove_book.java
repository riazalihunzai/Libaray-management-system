import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Remove_book extends Operation_book{
	Remove_book(String n,int r)
	{   
		super(n,r);
		
	}
int check1=0;
	Book_info my_book_info=new Book_info(bookname,bookid);
	public int rem_mem() 
	{
		if(status())
		{
			mybook=my_book_info.Display_bookdata();
		if (mybook.get_issuestatus()==false)
		{
			try {
				File inputFile = new File("book.txt");
				File tempFile = new File("myTempFile.txt");

				BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

				String lineToRemove =  Integer.toString(bookid)+" "+bookname;
				String currentLine;

				while((currentLine = reader.readLine()) != null) {
				    // trim newline when comparing with lineToRemove
				    String trimmedLine = currentLine.trim();
				    if(trimmedLine.equals(lineToRemove)){ check1=1; continue;}
				    writer.write(currentLine + System.getProperty("line.separator"));
				   
				}
				
			
				writer.close(); 
				
				reader.close(); 
			
				
				
				
				if(inputFile.delete()){
	    			
	    		}else{
	    			check1=-1;
	    		}
				boolean successful = tempFile.renameTo(inputFile);
	            if(successful==true)
	            {
	            	
	            }
	            else
	            	check1=-1;
		
	            	
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		}
		else
		{
			check1=2;
		}
		}
		else
		{
			check1=0;
		}
		
		return check1;
		}
}
