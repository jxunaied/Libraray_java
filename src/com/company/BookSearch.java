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
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class BookSearch extends Main implements WindowListener,ActionListener{
	
	String bnm,bcd,subj,au,pu,edt;
	
	public BookSearch(){
		
		super();
	}

	public void BSrc(){
		
		 try {
             SearchbooktFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read
                     (new File("p.jpg")))));
         } catch (IOException f) {
             f.printStackTrace();
         }

         SearchbooktFrame.addWindowListener(this);
         SearchbooktFrame.setSize(1366, 768);
         SearchbooktFrame.setResizable(true);
         SearchbooktFrame.setLayout(null);
         SearchbooktFrame.setVisible(true);

         BSearchButton.addActionListener(this);
         BBackButton.addActionListener(this);
         BexitButton.addActionListener(this);

         SearchbooktFrame.add(BooknameserchLabel);
         SearchbooktFrame.add(BooknameserchTextField);
       
         SearchbooktFrame.add(BsearchTALabel);
         SearchbooktFrame.add( BsearchTextArea);

         SearchbooktFrame.add( BSearchButton);
         SearchbooktFrame.add( BBackButton);
         SearchbooktFrame.add( BexitButton);

         Color textColor = Color.BLUE;
         Color text1Color = Color.WHITE;
         Color buttonColor=Color.BLUE;

         BooknameserchLabel.setForeground(textColor);
         BookcodeserchLabel.setForeground(textColor);
         subjectserchLabel.setForeground(textColor);

         BsearchTALabel.setForeground(textColor);

         BSearchButton.setBackground(buttonColor);
         BSearchButton.setForeground(text1Color);

         BBackButton.setBackground(buttonColor);
         BBackButton.setForeground(text1Color);

         BexitButton.setBackground(buttonColor);
         BexitButton.setForeground(text1Color);

         BooknameserchLabel.setFont(new Font("BOLD", Font.BOLD, 26));
         BooknameserchLabel.setBounds(150, 100, 450, 30);
         BooknameserchTextField.setFont(new Font("Arial", Font.BOLD, 20));
         BooknameserchTextField.setBounds(450, 100, 200, 30);

         BsearchTALabel.setFont(new Font("BOLD", Font.BOLD, 26));
         BsearchTALabel.setBounds(150, 200, 300, 40);

         BsearchTextArea.setFont(new Font("Arial", Font.BOLD, 20));
         BsearchTextArea.setBounds(150, 250, 300, 400);

         BSearchButton.setFont(new Font("Arial", Font.BOLD, 16));
         BSearchButton.setBounds(750, 100, 150, 30);

         BexitButton.setFont(new Font("Arial", Font.BOLD, 16));
         BexitButton.setBounds(750, 600, 150, 30);

         BBackButton.setFont(new Font("Arial", Font.BOLD, 16));
         BBackButton.setBounds(950, 600, 150, 30);
	}
	
	 public void actionPerformed(ActionEvent e) {
		 
		
		 if (e.getActionCommand().equals("SEARCHH"))
	        {
	    		   for (int i = 0; i < bname.size(); i++)
			        {
			    		if((bname.get(i)).equals(BooknameserchTextField.getText()))
				    	{			    			
			    			bnm=bname.get(i);
	          			bcd=bcode.get(i);
							subj=sub.get(i);
							au=aut.get(i);
							pu=pub.get(i);
							edt=ed.get(i);
														
							BsearchTextArea.append("Book Name:"+bnm+"\nBook Id:"+bcd+"\nSubject:"+subj+"\nAuthor:"+au+"\nPublisher:"+pu+"\nEdition:"+edt+"\n\n\n");				    		
				    	}
			    		
			        }
	         }
		 
		 else if (e.getActionCommand().equals("BACK"))
		 {	            
			 SearchbooktFrame.setVisible(false);
	         Libraryfeature lf=new Libraryfeature();
             lf.FeatureFrame();
	        	           
	     }
		 else if (e.getActionCommand().equals("EXIT")) {
	          
	            System.exit(0);
	     }
		 
	 }

}
