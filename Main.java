import java.awt.GridLayout;
import java.awt.event.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import org.omg.CORBA.portable.InputStream;
public class FRAME1 extends JFrame{
	JButton b;
	JButton b1;
	JButton b2;
	int n,m;
	String ch;
	FRAME1()
	{
		JButton front;
		setTitle("plant doctor");
		java.io.InputStream input=ClassLoader.getSystemResourceAsStream("project_frontpage.png");
		ImageIcon ic;
		try {
			ic = new ImageIcon(ImageIO.read(input));
			JLabel background=new JLabel(ic);
			setContentPane(background);
			setLocation(200,100);
			setSize(800,600);
		}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		front=new JButton("go");
		front.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		setVisible(false);
	    		dispose();
	    		new FRAME1('a');
	    	}});
		setLocation(200,100);
		setSize(800,600); 
		front.setBounds(700,500,60,30);
		add(front);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	FRAME1(char a)
	{
		setTitle("plant doctor");
		java.io.InputStream input=ClassLoader.getSystemResourceAsStream("d.jpg");
		ImageIcon ic;
		try {
			ic = new ImageIcon(ImageIO.read(input));
			JLabel background=new JLabel(ic);
			setContentPane(background);
			setLocation(200,100);
			setSize(800,600);
			input=ClassLoader.getSystemResourceAsStream("Brinjal.jpg");
			final ImageIcon poin= new ImageIcon(ImageIO.read(input));
			input=ClassLoader.getSystemResourceAsStream("tomato.jpg");
			ImageIcon poin1= new ImageIcon(ImageIO.read(input));
			input=ClassLoader.getSystemResourceAsStream("cabage.jpg");
			ImageIcon poin2= new ImageIcon(ImageIO.read(input));    
			b=new JButton(poin);  
			b1=new JButton(poin1);	
			b2=new JButton(poin2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		b1.setBounds(500,100,100,100);
		b2.setBounds(350,300,100,100);
		b.setBounds(200,100,100,100);    
		add(b1);
		add(b2);
		add(b); 
		setResizable(false);
		setVisible(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		b.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		n=3;
	    		setVisible(false);
	    		dispose();
	    		new description(n);
	    	}});
		b1.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		n=2;
	    		setVisible(false);
	    		dispose();
	    		new description(n);
	    	}});
		b2.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		n=1;
	    		setVisible(false);
	    		dispose();
	    		new description(n);
	    	}});
		
	}
