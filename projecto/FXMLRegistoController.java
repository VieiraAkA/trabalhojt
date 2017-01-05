/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXMLRegistoController implements Initializable {
    
    
    @FXML
    private Circle UserExistente;
    @FXML
    private Circle BotaoPWCerto;
    @FXML
    private Circle CCExistente;
    @FXML
    private Circle EmailExistente;
    @FXML
    private Button botaoRegistar;
    @FXML
    private Button botaoVoltar;
    @FXML
    private Button botaoSair;
    
    
    
    @FXML
    private void registoVoltarAtras(ActionEvent event) {
        
        try {
            Parent PagInicial = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene Janelainicial = new Scene(PagInicial);
            Stage Layoutinicial = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Layoutinicial.setScene(Janelainicial);
            Layoutinicial.show();
            
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @FXML
    private void registoRegistarUser(ActionEvent event) {
        // adicionar novo user ao sistema 
        
        System.out.println("adicionar user OK");
        
        try {
            Parent PagInicial = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene Janelainicial = new Scene(PagInicial);
            Stage Layoutinicial = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Layoutinicial.setScene(Janelainicial);
            Layoutinicial.show();
            
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    
    /*@FXML
    private int checkuser( event){
    
    }*/
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
