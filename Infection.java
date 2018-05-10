import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;
public class infection extends JFrame {
	String choice;
	
	
infection(String n)
{
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
	ImageIcon ic1;
	JLabel icon,name,caused_by,remedies;
	caused_by=new JLabel("CAUSED_BY :");
	caused_by.setBounds(100,200,100,30);
	add(caused_by);
	remedies=new JLabel("REMEDY :");
	remedies.setBounds(100,250,60,30);
	add(remedies);
	JLabel reas1;
	JLabel reas2;
	JLabel reas3;
	JLabel reas4;
	JLabel reas5;
	JLabel reas6;
	JLabel reas7;
	JLabel reas8;
	JLabel reas9;
	String get;
	JButton back=new JButton("BACK");
	back.setBounds(50,600,80,30);
choice=n;
switch(choice)
	{
case "T1":
	try {
	input = ClassLoader.getSystemResourceAsStream("septoria leaf spot.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
	} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	}
setTitle("septoria leaf spot");
	name=new JLabel("septoria leaf spot");
	name.setBounds(220,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
        Statement  st = con.createStatement();
        String query="select causes,remedies from  infection where inf_id=1";
        ResultSet rs=st.executeQuery(query);
        System.out.println("Success!");
        while(rs.next())
        {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	reas8=new JLabel();
	reas9=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,290,500,30);
	reas4.setBounds(200,330,500,30);
	reas5.setBounds(200,370,500,30);
	reas6.setBounds(200,410,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(back);
        }
        con.close();
    }
    catch(Exception e){
        System.out.println("---------->  "+e);
    }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(2);	
	}});
	break;
	
case "T2": 
try {
	input = ClassLoader.getSystemResourceAsStream("leaf roll.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
	setTitle("leaf roll");
	name=new JLabel("LEAF ROLL");
	name.setBounds(220,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
	        Statement  st = con.createStatement();
	        String query="select causes,remedies from  infection where inf_id=6";
	        ResultSet rs=st.executeQuery(query);
	        System.out.println("Success!");
	        while(rs.next())
	        {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	add(reas1);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	reas8=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	reas7.setBounds(200,400,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(back);
	        }
	        con.close();
	    }
	    catch(Exception e){
	        System.out.println("---------->  "+e);
	    }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(2);	
	}});
	break;
case "T3": 
try {
	input = ClassLoader.getSystemResourceAsStream("late blight.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("late blight");
	name=new JLabel("late blight");
	name.setBounds(220,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=5";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(2);	
	}});
	break;
case "T5": try {
	input = ClassLoader.getSystemResourceAsStream("early blight.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("early blight");
	name=new JLabel("early blight");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=4";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(2);	
	}});
	break;
case "T6":try {
	input = ClassLoader.getSystemResourceAsStream("bacterial spot.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} 
	
setTitle("bacterial spot");
	name=new JLabel("bacterial spot");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=9";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(2);	
	}});
	break;
case "T7": try {
	input = ClassLoader.getSystemResourceAsStream("bacterial speck.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("bacterial speck");
	name=new JLabel("bacterial speck");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=8";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	reas8=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas8.setText(w[6]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	reas7.setBounds(200,400,500,30);
	reas8.setBounds(200,430,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(reas8);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(2);	
	}});
	break;
case "T8":try {
	input = ClassLoader.getSystemResourceAsStream("bacterial cancer.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} 
setTitle("bacterial cancer");
	name=new JLabel("bacterial cancer");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=7";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	reas7.setBounds(200,400,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(2);	
	}});
	break;
case "T9": try {
	input = ClassLoader.getSystemResourceAsStream("anthracnose.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("anthracnose");
	name=new JLabel("anthracnose");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=2";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(2);	
	}});
	break;
case "T4": try {
	input = ClassLoader.getSystemResourceAsStream("fusarium.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("fusarium");
	name=new JLabel("fusarium");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=3";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,290,500,30);
	reas4.setBounds(200,330,500,30);
	reas5.setBounds(200,370,500,30);
	reas6.setBounds(200,410,500,30);
	reas7.setBounds(200,450,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(back);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(2);	
	}});
	break;
case "B2" :try {
	input = ClassLoader.getSystemResourceAsStream("phytophthora blight.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("phytophthora blight");
	name=new JLabel("phytophthora blight");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
	        Statement  st = con.createStatement();
	        String query="select causes,remedies from  infection where inf_id=19";
	        ResultSet rs=st.executeQuery(query);
	        System.out.println("Success!");
	        while(rs.next())
	        {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));	
	reas1.setBounds(250,200,500,30);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	reas7.setBounds(200,400,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(back);
	add(reas1);
	        }
	        con.close();
	    }
	    catch(Exception e){
	        System.out.println("---------->  "+e);
	    }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(3);	
	}});
	break;
