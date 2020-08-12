/*
'*************************************************
' Name: Multiple Choice Quiz
' Purpose: Show 10 Multiple Choice Questions with Marking

' Pre-Requisites 
' JRE should be installed

' Algorithm: 
 Step 1: Create the GUI Panel
 Step 2: Add Action Listener to change screen when Next Button is pressed
 Step 3: Update the Question and Answer Options Text
 Step 4: Check the Results
 
' Author: Guru99 Team
' Date Created: 30/07/2025
'*************************************************
*/

package p1;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* ============================================================================================
Step 1: Create the GUI Panel
=========================================================================================== */

class OnlineTest4 extends JFrame implements ActionListener
{
	JLabel label;
	JRadioButton option[]=new JRadioButton[5];
	JButton b1,b2;
	ButtonGroup bg;
	static int count =0;
	int current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest4()
	{
		label=new JLabel();
		add(label);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			option[i]=new JRadioButton();	
			add(option[i]);
			bg.add(option[i]);
		}
		b1=new JButton("Next");
		// Creating the result Button
		b2=new JButton("Result");
		b1.addActionListener(this);
		b2.setEnabled(false);
		// Adding it to pane
		b2.addActionListener(this);
		add(b1);add(b2);
		set();
		label.setBounds(30,40,450,20);
		option[0].setBounds(50,80,100,20);
		option[1].setBounds(50,110,100,20);
		option[2].setBounds(50,140,100,20);
		option[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	/* ============================================================================================
	  Step 2: Add Action Listener to change screen when Next Button is pressed
	 =========================================================================================== */
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{			
			
			// Check the current answer. If correct answer is selected increment count
		    if(check()) {count=count+1;}
		    //System.out.println(count);
			current++;
			
			//update the Questions
			set();	
			
			// If last Question. Enable the Results button
			if(current==9)
			{
				b1.setEnabled(false);
				b2.setEnabled(true);
				b2.setText("Result");
			}
		}
		
		// When results button is pressed
		if(e.getActionCommand().equals("Result"))
		{   // Check the current answer. If correct answer is selected increment count
			if(check()) {count=count+1;}
				
			//System.out.println(count);
			
			// Show the number of correct answers
			JOptionPane.showMessageDialog(this,"Correct Answers ="+count);
			System.exit(0);
		}
	}
	
	
	/* ============================================================================================
	 Step 3: Update the Question and Answer Options Text
	 =========================================================================================== */		
	void set()
	{
		option[4].setSelected(true);
		if(current==0)
		{
			label.setText("Que1: Which one among these is not a datatype");
			option[0].setText("int");option[1].setText("Float");option[2].setText("boolean");option[3].setText("char");	
		}
		if(current==1)
		{
			label.setText("Que2: Which class is available to all the class automatically");
			option[0].setText("Swing");option[1].setText("Applet");option[2].setText("Object");option[3].setText("ActionEvent");
		}
		if(current==2)
		{
			label.setText("Que3: Which package is directly available to our class without importing it");
			option[0].setText("swing");option[1].setText("applet");option[2].setText("net");option[3].setText("lang");
		}
		if(current==3)
		{
			label.setText("Que4: String class is defined in which package");
			option[0].setText("lang");option[1].setText("Swing");option[2].setText("Applet");option[3].setText("awt");
		}
		if(current==4)
		{
			label.setText("Que5: Which institute is best for java coaching");
			option[0].setText("Guru99");option[1].setText("ABC");option[2].setText("XYZ");option[3].setText("123");
		}
		if(current==5)
		{
			label.setText("Que6: Which one among these is not a keyword");
			option[0].setText("class");option[1].setText("int");option[2].setText("get");option[3].setText("if");
		}
		if(current==6)
		{
			label.setText("Que7: Which one among these is not a class ");
			option[0].setText("Swing");option[1].setText("Actionperformed");option[2].setText("ActionEvent");option[3].setText("Button");
		}
		if(current==7)
		{
			label.setText("Que8: which one among these is not a function of Object class");
			option[0].setText("toString");option[1].setText("finalize");option[2].setText("equals");option[3].setText("getDocumentBase");		
		}
		if(current==8)
		{
			label.setText("Que9: which function is not present in Applet class");
			option[0].setText("init");option[1].setText("main");option[2].setText("start");option[3].setText("destroy");
		}
		if(current==9)
		{
			label.setText("Que10: Which one among these is not a valid component");
			option[0].setText("JButton");option[1].setText("JList");option[2].setText("JButtonGroup");option[3].setText("JTextArea");
		}
		label.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			option[j].setBounds(50,80+i,200,20);
	}
	/* ============================================================================================
	  Step 4: Check the Results
	 =========================================================================================== */
	boolean check()
	{
		if(current==0)
			return(option[1].isSelected());
		if(current==1)
			return(option[2].isSelected());
		if(current==2)
			return(option[3].isSelected());
		if(current==3)
			return(option[0].isSelected());
		if(current==4)
			return(option[2].isSelected());
		if(current==5)
			return(option[1].isSelected());
		if(current==6)
			return(option[1].isSelected());
		if(current==7)
			return(option[3].isSelected());
		if(current==8)
			return(option[1].isSelected());
		if(current==9)
			return(option[2].isSelected());
		return false;
	}
	public static void main(String s[])
	{
		new OnlineTest4();
	}


}
