
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class LMS {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;
	private JPanel login;
	private JPanel operation ;
	private JTextField reg;
	private JTextField nametext;
	private JTextField regtext;
	private JTextField booktext;
	private JTextField idatetext;
	private JPanel searchdata_for_member ;
	private JTextField reg_textField;
	private JTextField name_textField;
	private JPanel add_removemember;
	private JTextField textbookid;
	private JTextField textbookname;
	private JTextField textbid;
	private JTextField textbstatus;
	private JTextField textissuedate;
	private JPanel Searchdataforbook;
	private JTextField textFieldbid;
	private JTextField textFieldbname;
	private JPanel add_remove_book ;
	private JTextField textFieldname;
	private JTextField textFieldreg;
	private JTextField textFieldbn;
	private JTextField textFieldbkid;
	private JPanel Issued;
	private JTextField textFielddate;
	private JTextField textFieldmem;
	private JTextField textFieldr;
	private JTextField textFieldbook;
	private JTextField textFieldid;
	private JPanel Return ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LMS window = new LMS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LMS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 818, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel login = new JPanel();
		JPanel operation = new JPanel();
		JPanel searchdata_for_member = new JPanel();
		JPanel add_removemember = new JPanel();
		JPanel Searchdataforbook = new JPanel();
		JPanel add_remove_book = new JPanel();
		JPanel Issued = new JPanel();
		JPanel Return = new JPanel();
		login.setBackground(Color.DARK_GRAY);
		  login.setVisible(true);
		frame.getContentPane().add(login, "name_24124850410455");
		login.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(178, 52, 61, 22);
		login.add(lblUsername);
		
		JLabel label = new JLabel("Password");
		
		label.setBounds(178, 85, 61, 14);
		login.add(label);
		
		username = new JTextField();
		username.setBounds(249, 53, 86, 20);
		login.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(249, 82, 86, 20);
		login.add(password);
		JButton btnLogin = new JButton("login");
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name,pass;
				try{
					name=username.getText();
					pass=password.getText();
					Login login_fun=new Login(name,pass);
					boolean check=login_fun.Verify();
					if(check==true)
					{
						
						JOptionPane.showMessageDialog(null,"WELCOME TO LMS");
						
						 login.setVisible(false);
						 operation.setVisible(true);
						
					}
					else{
						JOptionPane.showMessageDialog(null,"Incorrect attempt report has been submitted to authority");
					}
					
				}
				catch(Exception e)
				{
					
					JOptionPane.showMessageDialog(null,"invalid entries");
					
				}
				
			}
		});
		btnLogin.setBounds(276, 135, 61, 23);
		login.add(btnLogin);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("E:\\programing\\LMS\\carousel6.jpg"));
		label_1.setBounds(0, 0, 802, 370);
		login.add(label_1);
		
		JLabel lblDesginAndImplemented = new JLabel("Design and Implemented by Riaz ali Hunzai");
		lblDesginAndImplemented.setForeground(Color.ORANGE);
		lblDesginAndImplemented.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesginAndImplemented.setBounds(258, 373, 333, 22);
		login.add(lblDesginAndImplemented);
		
		
		frame.getContentPane().add(operation, "name_11254649389605");
		
		JButton searchmember = new JButton("Search Member ");
		searchmember.setBounds(45, 44, 181, 31);
		searchmember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operation.setVisible(false);
				 searchdata_for_member.setVisible(true);
			}
		});
		operation.setLayout(null);
		operation.add(searchmember);
		
		JButton mainaddremove = new JButton("Add/Remove  Member");
		mainaddremove.setBounds(45, 102, 181, 31);
		mainaddremove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation.setVisible(false);
				add_removemember.setVisible(true);
			}
		});
		operation.add(mainaddremove);
		
		JButton btnSearchForA = new JButton("Search  Book");
		btnSearchForA.setBounds(45, 159, 181, 31);
		btnSearchForA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation.setVisible(false);
				Searchdataforbook.setVisible(true);
			}
		});
		operation.add(btnSearchForA);
		
		JButton btnAddremoveBook = new JButton("Add/Remove Book");
		btnAddremoveBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operation.setVisible(false);
				add_remove_book.setVisible(true);
				
				
			}
		});
		btnAddremoveBook.setBounds(45, 212, 181, 31);
		operation.add(btnAddremoveBook);
		
		JButton Issuebtn = new JButton("Issue Book");
		Issuebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operation.setVisible(false);
				Issued.setVisible(true);
			}
		});
		Issuebtn.setBounds(45, 263, 181, 31);
		operation.add(Issuebtn);
		
		JButton Ret = new JButton("Return Book");
		Ret.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation.setVisible(false);
				Return.setVisible(true);
			}
		});
		Ret.setBounds(45, 314, 181, 31);
		operation.add(Ret);
		
		
		frame.getContentPane().add(searchdata_for_member, "name_11573323648828");
		searchdata_for_member.setLayout(null);
		
		JLabel lblRegNumber = new JLabel("Reg number");
		lblRegNumber.setBounds(54, 33, 96, 28);
		searchdata_for_member.add(lblRegNumber);
		
		reg = new JTextField();
		reg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		reg.setToolTipText("");
		reg.setBounds(290, 37, 118, 20);
		searchdata_for_member.add(reg);
		reg.setColumns(7);
		
		JButton clicktosearch_member = new JButton("Search");
		clicktosearch_member.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r;
				try{
					r=reg.getText();
				if(r.length()==7)
				{
					int r1=Integer.parseInt(r);
					Member_info  Memberdata=new Member_info  ("",r1);
					Member m1=new Member(null,0,0,null,0); 
					
					m1=Memberdata.Display_Memberdata();
				
			
					nametext.setText(m1.getname());
					regtext.setText(Integer.toString(m1.getreg()));
					booktext.setText("ID :  "+ m1.getbook1());
					
					
					idatetext.setText(Integer.toString(m1.getissuedate()));
				}
				else
				JOptionPane.showMessageDialog(null,"Reg number must have 7 Digits 201XXXX");
				}catch(Exception e1)
				{
					
					JOptionPane.showMessageDialog(null,"Invalid input");
					
				}
				
				
			
			}});
		clicktosearch_member.setBounds(290, 86, 89, 23);
		searchdata_for_member.add(clicktosearch_member);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(54, 149, 46, 14);
		searchdata_for_member.add(lblName);
		
		JLabel lblRegNumber_1 = new JLabel("Reg number");
		lblRegNumber_1.setBounds(54, 187, 118, 14);
		searchdata_for_member.add(lblRegNumber_1);
		
		JLabel lblBookIssued = new JLabel("book issued");
		lblBookIssued.setBounds(54, 226, 96, 20);
		searchdata_for_member.add(lblBookIssued);
		
		JLabel lblIssuedDate = new JLabel("issued date");
		lblIssuedDate.setBounds(54, 278, 96, 14);
		searchdata_for_member.add(lblIssuedDate);
		
		nametext = new JTextField();
		nametext.setForeground(Color.DARK_GRAY);
		nametext.setEditable(false);
		nametext.setBounds(290, 146, 164, 20);
		searchdata_for_member.add(nametext);
		nametext.setColumns(10);
		
		regtext = new JTextField();
		regtext.setForeground(Color.DARK_GRAY);
		regtext.setEditable(false);
		regtext.setBounds(290, 181, 118, 20);
		searchdata_for_member.add(regtext);
		regtext.setColumns(10);
		
		booktext = new JTextField();
		booktext.setEditable(false);
		booktext.setBounds(290, 226, 274, 37);
		searchdata_for_member.add(booktext);
		booktext.setColumns(10);
		
		idatetext = new JTextField();
		idatetext.setEditable(false);
		idatetext.setBounds(290, 272, 145, 20);
		searchdata_for_member.add(idatetext);
		idatetext.setColumns(10);
		
		
		frame.getContentPane().add(add_removemember, "name_50076821073199");
		add_removemember.setLayout(null);
		
		JLabel lblRegNumber_2 = new JLabel("Reg number");
		lblRegNumber_2.setBounds(75, 31, 91, 23);
		add_removemember.add(lblRegNumber_2);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(75, 97, 46, 14);
		add_removemember.add(lblName_1);
		
		reg_textField = new JTextField();
		reg_textField.setBounds(261, 32, 86, 20);
		add_removemember.add(reg_textField);
		reg_textField.setColumns(10);
		
		name_textField = new JTextField();
		name_textField.setBounds(261, 94, 203, 20);
		add_removemember.add(name_textField);
		name_textField.setColumns(10);
		
		JButton AddMember = new JButton("Add Member");
		AddMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 try {
				 
				int r1=Integer.parseInt(reg_textField.getText());
				
			    String namemember=name_textField.getText();
				if(reg_textField.getText().length()==7)
				{
				if(namemember.length()<=18)
				{
					Pattern regex = Pattern.compile("[$&+,:;=?@#|'<>.-^*()%! ]");
					Matcher matcher = regex.matcher(namemember);
					if(!matcher.find())
					{
				Add_member addmem=new Add_member(namemember,r1);
             
				boolean check=addmem.add_mem();
				if(check==true)
				{
					JOptionPane.showMessageDialog(null,"Member registered successfully");
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Member registered already");
				}
				}else
				{
					JOptionPane.showMessageDialog(null,"Special Character Not allowed");
				}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Member's Name must have less then 18 Digits  ");
				}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Reg Number must have 7 Digits 201XXXX");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null,"invalid input");
				
			}		       
				
				
			
				
			}
		});
		AddMember.setBounds(261, 168, 162, 34);
		add_removemember.add(AddMember);
		
		JButton RemoveMember = new JButton("Remove Member");
		RemoveMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 
				int r1=Integer.parseInt(reg_textField.getText());
				
			    String namemember=name_textField.getText(); 
			    if(reg_textField.getText().length()==7)
				{
				if(namemember.length()<=18)
				{
					Pattern regex = Pattern.compile("[$&+,:;=?@#|'<>.-^*()%! ]");
					Matcher matcher = regex.matcher(namemember);
					if(!matcher.find())
					{
			    Remove_member rmmem=new  Remove_member(namemember,r1);
			    int x=rmmem.rem_mem();
			    if(x==0)
			    {
			    	JOptionPane.showMessageDialog(null,"Member doesnot Exist");
			    	
			    }
			    else if(x==2)
			    {
			    	JOptionPane.showMessageDialog(null,"unable to remove member because book he/she issued are not returned yet");
			    }
			    else if(x==-1)
			    {
			    	JOptionPane.showMessageDialog(null,"Database problem contact authority");
			    }
			    else if(x==1)
			    {
			    	
			    	JOptionPane.showMessageDialog(null,"Member removed successfully");
			    }
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Special Character Not allowed");
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Member's Name must have less then 18 Digits  ");
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Reg Number must have 7 Digits 201XXXX");
					}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null,"invalid input");
				
			}		       
				
				
			
			}
		});
		RemoveMember.setBounds(261, 243, 162, 34);
		add_removemember.add(RemoveMember);
		
		
		frame.getContentPane().add(Searchdataforbook, "name_140381843539478");
		Searchdataforbook.setLayout(null);
		
		JLabel lblBookid = new JLabel("Book id");
		lblBookid.setBounds(64, 42, 75, 24);
		Searchdataforbook.add(lblBookid);
		
		textbookid = new JTextField();
		textbookid.setBounds(266, 44, 102, 20);
		Searchdataforbook.add(textbookid);
		textbookid.setColumns(10);
		
		JButton booksearch = new JButton("Search");
		booksearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String r;
				try{
					r=textbookid.getText();
					int r1=Integer.parseInt(r);
					Book_info  bookdata=new Book_info  ("",r1);
					Book b1=new Book(null,0,false,0); 
					
					b1=bookdata.Display_bookdata();
				
			
					textbookname.setText(b1.get_bookname());
					textbid.setText(Integer.toString(b1.get_bookid()));
					if(b1.get_issuestatus()==true)
					textbstatus.setText("True");
					else
						textbstatus.setText("False");	
					
					textissuedate.setText(Integer.toString(b1.get_issuedate()));
				}
				catch(Exception e1)
				{
					
					JOptionPane.showMessageDialog(null,"Invalid input");
					
				}
				
			
			}
				
				
				
				
				
			
		});
		booksearch.setBounds(266, 94, 89, 23);
		Searchdataforbook.add(booksearch);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setBounds(64, 158, 75, 24);
		Searchdataforbook.add(lblBookName);
		
		textbookname = new JTextField();
		textbookname.setBounds(266, 160, 189, 20);
		Searchdataforbook.add(textbookname);
		textbookname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Book id");
		lblNewLabel.setBounds(64, 212, 46, 24);
		Searchdataforbook.add(lblNewLabel);
		
		textbid = new JTextField();
		textbid.setBounds(266, 214, 86, 20);
		Searchdataforbook.add(textbid);
		textbid.setColumns(10);
		
		JLabel lblIssueStatus = new JLabel("Issue Status");
		lblIssueStatus.setBounds(64, 249, 102, 24);
		Searchdataforbook.add(lblIssueStatus);
		
		textbstatus = new JTextField();
		textbstatus.setBounds(266, 245, 86, 20);
		Searchdataforbook.add(textbstatus);
		textbstatus.setColumns(10);
		
		JLabel lblIssueDate = new JLabel("Issue Date");
		lblIssueDate.setBounds(64, 296, 129, 24);
		Searchdataforbook.add(lblIssueDate);
		
		textissuedate = new JTextField();
		textissuedate.setBounds(266, 298, 142, 20);
		Searchdataforbook.add(textissuedate);
		textissuedate.setColumns(10);
		
	
		frame.getContentPane().add(add_remove_book, "name_152759025548086");
		add_remove_book.setLayout(null);
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setBounds(114, 46, 74, 38);
		add_remove_book.add(lblBookId);
		
		JLabel lblBookName_1 = new JLabel("Book Name");
		lblBookName_1.setBounds(114, 95, 108, 14);
		add_remove_book.add(lblBookName_1);
		
		textFieldbid = new JTextField();
		textFieldbid.setBounds(293, 55, 86, 20);
		add_remove_book.add(textFieldbid);
		textFieldbid.setColumns(10);
		
		textFieldbname = new JTextField();
		textFieldbname.setBounds(293, 92, 204, 20);
		add_remove_book.add(textFieldbname);
		textFieldbname.setColumns(10);
		
		JButton btnAddBook = new JButton("Add book");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					int bid=Integer.parseInt(textFieldbid.getText());
					
				    String namebook=textFieldbname.getText();
					
					Add_book addbook=new Add_book(namebook,bid);
	             
					boolean check=addbook.Add_bk();
					if(check==true)
					{
						JOptionPane.showMessageDialog(null,"Book Added to Database successfully");
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Book already exist");
						
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null,"invalid input");
					
				}		       
				add_remove_book.setVisible(false);
				 operation.setVisible(true);	
				
			}
		});
		btnAddBook.setBounds(293, 157, 140, 23);
		add_remove_book.add(btnAddBook);
		
		JButton btnNewButton = new JButton("Remove book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
						int bid=Integer.parseInt(textFieldbid.getText());
						
					    String namebook=textFieldbname.getText(); 
					    Remove_book rmbook=new  Remove_book(namebook,bid);
					    int x=rmbook.rem_mem();
					    if(x==0)
					    {
					    	JOptionPane.showMessageDialog(null,"Book doesnot Exist");
					    	
					    }
					    else if(x==2)
					    {
					    	JOptionPane.showMessageDialog(null,"unable to remove Book because book hase been issued ");
					    }
					    else if(x==-1)
					    {
					    	JOptionPane.showMessageDialog(null,"Database problem contact authority");
					    }
					    else if(x==1)
					    {
					    	
					    	JOptionPane.showMessageDialog(null,"Book removed successfully");
					    	
					    }
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null,"invalid input");
						
					}	
				 add_remove_book.setVisible(false);
				 operation.setVisible(true);
				 
				
			}
		});
		btnNewButton.setBounds(293, 205, 140, 23);
		add_remove_book.add(btnNewButton);
		
		
		frame.getContentPane().add(Issued, "name_27518335816470");
		Issued.setLayout(null);
		
		JLabel lblNameOfMember = new JLabel("Name of Member");
		lblNameOfMember.setBounds(118, 42, 117, 21);
		Issued.add(lblNameOfMember);
		
		JLabel lblRegNumber_3 = new JLabel("Reg number");
		lblRegNumber_3.setBounds(118, 74, 101, 27);
		Issued.add(lblRegNumber_3);
		
		JLabel lblNameOfBook = new JLabel("Name of Book");
		lblNameOfBook.setBounds(118, 112, 101, 21);
		Issued.add(lblNameOfBook);
		
		JLabel lblBookId_1 = new JLabel("Book Id");
		lblBookId_1.setBounds(118, 144, 101, 27);
		Issued.add(lblBookId_1);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(338, 42, 156, 20);
		Issued.add(textFieldname);
		textFieldname.setColumns(10);
		
		textFieldreg = new JTextField();
		textFieldreg.setBounds(338, 77, 117, 20);
		Issued.add(textFieldreg);
		textFieldreg.setColumns(10);
		
		textFieldbn = new JTextField();
		textFieldbn.setBounds(338, 112, 198, 20);
		Issued.add(textFieldbn);
		textFieldbn.setColumns(10);
		
		textFieldbkid = new JTextField();
		textFieldbkid.setBounds(338, 147, 117, 20);
		Issued.add(textFieldbkid);
		textFieldbkid.setColumns(10);
		
		JButton btnIssue = new JButton("Issue");
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				int bid=Integer.parseInt(textFieldbkid.getText());
				String namebook=textFieldbn.getText();
				String membername=textFieldname.getText();
				int reg=Integer.parseInt(textFieldreg.getText());
				int date=Integer.parseInt(textFielddate.getText());
				Issue_book issue=new Issue_book(namebook,bid,membername,reg,date);
				     boolean check= issue.get_book();
				
				       if(check==true)
				           {
				        	   JOptionPane.showMessageDialog(null,"Book Issued successfully");
				        	   
				           }
				        else
				           {
				          JOptionPane.showMessageDialog(null,"Book cannot be issued");
				           }
				           
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null,"invalid input");
				
			}	
		 operation.setVisible(true);
		 Issued.setVisible(false);
			}});
		btnIssue.setBounds(338, 220, 89, 27);
		Issued.add(btnIssue);
		
		textFielddate = new JTextField();
		textFielddate.setBounds(338, 178, 101, 20);
		Issued.add(textFielddate);
		textFielddate.setColumns(10);
		
		JLabel lblIssueDate_1 = new JLabel("Issue date");
		lblIssueDate_1.setBounds(118, 182, 101, 16);
		Issued.add(lblIssueDate_1);
		
	
		frame.getContentPane().add(Return, "name_86333246005599");
		Return.setLayout(null);
		
		JLabel lblNameOfMember_1 = new JLabel("Name of Member ");
		lblNameOfMember_1.setBounds(118, 43, 142, 20);
		Return.add(lblNameOfMember_1);
		
		JLabel lblRegNumber_4 = new JLabel("Reg number");
		lblRegNumber_4.setBounds(118, 74, 97, 20);
		Return.add(lblRegNumber_4);
		
		JLabel lblNameOfBook_1 = new JLabel("Name of Book");
		lblNameOfBook_1.setBounds(118, 101, 113, 20);
		Return.add(lblNameOfBook_1);
		
		JLabel lblBookId_2 = new JLabel("Book Id");
		lblBookId_2.setBounds(118, 132, 46, 20);
		Return.add(lblBookId_2);
		
		textFieldmem = new JTextField();
		textFieldmem.setBounds(311, 43, 182, 20);
		Return.add(textFieldmem);
		textFieldmem.setColumns(10);
		
		textFieldr = new JTextField();
		textFieldr.setBounds(311, 74, 97, 20);
		Return.add(textFieldr);
		textFieldr.setColumns(10);
		
		textFieldbook = new JTextField();
		textFieldbook.setBounds(311, 101, 182, 20);
		Return.add(textFieldbook);
		textFieldbook.setColumns(10);
		
		textFieldid = new JTextField();
		textFieldid.setBounds(311, 132, 86, 20);
		Return.add(textFieldid);
		textFieldid.setColumns(10);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int bid=Integer.parseInt(textFieldid.getText());
					String namebook=textFieldbook.getText();
					String membername=textFieldmem.getText();
					int reg=Integer.parseInt(textFieldr.getText());
				
				Return_book ret=new Return_book(namebook,bid,membername,reg);
					     boolean check= ret.ret_book();
					
					       if(check==true)
					           {
					        	   JOptionPane.showMessageDialog(null,"Book Return successfully ");
					        	   
					           }
					       else
					           {
					        JOptionPane.showMessageDialog(null,"Book cannot be Return");
					           }
					           
				
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null,"invalid input");
					
				}	
			 operation.setVisible(true);
			 Return.setVisible(false);
				
			}
		});
		btnReturn.setBounds(311, 203, 89, 31);
		Return.add(btnReturn);
		
		JTextArea textArea;
		
		
	}
}
