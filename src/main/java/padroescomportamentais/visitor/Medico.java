package padroescomportamentais.visitor;

public class Medico implements Pessoa {

    private int id;
    private String nome;
    private String especializacao;

    public Medico(int id, String nome, String especializacao) {
        this.id = id;
        this.nome = nome;
        this.especializacao = especializacao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMedico(this);
    }

}
