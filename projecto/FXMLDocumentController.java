/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.*;
import trabalhojoaotiago.Repositorio;

/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    //      Botões
    
    @FXML
    private Button InicioBotaoLogin;
    @FXML
    private Button InicioBotaoRegistar;
    @FXML
    private Button InicioBotaoExit;
    
    
    
    
    
    @FXML
    private void inicioJanelaLogin(ActionEvent event) {
        try {
            Parent PagLogin = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
            Scene JanelaLogin = new Scene(PagLogin);
            Stage LayoutLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
            LayoutLogin.setScene(JanelaLogin);
            LayoutLogin.show();
            
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    @FXML
    private void inicioJanelaRegisto(ActionEvent event) {
        try {
            Parent PagLogin = FXMLLoader.load(getClass().getResource("FXMLRegisto.fxml"));
            Scene JanelaRegisto = new Scene(PagLogin);
            Stage LayoutRegisto = (Stage) ((Node) event.getSource()).getScene().getWindow();
            LayoutRegisto.setScene(JanelaRegisto);
            LayoutRegisto.show();
            
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    @FXML
    
    private void inicioExitPrograma(ActionEvent event) {
        Repositorio.Serializar(Repositorio.FILE_NAME);
                //Janela.close();
        /*
        try {
        Parent PagLogin = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        Scene JanelaLogin = new Scene(PagLogin);
        Stage LayoutLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        LayoutLogin.setScene(JanelaLogin);
        LayoutLogin.show();
        
        } catch (IOException ex) {
        //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
