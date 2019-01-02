import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.Scanner;
public class Login {
	 private  String name;
	 private String pass;
	 Login(String n,String p)
	 {
		 name=n;
		 pass=p;
		 
	 }
	public boolean Verify ()
	{     boolean check=false;
		File passfile=new File("text.txt");
		Scanner input;
		try {
			
			input = new Scanner(passfile);
			String check_name=input.nextLine();
			String check_pass=input.nextLine();
			if(name.equals(check_name)&&pass.equals(check_pass))
			{
				check=true;
				
			}
			else
			{
				check= false;
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return check;
	
	}
	
	
	
}
