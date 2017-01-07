/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import trabalhojoaotiago.*;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXMLRegistoController implements Initializable  {
    //private Repositorio repositorio = Repositorio.getInstance();
    //private Login loginaux = new Login();
    
    @FXML
    private Circle UserExistente;
    @FXML
    private Circle TeleExiste;
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
    
    boolean user = false;
    boolean tele = false;
    boolean email = false;
    boolean cc = false;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Vaqi ser aqui que aparece o nome do user logado
    } 
    
    
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
    private void registo_dados_user_novo(ActionEvent event){
        System.out.println("ASJGDCFASGHDBA");
//        -//if(se esta tudo verde)
//            -Login login = new Login();       
//            -login.setEmail("email");
//
//            -Repositorio.getInstance().getListaUsers().put("o user que ele introduziu", login); AQUI adiciona á lista
    /*
    
    String user = get_info(IntUser);
    String tele = get_info(IntTelemovel);
    String email = get_info(IntEmail);
    String cc = get_info(IntCC);
    
    
    System.out.println(user + "\n" + tele  + "\n" + email + "\n" + cc);
    
    boolean cuser = true, ctele = true, cemail = true, ccc = true;
    
    while(cuser==false &&  ctele==false &&  cemail==false && ccc==false){
    */
    }
    
    
    
    
    
    @FXML
    void get_info_USER(KeyEvent event) {
        String var = IntUser.getText();
        boolean res = Login.Existe_user(var);
        
        UserExistente.setVisible(true);
        if(res){
            // se true = existe
            UserExistente.setFill(Color.RED);
            user = false;
        }else{
            UserExistente.setFill(Color.GREEN);
            user = true;
        }        
        
    }
    
    @FXML
    void get_info_PW(KeyEvent event) {

        String var = IntPW.getText();
        System.out.println(var);
        
    }
    @FXML
    void get_info_FNome(KeyEvent event) {
        String var = IntPrimeiroNome.getText();
        System.out.println(var);
        
    }
    @FXML
    void get_info_UNome(KeyEvent event) {

        String var = IntUltimoNome.getText();
        System.out.println(var);
        
    }
    @FXML
    void get_info_TELE(KeyEvent event) {
        
        String var = IntTelemovel.getText();
      
        boolean res;
      
        TeleExiste.setVisible(true);
      
        try{
            Integer Tele = Integer.valueOf(var);
            // se chegar aqui então é um numero inteiro

            res = Login.Existe_CartaoCidadao(Tele);
            if(res){
                // se true = existe
                TeleExiste.setFill(Color.RED);
                tele = false;
            }else{
                TeleExiste.setFill(Color.GREEN);
                tele = true;
            }
          
      }catch(Exception e){
          TeleExiste.setFill(Color.RED);
          // se chegar aqui não é um numero inteiro
          if(var.length() != 0){
              if(var.length() == 1){
                  var = "";
              }    
              else{
                  var = var.substring(0, var.length() - 1);
              }    
          }
          IntTelemovel.setText(var);
    }
        
    }
    @FXML
    void get_info_Morada(KeyEvent event) {

        String var = IntMorada.getText();
        System.out.println(var);
        
    }
    @FXML
    void get_info_Email(KeyEvent event) {

        
        String var = IntEmail.getText();
        boolean res;
        
        res = Login.Existe_Email(var);
        
        EmailExistente.setVisible(true);
        if(res){
            // se true = existe
            EmailExistente.setFill(Color.RED);
            email= false;
        }
        else{
            EmailExistente.setFill(Color.GREEN);
            email= true;
        }   
        
    }
    @FXML
    void get_info_CC(KeyEvent event) {

        String var = IntCC.getText();
        boolean res;

        CCExistente.setVisible(true);
        try{
            Integer CC = Integer.valueOf(var);
            // se chegar aqui então é um numero inteiro
            res = Login.Existe_CartaoCidadao(CC);
            CCExistente.setFill(Color.GREEN);
            if(res){
                // se true = existe
                CCExistente.setFill(Color.RED);
                cc= false;
            }
            else{
                CCExistente.setFill(Color.GREEN);
                cc= true;
            }  
        }catch(Exception e){
            CCExistente.setFill(Color.RED);
            // se chegar aqui não é um numero inteiro
            if(var.length() != 0){
                if(var.length() == 1){
                    var = "";
                }    
                else{
                    var = var.substring(0, var.length() - 1);
                }    
            }
            IntCC.setText(var);
        }
        
    }
    
    
    /*
    @FXML
    public String get_email(TextField var){
    String email = var.getText();
    return email;
    }
    @FXML
    public String get_telemovel(TextField var){
    String telemovel = var.getText();
    return telemovel;
    }
    @FXML
    public String get_cc(TextField var){
    String cc = var.getText();
    return cc;
    }*/
    
    
    
    
    
    /*
    
    public EventHandler<ActionEvent> get_info() {
    
    botaoRegistar.setOnAction (e -> new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            String user = IntUser.getText();
            String tele = IntTelemovel.getText();
            String email = IntEmail.getText();
            String cc = IntCC.getText();
        }
    });
    
    
    */
    
    
    
    
    
    
     
    
    
    
}
