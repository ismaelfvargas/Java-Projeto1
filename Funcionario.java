
package bytebank.herdado;

//nao pode instanciar essa classe, pq é abstrata
public abstract class Funcionario {
    private String nome;
    private int cpf;
    private double salario;
    
    //metodo sem corpo, nao ha implementacao
    public abstract double getBonificacao();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
