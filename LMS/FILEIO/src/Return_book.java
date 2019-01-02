import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Return_book extends Operation_book{
	   private Member_info my_member_info; 
	   private Book_info my_book_info;
	   private String mname;
		Return_book(String bn,int id,String mn,int r)
	    
		{
		super(bn,id);
		my_member_info =new Member_info(mn,r);
		my_book_info=new Book_info(bn,id);
		mname=mn;
	}
		boolean check=false;

		public boolean ret_book()
		{  Member m1=my_member_info.Display_Memberdata();
			if(my_member_info.status()&&mname.equals(m1.getname()))
		{	
			
			if(m1.getissuedbook()==1)
			{
			Book b=my_book_info.Display_bookdata();
				if (status()&&bookname.equals(b.get_bookname()))
				{ 
					
					if (b.get_issuestatus())
					{  
						try {
							File inputFile = new File("bookissued.txt");
							File tempFile = new File("myTempFile.txt");
                         
							BufferedReader reader = new BufferedReader(new FileReader(inputFile));
							BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

							String lineToRemove =  Integer.toString(m1.getreg())+" "+b.get_bookid()+" "+b.get_issuedate();
							String currentLine;

							while((currentLine = reader.readLine()) != null) {
							    // trim newline when comparing with lineToRemove
							    String trimmedLine = currentLine.trim();
							    if(trimmedLine.equals(lineToRemove)) continue;
							    writer.write(currentLine + System.getProperty("line.separator"));
							   check=true;
							}
							
						
							writer.close(); 
							
							reader.close(); 
						
							
							
							
							if(inputFile.delete()){
				    		
				    		}else{
				    			 check=false;
				    		}
							boolean successful = tempFile.renameTo(inputFile);
				            if(successful==true)
				            {
				            	 
				            }
				            else
				            	 check=false;
					
				            
						}catch (FileNotFoundException ex) {
				            ex.printStackTrace();
				        } catch (IOException ex) {
				            ex.printStackTrace();
				        }
	
					
				}
			}
			
		}	
			
		}
			return check;
		}}

