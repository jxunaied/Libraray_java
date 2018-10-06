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

@SuppressWarnings("serial")
public class ReturnBook extends Main implements WindowListener,ActionListener{
	
	public ReturnBook(){
		
		super();
	}
	
	public void Rebks(){
		
		try {
            ReturnBooksFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read
                    (new File("p.jpg")))));
        } catch (IOException f) {
            f.printStackTrace();
        }

        ReturnBooksFrame.addWindowListener(this);
        ReturnBooksFrame.setSize(1366,768);
        ReturnBooksFrame.setResizable(true);
        ReturnBooksFrame.setLayout(null);
        ReturnBooksFrame.setVisible(true);

        RaddButton.addActionListener(this);
        RupdateButton.addActionListener(this);
        RexitButton.addActionListener(this);
        RBackButton.addActionListener(this);

        ReturnBooksFrame.add(RbooknameLabel);
        ReturnBooksFrame.add(RbookcodeLabel);
        ReturnBooksFrame.add(RnameLabel);
        ReturnBooksFrame.add(RidLabel);
        ReturnBooksFrame.add(RissueofdateLabel);
        ReturnBooksFrame.add(RdueofdateLabel);
        ReturnBooksFrame.add(ReturnofdateLabel);

        ReturnBooksFrame.add(RbooknameTextField);
        ReturnBooksFrame.add(RbookcodeTextField);
        ReturnBooksFrame.add(RnameTextField);
        ReturnBooksFrame.add(RidTextField);
        ReturnBooksFrame.add(RissueofdateTextField);
        ReturnBooksFrame.add(RdueofdateTextField);
        ReturnBooksFrame.add(ReturnofdateTextField);

        ReturnBooksFrame.add(RaddButton);
        ReturnBooksFrame.add(RupdateButton);
        ReturnBooksFrame.add(RexitButton);
        ReturnBooksFrame.add(RBackButton);

        Color textColor = Color.BLUE;
        Color text1Color = Color.WHITE;
        Color buttonColor=Color.BLUE;

        RbooknameLabel.setForeground(textColor);
        RbookcodeLabel.setForeground(textColor);
        RnameLabel.setForeground(textColor);
        RidLabel.setForeground(textColor);
        RissueofdateLabel.setForeground(textColor);
        RdueofdateLabel.setForeground(textColor);
        ReturnofdateLabel.setForeground(textColor);

        RaddButton.setBackground(buttonColor);
        RaddButton.setForeground(text1Color);
        RupdateButton.setBackground(buttonColor);
        RupdateButton.setForeground(text1Color);
        RexitButton.setBackground(buttonColor);
        RexitButton.setForeground(text1Color);
        RBackButton.setBackground(buttonColor);
        RBackButton.setForeground(text1Color);

        RbooknameLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        RbooknameLabel.setBounds(150, 100, 450, 30);
        RbooknameTextField.setFont(new Font("Arial", Font.BOLD, 20));
        RbooknameTextField.setBounds(550, 100, 200, 30);

        RbookcodeLabel.setFont(new Font("BOLD",Font.BOLD,26));
        RbookcodeLabel.setBounds(150, 170, 450, 30);
        RbookcodeTextField.setFont(new Font("Arial", Font.BOLD, 20));
        RbookcodeTextField.setBounds(550, 170, 200, 30);

        RnameLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        RnameLabel.setBounds(150, 240, 450, 30);
        RnameTextField.setFont(new Font("Arial", Font.BOLD, 20));
        RnameTextField.setBounds(550, 240, 200, 30);

        RidLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        RidLabel.setBounds(150, 310, 450, 30);
        RidTextField.setFont(new Font("Arial", Font.BOLD, 20));
        RidTextField.setBounds(550, 310, 200, 30);

        RissueofdateLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        RissueofdateLabel.setBounds(150, 380, 450, 30);
        RissueofdateTextField.setFont(new Font("Arial", Font.BOLD, 20));
        RissueofdateTextField.setBounds(550, 380, 200, 30);

        RdueofdateLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        RdueofdateLabel.setBounds(150, 450, 450, 30);
        RdueofdateTextField.setFont(new Font("Arial", Font.BOLD, 20));
        RdueofdateTextField.setBounds(550, 450, 200, 30);

        ReturnofdateLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        ReturnofdateLabel.setBounds(150, 520, 450, 30);
        ReturnofdateTextField.setFont(new Font("Arial", Font.BOLD, 20));
        ReturnofdateTextField.setBounds(550, 520, 200, 30);

        RaddButton.setFont(new Font("Arial",Font.BOLD,16));
        RaddButton.setBounds(250,600,150,30);
        RupdateButton.setFont(new Font("Arial",Font.BOLD,16));
        RupdateButton.setBounds(450,600,150,30);
        RexitButton.setFont(new Font("Arial",Font.BOLD,16));
        RexitButton.setBounds(650,600,150,30);

        RBackButton.setFont(new Font("Arial", Font.BOLD, 16));
        RBackButton.setBounds(850, 600, 150, 30);
	}
	
    public void actionPerformed(ActionEvent e) {
    	
    	if(e.getActionCommand().equals("RUTURN BOOK"))
    	{
    		
    		for(int i=0; i< ibcode.size();i++ )
			{
				if(ibcode.get(i).equals(RbookcodeTextField.getText()))
				{
					 try {
			   	    	   
						    BufferedWriter f7 = new BufferedWriter(new FileWriter("2bookname.txt",true));
						    BufferedWriter f8= new BufferedWriter(new FileWriter("2bookcode.txt",true));
						    BufferedWriter f9 = new BufferedWriter(new FileWriter("2subject.txt",true));
						    BufferedWriter f10 = new BufferedWriter(new FileWriter("2author.txt",true));
						    BufferedWriter f11 = new BufferedWriter(new FileWriter("2publisher.txt",true));
						    BufferedWriter f12 = new BufferedWriter(new FileWriter("2edition.txt",true));						    						    					    
						  
						    String m1 = ibname.get(i);
						    String m2 = ibcode.get(i);
						    String m3 = isub.get(i);
						    String m4 = iaut.get(i);
						    String m5 = ipub.get(i);
						    String m6 = ied.get(i);
						  
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
						    
						    BufferedWriter br= new BufferedWriter(new FileWriter("22id.txt",true));
							BufferedWriter br2 = new BufferedWriter(new FileWriter("22bkname.txt",true));
						    BufferedWriter n8= new BufferedWriter(new FileWriter("22bookcode.txt",true));
						    BufferedWriter n9 = new BufferedWriter(new FileWriter("22subject.txt",true));
						    BufferedWriter n10 = new BufferedWriter(new FileWriter("22author.txt",true));
						    BufferedWriter n11 = new BufferedWriter(new FileWriter("22publisher.txt",true));
						    BufferedWriter n12 = new BufferedWriter(new FileWriter("22edition.txt",true));
						    BufferedWriter n13 = new BufferedWriter(new FileWriter("22issuedate.txt",true));
						    BufferedWriter n14 = new BufferedWriter(new FileWriter("22duedate.txt",true));
						    						    
						    iid.set(i,"");						   
							ibname.set(i," ");
							ibcode.set(i,"");
							isub.set(i," ");
							iaut.set(i," ");
							ipub.set(i," ");
							ied.set(i," ");
							isdt.set(i," ");
							dudt.set(i," ");
							
						
							
							for(int k=0 ; k< iid.size() ;k++)
							{
								br.write(iid.get(k));
								br2.write(ibname.get(k));
								n8.write(ibcode.get(k));
								n9.write(isub.get(k));
								n10.write(iaut.get(k));
								n11.write(ipub.get(k));
								n12.write(ied.get(k));
								n13.write(isdt.get(k));
								n14.write(dudt.get(k));
								
								br.newLine();
								br2.newLine();
								n8.newLine();
								n9.newLine();
								n10.newLine();
								n11.newLine();
								n12.newLine();
								n13.newLine();
								n14.newLine();
							}
							
							br.close();			
							br2.close(); 
							n8.close(); 	
							n9.close(); 	
							n10.close(); 	
							n11.close(); 
							n12.close(); 	
							n13.close(); 	
							n14.close(); 							  
	    						    
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 						
				}
				
			}
    		
    		     RbooknameTextField.setText("");;
    		     RbookcodeTextField.setText("");
    		     RnameTextField.setText("");
    		     RidTextField.setText("");
    		     RissueofdateTextField.setText("");
    		     RdueofdateTextField.setText("");;
    		     ReturnofdateTextField.setText("");	
	
    	}
    	
    	
    else if (e.getActionCommand().equals("BACK"))
		 {	            
    		ReturnBooksFrame.setVisible(false);
	        Libraryfeature lf=new Libraryfeature();
            lf.FeatureFrame();
	                   
	        }
		  else if (e.getActionCommand().equals("EXIT")) {
	          
	            System.exit(0);
	        }
		 
	 }

}
