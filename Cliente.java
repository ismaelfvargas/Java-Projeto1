
package bytebank.herdado;
//contrato autenticavel
    //quem assinar esse contrato, precisa implementar
        //metodo setSenha 
        //metodo autentica
public class Cliente implements Autenticavel{
   
    private AutenticacaoUtil util;
    
    public Cliente(){
        this.util = new AutenticacaoUtil();
    }
    
    @Override
    public void setSenha(int senha3){
        this.util.setSenha(senha3);
    }        
    
    @Override
    public boolean autentica1 (int senha2){
        return this.util.autentica1(senha2);       
    }
    
}
