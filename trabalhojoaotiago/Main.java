
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
    
    //      Janelas
    Stage Janela;
    
    
    //      Botões
    Button botaoLogin       = new Button("  Login  ");
    Button botaoLogin2      = new Button("    Login     ");
    Button botaoRegistar    = new Button("  Registar  ");
    Button botaoRegistar2   = new Button("  Registar  ");
    Button botaoRegistar3   = new Button("  Registar  ");
    Button botaoRetroceder1 = new Button("  Retroceder  ");
    Button botaoRetroceder2 = new Button("  Retroceder  ");
    Button botaoOk          = new Button("  Ok  ");
    Button botaoEsqueceuPW  = new Button("  Esqueceu a sua password ?  ");
    Button botaoLogOut      = new Button("  LOGOUT  ");
    Button botaoExit        = new Button("  SAIR  ");
    //Button botao = new Button("bla");
    //Button botao = new Button("nla");
    
    
    //      Layouts
    GridPane layoutInicial = new GridPane();
    GridPane layoutInicialBotton = new GridPane();
    GridPane layoutLogin = new GridPane();
    GridPane layoutRegisto = new GridPane();
    BorderPane borderInicial = new BorderPane();
    
    
    //      Cenas
    Scene JanelaInicial = new Scene(borderInicial, 1280, 720);
    Scene JanelaLogin = new Scene(layoutLogin, 1280, 720);
    Scene JanelaRegisto = new Scene(layoutRegisto, 1280, 720);
    //Scene JanelaMenuInvestidor = new Scene(layoutRegisto, 1280, 720);
    
    
    //      Labels
    Label textologin = new Label("Por Favor, faça o seu Login\n");
    Label textoregisto = new Label("Por Favor, faça o seu registo");
    
    
    public static void main(String[] args) {
        launch(args);
        
    }   
    
    //ajsgdvjshgada
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Janela= primaryStage;
        Janela.setTitle("Gestão de Mercado de Títulos Mobiliários");
        Janela.setOnCloseRequest(e ->{
            e.consume();
            closeProgram() ;
                });
        borderInicial.setTop(layoutInicial);
        borderInicial.setBottom(layoutInicialBotton);
        //  borderInicial.setBottom(layoutInicial);
        
        layoutInicialBotton.setPadding(new Insets( 10, 20, 20, 10));
        layoutInicialBotton.setVgap(10);
        layoutInicialBotton.setHgap(15);
        layoutInicial.setPadding(new Insets( 10, 20, 10, 10));
        layoutInicial.setVgap(10);
        layoutInicial.setHgap(15);
        layoutLogin.setPadding(new Insets( 10, 10, 10, 10));
        layoutLogin.setVgap(10);
        layoutLogin.setHgap(10);
        layoutRegisto.setPadding(new Insets( 10, 10, 10, 10));
        layoutRegisto.setVgap(10);
        layoutRegisto.setHgap(10);
        
        
        //Formulario Login
        GridPane.setConstraints(textologin, 0, 0);
        Label InserirUser = new Label("Username :  ");
        GridPane.setConstraints(InserirUser, 0, 1);
        
        TextField sujestaoUser = new TextField();
        sujestaoUser.setPromptText("-----  Username  -----");
        GridPane.setConstraints(sujestaoUser, 1, 1);
        
        Label InserirPW = new Label("Password : ");
        GridPane.setConstraints(InserirPW, 0, 2);
        
        TextField sujestaPW = new TextField();
        sujestaPW.setPromptText("-----  Password  -----");
        GridPane.setConstraints(sujestaPW, 1, 2);
        
        GridPane.setConstraints(botaoRetroceder1, 0, 3);
        GridPane.setConstraints(botaoLogin2, 1, 3);
        
        
        
        //Formulario Registo
        GridPane.setConstraints(textoregisto, 0, 0);
        Label RegistarUser = new Label("Username :  ");
        GridPane.setConstraints(RegistarUser, 0, 1);
        TextField sujestaoUser2 = new TextField();
        sujestaoUser2.setPromptText("-----  Username  -----");
        GridPane.setConstraints(sujestaoUser2, 1, 1);
        
        Label RegistarPW = new Label("Password : ");
        GridPane.setConstraints(RegistarPW, 0, 2);
        TextField sujestaPW2 = new TextField();
        sujestaPW2.setPromptText("-----  Password  -----");
        GridPane.setConstraints(sujestaPW2, 1, 2);
        
        Label Registarnome = new Label("Primeiro Nome :  ");
        GridPane.setConstraints(Registarnome, 0, 3);
        TextField sujestaonome = new TextField();
        sujestaonome.setPromptText("---- Primeiro Nome ----");
        GridPane.setConstraints(sujestaonome, 1, 3);
        
        Label Registarapelido = new Label("Último Nome :  ");
        GridPane.setConstraints(Registarapelido, 0, 4);
        TextField sujestaoapelido = new TextField();
        sujestaoapelido.setPromptText("---- Último Nome ----");
        GridPane.setConstraints(sujestaoapelido, 1, 4);
        
        Label RegistarTelemovel = new Label("Telemóvel :  ");
        GridPane.setConstraints(RegistarTelemovel, 0, 5);
        TextField sujestaoTelemovel = new TextField();
        sujestaoTelemovel.setPromptText("---- Telemóvel ----");
        GridPane.setConstraints(sujestaoTelemovel, 1, 5);
        
        Label RegistarMorada = new Label("Morada :  ");
        GridPane.setConstraints(RegistarMorada, 0, 6);
        TextField sujestaoMorada = new TextField();
        sujestaoMorada.setPromptText("---- Morada ----");
        GridPane.setConstraints(sujestaoMorada, 1, 6);
        
        Label RegistarEmail = new Label("Email :  ");
        GridPane.setConstraints(RegistarEmail, 0, 7);
        TextField sujestaoEmail = new TextField();
        sujestaoEmail.setPromptText("---- Email ----");
        GridPane.setConstraints(sujestaoEmail, 1, 7);
        
        Label RegistarCC = new Label("Cartão Cidadão :  ");
        GridPane.setConstraints(RegistarCC, 0, 8);
        TextField sujestaoCC = new TextField();
        sujestaoCC.setPromptText("---- Cartão Cidadão ----");
        GridPane.setConstraints(sujestaoCC, 1, 8);
        
        GridPane.setConstraints(botaoRetroceder2, 0, 9);
        GridPane.setConstraints(botaoRegistar3, 1, 9);
        
        
        
        
        //Acção dos botões:
        botaoExit.setOnAction(e ->closeProgram());
        botaoLogin.setOnAction(e -> Janela.setScene(JanelaLogin));       
        botaoRetroceder1.setOnAction(e -> Janela.setScene(JanelaInicial));
        botaoRetroceder2.setOnAction(e -> Janela.setScene(JanelaInicial));
        botaoRegistar.setOnAction(e -> Janela.setScene(JanelaRegisto));
        /*botaoRegistar2.setOnAction(e -> Janela.setScene(JanelaRegisto));*/
        botaoRegistar3.setOnAction(e -> {
            
            //System.out.println(sujestaoUser2.getText() + "\n " + sujestaoCC.getText()+ "\n "+ sujestaoTelemovel.getText()+ "\n "+ sujestaoEmail.getText());
            
                    
            //if(!aux.Existe_user(sujestaoUser2.getText())) System.out.println("akygdbhsnkdados validos");    
                    
            boolean res =  ValidarDados(sujestaoUser2.getText(), sujestaoCC.getText(), sujestaoTelemovel.getText(), sujestaoEmail.getText());
                    
            if (res) System.out.println("dados validos222");
            else System.out.println("dados erraodsj,hadbhkba");
        });
       
        
