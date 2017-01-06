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
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import trabalhojoaotiago.*;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXMLRegistoController implements Initializable {
    private Repositorio repositorio = Repositorio.getInstance();
    private Login loginaux;
    //
    //
    
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
    private TextField IntUser;
    @FXML
    private TextField IntPW;
    @FXML
    private TextField IntPrimeiroNome;
    @FXML
    private TextField IntUltimoNome;
    @FXML
    private TextField IntTelemovel;
    @FXML
    private TextField IntCC;
    @FXML
    private TextField IntEmail;
    @FXML
    private TextField IntMorada;   
    
    
    
    @FXML
    private void registoVoltarAtras(ActionEvent event) {
        System.out.println("VoltarPagInicial");
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
        
        
    }
    
    
    @FXML
    private void registoExitPrograma(ActionEvent event) {
        
        Repositorio.Serializar(Repositorio.FILE_NAME);
        try {
            Parent PagLogin = FXMLLoader.load(getClass().getResource("FXMLRegisto.fxml"));
            Scene JanelaLogin = new Scene(PagLogin);
            Stage LayoutLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
            LayoutLogin.setScene(JanelaLogin);
            LayoutLogin.close();
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    @FXML
    private void registo_UserExiste(TextField user){
        System.out.println("ashgdas");
        
        if(loginaux.Existe_user( IntUser.getText()) ){
            System.out.println("if true");
            // true = existe
            UserExistente.setStroke(Color.RED);
            //UserExistente.setVisible(true);
            UserExistente.setVisible(false);
        }else{
            System.out.println("if false");
            UserExistente.setStroke(Color.GREEN);
            UserExistente.setVisible(true);
        }
    }
    
    
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    
    
    
    
}
