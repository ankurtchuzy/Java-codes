import java.awt.*;  
import java.awt.event.*;  

class Event_listener extends Frame implements ActionListener
{ 
    TextField tf1,tf2;
	Button b1,b2;
	
	Event_listener()
	 {
		 tf1=new TextField();
		 tf1.setBounds(110,50,200,20);  
		 tf2=new TextField();
		 tf2.setBounds(110,100,200,20); 
         b1=new Button("CLICK");  
         b1.setBounds(150,150,80,30);  
		 
		 b2=new Button("CLICK");  
         b2.setBounds(150,200,80,30);   
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 
		 add(tf1);  
		 add(tf2); 
		 add(b1);
		 add(b2);
		 setSize(400,300);  
         
		 setLayout(null);  
         setVisible(true);  
		
	addWindowListener(new WindowAdapter()
	       {  
            public void windowClosing(WindowEvent e) 
			{  
              dispose();  
            }  
           }          ); 
	 } 
		 
    public void actionPerformed(ActionEvent e)
	{ 
	 if(e.getSource()==b1)	
     tf1.setText("Welcome"); 
	 if(e.getSource()==b2)	
	 tf2.setText("The event is listening");
    }  
    
	public static void main(String args[])
	{  
     new Event_listener(); 
    }  
}  	
				 