
package Progparradigm.Airline;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


public class Virgin_airlines  extends JFrame {
    
    
     public static void main(String[] Args){
         
         
	  
	    Virgin_airlines virgin_airlines1 = new Virgin_airlines();    

	     virgin_airlines1.setVisible(true);
    
             JOptionPane.showMessageDialog(null, "Hi!  WELCOME TO VIRGIN AIRLINES =) Press Okay to continue!","Message", JOptionPane.ERROR_MESSAGE);
              JOptionPane.showMessageDialog(null, "The Green Numbers are the Available seats =) Press Okay to continue! Thank you","Message", JOptionPane.ERROR_MESSAGE);
               
              
             
     }    
          
          private final int TOTAL_SEATS = 12;  

	  private final int WIDTH= 320;        

	  private final int HEIGHT = 350;      

	   

	  private JButton[] seatButtns = new JButton[TOTAL_SEATS];
	  private JLabel nameLabel = new JLabel("Enter Name");

	  private JTextField nameBox;    

	  private JLabel seatNumLabel = new JLabel("Seat Number");

	  private JTextField seatNumBox; 
	  private JLabel confirmLabel = new JLabel("Confirmed"); 

	  private int userSelectedSeat; 

	  private ButtonListener buttonListener = new ButtonListener(); 

	  private String[] people = { "Peter Bacus", null ,"Philip Juderiasen", "Bianca King",null, 

	                             null,"Pets Mo", "Rose ann", "Kc Mantalaba","Joy ava",

	                             null,"Gab Erp",};

          
 
          
          
          
	  public Virgin_airlines(){

	  

	    setTitle("VIRGIN AIRLINES");

	    setSize(WIDTH, HEIGHT);

	    setLayout(new FlowLayout());

	    setDefaultCloseOperation(EXIT_ON_CLOSE);

	    createContents();

	    

	   

	  } 

	   
          private void createContents(){

	  

	    setLayout(new FlowLayout());

	    nameBox = new JTextField(20);

	    nameBox.setEditable(false);

	    seatNumBox = new JTextField(2);

	    JLabel selectSeat = new JLabel("Select Available(green numbered seat)");

	    selectSeat.setPreferredSize(new Dimension(WIDTH-20, 20));   

	    for(int i = 0; i<TOTAL_SEATS; i++){

	     seatButtns[i] = new JButton(Integer.toString(i + 1));

	      add(seatButtns[i]);

	       

	      }     

	         for (int i=0; i<TOTAL_SEATS ; i++){

	    
	          if (people[i] == null)

	          {

	       

	            seatButtns[i].setForeground(Color.GREEN);

	             seatButtns[i].addActionListener(buttonListener);

	    } 

	  } 

	 

	              add(nameLabel).setVisible(true);

	              add(nameBox).setVisible(true);

	              add(seatNumLabel).setVisible(true);

	              add(seatNumBox).setVisible(true);

	              seatNumBox.setEditable(true);

	              add(confirmLabel).setVisible(true);   

	               nameBox.addActionListener(new TextListener());

	         

	  } 

	   

	          public void display(){

	           System.out.println("Seats   Passengers");

	             for (int i = 0; i <TOTAL_SEATS; i++ ){

	    

	                 System.out.println((i+1) + "   " + people[i]);   
	             } 
	           } 

	   
	   

	  private class TextListener implements ActionListener{

	 

	  

	    public void actionPerformed(ActionEvent e){

	    

	      people[userSelectedSeat-1] = nameBox.getText();
	      display();

	      seatNumBox.setText(Integer.toString(userSelectedSeat));

	      seatButtns[userSelectedSeat - 1].setForeground(Color.BLACK);

	      seatButtns[userSelectedSeat - 1].removeActionListener(buttonListener);

	      nameBox.setEditable(false);      

              JOptionPane.showMessageDialog(null, "Your Transaction is all set! Thank you","Message", JOptionPane.ERROR_MESSAGE);
                      

              
	    } 
	  } 
	   

	  private class ButtonListener implements ActionListener{

	  

	    public void actionPerformed(ActionEvent e){

	    

	      int i = 0;

	      JButton seat = (JButton) e.getSource();

	      if (seatButtns[i] != seat){

	        i++;

	       }

	      userSelectedSeat = i + 1;

	      nameBox.setText("");

	      seatNumBox.setText("");

	      if (!nameLabel.isVisible())

	      {

	        seatNumLabel.setVisible(true);

	        seatNumBox.setVisible(true);

	        confirmLabel.setVisible(true);

	        nameLabel.setVisible(true);

	        nameBox.setVisible(true);

	      }

	        nameBox.setEditable(true);
                
                
	    } 

	  } 

	  } 

	   

	   




    
    

    
    


