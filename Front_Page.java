# Pest-Alert-Application
//Pest Alert is Java Application that assits farmers to identify the infected crops and suggest remedies for the infected crops.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class description extends JFrame {
	JButton infection;
description(int n)
{
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	switch(n)
	{
	case 1: setTitle("CABBAGE DESCRIPTION");
	java.io.InputStream input=ClassLoader.getSystemResourceAsStream("cabbaged.png");
	ImageIcon ic;
	try {
		ic = new ImageIcon(ImageIO.read(input));
		JLabel background=new JLabel(ic);
		setContentPane(background);
	}
	catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	infection=new JButton("Infection");
	infection.setBounds(680,500,100,30);
	infection.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e)
    	{
    		setVisible(false);
    		dispose();
    		new FRAME1(1);
    	}});
	add(infection);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	break;
	case 2: setTitle("TOMATO DESCRIPTION");
	input=ClassLoader.getSystemResourceAsStream("tomatod (1).png");
	try {
		ic = new ImageIcon(ImageIO.read(input));
		JLabel background=new JLabel(ic);
		setContentPane(background);
	}
	catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	infection=new JButton("Infection");
	infection.setBounds(680,500,100,30);
	infection.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e)
    	{
    		setVisible(false);
    		dispose();
    		new FRAME1(2);
    	}});
	add(infection);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	break;
	case 3: setTitle("BRINJAL INFECTION");
	input=ClassLoader.getSystemResourceAsStream("brinjald.png");
	
	try {
		ic = new ImageIcon(ImageIO.read(input));
		JLabel background=new JLabel(ic);
		setContentPane(background);
	}
	catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	infection=new JButton("Infection");
	infection.setBounds(680,500,100,30);
	infection.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e)
    	{
    		setVisible(false);
    		dispose();
    		new FRAME1(3);
    	}});
	add(infection);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	break;

	}
}
}

