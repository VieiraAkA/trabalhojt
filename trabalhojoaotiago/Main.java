
package trabalhojoaotiago;

import java.io.Serializable;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Login login = new Login("admin", "123", "João", "Vieira", "vjo@ipvc.pt", 123456789, 912123123, "morada");
    Login aux = new Login();
    
    
    public static void main(String[] args) {
        launch(args);
        
    }   
    
    //ajsgdvjshgada
    private Stage Janela;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        Janela.setTitle("Gestão de Mercado de Títulos Mobiliários");
        
        /*
        
        botaoRegistar3.setOnAction(e -> {
        
            System.out.println(sujestaoUser2.getText() + "\n " + sujestaoCC.getText()+ "\n "+ sujestaoTelemovel.getText()+ "\n "+ sujestaoEmail.getText());
        
        
            if(!aux.Existe_user(sujestaoUser2.getText())) System.out.println("akygdbhsnkdados validos");
        
            boolean res =  ValidarDados(sujestaoUser2.getText(), sujestaoCC.getText(), sujestaoTelemovel.getText(), sujestaoEmail.getText());
        
            if (res) System.out.println("dados validos222");
            else System.out.println("dados erraodsj,hadbhkba");
        });
        
        
        
        */
       
        
    }
    
//////////////////////////////        FIM START          //////////////////////////////////////////////////
    
    public boolean ValidarDados(String user,String Cartao, String Tele, String Email) {
        if(!  aux.Existe_user(user)){
            System.out.println("dados existem");
        }else{
            System.out.println("Dados ok:");
        }
        return true;
    }
    
    
    
    public void closeProgram(){
        boolean resultado = ConfirmBox.display("Sair", " Tem a certeza que pretende Sair ? ");     
            if(resultado){
                Repositorio.Serializar(Repositorio.FILE_NAME);
                Janela.close();
            }
    }
    
    public boolean isTele(TextField input, String text) {
        
        try{
            int numero = Integer.parseInt(input.getText());
            if(numero >910000000 && numero < 919999999);
            if(numero >920000000 && numero < 929999999);
            if(numero >930000000 && numero < 939999999);
            if(numero >960000000 && numero < 949999999);
            if(numero >200000000 && numero < 299999999);
            
        }catch(NumberFormatException e){
            System.out.println("Número inválido");
            return false;
        }
        return true;
    }
    public boolean isCC(TextField input, String text) {
        
        try{
            int numero = Integer.parseInt(input.getText());
            if(numero >100000000 && numero < 999999999);
            
            
        }catch(NumberFormatException e){
            System.out.println("Número inválido");
            return false;
        }
        return true;
    }

    
}    
        /*
        if(!isTele(sujestaoTelemovel, sujestaoTelemovel.getText())){
        if(!isCC(sujestaoCC, sujestaoCC.getText())){
        /*sujestaPW2
        sujestaonome
        sujestaoapelido
        sujestaoMorada
        sujestaoEmail

        }}
    }
}
