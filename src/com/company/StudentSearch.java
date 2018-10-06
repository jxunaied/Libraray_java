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
public class StudentSearch extends Main implements WindowListener,ActionListener{
	
	String nm,idd,dept,yrr,ads,mdat;
	String bknm,bcd,issdt,lstdt;
	
	public StudentSearch() {
		
		super();
	}
	
	public void StSrc(){
		
		try {
            SearchstudentFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read
                    (new File("p.jpg")))));
        } catch (IOException f) {
            f.printStackTrace();
        }

        SearchstudentFrame.addWindowListener(this);
        SearchstudentFrame.setSize(1366, 768);
        SearchstudentFrame.setResizable(true);
        SearchstudentFrame.setLayout(null);
        SearchstudentFrame.setVisible(true);

        SSearchButton.addActionListener(this);
        SBackButton.addActionListener(this);
        SexitButton.addActionListener(this);

        SearchstudentFrame.add(StudentidsearchLabel);
        SearchstudentFrame.add( StudentidsearchTextField);

        SearchstudentFrame.add(SsearchTALabel);
        SearchstudentFrame.add( SsearchTextArea);

        SearchstudentFrame.add( SSearchButton);
        SearchstudentFrame.add( SBackButton);
        SearchstudentFrame.add( SexitButton);


        Color textColor = Color.BLUE;
        Color text1Color = Color.WHITE;
        Color buttonColor=Color.BLUE;

        StudentsearchLabel.setForeground(textColor);
        StudentidsearchLabel.setForeground(textColor);
        departmentsearchLabel.setForeground(textColor);

        SsearchTALabel.setForeground(textColor);

        SSearchButton.setBackground(buttonColor);
        SSearchButton.setForeground(text1Color);

        SBackButton.setBackground(buttonColor);
        SBackButton.setForeground(text1Color);

        SexitButton.setBackground(buttonColor);
        SexitButton.setForeground(text1Color);

        StudentidsearchLabel.setFont(new Font("BOLD", Font.BOLD, 26));
        StudentidsearchLabel.setBounds(150, 100, 450, 30);
        StudentidsearchTextField.setFont(new Font("Arial", Font.BOLD, 20));
        StudentidsearchTextField.setBounds(450, 100, 200, 30);

        SsearchTALabel.setFont(new Font("BOLD", Font.BOLD, 26));
        SsearchTALabel.setBounds(150, 200, 300, 40);

        SsearchTextArea.setFont(new Font("Arial", Font.BOLD, 20));
        SsearchTextArea.setBounds(150, 250, 300, 400);

        SSearchButton.setFont(new Font("Arial", Font.BOLD, 16));
        SSearchButton.setBounds(750, 100, 150, 30);

        SexitButton.setFont(new Font("Arial", Font.BOLD, 16));
        SexitButton.setBounds(750, 600, 150, 30);
        SBackButton.setFont(new Font("Arial", Font.BOLD, 16));
        SBackButton.setBounds(950, 600, 150, 30);
		
	}
	
	 public void actionPerformed(ActionEvent e) {
		 
		 if (e.getActionCommand().equals("SEARCH"))
	        {
			     
	    		   for (int i = 0; i < id.size(); i++)
			        {
			    		if((id.get(i)).equals(StudentidsearchTextField.getText()))
				    	{
			    			nm=name.get(i);
	          				idd= id.get(i);
							dept=dep.get(i);
							yrr=yr.get(i);
							ads=adds.get(i);
							mdat=mdate.get(i);
						
							SsearchTextArea.append("Name:"+nm+"\n Id:"+idd+"\n Department:"+dept+"\n Year:"+yrr+"\n Address:"+ads+"\n Memeber Added Date:"+mdat+"\n");				    		
				    	}
			    		
			        }
	    		   
	    		   for (int i = 0; i < iid.size(); i++)
			        {
			    		if((iid.get(i)).equals(StudentidsearchTextField.getText()))
				    	{
			    			bknm=ibname.get(i);
	          				bcd= iid.get(i);
							issdt=isdt.get(i);
							lstdt=dudt.get(i);
						
							SsearchTextArea.append("*****Book Issue******"+"\n");
							SsearchTextArea.append("BooK Name:"+bknm+"\nBook Id:"+bcd+"\nIssue Date:"+issdt+"\n Due Date:"+lstdt+"\n\n\n");
							 				    		
				    	}
			    		
			        }

	         }
		 
		 else if (e.getActionCommand().equals("BACK"))
		 {        
			 SearchstudentFrame.setVisible(false);
	         Libraryfeature lf=new Libraryfeature();
             lf.FeatureFrame();           
	     }
		 else if (e.getActionCommand().equals("EXIT")) {
	          
	            System.exit(0);
	     }
	 }

}
