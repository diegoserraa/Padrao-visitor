package padroescomportamentais.visitor;

public class Funcionario implements Pessoa {

    private int id;
    private String nome;
    private float salario;

    public Funcionario(int id, String nome, float salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirFuncionario(this);
    }

}
