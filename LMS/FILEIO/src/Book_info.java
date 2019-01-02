import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Book_info extends Operation_book {
	Book_info(String n,int r)
	{
		super( n,r);
	}
	
	public Book Display_bookdata()
	{ 
		if(status())
		{
			File my_file=new File("bookissued.txt");
			 String bid=Integer.toString(bookid);
			 try {
				Scanner input1 = new Scanner(my_file);
				while(input1.hasNext())
				{  
					String search_for=input1.next();
					
					if(search_for.equals(null))
					{
						search_for="";
					}
					
					if(search_for.equalsIgnoreCase(bid))
					{ 
						   mybook.set_issuestatus(true);
						   
						   
							mybook.set_issuedate(Integer.parseInt(input1.next()));
						   File my_file1=new File("book.txt");
							Scanner input2 = new Scanner(my_file1);
							while(input2.hasNext())
								{  
									String search_for1=input2.next();
									if(search_for1.equals(null))
									{
										search_for="";
									}
									
									if(search_for1.equalsIgnoreCase(bid))
									{
										 mybook.set_bookname(input2.next());
										 
										
									}
								  
						
								}
							input2.close();
							}}
				 input1.close();
				 
		} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}

		

		
	}
		return mybook;
		
	}

}
