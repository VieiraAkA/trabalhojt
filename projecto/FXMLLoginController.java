
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
import javafx.scene.shape.Circle;
import javafx.stage.*;
import trabalhojoaotiago.Repositorio;


public class FXMLLoginController implements Initializable {
    private Repositorio repositorio = Repositorio.getInstance();
    @FXML
    private Button botaoRegistar;
    @FXML
    private Button botaoVoltar;
    @FXML
    private Button botaoLogin;
    @FXML
    private Button botaoSair;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
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
        System.out.println("Botao Exit OK");
        
       
    }
    
    @FXML
    private void loginExitPrograma(ActionEvent event) {
        Repositorio.Serializar(Repositorio.FILE_NAME);
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
    
    
    
//    @FXML 
//    private void funcaoTeste(ActionEvent evento_nome){
//        //evento_nome.função.......
//       
//    }
    
    
    
    
    
    
}
