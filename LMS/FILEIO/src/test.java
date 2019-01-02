import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
public class test   {

	public static void main(String[] args)
    {   Member_info my_member_info=new  Member_info("karamat",2014311);
		Member m1=my_member_info.Display_Memberdata();
		System.out.println(m1.getreg());

    }}


