
package bytebank.herdado;

public class SistemaInterno {
    
    private int senha = 2222;
    
    public void autentica2 (Autenticavel fa){
        boolean autenticando = fa.autentica1(this.senha);
        if(autenticando){
            System.out.println("usuario atenticado");
        }else{
            System.out.println("usuario nao autenticado");
        }
    }
}
