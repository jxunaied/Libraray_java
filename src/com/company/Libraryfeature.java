package com.company;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Libraryfeature extends Main implements WindowListener,ActionListener
{
	
	public Libraryfeature()
	{
		super();
	}
	
	public void FeatureFrame()
	{
		 try {
             LibraryoptionsFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read
                     (new File("p.jpg")))));
         } catch (IOException f) {
             f.printStackTrace();
         }
        
         LibraryoptionsFrame.addWindowListener((WindowListener) this);
         LibraryoptionsFrame.setSize(1366, 768);
         LibraryoptionsFrame.setResizable(true);
         LibraryoptionsFrame.setLayout(null);
         LibraryoptionsFrame.setVisible(true);
         loginFrame.setVisible(false);

         //  LibraryoptionsFrame = new JFrame("Library Options");
         SelectOptionLabel = new JLabel("Please Select Your Options");
         AddbooksButton = new JButton("Addbook");
         AddmembersButton = new JButton("Addmembers");
         IssuebooksButton = new JButton("Issue Of Book");
         ReturnBooksButton = new JButton("Return of Books");
         studenserchtButton=new JButton("Student Search");
         booksearchButton=new JButton("Book Search");
         ExitLOFButton=new JButton("EXIT");

         //for add button
         LibraryoptionsFrame.add(SelectOptionLabel);
         LibraryoptionsFrame.add(AddbooksButton);
         LibraryoptionsFrame.add(AddmembersButton);
         LibraryoptionsFrame.add(IssuebooksButton);
         LibraryoptionsFrame.add(ReturnBooksButton);
         LibraryoptionsFrame.add( studenserchtButton);
         LibraryoptionsFrame.add( booksearchButton);
         LibraryoptionsFrame.add(ExitLOFButton);

         //add action listener
         AddbooksButton.addActionListener(this);
         AddmembersButton.addActionListener(this);
         IssuebooksButton.addActionListener(this);
         ReturnBooksButton.addActionListener(this);
         studenserchtButton.addActionListener(this);
         booksearchButton.addActionListener(this);
         ExitLOFButton.addActionListener(this);

         //set size and front
         SelectOptionLabel.setFont(new Font("BOLD", Font.BOLD, 36));
         SelectOptionLabel.setBounds(450, 1, 800, 100);

         AddbooksButton.setFont(new Font("CASTELLAR", Font.BOLD, 15));
         AddbooksButton.setBounds(250, 150, 250, 30);
         AddmembersButton.setFont(new Font("CASTELLAR", Font.BOLD, 15));
         AddmembersButton.setBounds(250, 250, 250, 30);

         IssuebooksButton.setFont(new Font("CASTELLAR", Font.BOLD, 15));
         IssuebooksButton.setBounds(250, 350, 250, 30);
         ReturnBooksButton.setFont(new Font("CASTELLAR", Font.BOLD, 15));
         ReturnBooksButton.setBounds(250, 450, 250, 30);
         studenserchtButton.setFont(new Font("CASTELLAR", Font.BOLD, 15));
         studenserchtButton.setBounds(250, 550, 250, 30);
         booksearchButton.setFont(new Font("CASTELLAR", Font.BOLD, 15));
         booksearchButton.setBounds(250, 650, 250, 30);
         ExitLOFButton.setFont(new Font("Arial", Font.BOLD, 16));
         ExitLOFButton.setBounds(950, 600, 150, 30);

         Color textColor = Color.white;
         Color buttonColor = Color.BLUE;
         Color  labelColor = Color.BLUE;

         SelectOptionLabel.setForeground(labelColor);

         AddbooksButton.setForeground(textColor);
         AddmembersButton.setForeground(textColor);
         IssuebooksButton.setForeground(textColor);
         ReturnBooksButton.setForeground(textColor);
         studenserchtButton.setForeground(textColor);
         booksearchButton.setForeground(textColor);
         ExitLOFButton.setForeground(textColor);

         AddbooksButton.setBackground(buttonColor);
         AddmembersButton.setBackground(buttonColor);
         IssuebooksButton.setBackground(buttonColor);
         ReturnBooksButton.setBackground(buttonColor);
         studenserchtButton.setBackground(buttonColor);
         booksearchButton.setBackground(buttonColor);
         ExitLOFButton.setBackground(buttonColor);
		
	}
	
	public void actionPerformed(ActionEvent e) {


	       if (e.getActionCommand().equals("Addbook"))
	        {
	    	   
	    	    LibraryoptionsFrame.setVisible(false);
	            Addbooks ab=new Addbooks();
	            ab.addbks();

	        }
	        else if (e.getActionCommand().equals("Addmembers")) 
	        {
	        	LibraryoptionsFrame.setVisible(false);
	        	Addmembers am =new Addmembers();
	        	am.addmbrs();
	        	
	        }
	        else if (e.getActionCommand().equals("Issue Of Book"))
	        {
	        	LibraryoptionsFrame.setVisible(false);
	        	IssueBook ib=new IssueBook();
	        	ib.Isbks();
	
	        }

	        else if (e.getActionCommand().equals("Return of Books"))
	        {
	        	LibraryoptionsFrame.setVisible(false);	
	        	ReturnBook rb=new ReturnBook();
	        	rb.Rebks();

	        }

	        else if (e.getActionCommand().equals("Student Search"))
	        {
	        	LibraryoptionsFrame.setVisible(false);	
	            StudentSearch ss=new StudentSearch();
	            ss.StSrc();

	        }
	        else if (e.getActionCommand().equals("Book Search"))

	        {
	        	LibraryoptionsFrame.setVisible(false);	
	        	BookSearch bs=new BookSearch();
	        	bs.BSrc();

	        }
	       
	        else if (e.getActionCommand().equals("EXIT")) {
	          
	            System.exit(0);
	        }
	       
	}

}
