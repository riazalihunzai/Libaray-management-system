import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Add_member extends Operation_member {

	Add_member(String n,int r)
	{   
		super(n,r);
		
	}
	boolean check=false;
	public boolean add_mem() 
	{
		if(!status())
		{
			FileWriter fw = null; 
			BufferedWriter bw = null;
			PrintWriter pw = null; 
			 
			try {
				fw = new FileWriter("member.txt", true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.println(regnum +"	"+ membername +"\n" );
			
			pw.flush();  

			
			
			check=true;
		}
		return check;
		
	}
}
