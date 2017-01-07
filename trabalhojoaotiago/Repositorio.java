
package trabalhojoaotiago;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Repositorio implements Serializable  {
    
    public static String FILE_NAME = "ficheiro.bin";
   
    private static Repositorio instance;
    private Map<String, Login> ListaUsers = new HashMap<>();
//           = new HashMap<>();
    //                          private Carteira carteira;
    
    
    private Repositorio(boolean cir){}
    private Repositorio(){
        try {
            Desserializar(FILE_NAME);
//            throw new Exception();
        } catch (Exception ex) {
//           quando o ficheiro nao existir ou estiver corrompido
            this.ListaUsers = new HashMap<>(); //   isto faz de conta que o ficheiro existe(vazio);
        }
    }
    
    public static Repositorio getInstance(){

        if(instance == null){
            instance = new Repositorio();
        }
        return instance;
    }
    
    public Map<String, Login> getListaUsers() {
        System.out.println("Teste");
        return this.ListaUsers;
               
    }
    
    public void setListaUsers(Map<String, Login> ListaUsers) {
        this.ListaUsers = ListaUsers;
    }
    
    
    /**
     * Guardar info
     * @param filename
     */
    public static void Serializar(String filename)                              {
        // nao esquecer exepctions
        // Serializar um objeto para ficheiro
        try{
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            Repositorio myInstance = Repositorio.getInstance();
            out.writeObject(myInstance);  //AQUI
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in " + filename);
        }catch (IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
            
    }
    public static void Desserializar(String filename) throws Exception  {

            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            instance = (Repositorio) in.readObject();
            in.close();
            fileIn.close();
            System.out.printf("Desserialized data from file " + filename + "\n");
        
    }
}
