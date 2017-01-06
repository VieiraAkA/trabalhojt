/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import com.sun.prism.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
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
import javafx.scene.layout.BackgroundImage;
import javafx.stage.*;
import trabalhojoaotiago.*;

/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {
      
    
    //      Botões
    @FXML
    private Button InicioBotaoLoginq;
    @FXML
    private Button InicioBotaoRegistar;
    @FXML
    private Button InicioBotaoExit;
    
    @FXML
    private void inicioJaneladeLogin(ActionEvent evento) {
        System.out.println("ahsgfdhagsdvgavsd");
            Parent PaginaLogin;
        try {
            PaginaLogin = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        
            Scene JanelaLogin = new Scene(PaginaLogin);
            Stage LayoutdoLogin = (Stage) ((Node) evento.getSource()).getScene().getWindow();
            LayoutdoLogin.setScene(JanelaLogin);
            LayoutdoLogin.show();
            } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
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
        
        try {
        Parent PagLogin = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene JanelaLogin = new Scene(PagLogin);
        Stage LayoutLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        LayoutLogin.setScene(JanelaLogin);
        LayoutLogin.close();
        
        } catch (IOException ex) {
        //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
