
package bytebank.herdado;

//Administrador é um funcionario, Administrador herda da class funcionario, assina o contrato Autenticado(interface)
public class Administrador extends Funcionario implements Autenticavel{

    private AutenticacaoUtil util;
    
    @Override
    public double getBonificacao(){
        System.out.println("Chamando o método bonificacao do GERENTE");
        return + 50;
    } 
    
    public Administrador(){
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

