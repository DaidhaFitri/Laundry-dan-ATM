/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author DAIDHA
 */
public class FXMLDocumentController implements Initializable {
    
    String pin = "";
    String PIN = "3115";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private JFXButton btn1;

    @FXML
    private JFXButton btn2;

    @FXML
    private JFXButton btn3;

    @FXML
    private JFXButton btn4;

    @FXML
    private JFXButton btn5;

    @FXML
    private JFXButton btn6;

    @FXML
    private JFXButton btn7;

    @FXML
    private JFXButton btn8;

    @FXML
    private JFXButton btn9;

    @FXML
    private JFXButton btnC;

    @FXML
    private JFXButton btn0;

    @FXML
    private JFXButton btnOK;

    @FXML
    private JFXPasswordField pass;

    @FXML
    private void tekan0(ActionEvent event) {
        pin += "0";
        pass.setText(pin);
    }

    @FXML
    private void tekan1(ActionEvent event) {
        pin += "1";
        pass.setText(pin);
    }

    @FXML
    private void tekan2(ActionEvent event) {
        pin += "2";
        pass.setText(pin);
    }

    @FXML
    private void tekan3(ActionEvent event) {
        pin += "3";
        pass.setText(pin);
    }

    @FXML
    private void tekan4(ActionEvent event) {
        pin += "4";
        pass.setText(pin);
    }

    @FXML
    private void tekan5(ActionEvent event) {
        pin += "5";
        pass.setText(pin);
    }

    @FXML
    private void tekan6(ActionEvent event) {
        pin += "6";
        pass.setText(pin);
    }

    @FXML
    private void tekan7(ActionEvent event) {
        pin += "7";
        pass.setText(pin);
    }

    @FXML
    private void tekan8(ActionEvent event) {
        pin += "8";
        pass.setText(pin);
    }

    @FXML
    private void tekan9(ActionEvent event) {
        pin += "8";
        pass.setText(pin);
    }

    @FXML
    private void tekanC(ActionEvent event) {
        pin = "";
        pass.setText(pin);
    }

    @FXML
    private void tekanOK(ActionEvent event) {
        if (pin.equals(PIN)) {
           try{
            //Hide this current window(if this is what you want)
            ((Node) (event.getSource())).getScene().getWindow().hide();
            //Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load(),830,450);
            stage.setScene(scene);
            stage.setTitle("MenuAwal");
            stage.show();   
          } catch (IOException e){
              System.out.println("Failed to create new window." + e);           
          }
       }else {
           kesempatan -= 1;
           JOptionPane.showMessageDialog(null, "PIN Salah \n Tersisa " + kesempatan 
                            + "kesempatan lagi!");
           pass.setText("");
           pin = "";
           if (kesempatan == 0){
               System.exit(0);
           }
       }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private static class JFXButton {

        public JFXButton() {
        }
    }

    private static class JFXPasswordField {

        public JFXPasswordField() {
        }

        private void setText(String pin) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
