package padroescomportamentais.visitor;

public class Paciente implements Pessoa {

    private int id;
    private String nome;
    private Exame exame;

    public Paciente(int id, String nome, Exame exame) {
        this.id = id;
        this.nome = nome;
        this.exame = exame;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeExame() {
        return this.exame.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPaciente(this);
    }

}
