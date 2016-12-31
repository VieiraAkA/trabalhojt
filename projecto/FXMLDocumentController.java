/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.*;

/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    //      Botões
    Button botaoLogin1;//      = new Button("  Login  ");
    Button botaoLogin2;//      = new Button("    Login     ");
    Button botaoRegistar;//    = new Button("  Registar  ");
    Button botaoRegistar2;//   = new Button("  Registar  ");
    Button botaoRegistar3;//   = new Button("  Registar  ");
    Button botaoRetroceder1;// = new Button("  Retroceder  ");
    Button botaoRetroceder2;// = new Button("  Retroceder  ");
    Button botaoOk;//          = new Button("  Ok  ");
    Button botaoEsqueceuPW;//  = new Button("  Esqueceu a sua password ?  ");
    Button botaoLogOut;//      = new Button("  LOGOUT  ");
    Button botaoExit;//        = new Button("  SAIR  ");
    //Button botao = new Button("bla");
    //Button botao = new Button("nla");
    
    
    
    @FXML
    private void JanelaLogin(ActionEvent event) {
        System.out.println("Botao Login OK");
        //stage.setScene(JanelaInicial);
        
       
    }
    @FXML
    private void JanelaRegisto(ActionEvent event) {
        System.out.println("Botao Registo OK");
        
       
    }
    @FXML
    private void ExitPrograma(ActionEvent event) {
        System.out.println("Botao Exit OK");
        
       
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
