package com.company;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Main extends JFrame implements WindowListener,ActionListener{
	
	 //1st Frame
    JFrame MainFrame;
    JLabel LibraryLabel;
    JButton nextButton;

    //login frame
    JFrame loginFrame;
    JPasswordField passwordField;
    JLabel usernameLabel;
    JLabel passwordLabel;
    JTextField usernameTextField;
    JButton loginButton;
    JLabel loginLabel;

    //library options Frame
    JFrame LibraryoptionsFrame;
    JLabel SelectOptionLabel;
    JButton AddbooksButton;
    JButton AddmembersButton;
    JButton ReturnBooksButton;
    JButton IssuebooksButton;
    JButton ExitLOFButton;

    //label for AddBook Frame
    JFrame AddbookFrame;
    JLabel BooknameLabel;
    JLabel BookCodeLabel;
    JLabel SubjectLabel;
    JLabel AuthorLabel;
    JLabel PublisherLabel;
    JLabel EditionLabel;

    //text fild for AddBook frame
    JTextField  BooknameTextBox;
    JTextField  BookCodeTextBox;
    JTextField  SubjectTextBox;
    JTextField  AuthorTextBox;
    JTextField  PublisherTextBox;
    JTextField  EditionTextBox;

    //button
    JButton AddbookButton;
    JButton UpdatebookButton;
    JButton ExitbookButton;
    JButton BackbookButton;

    //For Addmembers Frame
    JFrame AddmembersFrame;
    //Label
    JLabel MembernameLabel;
    JLabel IdLabel;
    JLabel DepartmentLabel;
    JLabel YearLabel;
    JLabel AddressLabel;
    JLabel DateLabel;

    //textfild
    JTextField MembernameTextBox;
    JTextField IdTextBox;
    JTextField DepartmentTextBox;
    JTextField YearTextBox;
    JTextField AddressTextBox;
    JTextField DateTextBox;
    //button
    JButton AddmembButton;
    JButton UpdatememberButton;
    JButton ExitmemberframeButton;
    JButton BackmemButton;

    //for issuebook frame
    JFrame IssueBooksFrame;
    //for label
    JLabel IbooknameLabel;
    JLabel IbookcodeLabel;
    JLabel InameLabel;
    JLabel IidLabel;
    JLabel IissueofdateLabel;
    JLabel IdueofdateLabel;

    //for textfild
    JTextField IbooknameTextField;
    JTextField IbookcodeTextField;
    JTextField InameTextField;
    JTextField IidTextField;
    JTextField IissueofdateTextField;
    JTextField IdueofdateTextField;

    //for button
    JButton IaddButton;
    JButton IupdateButton;
    JButton IexitButton;
    JButton IBackButton;

    //for Returnbook frame
    JFrame ReturnBooksFrame;
    //for label
    JLabel RbooknameLabel;
    JLabel RbookcodeLabel;
    JLabel RnameLabel;
    JLabel RidLabel;
    JLabel RissueofdateLabel;
    JLabel RdueofdateLabel;
    JLabel ReturnofdateLabel;

    //for textfild
    JTextField RbooknameTextField;
    JTextField RbookcodeTextField;
    JTextField RnameTextField;
    JTextField RidTextField;
    JTextField RissueofdateTextField;
    JTextField RdueofdateTextField;
    JTextField ReturnofdateTextField;

    //for button
    JButton RaddButton;
    JButton RupdateButton;
    JButton RexitButton;
    JButton RBackButton;

    //for searchframe
    JFrame SearchstudentFrame;
    JFrame SearchbooktFrame;
    
    //for button
    JButton studenserchtButton;
    JButton booksearchButton;
    
    //for label
    JLabel StudentsearchLabel;
    JLabel StudentidsearchLabel;
    JLabel departmentsearchLabel;
    JLabel BooknameserchLabel;
    JLabel BookcodeserchLabel;
    JLabel subjectserchLabel;

    //for textfild
    JTextField StudentsearchTextField;
    JTextField departmentsearchTextField;
    JTextField StudentidsearchTextField;
    
    JTextField BooknameserchTextField;
    JTextField BookcodeserchTextField;
    JTextField subjectserchTextField;

    //for book or student search button
    JButton SSearchButton;
    JButton SBackButton;
    JButton BSearchButton;
    JButton BBackButton;
    JButton SexitButton;
    JButton BexitButton;

    TextArea SsearchTextArea;
    JLabel SsearchTALabel;
    TextArea BsearchTextArea;
    JLabel BsearchTALabel;
    
    public static ArrayList<String> loginname;
   	public static ArrayList<String> loginpass;
     
    public static ArrayList<String> bname;
   	public static ArrayList<String> bcode;
   	public static ArrayList<String> sub;
   	public static ArrayList<String> aut;
   	public static ArrayList<String> pub;
   	public static ArrayList<String> ed;
    
    public static ArrayList<String> name;
   	public static ArrayList<String> id;
   	public static ArrayList<String> dep;
   	public static ArrayList<String> yr;
   	public static ArrayList<String> adds;
   	public static ArrayList<String> mdate;
   	
	public static ArrayList<String> iid;
    public static ArrayList<String> ibname;
   	public static ArrayList<String> ibcode;
   	public static ArrayList<String> isub;
   	public static ArrayList<String> iaut;
   	public static ArrayList<String> ipub;
   	public static ArrayList<String> ied;
 	public static ArrayList<String> isdt;
   	public static ArrayList<String> dudt;
   	

    public Main (){
    	
    	loginname=new  ArrayList<String>();
		loginpass=new  ArrayList<String>();
    	   	
    	name=new  ArrayList<String>();
		id=new  ArrayList<String>();
		dep=new  ArrayList<String>();
		yr =new  ArrayList<String>();
		adds=new  ArrayList<String>();
		mdate=new  ArrayList<String>();	
		
		bname=new  ArrayList<String>();
		bcode=new  ArrayList<String>();
		sub=new  ArrayList<String>();
		aut =new  ArrayList<String>();
		pub=new  ArrayList<String>();
		ed=new  ArrayList<String>();
		
		iid=new  ArrayList<String>();
		ibname=new  ArrayList<String>();
		ibcode=new  ArrayList<String>();
		isub=new  ArrayList<String>();
		iaut =new  ArrayList<String>();
		ipub=new  ArrayList<String>();
		ied=new  ArrayList<String>();
		isdt=new  ArrayList<String>();
		dudt=new  ArrayList<String>();
		
				
		try {
			
			Scanner x = new Scanner(new File("loginname.txt"));
			Scanner x1 = new Scanner(new File("loginpass.txt"));
	
			Scanner s = new Scanner(new File("1name.txt"));
			Scanner s1 = new Scanner(new File("1id.txt"));
			Scanner s2 = new Scanner(new File("1dept.txt"));
			Scanner s3 = new Scanner(new File("1yearle.txt"));
			Scanner s4 = new Scanner(new File("1address.txt"));
			Scanner s5 = new Scanner(new File("1memberdate.txt"));	
			
			Scanner p = new Scanner(new File("2bookname.txt"));
			Scanner p7 = new Scanner(new File("2bookcode.txt"));
			Scanner p8 = new Scanner(new File("2subject.txt"));
			Scanner p9 = new Scanner(new File("2author.txt"));
			Scanner p10 = new Scanner(new File("2publisher.txt"));
			Scanner p11 = new Scanner(new File("2edition.txt"));
			
			Scanner a = new Scanner(new File("22id.txt"));
			Scanner a7 = new Scanner(new File("22bkname.txt"));
			Scanner a8 = new Scanner(new File("22bookcode.txt"));
			Scanner a9 = new Scanner(new File("22subject.txt"));
			Scanner a10 = new Scanner(new File("22author.txt"));
			Scanner a11 = new Scanner(new File("22publisher.txt"));
			Scanner a12 = new Scanner(new File("22edition.txt"));
			Scanner a13 = new Scanner(new File("22issuedate.txt"));
			Scanner a14 = new Scanner(new File("22duedate.txt"));
					
			while(x.hasNext()){
				
				loginname.add(x.nextLine());
			    loginpass.add(x1.nextLine());
				
			}
			
			x.close();
			x1.close();
					
			while(p.hasNext()){
				
				bname.add(p.nextLine());
			    bcode.add(p7.nextLine());
				sub.add(p8.nextLine());
				aut.add(p9.nextLine());
				pub.add(p10.nextLine());
				ed.add(p11.nextLine());
				
			}
			
			p.close();
			p7.close();
			p8.close();
			p9.close();
			p10.close();
			p11.close();
			
			
			while(s.hasNext())
			{				
				name.add(s.nextLine());
				id.add(s1.nextLine());
				dep.add(s2.nextLine());
				yr.add(s3.nextLine());
				adds.add(s4.nextLine());
				mdate.add(s5.nextLine());		
								
			}
						
			s.close();
			s1.close();
			s2.close();
			s3.close();
			s4.close();
			s5.close();
			
			while(a.hasNext()){
				
				iid.add(a.nextLine());
				ibname.add(a7.nextLine());
			    ibcode.add(a8.nextLine());
				isub.add(a9.nextLine());
				iaut.add(a10.nextLine());
				ipub.add(a11.nextLine());
				ied.add(a12.nextLine());
				isdt.add(a13.nextLine());
				dudt.add(a14.nextLine());
				
			}
			
			a.close();	
			a7.close();
			a8.close();
			a9.close();
			a10.close();
			a11.close();
			a12.close();
			a13.close();
			a14.close();
			
			
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
    	   	
    	 //show names 1st frame
        MainFrame = new JFrame("MainFrame");
        LibraryLabel = new JLabel("Library Management System");
        nextButton = new JButton("NEXT");

        //login frame
        loginFrame=new JFrame("Loginframe");
        usernameLabel=new JLabel("User Name");
        passwordLabel=new JLabel("Paasword");
        usernameTextField=new JTextField("");
        passwordField=new JPasswordField("");
        loginButton=new JButton("Login");
        loginLabel=new JLabel("LOG IN");

        //show List 2ndframe
        LibraryoptionsFrame = new JFrame("Library Options");
        SelectOptionLabel = new JLabel("Please Select Your Option");
        AddbooksButton = new JButton("Addbook");
        AddmembersButton= new JButton("Addmembers");
        IssuebooksButton= new JButton("Issue Of Book");
        ReturnBooksButton= new JButton("Return of Books");
        ExitLOFButton=new JButton("EXIT");

        //for add book frame
        AddbookFrame= new JFrame("AddBook");
        //for label
        BooknameLabel=new JLabel("BookName");
        BookCodeLabel=new JLabel("BookCode");
        SubjectLabel=new JLabel("Subject");
        AuthorLabel=new JLabel("Author");
        PublisherLabel=new JLabel("Publisher");
        EditionLabel=new JLabel("Edition");

        //for textfield
        BooknameTextBox = new JTextField("");
        BookCodeTextBox = new JTextField("");
        SubjectTextBox = new JTextField("");
        AuthorTextBox = new JTextField("");
        PublisherTextBox = new JTextField("");
        EditionTextBox = new JTextField("");

        //for button
        AddbookButton=new JButton("ADD BOOK");
        UpdatebookButton=new JButton("EDIT");
        ExitbookButton=new JButton("EXIT");
        BackbookButton= new JButton("BACK");

        //for addmember frame
        AddmembersFrame=new JFrame("AddMembers");
        //label
        MembernameLabel=new JLabel("Name");
        IdLabel=new JLabel("ID");
        DepartmentLabel=new JLabel("Department");
        YearLabel=new JLabel("Year Level");
        AddressLabel=new JLabel("Address");
        DateLabel=new JLabel("Date");
        //text box
        MembernameTextBox =new JTextField("");
        IdTextBox = new JTextField("");
        DepartmentTextBox = new JTextField("");
        YearTextBox = new JTextField("");
        AddressTextBox = new JTextField("");
        DateTextBox = new JTextField("");

        //button
        AddmembButton=new JButton("ADD MEMBER");
        UpdatememberButton=new JButton("EDIT");
        ExitmemberframeButton=new JButton("EXIT");
        BackmemButton= new JButton("BACK");

        //for issuebook
        IssueBooksFrame=new JFrame("Issue Books");

        IbooknameLabel=new JLabel("Book Name");
        IbookcodeLabel=new JLabel("Book Code");
        InameLabel=new JLabel("Name");
        IidLabel =new JLabel("ID");
        IissueofdateLabel=new JLabel("Issue Of Date");
        IdueofdateLabel=new JLabel("Due of Date");

        IbooknameTextField=new JTextField("");
        IbookcodeTextField=new JTextField("");
        InameTextField=new JTextField("");
        IidTextField=new JTextField("");
        IissueofdateTextField=new JTextField("");
        IdueofdateTextField=new JTextField("");

        IaddButton=new JButton("ISSUE BOOK ADD");
        IupdateButton=new JButton("EDIT");
        IexitButton=new JButton("EXIT");
        IBackButton= new JButton("BACK");

        //for return book
        ReturnBooksFrame=new JFrame("Return Books");
        RbooknameLabel=new JLabel("Book Name");
        RbookcodeLabel=new JLabel("Book Code");
        RnameLabel=new JLabel("Name");
        RidLabel =new JLabel("ID");
        RissueofdateLabel=new JLabel("Issue Of Date");
        RdueofdateLabel=new JLabel("Due of Date");
        ReturnofdateLabel=new JLabel("Return Of Date");

        RbooknameTextField=new JTextField("");
        RbookcodeTextField=new JTextField("");
        RnameTextField=new JTextField("");
        RidTextField=new JTextField("");
        RissueofdateTextField=new JTextField("");
        RdueofdateTextField=new JTextField("");
        ReturnofdateTextField=new JTextField("");

        RaddButton=new JButton("RUTURN BOOK");
        RupdateButton=new JButton("EDIT");
        RexitButton=new JButton("EXIT");
        RBackButton= new JButton("BACK");

        //for search options
        SearchstudentFrame=new JFrame("Searchstudent");
        SearchbooktFrame = new JFrame("Searchbook");

        studenserchtButton=new JButton("Student Search");
        booksearchButton=new JButton("Book Search");

        StudentsearchLabel=new JLabel("Student Name");
        StudentidsearchLabel=new JLabel("Student ID");
        departmentsearchLabel=new JLabel("Department");

        BooknameserchLabel =new JLabel("Book Name");
        BookcodeserchLabel=new JLabel("Book Code");
        subjectserchLabel=new JLabel("Subject");

        StudentsearchTextField=new JTextField("");
        StudentidsearchTextField=new JTextField("");
        departmentsearchTextField=new JTextField("");
        BooknameserchTextField=new JTextField("");
        BookcodeserchTextField=new JTextField("");
        subjectserchTextField=new JTextField("");

        SSearchButton=new JButton("SEARCH");
        SBackButton=new JButton("BACK");
        BSearchButton=new JButton("SEARCHH");
        BBackButton=new JButton("BACK");

        SexitButton=new JButton("EXIT");
        BexitButton=new JButton("EXIT");

        SsearchTextArea=new TextArea(" ");
        SsearchTALabel=new JLabel("Text Area");
        BsearchTextArea=new TextArea(" ");
        BsearchTALabel=new JLabel("Text Area");
    	
    	
    }
    
    
    public void MainFrame()
    {

        //for pic
        try {
            MainFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read
                    (new File("p.jpg")))));
        } catch (IOException f) {
            f.printStackTrace();
        }

        //for 1st frame
        MainFrame.addWindowListener(this);
        MainFrame.setSize(1366,768);
        MainFrame.setResizable(true);
        MainFrame.setLayout(null);
        MainFrame.setVisible(true);

        nextButton.addActionListener(this);

        //set label
        LibraryLabel.setFont(new Font("BOLD",Font.CENTER_BASELINE,62));
        LibraryLabel.setBounds(300, 100, 1000,100);
        nextButton.setFont(new Font("CASTELLAR", Font.BOLD,36));
        nextButton.setBounds(700, 550, 250,36);

        // for set color
        Color  textColor 	= Color.WHITE;
        Color  buttonColor	= Color.BLUE;
        Color  labelColor = Color.BLUE;

        LibraryLabel.setForeground(textColor);
        LibraryLabel.setForeground(labelColor);
        nextButton.setForeground(textColor);
        nextButton.setBackground(buttonColor);

        //for add
        MainFrame.add(LibraryLabel);
        MainFrame.add(nextButton);

    }

    @SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("NEXT"))
        {
            try {
                loginFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read
                        (new File("p.jpg")))));
            } catch (IOException f) {
                f.printStackTrace();
            }

            loginFrame.addWindowListener(this);
            loginFrame.setSize(1366,768);
            loginFrame.setResizable(true);
            loginFrame.setLayout(null);
            loginFrame.setVisible(true);
            MainFrame.setVisible(false);
            loginButton.addActionListener(this);

            loginFrame.add(usernameLabel);
            loginFrame.add(passwordLabel);
            loginFrame.add(usernameTextField);
            loginFrame.add( passwordField);
            loginFrame.add(loginButton);
            loginFrame.add(loginLabel);

            usernameLabel.setFont(new Font("BOLD", Font.BOLD, 26));
            usernameLabel.setBounds(250, 240, 450, 30);
            passwordLabel.setFont(new Font("BOLD", Font.BOLD, 26));
            passwordLabel.setBounds(250, 310, 450, 30);
            usernameTextField.setFont(new Font("Arial", Font.BOLD, 20));
            usernameTextField.setBounds(550, 240, 200, 30);
            passwordField.setFont(new Font("Arial", Font.BOLD, 20));
            passwordField.setBounds(550, 310, 200, 30);

            loginButton.setFont(new Font("CASTELLAR", Font.BOLD, 15));
            loginButton.setBounds(550, 550, 250, 50);

            loginLabel.setFont(new Font("BOLD",Font.CENTER_BASELINE,62));
            loginLabel.setBounds(600, 50, 800,100);

            Color textColor=Color.blue;
            Color text1Color=Color.white;
            Color buttonColor=Color.BLUE;
            loginLabel.setForeground(textColor);
            loginButton.setForeground(text1Color);
            loginButton.setBackground(buttonColor);
            usernameLabel.setForeground(textColor);
            passwordLabel.setForeground(textColor);


        }

        else if (e.getActionCommand().equals("Login"))
        {         
            int flag=0;
            for(int i=0 ;i<loginpass.size();i++)
            {           
            	if((loginpass.get(i)).equals(passwordField.getText()) && loginname.get(i).equals(usernameTextField.getText()))
            	{
            		loginFrame.setVisible(false);
            		Libraryfeature lf=new Libraryfeature();
            		lf.FeatureFrame();   
            		flag=1;
            	}
            }
           if(flag==0)
            {
                JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
            }

        }
        
    }
	
    public static void main(String[] args)
    {       
        Main open = new Main();
        open.MainFrame();
    }


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(0);
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
