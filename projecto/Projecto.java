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
import javafx.stage.Stage;
import trabalhojoaotiago.Login;
import trabalhojoaotiago.Repository;

/**
 *
 * @author Asus
 */
public class Projecto extends Application {
    
    public static Repository repository;
    public static String filename = "ficheiro.bin";
    public static Login UserLogado;

    
    public static Login getUserLogado() {
        return UserLogado;
    }
    
    public static void setUserLogado(Login Username) {
        Projecto.UserLogado = Username;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//        Repository rep = new Repository();
//        
//        Login l = new Login();
//        l.setEmail("email1");
//        l.setUser("user1");
//        rep.getListaUsers().put("user1", l);
//        
//        l = new Login();
//        l.setEmail("email2");
//        l.setUser("user2");
//        rep.getListaUsers().put("user2", l);
//        
//        rep.Serializar();



//          Repository rep = Repository.Desserializar("ficheiro.bin");
            Projecto.repository = Repository.Desserializar();
          System.out.println("tamanho: " + Projecto.repository.getListaUsers().size());
        
        
        launch(args);
    }
    
    
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent PagInicio = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        
        Scene JanelaInicial = new Scene(PagInicio);
        
        
        stage.setScene(JanelaInicial);
        stage.show();
        
    }

    
    
}