case "B1" :try {
	input = ClassLoader.getSystemResourceAsStream("phomopsis fruit root.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("phomopsis fruit root");
	name=new JLabel("phomopsis fruit root");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=18";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	reas8=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas8.setText(w[6]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	reas7.setBounds(200,400,500,30);
	reas8.setBounds(200,280,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(back);
	add(reas1);
	add(reas8);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(3);	
	}});
	break;
case "B3" :try {
	input = ClassLoader.getSystemResourceAsStream("brinjal cutworms.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("brinjal cutworms");
	name=new JLabel("brinjal cutworms");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=12";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	add(reas1);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	reas7.setBounds(200,400,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(back);
     
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(3);	
	}});
	break;
   
case "B4" :try {
	input = ClassLoader.getSystemResourceAsStream("brinjal early blight.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("brinjal early blight");
	name=new JLabel("brinjal early blight");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=14";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	add(reas1);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	reas7.setBounds(200,400,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(3);	
	}});
	break;
case "B5" :try {
	input = ClassLoader.getSystemResourceAsStream("flea beetles.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("flea beetles");
	name=new JLabel("flea beetles");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=15";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	add(reas1);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(3);	
	}});
	break;
case "B6" :try {
	input = ClassLoader.getSystemResourceAsStream("hornworms.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("hornworms");
	name=new JLabel("hornworms");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=16";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	add(reas1);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	reas7.setBounds(200,400,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(3);	
	}});
	break;
case "B9" :try {
	input = ClassLoader.getSystemResourceAsStream("colletotichum fruit root.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("colletotichum fruit root");
	name=new JLabel("colletotichum fruit root");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=11";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	add(reas1);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	reas7.setBounds(200,400,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(3);	
	}});
	break;
case "B7" :try {
	input = ClassLoader.getSystemResourceAsStream("mites.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("mites");
name=new JLabel("mites");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=17";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	add(reas1);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(3);	
	}});
	break;

case "B8" :try {
	input = ClassLoader.getSystemResourceAsStream("damping off (1).jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("damping off");
	name=new JLabel("damping off");
	name.setBounds(230,70,200,30);
	setLocation(200,0);
	setSize(800,700);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=13";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas1.setText(rs.getString(1));
	reas1.setBounds(250,200,500,30);
	add(reas1);
	reas2=new JLabel();
	reas3=new JLabel();
	reas4=new JLabel();
	reas5=new JLabel();
	reas6=new JLabel();
	reas7=new JLabel();
	get=rs.getString(2);
	String[] w=get.split("-");
	reas2.setText(w[0]);
	reas3.setText(w[1]);
	reas4.setText(w[2]);
	reas5.setText(w[3]);
	reas6.setText(w[4]);
	reas7.setText(w[5]);
	reas2.setBounds(200,250,500,30);
	reas3.setBounds(200,280,500,30);
	reas4.setBounds(200,310,500,30);
	reas5.setBounds(200,340,500,30);
	reas6.setBounds(200,370,500,30);
	reas7.setBounds(200,400,500,30);
	add(reas1);
	add(reas2);
	add(reas3);
	add(reas4);
	add(reas5);
	add(reas6);
	add(reas7);
	add(back);
	
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(3);	
	}});
	break;
	/*ImageIcon im1=new ImageIcon("damping off.jpg");
	ImageIcon im2=new ImageIcon("");
	ImageIcon im3=new ImageIcon("cutworms.jpg");
	ImageIcon im4=new ImageIcon("cabbage aphid.jpg");
	ImageIcon im5=new ImageIcon("");
	ImageIcon im6=new ImageIcon("");
	ImageIcon im7=new ImageIcon("");
	ImageIcon im8=new ImageIcon("");
	ImageIcon im9=new ImageIcon("");
	ImageIcon im10=new ImageIcon("");*/
case "C1" :try {
	input = ClassLoader.getSystemResourceAsStream("damping off.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("damping off");
	name=new JLabel("damping off");
	name.setBounds(230,70,200,30);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=29";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas2.setText(rs.getString(2));
	reas1.setBounds(250,200,500,30);
	reas2.setBounds(200,300,500,30);
	add(reas1);
	add(reas2);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(1);	
	}});
	break;
