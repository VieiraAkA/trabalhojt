
package trabalhojoaotiago;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {
    
    static boolean resposta;
    
    public static boolean display(String titulo, String mensagem) {
        Stage Window = new Stage();
        Window.initModality(Modality.APPLICATION_MODAL);
        Window.setTitle(titulo);
        Window.setMinWidth(250);
        Label lab = new Label();
        Label bla = new Label("                 ");
        lab.setText(mensagem);
        
        
        // criar dois botoes
        Button sim = new Button("SIM");
        Button nao = new Button("NÃO");
        
        sim.setOnAction(e ->{
            resposta = true;
            Window.close();
           
        });
        nao.setOnAction(e ->{
            resposta = false;
            Window.close();
        });
        
        VBox layout =new VBox(10);
        layout.getChildren().addAll(lab, sim, nao, bla);
        layout.setAlignment(Pos.CENTER);
        Scene cena= new Scene(layout);
        Window.setScene(cena);
        Window.showAndWait();
        
        return resposta;
        
    }
    
}
