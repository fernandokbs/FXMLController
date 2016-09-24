/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.com;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Fernando
 */
public class FXMLNewWindowController implements Initializable {
    
    @FXML
    private TextField txtField;
    
    private Label label;

    public void setLabel(Label label) {
        this.label = label;
        label.textProperty().bindBidirectional(txtField.textProperty());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