case "C2" :try {
	input = ClassLoader.getSystemResourceAsStream("cabbage looper.jpeg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("cabbage looper");
	name=new JLabel("cabbage looper");
	name.setBounds(230,70,200,30);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=27";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas2.setText(rs.getString(2));
	reas1.setBounds(250,200,500,30);
	reas2.setBounds(200,300,500,30);
	add(reas1);
	add(reas2);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(1);	
	}});
	break;

case "C3" :try {
	input = ClassLoader.getSystemResourceAsStream("cutworms.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("cutworms");
	name=new JLabel("cutworms");
	name.setBounds(230,70,200,30);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=28";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas2.setText(rs.getString(2));
	reas1.setBounds(250,200,500,30);
	reas2.setBounds(200,300,500,30);
	add(reas1);
	add(reas2);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(1);	
	}});
	break;
case "C4" :try {
	input = ClassLoader.getSystemResourceAsStream("cabbage aphid.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("cabbage aphid");
	name=new JLabel("cabbage aphid");
	name.setBounds(230,70,200,30);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=26";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas2.setText(rs.getString(2));
	reas1.setBounds(250,200,500,30);
	reas2.setBounds(200,300,500,30);
	add(reas1);
	add(reas2);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(1);	
	}});
	break;
case "C5" :try {
	input = ClassLoader.getSystemResourceAsStream("black root.jpeg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("black root");
	name=new JLabel("black root.jpeg");
	name.setBounds(230,70,200,30);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=25";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas2.setText(rs.getString(2));
	reas1.setBounds(250,200,500,30);
	reas2.setBounds(200,300,500,30);
	add(reas1);
	add(reas2);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(1);	
	}});
	break;
case "C6" :try {
	input = ClassLoader.getSystemResourceAsStream("beet armyworm.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("beet armyworm");
	name=new JLabel("beet armyworm");
	name.setBounds(230,70,200,30);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=23";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas2.setText(rs.getString(2));
	reas1.setBounds(250,200,500,30);
	reas2.setBounds(200,300,500,30);
	add(reas1);
	add(reas2);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(1);	
	}});
	break;
case "C7" :try {
	input = ClassLoader.getSystemResourceAsStream("black leg.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("black leg");
	name=new JLabel("black leg");
	name.setBounds(230,70,200,30);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=24";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas2.setText(rs.getString(2));
	reas1.setBounds(250,200,500,30);
	reas2.setBounds(200,300,500,30);
	add(reas1);
	add(reas2);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(1);	
	}});
	break;
case "C8" :try {
	input = ClassLoader.getSystemResourceAsStream("bacterial soft root.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("bacterial soft root");
	name=new JLabel("bacterial soft root");
	name.setBounds(230,70,200,30);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=22";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas2.setText(rs.getString(2));
	reas1.setBounds(250,200,500,30);
	reas2.setBounds(200,300,500,30);
	add(reas1);
	add(reas2);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(1);	
	}});
	break;
case "C9" :try {
	input = ClassLoader.getSystemResourceAsStream("anthrancnose.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("anthrancnose");
	name=new JLabel("anthrancnose");
	name.setBounds(230,70,200,30);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=21";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas2.setText(rs.getString(2));
	reas1.setBounds(250,200,500,30);
	reas2.setBounds(200,300,500,30);
	add(reas1);
	add(reas2);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(1);	
	}});
	break;
case "C10" :try {
	input = ClassLoader.getSystemResourceAsStream("alternaria.jpg");
	ic1 = new ImageIcon(ImageIO.read(input));
	icon=new JLabel(ic1);
	add(icon);
	icon.setBounds(10,10,200,190);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
setTitle("alternaria");
	name=new JLabel("alternaria");
	name.setBounds(230,70,200,30);
	setLocation(200,100);
	setSize(800,600);
	setVisible(true);
	try{

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","123");
     Statement  st = con.createStatement();
     String query="select causes,remedies from  infection where inf_id=20";
     ResultSet rs=st.executeQuery(query);
     System.out.println("Success!");
     while(rs.next())
     {
	System.out.println(rs.getString(1));
	reas1=new JLabel();
	reas2=new JLabel();
	reas1.setText(rs.getString(1));
	reas2.setText(rs.getString(2));
	reas1.setBounds(250,200,500,30);
	reas2.setBounds(200,300,500,30);
	add(reas1);
	add(reas2);
     }
     con.close();
 }
 catch(Exception e){
     System.out.println("---------->  "+e);
 }

	add(name);
	back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	    	setVisible(false);
	    	dispose();
	    	new FRAME1(1);	
	}});
	break;

	}
}
}

