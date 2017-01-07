/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojoaotiago;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import projecto.Projecto;

/**
 *
 * @author miguel
 */
public class Repository implements Serializable{
    
    public Map<String, Login> ListaUsers;

    public Repository() {
        ListaUsers = new HashMap<>();
    }

    public Map<String, Login> getListaUsers() {
        return ListaUsers;
    }

    public void setListaUsers(Map<String, Login> ListaUsers) {
        this.ListaUsers = ListaUsers;
    }
    
    /**
     * Guardar info
     * @param filename
     */
    public void Serializar()                              {
        // nao esquecer exepctions
        // Serializar um objeto para ficheiro
        String filename = Projecto.filename;
        try{
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);  //AQUI
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in " + filename + "\n");
        }catch (IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
            
    }
    public static Repository Desserializar(){
        FileInputStream fileIn;
        Repository rep = new Repository();
        String filename = Projecto.filename;
        try {
            fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            rep = (Repository) in.readObject();
            in.close();
            fileIn.close();
            System.out.printf("Desserialized data from file " + filename + "\n");
        } catch (Exception ex) {
            System.out.println("Erro ao ler ficheiro");
        }
        
        return rep;
    }
    
}
