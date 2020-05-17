
package bytebank.herdado;

public class AutenticacaoUtil {
    
    private int senha;
    
    public void setSenha(int senha3){
        this.senha = senha3;
    }        
      
    public boolean autentica1 (int senha2){
        if(this.senha == senha2){
            System.out.println("senha valida");
            return true;
        }else{
            System.out.println("senha invalida");
            return false;
        }
    }
}