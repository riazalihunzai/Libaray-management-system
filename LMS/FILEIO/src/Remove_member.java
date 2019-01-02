import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Remove_member extends Operation_member {
	Remove_member(String n,int r)
	{   
		super(n,r);
		
	}
int check1=0;
	Member_info my_mem_info=new Member_info(membername,regnum);
	public int rem_mem() 
	{
		if(status())
		{
			my_member=my_mem_info.Display_Memberdata();
		if (my_member.getissuedbook()==0)
		{
			try {
				File inputFile = new File("member.txt");
				File tempFile = new File("myTempFile.txt");

				BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

				String lineToRemove =  Integer.toString(regnum)+"	"+membername;
				String currentLine;

				while((currentLine = reader.readLine()) != null) {
				    // trim newline when comparing with lineToRemove
				    String trimmedLine = currentLine.trim();
				    if(trimmedLine.equals(lineToRemove)) continue;
				    writer.write(currentLine + System.getProperty("line.separator"));
				    check1=1;
				}
				
			
				writer.close(); 
				
				reader.close(); 
			
				
				
				
				if(inputFile.delete()){
	    			check1=1;
	    		}else{
	    			check1=-1;
	    		}
				boolean successful = tempFile.renameTo(inputFile);
	            if(successful==true)
	            {
	            	check1=1;
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
