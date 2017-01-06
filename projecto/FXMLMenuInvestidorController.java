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
import javafx.scene.control.Tab;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXMLMenuInvestidorController implements Initializable {

    
    @FXML
    private Tab tab_inicio;

    @FXML
    private Button botao_comprar;

    @FXML
    private Button botao_vender;

    @FXML
    private Button botao_consultar;

    @FXML
    private Tab tab_comprar;

    @FXML
    private Tab tab_vender;

    @FXML
    private Tab tab_consultar;

    @FXML
    void go_to_tab_comprar(ActionEvent event) {

    }

    @FXML
    void go_to_tab_consulta(ActionEvent event) {

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
        // TODO
    }    
    
}
