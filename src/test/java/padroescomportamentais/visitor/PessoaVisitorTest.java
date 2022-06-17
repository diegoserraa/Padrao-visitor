package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirPaciente() {
        Paciente paciente = new Paciente(1, "Beatriz", new Exame("Exame de sangue"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Paciente{id=1, nome='Beatriz', exame=Exame de sangue}", visitor.exibir(paciente));
    }

    @Test
    void deveExibirProfessor() {
        Medico medico = new Medico(1, "Paula", "Cirurgião");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Medico{id=1, nome='Paula', especializacao='Cirurgião'}", visitor.exibir(medico));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Vitoria", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{id=1, nome='Vitoria', salario=5000.0}", visitor.exibir(funcionario));
    }

}