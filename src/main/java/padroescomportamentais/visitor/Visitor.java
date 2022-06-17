package padroescomportamentais.visitor;

public interface Visitor {

    String exibirPaciente(Paciente paciente);
    String exibirMedico(Medico medico);
    String exibirFuncionario(Funcionario funcionario);

}
