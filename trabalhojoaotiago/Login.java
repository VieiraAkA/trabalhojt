
package trabalhojoaotiago;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import trabalhojoaotiago.Repositorio;

public class Login implements Serializable {
    private String User;
    private String Password;
    private String PriNome;
    private String UltNome;
    private String Email;
    private int CartaoCidadao = 000000000;
    private int Telefone = 000000000;
    private String Morada;
    private double Saldo;
    private Carteira carteira;
    private Repositorio repositorio = Repositorio.getInstance();
    
    public Login() {
        
    }
    
    public Login(String user, String pw, String nome, String ultimonome, String email, int cc, int Tele, String morada){
        this.User = user;
        this.Password = pw;
        this.PriNome = nome;
        this.UltNome = ultimonome;
        this.Email = email;
        this.CartaoCidadao = cc;
        this.Telefone = Tele;
        this.Morada = morada;
        this.Saldo = 0;
        this.carteira = new Carteira();
    }  
    
    
    public String getUser()         {
        return User;
    }
    public String getPassword()     {
        return Password;
    }
    public String getPriNome()      {
        return PriNome;
    }
    public String getUltNome()      {
        return UltNome;
    }
    public String getEmail()        {
        return Email;
    }
    public int getCartaoCidadao()   {
        return CartaoCidadao;
    }
    public int getTelefone()        {
        return Telefone;
    }
    public String getMorada()       {
        return Morada;
    }
    public double getSaldo()        {
        return Saldo;
    }    
    public Carteira getCarteira()   {
        return carteira;
    }
    
    
    public void setUser(String User)                {
        this.User = User;
    }
    public void setPassword(String Password)        {
        this.Password = Password;
    }
    public void setPriNome(String PriNome)          {
        this.PriNome = PriNome;
    }
    public void setUltNome(String UltNome)          {
        this.UltNome = UltNome;
    }
    public void setEmail(String Email)              {
        this.Email = Email;
    }
    public void setCartaoCidadao(int CartaoCidadao) {
        this.CartaoCidadao = CartaoCidadao;
    }
    public void setTelefone(int Telefone)           {
        this.Telefone = Telefone;
    }
    public void setMorada(String Morada)            {
        this.Morada = Morada;
    }
    public void setSaldo(double Saldo)              {
        this.Saldo = Saldo;
    }
    public void setCarteira(Carteira carteira)      {
        this.carteira = carteira;
    }
    
    
    public boolean Existe_user(String user){
        System.out.println("\n\n--------------------------funcaoExiste_user \n");
        //System.out.println( "lista de chaves: " + repositorio.getListaUsers().isEmpty() + " lista de merdas ");
        boolean res = repositorio.getListaUsers().isEmpty();
        if(!res)
            System.out.println("esta vazio");
        
        if(repositorio.getListaUsers().containsKey(user)){
            System.out.println("encontrou user existente \n");
            return true;
        }
        System.out.println("nao encontrou user existente \n");
        return false;
    }    
    
    
    
    public boolean Existe_CartaoCidadao(int cc){
        System.out.println("funcaoCartaoCidadao \n");
        
        for(Login cartao : repositorio.getListaUsers().values() ){
            System.out.println("cicloCartaoCidadao for\n");   
        
            if(cartao.CartaoCidadao == cc){
                System.out.println("encontrou CC\n");
                return true;
            }
        }
        return false;
    }  
    public boolean Existe_telemovel(int tele){
        System.out.println("funcaoCartaoCidadao \n");
        
        for(Login telemovel : repositorio.getListaUsers().values() ){
        System.out.println("cicloCartaoCidadao for\n");   
        
            if(telemovel.Telefone == tele){
                System.out.println("encontrou telemovel\n");
                return true;
            }
        }
        return false;
    }  
    public boolean Existe_Email(String Email){
        System.out.println("funcaoCartaoCidadao \n");
        
        for(Login email : repositorio.getListaUsers().values() ){
        System.out.println("cicloCartaoCidadao for\n");   
        
            if(email.Email.equals(Email)){
                System.out.println("encontrou telemovel\n");
                return true;
            }
        }
        return false;
    } 
    
}
