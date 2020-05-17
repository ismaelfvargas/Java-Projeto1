
package bytebank.herdado;

///Gerente é um funcionario, Gerente herda da class funcionario, assina o contrato Autenticado(interface)
public class Gerente extends Funcionario implements Autenticavel{
    
    private AutenticacaoUtil util;
    
    @Override
    public double getBonificacao(){
        System.out.println("Chamando o método bonificacao do GERENTE");
        return + 300;
    } 
    
    public Gerente(){
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
    
    

