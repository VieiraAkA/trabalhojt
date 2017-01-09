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
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import trabalhojoaotiago.Login;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXMLMenuInvestidorController implements Initializable {
    Login UserLogado = Projecto.getUserLogado();
    @FXML
    private Button botao_comprar;
    @FXML
    private Button botao_vender;
    @FXML
    private Button botao_consultar;
    @FXML
    private Button BotaoSairPrograma;
    @FXML
    private Button BotaoTerminaoSessao;
    @FXML
    private Button Perfil;
    @FXML
    private Button BotaoTerminaoSessao2;
    @FXML
    private Button alteraDados;
    @FXML
    private Text LabelSaldoComprar ;
    @FXML
    private Text LabelBemVindo;
    @FXML
    private Tab tab_inicio;
    @FXML
    private Tab tab_comprar;
    @FXML
    private Tab tab_vender;
    @FXML
    private Tab tab_consultar;
    @FXML
    private Tab tab_perfil;
    @FXML
    private Text dados_nome;
    @FXML
    private Text dados_user;
    @FXML
    private Text dados_telemovel;
    @FXML
    private Text dados_morada;
    @FXML
    private Text dados_email;
    @FXML
    private Text dados_cc;
    @FXML
    private Text dados_saldo;
    
    private TabPane tabPane = new TabPane();

    
    @FXML
    void go_SairPrograma(ActionEvent event) {
       Projecto.repository.Serializar();
                //Janela.close();
        try {
        Parent menuInv = FXMLLoader.load(getClass().getResource("FXMLMenuInvestidor.fxml"));
        Scene JanelaInv = new Scene(menuInv);
        Stage LayoutLogin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        LayoutLogin.setScene(JanelaInv);
        LayoutLogin.close();
        
        } catch (IOException ex) {
        //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    void go_TerminarSessao(ActionEvent event) {
        
    }

    @FXML
    void go_to_tab_comprar(ActionEvent event) {
        tabPane.getTabs().add(tab_comprar);
                    
    }

    @FXML
    void go_to_tab_vender(ActionEvent event) {
        tabPane.getTabs().add(tab_vender);
        
    }
    
    @FXML
    void go_to_tab_consulta(ActionEvent event) {
        tabPane.getTabs().add(tab_consultar);
        
    }
     @FXML
    void go_to_tab_Perfil(ActionEvent event) {
        tabPane.getTabs().add(tab_perfil);
    }

    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        LabelBemVindo.setText(" Bem Vindo " + UserLogado.getPriNome() );
        LabelSaldoComprar.setText("Saldo Actual é de: " + UserLogado.getSaldo() + " €");
        
        dados_nome.setText("Nome : " + UserLogado.getPriNome() + " " + UserLogado.getUltNome());
        dados_user.setText("Username : " + UserLogado.getUser());
        dados_telemovel.setText("Telemovel : " + UserLogado.getTelefone());
        dados_morada.setText("Morada : "+ UserLogado.getMorada());
        dados_email.setText("Email : " +UserLogado.getEmail());
        dados_cc.setText("   Cartão de Cidadão : " + UserLogado.getCartaoCidadao());
        dados_saldo.setText("Saldo : "+ UserLogado.getSaldo());
        
        
        
        
    }  
    
    
    
    
    
    
    
}
