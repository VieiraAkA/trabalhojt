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
import javafx.scene.control.Tab;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import trabalhojoaotiago.Login;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXMLMenuInvestidorController implements Initializable {
    
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
    

    //jtrfhtfjycvjycgtfghcomentario
    
    @FXML
    void go_SairPrograma(ActionEvent event) {
        Projecto.repository.Serializar();
                //Janela.close();
        try {
            Parent pagina = FXMLLoader.load(getClass().getResource("FXMLMenuInvestidorController.fxml"));
            Scene janela = new Scene(pagina);
            Stage layout = (Stage) ((Node) event.getSource()).getScene().getWindow();
            layout.setScene(janela);
            layout.close();
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    void go_TerminarSessao(ActionEvent event) {

    }

    @FXML
    void go_to_tab_comprar(ActionEvent event) {

    }

    @FXML
    void go_to_tab_consulta(ActionEvent event) {
        LabelSaldoComprar.setText("Saldo Actual é de: ");
    }

    @FXML
    void go_to_tab_vender(ActionEvent event) {

    }
    
    
    
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Login UserLogado = Projecto.getUserLogado();
        
    }  
    
    
    
    
    
    
    
}
