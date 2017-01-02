/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class Projecto extends Application {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent PagInicio = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        //Parent PagLogin = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        //Parent PagRegisto = FXMLLoader.load(getClass().getResource("FXMLRegisto.fxml"));
        
        
        Scene JanelaInicial = new Scene(PagInicio);
        
        //Scene JanelaLogin = new Scene(PagLogin);
        //Scene JanelaRegisto = new Scene(PagRegisto);
        
        
        
        
        stage.setScene(JanelaInicial);
        stage.show();
    }

    
    
}
