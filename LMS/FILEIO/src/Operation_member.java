import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Operation_member  {
	 protected String membername;
	 protected int regnum;
	 Operation_member(String n,int reg)
	{
		membername=n;
		regnum=reg;
	}
    Member my_member=new Member(null,0,0,null,0); 
	boolean check=false;
	public boolean status() 
	{   
		File my_file=new File("member.txt");
		 String reg=Integer.toString(regnum);
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
					my_member.setname(input.next());
						my_member.setreg(regnum);
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
