package com.company;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Addbooks extends Main implements WindowListener,ActionListener{

	
	public Addbooks(){
		
		super();
	}
	
	public void addbks(){
		
		try {
            AddbookFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read
                    (new File("p.jpg")))));
        } catch (IOException f) {
            f.printStackTrace();
        }

        AddbookFrame.addWindowListener(this);
        AddbookFrame.setSize(1366, 768);
        AddbookFrame.setResizable(true);
        AddbookFrame.setLayout(null);
        AddbookFrame.setVisible(true);

        AddbookButton.addActionListener(this);
        UpdatebookButton.addActionListener(this);
        ExitbookButton.addActionListener(this);
        BackbookButton.addActionListener(this);

        //add label for addbook frame
        AddbookFrame.add(BooknameLabel);
        AddbookFrame.add(BookCodeLabel);
        AddbookFrame.add(SubjectLabel);
        AddbookFrame.add(AuthorLabel);
        AddbookFrame.add(PublisherLabel);
        AddbookFrame.add(EditionLabel);

        //add textfild for add book frame
        AddbookFrame.add(BooknameTextBox);
        AddbookFrame.add(BookCodeTextBox);
        AddbookFrame.add(SubjectTextBox);
        AddbookFrame.add(AuthorTextBox);
        AddbookFrame.add(PublisherTextBox);
        AddbookFrame.add(EditionTextBox);

        //add button
        AddbookFrame.add(AddbookButton);
        AddbookFrame.add(UpdatebookButton);
        AddbookFrame.add(ExitbookButton);
        AddbookFrame.add(BackbookButton);

        Color textColor = Color.BLUE;
        Color text1Color = Color.WHITE;
        Color buttonColor=Color.BLUE;

        BooknameLabel.setForeground(textColor);
        BookCodeLabel.setForeground(textColor);
        SubjectLabel.setForeground(textColor);
        AuthorLabel.setForeground(textColor);
        PublisherLabel.setForeground(textColor);
        EditionLabel.setForeground(textColor);
        AddbookButton.setBackground(buttonColor);
        AddbookButton.setForeground(text1Color);
        UpdatebookButton.setBackground(buttonColor);
        UpdatebookButton.setForeground(text1Color);
        ExitbookButton.setBackground(buttonColor);
        ExitbookButton.setForeground(text1Color);
        BackbookButton.setBackground(buttonColor);
        BackbookButton.setForeground(text1Color);

        //add size,color and front
        BooknameLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        BooknameLabel.setBounds(150, 100, 450, 30);
        BooknameTextBox.setFont(new Font("Arial", Font.BOLD, 20));
        BooknameTextBox.setBounds(550, 100, 200, 30);

        BookCodeLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        BookCodeLabel.setBounds(150, 170, 450, 30);
        BookCodeTextBox.setFont(new Font("Arial", Font.BOLD, 20));
        BookCodeTextBox.setBounds(550, 170, 200, 30);

        SubjectLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        SubjectLabel.setBounds(150, 240, 450, 30);
        SubjectTextBox.setFont(new Font("Arial", Font.BOLD, 20));
        SubjectTextBox.setBounds(550, 240, 200, 30);

        AuthorLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        AuthorLabel.setBounds(150, 310, 450, 30);
        AuthorTextBox.setFont(new Font("Arial", Font.BOLD, 20));
        AuthorTextBox.setBounds(550, 310, 200, 30);

        PublisherLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        PublisherLabel.setBounds(150, 380, 450, 30);
        PublisherTextBox.setFont(new Font("Arial", Font.BOLD, 20));
        PublisherTextBox.setBounds(550, 380, 200, 30);

        EditionLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        EditionLabel.setBounds(150, 450, 450, 30);
        EditionTextBox.setFont(new Font("Arial", Font.BOLD, 20));
        EditionTextBox.setBounds(550, 450, 200, 30);

        AddbookButton.setFont(new Font("Arial", Font.BOLD, 16));
        AddbookButton.setBounds(250, 600, 150, 30);
        UpdatebookButton.setFont(new Font("Arial", Font.BOLD, 16));
        UpdatebookButton.setBounds(450, 600, 150, 30);
        ExitbookButton.setFont(new Font("Arial", Font.BOLD, 16));
        ExitbookButton.setBounds(650, 600, 150, 30);
        BackbookButton.setFont(new Font("Arial", Font.BOLD, 16));
        BackbookButton.setBounds(850, 600, 150, 30);
	}
	  public void actionPerformed(ActionEvent e) 
	  {
		  if (e.getActionCommand().equals("ADD BOOK"))
	        {
			  
			  try {
   	    	   
					BufferedWriter f7 = new BufferedWriter(new FileWriter("2bookname.txt",true));
				    BufferedWriter f8= new BufferedWriter(new FileWriter("2bookcode.txt",true));
				    BufferedWriter f9 = new BufferedWriter(new FileWriter("2subject.txt",true));
				    BufferedWriter f10 = new BufferedWriter(new FileWriter("2author.txt",true));
				    BufferedWriter f11 = new BufferedWriter(new FileWriter("2publisher.txt",true));
				    BufferedWriter f12 = new BufferedWriter(new FileWriter("2edition.txt",true));
				   				    
				    String m1 = BooknameTextBox.getText();
				    String m2 = BookCodeTextBox.getText();
				    String m3 = SubjectTextBox.getText();
				    String m4 = AuthorTextBox.getText();
				    String m5 = PublisherTextBox.getText();
				    String m6 = EditionTextBox.getText();
				  				    
				    f7.write(""+m1);
				    f7.newLine();
				    f8.write(""+m2);
				    f8.newLine();
				    f9.write(""+m3);
				    f9.newLine();
				    f10.write(""+m4);
				    f10.newLine();
				    f11.write(""+m5);
				    f11.newLine();
				    f12.write(""+m6);
				    f12.newLine();
				  				    
				    f7.close();
				    f8.close();
				    f9.close();
				    f10.close();
				    f11.close();
				    f12.close();
				    			    
				    
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  			
			    BooknameTextBox.setText("");
			    BookCodeTextBox.setText("");
			    SubjectTextBox.setText("");
			    AuthorTextBox.setText("");
			    PublisherTextBox.setText("");
			    EditionTextBox.setText("");		    

	            JOptionPane.showMessageDialog(null, "Book is added", "Success", JOptionPane.INFORMATION_MESSAGE);
	            
	      }
		  else if (e.getActionCommand().equals("BACK")) 
		  {  
	            AddbookFrame.setVisible(false);
	            Libraryfeature lf=new Libraryfeature();
                lf.FeatureFrame();  
	           
	        }
		  else if (e.getActionCommand().equals("EXIT")) {
	          
	            System.exit(0);
	        }
	  }
	
}
