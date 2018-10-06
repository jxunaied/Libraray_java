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
public class IssueBook extends Main implements WindowListener,ActionListener{
	
	public IssueBook(){
		
		super();
	}
	
	public void Isbks(){
		
		 try {
             IssueBooksFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read
                     (new File("p.jpg")))));
         } catch (IOException f) {
             f.printStackTrace();
         }

         IssueBooksFrame.addWindowListener(this);
         IssueBooksFrame.setSize(1366,768);
         IssueBooksFrame.setResizable(true);
         IssueBooksFrame.setLayout(null);
         IssueBooksFrame.setVisible(true);

         IaddButton.addActionListener(this);
         IupdateButton.addActionListener(this);
         IexitButton.addActionListener(this);
         IBackButton.addActionListener(this);

         IssueBooksFrame.add(IbooknameLabel);
         IssueBooksFrame.add(IbookcodeLabel);
         IssueBooksFrame.add(InameLabel);
         IssueBooksFrame.add(IidLabel);
         IssueBooksFrame.add(IissueofdateLabel);
         IssueBooksFrame.add(IdueofdateLabel);

         IssueBooksFrame.add(IbooknameTextField);
         IssueBooksFrame.add(IbookcodeTextField);
         IssueBooksFrame.add(InameTextField);
         IssueBooksFrame.add(IidTextField);
         IssueBooksFrame.add(IissueofdateTextField);
         IssueBooksFrame.add(IdueofdateTextField);

         IssueBooksFrame.add(IaddButton);
         IssueBooksFrame.add(IupdateButton);
         IssueBooksFrame.add(IexitButton);
         IssueBooksFrame.add(IBackButton);

         Color textColor = Color.BLUE;
         Color text1Color = Color.WHITE;
         Color buttonColor=Color.BLUE;

         IbooknameLabel.setForeground(textColor);
         IbookcodeLabel.setForeground(textColor);
         InameLabel.setForeground(textColor);
         IidLabel.setForeground(textColor);
         IissueofdateLabel.setForeground(textColor);
         IdueofdateLabel.setForeground(textColor);

         IaddButton.setBackground(buttonColor);
         IaddButton.setForeground(text1Color);
         IupdateButton.setBackground(buttonColor);
         IupdateButton.setForeground(text1Color);
         IexitButton.setBackground(buttonColor);
         IexitButton.setForeground(text1Color);
         IBackButton.setBackground(buttonColor);
         IBackButton.setForeground(text1Color);

         IbooknameLabel.setFont(new Font("BOLD", Font.BOLD, 26));
         IbooknameLabel.setBounds(150, 100, 450, 30);
         IbooknameTextField.setFont(new Font("Arial", Font.BOLD, 20));
         IbooknameTextField.setBounds(550, 100, 200, 30);

         IbookcodeLabel.setFont(new Font("BOLD",Font.BOLD,26));
         IbookcodeLabel.setBounds(150, 170, 450, 30);
         IbookcodeTextField.setFont(new Font("Arial", Font.BOLD, 20));
         IbookcodeTextField.setBounds(550, 170, 200, 30);

         InameLabel.setFont(new Font("BOLD", Font.BOLD, 26));
         InameLabel.setBounds(150, 240, 450, 30);
         InameTextField.setFont(new Font("Arial", Font.BOLD, 20));
         InameTextField.setBounds(550, 240, 200, 30);

         IidLabel.setFont(new Font("BOLD", Font.BOLD, 26));
         IidLabel.setBounds(150, 310, 450, 30);
         IidTextField.setFont(new Font("Arial", Font.BOLD, 20));
         IidTextField.setBounds(550, 310, 200, 30);

         IissueofdateLabel.setFont(new Font("BOLD", Font.BOLD, 26));
         IissueofdateLabel.setBounds(150, 380, 450, 30);
         IissueofdateTextField.setFont(new Font("Arial", Font.BOLD, 20));
         IissueofdateTextField.setBounds(550, 380, 200, 30);

         IdueofdateLabel.setFont(new Font("BOLD", Font.BOLD, 26));
         IdueofdateLabel.setBounds(150, 450, 450, 30);
         IdueofdateTextField.setFont(new Font("Arial", Font.BOLD, 20));
         IdueofdateTextField.setBounds(550, 450, 200, 30);

         IaddButton.setFont(new Font("Arial",Font.BOLD,16));
         IaddButton.setBounds(250,600,150,30);
         IupdateButton.setFont(new Font("Arial",Font.BOLD,16));
         IupdateButton.setBounds(450,600,150,30);
         IexitButton.setFont(new Font("Arial",Font.BOLD,16));
         IexitButton.setBounds(650,600,150,30);

         IBackButton.setFont(new Font("Arial", Font.BOLD, 16));
         IBackButton.setBounds(850, 600, 150, 30);
		
	}
	
	 public void actionPerformed(ActionEvent e) {
		 
		 if(e.getActionCommand().equals("ISSUE BOOK ADD"))
		 {
			 int flag=0;
			for(int i=0; i< bcode.size();i++ )
			{
				if(bcode.get(i).equals(IbookcodeTextField.getText()))
				{
					 try {
			   	    	   
						    BufferedWriter f6= new BufferedWriter(new FileWriter("22id.txt",true));
							BufferedWriter f7 = new BufferedWriter(new FileWriter("22bkname.txt",true));
						    BufferedWriter f8= new BufferedWriter(new FileWriter("22bookcode.txt",true));
						    BufferedWriter f9 = new BufferedWriter(new FileWriter("22subject.txt",true));
						    BufferedWriter f10 = new BufferedWriter(new FileWriter("22author.txt",true));
						    BufferedWriter f11 = new BufferedWriter(new FileWriter("22publisher.txt",true));
						    BufferedWriter f12 = new BufferedWriter(new FileWriter("22edition.txt",true));
						    BufferedWriter f13 = new BufferedWriter(new FileWriter("22issuedate.txt",true));
						    BufferedWriter f14 = new BufferedWriter(new FileWriter("22duedate.txt",true));
						    						    					    
						    String m = IidTextField.getText();
						    String m1 = bname.get(i);
						    String m2 = bcode.get(i);
						    String m3 = sub.get(i);
						    String m4 = aut.get(i);
						    String m5 = pub.get(i);
						    String m6 = ed.get(i);
						    String m7 = IissueofdateTextField.getText();
						    String m8 = IdueofdateTextField.getText();
						  
						    f6.write(""+m);
						    f6.newLine();
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
						    f13.write(""+m7);
						    f13.newLine();
						    f14.write(""+m8);
						    f14.newLine();
						  					    
						    f6.close();
						    f7.close();
						    f8.close();
						    f9.close();
						    f10.close();
						    f11.close();
						    f12.close();
						    f13.close();
						    f14.close();					    
						    
						    BufferedWriter br=new BufferedWriter(new FileWriter("2bookname.txt"));
							BufferedWriter br1=new BufferedWriter(new FileWriter("2bookcode.txt"));
							BufferedWriter br2=new BufferedWriter(new FileWriter("2subject.txt"));
							BufferedWriter br3=new BufferedWriter(new FileWriter("2author.txt"));
							BufferedWriter br4=new BufferedWriter(new FileWriter("2publisher.txt"));
							BufferedWriter br5=new BufferedWriter(new FileWriter("2edition.txt"));
							
							bname.set(i,"");
							bcode.set(i,"");
							sub.set(i,"");
							aut.set(i,"");
							pub.set(i,"");
							ed.set(i,"");
							
							for(int j=0 ; j<bcode.size() ;j++)
							{
								br.write(bname.get(j));
								br1.write(bcode.get(j));
								br2.write(sub.get(j));
								br3.write(aut.get(j));
								br4.write(pub.get(j));
								br5.write(ed.get(j));
								br.newLine();
								br1.newLine();
								br2.newLine();
								br3.newLine();
								br4.newLine();
								br5.newLine();
							}
							
							br.close();			
							br1.close(); 
							br2.close(); 	
							br3.close(); 	
							br4.close(); 	
							br5.close(); 	
						    
							flag=1;
	    						    
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 						
				}
			   if(flag==0)
				{
					 JOptionPane.showMessageDialog(null, "Wrong Book Code", "Success", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
								 
			    IbooknameTextField.setText("");
			    IbookcodeTextField.setText("");
			    InameTextField.setText("");
			    IidTextField.setText("");
			    IissueofdateTextField.setText("");
			    IdueofdateTextField.setText("");
			 		 		 
		 }
		 
	     else if (e.getActionCommand().equals("BACK"))
		 {            
			 IssueBooksFrame.setVisible(false);
	         Libraryfeature lf=new Libraryfeature();
             lf.FeatureFrame();           
	      }
		  else if (e.getActionCommand().equals("EXIT")) {
	          
	            System.exit(0);
	       }
		 
	 }

}
