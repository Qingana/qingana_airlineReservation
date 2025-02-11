
package qingana_221151540_flightreservations;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Communicator {
    public static void sendToServer(String inputName,String inputSeatName){
        Socket socket;
        DataOutputStream dataOut;
        int reservationNumber = 0;
        try {
            socket = new Socket("localhost",1742);
             System.out.println("Connected to the server");
             dataOut = new DataOutputStream(socket.getOutputStream());
             dataOut.writeUTF(inputName);
             dataOut.writeUTF(inputSeatName);
             dataOut.writeInt(reservationNumber);
             reservationNumber++;
             
              dataOut.close();
             socket.close();
             
            
        } catch (IOException ex) {
            Logger.getLogger(Communicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
