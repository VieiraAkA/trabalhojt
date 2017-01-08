
package projecto;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.*;
import trabalhojoaotiago.Login;
import trabalhojoaotiago.Repository;


public class FXMLLoginController implements Initializable {
    @FXML
    private TextField IntUser;
    @FXML
    private PasswordField IntPW;
    @FXML
    private Text InfoErrada;
 
    
    
    //JanelaRegisto
    
    @FXML 
    private void loginJanelaRegisto(ActionEvent event){
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
    private void loginVoltarAtras(ActionEvent event) {
        System.out.println("Botao Voltar OK");
        
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
    private void loginFazerLogin(ActionEvent event) {
        String intuser = IntUser.getText();
        String intpw = IntPW.getText();
        
        if(Projecto.repository.getListaUsers().containsKey(intuser)){
             
            // chave (user) , objecto login;
            
            if (Projecto.repository.getListaUsers().get(intuser).getPassword().equals(intpw)){
                try {
                    
                    Projecto.setUserLogado(Projecto.repository.getListaUsers().get(intuser));
                    Parent MenuInvestidor = FXMLLoader.load(getClass().getResource("FXMLMenuInvestidor.fxml"));
                    Scene JanelaInvestidor = new Scene(MenuInvestidor);
                    Stage LayoutInvestidor = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    LayoutInvestidor.setScene(JanelaInvestidor);
                    LayoutInvestidor.show();
                    
                    
                } catch (IOException ex) {
                    //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                InfoErrada.setText  ("             Password Incorrecta! Tente novamente.");
            }
        }else{
            InfoErrada.setText      ("         User ou Password Incorrectos! Tente novamente.");
        }
    }
    
    
    @FXML
    private void loginExitPrograma(ActionEvent event) {
        Projecto.repository.Serializar();
                //Janela.close();
        
        try {
        Parent PagLogin = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
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
        
        
    }  
}