//      Janela principal
        GridPane.setConstraints(botaoLogin, 0, 1);
        GridPane.setConstraints(botaoRegistar, 1, 1);
        layoutInicial.getChildren().addAll( botaoLogin, botaoRegistar);
        layoutInicial.setAlignment(Pos.BASELINE_RIGHT);
        layoutInicialBotton.getChildren().addAll(botaoExit);
        layoutInicialBotton.setAlignment(Pos.BOTTOM_RIGHT);
        
//      Janela Login

        layoutLogin.getChildren().addAll(textologin, InserirUser, sujestaoUser, InserirPW,  sujestaPW, botaoLogin2, botaoRetroceder1);
        layoutLogin.setAlignment(Pos.CENTER);
        
        
//      Janela Registo
        layoutRegisto.getChildren().addAll(textoregisto,  RegistarUser, sujestaoUser2, RegistarPW, sujestaPW2, Registarnome, sujestaonome,Registarapelido, sujestaoapelido,RegistarTelemovel,sujestaoTelemovel,  RegistarMorada, sujestaoMorada, RegistarEmail, sujestaoEmail, RegistarCC, sujestaoCC,botaoRegistar3, botaoRetroceder2);
        layoutRegisto.setAlignment(Pos.CENTER);
        
        
        
        
        
        Janela.setScene(JanelaInicial);
        Janela.show(); 
    }
    
//////////////////////////////        FIM START          //////////////////////////////////////////////////
    
    private boolean ValidarDados(String user,String Cartao, String Tele, String Email) {
        if(!  aux.Existe_user(user)){
            System.out.println("dados existem");
        }else{
            System.out.println("Dados ok:");
        }
        return true;
    }
    
    
    
    private void closeProgram(){
        boolean resultado = ConfirmBox.display("Sair", " Tem a certeza que pretende Sair ? ");     
            if(resultado){
                Repositorio.Serializar(Repositorio.FILE_NAME);
                Janela.close();
            }
    }
    
    private boolean isTele(TextField input, String text) {
        
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
    private boolean isCC(TextField input, String text) {
        
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

// CHECK BOX
/*
check box

    CheckBox box1 = new CheckBox("opcao 1");
    CheckBox box2 = new CheckBox("Opcao 2");

    // escolhas ja selecionadas quando aberto:
    box2.setSelected(true);

    botao = new Button ("Order Now");
    botao.setOnAction(e -> handleOnptions(box1, box2));

    VBox layout = new VBox(15);
    Layout.setPadding(new Insets (20, 20, 20, 20));
    Layout.getChrildren().addAll(box1, box2, botao);

    private void handleOnptions(CheckBox box1 , CheckBox box2){
        String mensagem= " pedido: \n";

        if(box1.isSelected())
            mensagem += "opcao1\n "
        if(box2.isSelected())
            mensagem += "opcao2\n "
            
            
        System.out.println(mensagem);
            
    }*/