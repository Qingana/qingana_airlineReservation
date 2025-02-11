
package qingana_221151540_checkin;

//import java.awt.TextField;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Qingana_221151540_CheckIn extends Application {

    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane layout = new GridPane();
        TextArea txtArea = new TextArea();
        Scene scene = new Scene(layout,400,400);
        
       layout.getChildren().add(txtArea);
        
        stage.setScene(scene);
        stage.setTitle("CheckIn");
        stage.show();
        
         Socket socket;
        DataOutputStream dataOut;
        DataInputStream dataIn;
        String content;
        try {
            socket = new Socket("localhost",1742);
            System.out.println("Connected to the server");
             dataOut = new DataOutputStream(socket.getOutputStream());
             dataIn = new DataInputStream(socket.getInputStream());
              dataOut.writeUTF("CheckIn");
            // dataOut.writeUTF(inputSeatName);*/
             content = dataIn.readUTF();
             
             txtArea.setText(content);
             
             dataOut.close();
             socket.close();
             
            
        } catch (IOException ex) {
            Logger.getLogger(Communicator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