FRAME1(int n) 
{
 
	this.n=n;
	java.io.InputStream input = ClassLoader.getSystemResourceAsStream("d.jpg");
	ImageIcon ic;
	try {
		ic = new ImageIcon(ImageIO.read(input));
		JLabel background=new JLabel(ic);
		setContentPane(background);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	setLocation(200,100);
	setSize(800,600); 
	setVisible(true);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	switch(n)
	{
	case 1 :
	setTitle("Cabbage infection");
		ImageIcon im1;
		try {
			input = ClassLoader.getSystemResourceAsStream("damping off.jpg");
			im1 = new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("cabbage looper.jpeg");
			ImageIcon im2=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("cutworms.jpg");
			ImageIcon im3=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("cabbage aphid.jpg");
			ImageIcon im4=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("black root.jpeg");
			ImageIcon im5=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("beet armyworm.jpg");
			ImageIcon im6=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("black leg.jpg");
			ImageIcon im7=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("bacterial soft root.jpg");
			ImageIcon im8=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("anthrancnose.jpg");
			ImageIcon im9=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("alternaria.jpg");
			ImageIcon im10=new ImageIcon(ImageIO.read(input));
			final JButton b1=new JButton(im1); 
			final JButton b2=new JButton(im2); 
			final JButton b3=new JButton(im3); 
			final JButton b4=new JButton(im4); 
			final JButton b5=new JButton(im5); 
			final JButton b6=new JButton(im6); 
			final JButton b7=new JButton(im7); 
			final JButton b8=new JButton(im8); 
			final JButton b9=new JButton(im9);
			final JButton b10=new JButton(im10);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			add(b6);
			add(b7);
			add(b8);
			add(b9);
			add(b10);
			b2.setBounds(150,170,90,70);
			b3.setBounds(150,290,90,70);
			b4.setBounds(150,410,90,70);
			b5.setBounds(340,50,90,70);
			b6.setBounds(340,170,90,70);
			b7.setBounds(340,290,90,70);
			b8.setBounds(340,410,90,70);
			b9.setBounds(530,50,90,70);
			b10.setBounds(530,170,90,70);
			b1.setBounds(150,50,90,70);
			b1.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="C1";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    	}});
			
			b2.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="C2";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    	}});
			
			b3.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="C3";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    	}});
			
			b4.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="C4";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    	}});
			
			b5.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="C5";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    	}});
			
			b6.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="C6";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    	}});
			
			b7.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="C7";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    	}});
			
			b8.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="C8";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    	}});
			
			b9.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="C9";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    	}});
			b10.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="C10";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    	}});
			final JButton back=new JButton("BACK");
			setLayout(new GridLayout(3,3));
			back.setBounds(50,530,80,30);
			add(back);
			back.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
		    		setVisible(false);
		    		dispose();
		    		new FRAME1('a');	
			}});
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
			break;
	case 2 : setTitle("Tomato infection");
		try {
			input = ClassLoader.getSystemResourceAsStream("septoria leaf spot.jpg");
			ImageIcon im11;
			im11 = new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("leaf roll.jpg");
			ImageIcon im22=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("late blight.jpg");
			ImageIcon im33=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("fusarium.jpg");
			ImageIcon im44=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("early blight.jpg");
			ImageIcon im55=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("bacterial spot.jpg");
			ImageIcon im66=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("bacterial speck.jpg");
			ImageIcon im77=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("bacterial cancer.jpg");
			ImageIcon im88=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("anthracnose.jpg");
			ImageIcon im99=new ImageIcon(ImageIO.read(input));
			final JButton b11=new JButton(im11); 
			final JButton b22=new JButton(im22); 
			final JButton b33=new JButton(im33); 
			final JButton b44=new JButton(im44); 
			final JButton b55=new JButton(im55); 
			final JButton b66=new JButton(im66); 
			final JButton b77=new JButton(im77); 
			final JButton b88=new JButton(im88); 
			final JButton b99=new JButton(im99);
			add(b11);
			add(b22);
			add(b33);
			add(b44);
			add(b55);
			add(b66);
			add(b77);
			add(b88);
			add(b99);
			b11.setBounds(150,50,90,70);
			b11.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="T1";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b22.setBounds(150,170,90,70);
			b22.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="T2";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b33.setBounds(150,290,90,70);
			b33.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="T3";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b44.setBounds(150,410,90,70);
			b44.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="T4";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b55.setBounds(340,50,90,70);
			b55.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="T5";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b66.setBounds(340,170,90,70);
			b66.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="T6";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b77.setBounds(340,290,90,70);
			b77.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="T7";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b88.setBounds(340,410,90,70);
			b88.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="T8";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b99.setBounds(530,50,90,70);
			b99.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="T9";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			final JButton back1=new JButton("BACK");
			back1.setBounds(50,530,80,30);
			add(back1);
			setLayout(new GridLayout(3,3));
			back1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
		    		setVisible(false);
		    		dispose();
		    		new FRAME1('a');	
			}});
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	break;
	case 3 :setTitle("Brinjal infection");
	
		try {
			input = ClassLoader.getSystemResourceAsStream("phomopsis fruit root.jpg");
			ImageIcon im111;
			im111 = new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("phytophthora blight.jpg");
			ImageIcon im222=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("brinjal cutworms.jpg");
			ImageIcon im333=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("brinjal early blight.jpg");
			ImageIcon im444=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("flea beetles.jpg");
			ImageIcon im555=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("hornworms.jpg");
			ImageIcon im666=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("mites.jpg");
			ImageIcon im777=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("damping off (1).jpg");
			ImageIcon im888=new ImageIcon(ImageIO.read(input));
			input = ClassLoader.getSystemResourceAsStream("colletotichum fruit root.jpg");
			ImageIcon im999=new ImageIcon(ImageIO.read(input));
			final JButton b111=new JButton(im111); 
			final JButton b222=new JButton(im222); 
			final JButton b333=new JButton(im333); 
			final JButton b444=new JButton(im444); 
			final JButton b555=new JButton(im555); 
			final JButton b666=new JButton(im666); 
			final JButton b777=new JButton(im777); 
			final JButton b888=new JButton(im888); 
			final JButton b999=new JButton(im999);
			add(b111);
			add(b222);
			add(b333);
			add(b444);
			add(b555);
			add(b666);
			add(b777);
			add(b888);
			add(b999);
			b111.setBounds(150,50,90,70);
			b111.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="B1";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b222.setBounds(150,170,90,70);
			b222.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="B2";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b333.setBounds(150,290,90,70);
			b333.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="B3";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b444.setBounds(150,410,90,70);
			b444.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="B4";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b555.setBounds(340,50,90,70);
			b555.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="B5";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b666.setBounds(340,170,90,70);
			b666.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="B6";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b777.setBounds(340,290,90,70);
			b777.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="B7";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b888.setBounds(340,410,90,70);
			b888.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="B8";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			b999.setBounds(530,50,90,70);
			b999.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		ch="B9";
		    		setVisible(false);
		    		dispose();
		    		new infection(ch);
		    		
		    	}});
			final JButton back2=new JButton("BACK");
			setLayout(new GridLayout(3,3));
			back2.setBounds(50,530,80,30);
			add(back2);
			back2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
		    		setVisible(false);
		    		dispose();
		    		new FRAME1('a');	
			}});
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
			break;
	}
}
public static void main(String aa[])
	{
	new FRAME1();
	}
}
