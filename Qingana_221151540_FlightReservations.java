
package qingana_221151540_flightreservations;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.beans.EventHandler;
import javax.swing.JFrame;


public class Qingana_221151540_FlightReservations extends JFrame implements ActionListener{
     JFrame airplane = new JFrame();
     JFrame passenger = new JFrame();
     GridLayout layout = new GridLayout();
     Button A1 = new Button("A1");
     Button A2 = new Button("A2");
     Button A3 = new Button("A3");
     Button A4 = new Button("A4");
     Button B1 = new Button("B1");
     Button B2 = new Button("B2");
     Button B3 = new Button("B3");
     Button B4 = new Button("B4");
     
     TextField ReservationsPassenger = new TextField();
     String passagerName;
     String seatName;
     
    public Qingana_221151540_FlightReservations() {
        layout = null;
       airplane.setVisible(true); 
       airplane.setSize(400,400);
       airplane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       airplane.setLocation(100, 100);
       airplane.setTitle("Reservations Airplane");
       airplane.setLayout(layout);
      
       
      
               
      airplane.add(A1).setBounds(0, 0, 100,40);
      airplane.add(A2).setBounds(0, 40, 100,40);
       airplane.add(A3).setBounds(0, 80, 100,40);
       airplane.add(A4).setBounds(0, 120, 100,40);
       airplane.add(B1).setBounds(100, 0, 100,40);
       airplane.add(B2).setBounds(100, 40, 100,40);
       airplane.add(B3).setBounds(100, 80, 100,40);
       airplane.add(B4).setBounds(100, 120, 100,40);
       
       A1.addActionListener(this);
       A2.addActionListener(this);
       A3.addActionListener(this);
       A4.addActionListener(this);
       B1.addActionListener(this);
       B2.addActionListener(this);
       B3.addActionListener(this);
       B4.addActionListener(this);
       ReservationsPassenger.addActionListener(this);
       
       
      
       
        passenger.setVisible(true); 
       passenger.setSize(300,200);
       passenger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       passenger.setLocation(700, 100);
       passenger.setTitle("Reservations Passenger");
       passenger.setLayout(layout);
       passenger.add(ReservationsPassenger).setBounds(0, 0, 300, 40);
      
        
       
        
    }
      
    Communicator communicator;
    public static void main(String[] args) {
      Qingana_221151540_FlightReservations object = new Qingana_221151540_FlightReservations();
      
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        if(event.getSource().equals(A1)){
            System.out.println("Button pressed");
            A1.setVisible(false);
            airplane.setVisible(false);
            passagerName = ReservationsPassenger.getText();
            seatName = "A1";
        }
        
        if(event.getSource().equals(A2)){
            System.out.println("Button pressed");
             A2.setVisible(false);
            airplane.setVisible(false);
            passagerName = ReservationsPassenger.getText();
            seatName = "A2";
        }
        
        if(event.getSource().equals(A3)){
            System.out.println("Button pressed");
             A3.setVisible(false);
            airplane.setVisible(false);
            passagerName = ReservationsPassenger.getText();
            seatName = "A3";
        }
        
        if(event.getSource().equals(A4)){
            System.out.println("Button pressed");
             A4.setVisible(false);
            airplane.setVisible(false);
            passagerName = ReservationsPassenger.getText();
            seatName = "A4";
        }
        
        if(event.getSource().equals(B1)){
            System.out.println("Button pressed");
             B1.setVisible(false);
            airplane.setVisible(false);
            passagerName = ReservationsPassenger.getText();
            seatName = "B1";
            
        }
        if(event.getSource().equals(B2)){
            System.out.println("Button pressed");
             B2.setVisible(false);
            airplane.setVisible(false);
            passagerName = ReservationsPassenger.getText();
            seatName = "B2";
        }
        if(event.getSource().equals(B3)){
            System.out.println("Button pressed");
             B3.setVisible(false);
            airplane.setVisible(false);
        }
            if(event.getSource() == ReservationsPassenger){
            passagerName = ReservationsPassenger.getText();
            seatName = "B3"; 
            airplane.setVisible(true);
            passenger.setVisible(false);
            Communicator.sendToServer(passagerName,seatName);
            
            }
     
            
            
        
        if(event.getSource().equals(B4)){
            System.out.println("Button pressed");
             B4.setVisible(false);
            airplane.setVisible(false);
            
            passagerName = ReservationsPassenger.getText();
            seatName = "B4";
            
        }
      
         
    }
    
    
}
