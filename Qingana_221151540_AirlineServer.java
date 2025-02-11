
package qingana_221151540_airlineserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Qingana_221151540_AirlineServer {

    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;
        String ServerInput;
        int reservationNumber;
        String seatName;
        String passagerName;
        String input;
        String passengerOnSeat[][] = new String[2][4];
        try {
            serverSocket = new ServerSocket(1742);
            
            while(true){
            System.out.println("Waiting for connection");
            socket = serverSocket.accept();
            System.out.println("connection successful");
            DataInputStream DataIn = new DataInputStream(socket.getInputStream());
             DataInputStream DataIn1 = new DataInputStream(socket.getInputStream());
             DataOutputStream DataOut = new DataOutputStream(socket.getOutputStream());
             passagerName = DataIn.readUTF();
             seatName = DataIn1.readUTF();
             reservationNumber = DataIn.readInt();
             
             System.out.println("Reservation no: "+reservationNumber);
             System.out.println("Passager name: "+passagerName);
             System.out.println("seat name: "+ seatName);
             
            
             
            //DataOut.writeUTF("        ");
             
             input = DataIn.readUTF();
             System.out.println(input);
             
            
          for(int count = 0;count < 2;count++){
                for(int count2 = 0;count2 < 4;count2++){
                  
                  passengerOnSeat[count][count2]  = passagerName;
                  
                }
                
            }
            
             for(int count = 0;count < 2;count++){
                for(int count2 = 0;count2 < 4;count2++){
                  
                    System.out.println( passengerOnSeat[count][count2]); 
                    System.out.println(seatName);
                    DataOut.writeUTF(passengerOnSeat[count][count2]);
                }
                
            }
           
            
            DataIn.close();
            DataOut.close();
            socket.close();
           
            
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Qingana_221151540_AirlineServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

