package padroescomportamentais.visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirPaciente(Paciente paciente) {
        return "Paciente{" +
                "id=" + paciente.getId() +
                ", nome='" + paciente.getNome() + '\'' +
                ", exame=" + paciente.getNomeExame() +
                '}';
    }

    @Override
    public String exibirMedico(Medico medico) {
        return "Medico{" +
                "id=" + medico.getId() +
                ", nome='" + medico.getNome() + '\'' +
                ", especializacao='" + medico.getEspecializacao() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "id=" + funcionario.getId() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}
