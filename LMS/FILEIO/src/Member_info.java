import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Member_info extends Operation_member {

	Member_info(String n,int r)
	{   
		super(n,r);
		
	}

public Member Display_Memberdata()
{ 
	if(status())
	{
		File my_file=new File("bookissued.txt");
		 String reg=Integer.toString(regnum);
		 try {
			 my_member.setreg(regnum);
			
			Scanner input1 = new Scanner(my_file);
			while(input1.hasNext())
			{  
				String search_for=input1.next();
				if(search_for.equals(null))
				{
					search_for="";
				}
				
				if(search_for.equalsIgnoreCase(reg))
				{ 
					   my_member.setissuedbook(1);
					   String bookid=input1.next();
					   
						my_member.setissuedate(Integer.parseInt(input1.next()));
					   File my_file1=new File("book.txt");
						Scanner input2 = new Scanner(my_file1);
						while(input2.hasNext())
							{  
								String search_for1=input2.next();
								if(search_for1.equals(null))
								{
									search_for="";
								}
								
								if(search_for1.equalsIgnoreCase(bookid))
								{
									 my_member.setbook1(search_for1 +"         Name :"+input2.next());
									 
									
								}
							  
					
							}
						input2.close();
						}}
			 input1.close();
			 
	} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	

	
}
	return my_member;
	
}}
