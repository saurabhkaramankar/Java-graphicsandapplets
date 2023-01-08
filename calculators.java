import java.awt.*;
import java.awt.event.*;

class calculators implements ActionListener
{
   Frame f = new Frame();
   Label l1 = new Label ("First Number");
   Label l2 = new Label ("Second Number");
   Label l3 = new Label ("Result");
   
   TextField tf1 = new TextField();
   TextField tf2 = new TextField();
   TextField tf3 = new TextField();
   
   Button b1 = new Button("Add");
   Button b2 = new Button("Sub");
   Button b3 = new Button("Mul");
   Button b4 = new Button("Div");
   Button b5 = new Button("Mod");
   Button b6 = new Button("reset");
   Button b7 = new Button("Cancel");
   
   public calculators()
   {
     l1.setBounds(50,100,100,20);
	 l2.setBounds(50,140,100,20);
     l3.setBounds(50,180,100,20);
	 
	 tf1.setBounds(200,100,100,20);
	 tf2.setBounds(200,140,100,20);
	 tf3.setBounds(200,180,100,20);
	 
	 b1.setBounds(50,250,50,20);
	 b2.setBounds(110,250,50,20);
	 b3.setBounds(170,250,50,20);
	 b4.setBounds(230,250,50,20);
	 b5.setBounds(290,250,50,20);
	 b6.setBounds(350,250,50,20);
	 b7.setBounds(410,250,50,20);
	 
	 f.add(l1);
	 f.add(l2);
	 f.add(l3);
	 
	 f.add(tf1);
	 f.add(tf2);
	 f.add(tf3);
	 
	 f.add(b1);
	 f.add(b2);
	 f.add(b3);
	 f.add(b4);
	 f.add(b5);
	 f.add(b6);
	 f.add(b7);
	 
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 b4.addActionListener(this);
	 b5.addActionListener(this);
	 b6.addActionListener(this);
	 b7.addActionListener(this);
	 
	 f.setLayout(null);
	 f.setVisible(true);
	 f.setSize(400,350);
	 f.setLocation(500,200);
	 
	 }
	 
	 public void actionPerformed(ActionEvent ae)
	 {
	 
	   double a=0,b=0,c=0;
	   try
	   {
	     a=Double.parseDouble(tf1.getText());
	   }
	   catch (NumberFormatException e){
	     tf1.setText("Invalid input");
	   }
	   try
	   {
	     b = Double.parseDouble(tf2.getText());
	   }
	   catch(NumberFormatException e)
	   {
	    tf2.setText("Invalid Input");
	   }
	   try { 
            System.out.println(a / b); 
        }
        catch (ArithmeticException e) {
            
            System.out.println( "Impossible");
        }
	    if(ae.getSource()==b1)
        {   
		    c=a+b;
            tf3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b2)
        {
		    c=a-b;
            tf3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b3)
        {
		    c=a*b;
           tf3.setText(String.valueOf(c)); 
        }
		if(ae.getSource()==b4)
        {
		    c=a/b;
            tf3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b5)
        {
		    c=a%b;
            tf3.setText(String.valueOf(c));
	    }
		if(ae.getSource()==b6)
        {
            tf1.setText("0");
			tf2.setText("0");
			tf3.setText("0");
			
			
	    }
		if(ae.getSource()==b7)
        {
            System.exit(0);
	    }
	 }
		public static void main(String...s)
		{
		   new calculators();
		}
 }