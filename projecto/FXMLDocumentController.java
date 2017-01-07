/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import com.sun.prism.Image;
import java.awt.image.BufferedImage;
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
import javafx.scene.layout.BorderPane;
import javafx.stage.*;
import javax.imageio.ImageIO;
import trabalhojoaotiago.*;

/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {
      
    // comentartio teste
    //      Botões
    
    
    
    
    @FXML
    private BorderPane borderInicial;

    @FXML
    private Button InicioBotaoExit;

    @FXML
    private Button InicioBotaoLoginq;

    @FXML
    private Button InicioBotaoRegistar;

    @FXML
    void inicioExitPrograma(ActionEvent event) {
        Projecto.repository.Serializar();
        
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

    @FXML
    void inicioJanelaRegisto(ActionEvent event) {
        System.out.println("registoooooooooooooooo\n");
            Parent PaginaRegisto;
        try {
            PaginaRegisto = FXMLLoader.load(getClass().getResource("FXMLRegisto.fxml"));
        
            Scene JanelaRegisto = new Scene(PaginaRegisto);
            Stage LayoutdoRegisto = (Stage) ((Node) event.getSource()).getScene().getWindow();
            LayoutdoRegisto.setScene(JanelaRegisto);
            LayoutdoRegisto.show();
            } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void inicioJaneladeLogin(ActionEvent event) {
        System.out.println("ahsgfdhagsdvgavsd");
            Parent PaginaLogin;
        try {
            PaginaLogin = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        
            Scene JanelaLogin = new Scene(PaginaLogin);
            Stage LayoutdoLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
            LayoutdoLogin.setScene(JanelaLogin);
            LayoutdoLogin.show();
            } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("tamanho: " + Projecto.repository.getListaUsers().size());
        
    }    
    
}
