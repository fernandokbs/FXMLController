package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import controllers.com.FXMLNewWindowController;
/**
 *
 * @author Fernando
 */
public class FXMLMainDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    
    
    private Stage stage;
    private Parent parent;
    private FXMLNewWindowController controller;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
         loadFXML();
    }
    
    public void loadFXML(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("com/FXMLNewWindow.fxml"));
        try {
            parent = (Parent)loader.load();
        } catch (IOException ex) {}
        
        if(parent!=null){
            //we create a custom controller
            controller = loader.getController();
            //here we pass the reference to the  other controller
            controller.setLabel(label);
        }
        stage = new Stage();
        stage.setScene(new Scene(parent));
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
    }    
    
}
