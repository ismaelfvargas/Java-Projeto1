
package bytebank.herdado;

import com.sun.org.apache.xpath.internal.operations.And;

public class BytebankHerdado {

   
    public static void main(String[] args) {
        
        Gerente joao = new Gerente();
        joao.setNome("Joao miguel");
        joao.setSalario(5000);
        joao.setSenha(20393);
        
        Administrador adm1 = new Administrador();
        adm1.setSenha(2934);
        
        System.out.println("Nome: "+joao.getNome());
        System.out.println("Salario do joao: "+joao.getSalario());
        System.out.println("Bonificacao do joao: "+joao.getBonificacao());
        
        System.out.println("");
        
        EditorDeVideo pedro = new EditorDeVideo();
        pedro.setSalario(2500.00);
        
        Designer maria = new Designer();
        pedro.setSalario(2000.00);
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(joao);
        controle.registra(pedro);
        controle.registra(maria);
        
        System.out.println();  
        System.out.println(controle.getSoma());
        
        Administrador adm2 = new Administrador();
        adm2.setSenha(2222);
        
        SistemaInterno si = new SistemaInterno();
        si.autentica2(joao);
        si.autentica2(adm1);
        si.autentica2(adm2);
    }
    
}
