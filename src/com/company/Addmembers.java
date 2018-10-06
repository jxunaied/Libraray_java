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
public class Addmembers extends Main implements WindowListener,ActionListener{
	
	public Addmembers(){
		
		super();
	}
	
	public void addmbrs(){
		
		  try {
              AddmembersFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read
                      (new File("p.jpg")))));
          } catch (IOException f) {
              f.printStackTrace();
          }

          AddmembersFrame.addWindowListener(this);
          AddmembersFrame.setSize(1366, 768);
          AddmembersFrame.setResizable(true);
          AddmembersFrame.setLayout(null);
          AddmembersFrame.setVisible(true);

          AddmembButton.addActionListener(this);
          UpdatememberButton.addActionListener(this);
          ExitmemberframeButton.addActionListener(this);
          BackmemButton.addActionListener(this);

          AddmembersFrame.add(MembernameLabel);
          AddmembersFrame.add(IdLabel);
          AddmembersFrame.add(DepartmentLabel);
          AddmembersFrame.add(YearLabel);
          AddmembersFrame.add(AddressLabel);
          AddmembersFrame.add(DateLabel);

          AddmembersFrame.add(MembernameTextBox);
          AddmembersFrame.add(IdTextBox);
          AddmembersFrame.add(DepartmentTextBox);
          AddmembersFrame.add(YearTextBox);
          AddmembersFrame.add(AddressTextBox);
          AddmembersFrame.add(DateTextBox);

          AddmembersFrame.add(AddmembButton);
          AddmembersFrame.add(UpdatememberButton);
          AddmembersFrame.add(ExitmemberframeButton);
          AddmembersFrame.add(BackmemButton);

          Color textColor = Color.BLUE;
          Color text1Color = Color.WHITE;
          Color buttonColor=Color.BLUE;

          MembernameLabel.setForeground(textColor);
          IdLabel.setForeground(textColor);
          DepartmentLabel.setForeground(textColor);
          YearLabel.setForeground(textColor);
          AddressLabel.setForeground(textColor);
          DateLabel.setForeground(textColor);

          AddmembButton.setBackground(buttonColor);
          AddmembButton.setForeground(text1Color);
          UpdatememberButton.setBackground(buttonColor);
          UpdatememberButton.setForeground(text1Color);
          ExitmemberframeButton.setBackground(buttonColor);
          ExitmemberframeButton.setForeground(text1Color);
          BackmemButton.setBackground(buttonColor);
          BackmemButton.setForeground(text1Color);

          MembernameLabel.setFont(new Font("BOLD", Font.BOLD, 26));
          MembernameLabel.setBounds(150, 100, 450, 30);
          MembernameTextBox.setFont(new Font("Arial", Font.BOLD, 20));
          MembernameTextBox.setBounds(550, 100, 200, 30);

          IdLabel.setFont(new Font("BOLD", Font.BOLD, 26));
          IdLabel.setBounds(150, 170, 450, 30);
          IdTextBox.setFont(new Font("Arial", Font.BOLD, 20));
          IdTextBox.setBounds(550, 170, 200, 30);

          DepartmentLabel.setFont(new Font("BOLD", Font.BOLD, 26));
          DepartmentLabel.setBounds(150, 240, 450, 30);
          DepartmentTextBox.setFont(new Font("Arial", Font.BOLD, 20));
          DepartmentTextBox.setBounds(550, 240, 200, 30);

          YearLabel.setFont(new Font("BOLD", Font.BOLD, 26));
          YearLabel.setBounds(150, 310, 450, 30);
          YearTextBox.setFont(new Font("Arial", Font.BOLD, 20));
          YearTextBox.setBounds(550, 310, 200, 30);

          AddressLabel.setFont(new Font("BOLD", Font.BOLD, 26));
          AddressLabel.setBounds(150, 380, 450, 30);
          AddressTextBox.setFont(new Font("Arial", Font.BOLD, 20));
          AddressTextBox.setBounds(550, 380, 200, 30);

          DateLabel.setFont(new Font("BOLD", Font.BOLD, 26));
          DateLabel.setBounds(150, 450, 450, 30);
          DateTextBox.setFont(new Font("Arial", Font.BOLD, 20));
          DateTextBox.setBounds(550, 450, 200, 30);

          AddmembButton.setFont(new Font("Arial", Font.BOLD, 16));
          AddmembButton.setBounds(250, 600, 150, 30);
          UpdatememberButton.setFont(new Font("Arial", Font.BOLD, 16));
          UpdatememberButton.setBounds(450, 600, 150, 30);
          ExitmemberframeButton.setFont(new Font("Arial", Font.BOLD, 16));
          ExitmemberframeButton.setBounds(650, 600, 150, 30);

          BackmemButton.setFont(new Font("Arial", Font.BOLD, 16));
          BackmemButton.setBounds(850, 600, 150, 30);
		
	}
	
	 public void actionPerformed(ActionEvent e) {
		 
		   if (e.getActionCommand().equals("ADD MEMBER"))
	        {
			   
			   try {
    	    	   
					BufferedWriter f1 = new BufferedWriter(new FileWriter("1name.txt",true));
				    BufferedWriter f2= new BufferedWriter(new FileWriter("1id.txt",true));
				    BufferedWriter f3 = new BufferedWriter(new FileWriter("1dept.txt",true));
				    BufferedWriter f4 = new BufferedWriter(new FileWriter("1yearle.txt",true));
				    BufferedWriter f5 = new BufferedWriter(new FileWriter("1address.txt",true));
				    BufferedWriter f6 = new BufferedWriter(new FileWriter("1memberdate.txt",true));
				    
				    String m1 = MembernameTextBox.getText();
				    String m2 = IdTextBox.getText();
				    String m3 = DepartmentTextBox.getText();
				    String m4 = YearTextBox.getText();
				    String m5 = AddressTextBox.getText();
				    String m6 = DateTextBox.getText();				  
				    
				    f1.write(""+m1);
				    f1.newLine();
				    f2.write(""+m2);
				    f2.newLine();
				    f3.write(""+m3);
				    f3.newLine();
				    f4.write(""+m4);
				    f4.newLine();
				    f5.write(""+m5);
				    f5.newLine();
				    f6.write(""+m6);
				    f6.newLine();				    
				    
				    f1.close();
				    f2.close();
				    f3.close();
				    f4.close();
				    f5.close();
				    f6.close();
				    				    
				    
			   } catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			   }
   	     	   
			   MembernameTextBox.setText("");
			   IdTextBox.setText("");
			   DepartmentTextBox.setText("");
			   YearTextBox.setText("");
			   AddressTextBox.setText("");
			   DateTextBox.setText("");

	           JOptionPane.showMessageDialog(null, "Member is added", "Success", JOptionPane.INFORMATION_MESSAGE);

	        }
		   else if (e.getActionCommand().equals("BACK")) {

			    AddmembersFrame.setVisible(false);
	            Libraryfeature lf=new Libraryfeature();
                lf.FeatureFrame();
	        	           
	        }
		  else if (e.getActionCommand().equals("EXIT")) {
	          
	            System.exit(0);
	        }
 
	 }

}
