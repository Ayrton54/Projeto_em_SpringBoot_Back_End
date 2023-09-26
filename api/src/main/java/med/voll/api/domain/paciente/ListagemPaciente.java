package med.voll.api.domain.paciente;

public record ListagemPaciente(Long id,String nome,String cpf,String email){

public ListagemPaciente(Paciente paciente){
        this(paciente.getId(),paciente.getNome(),paciente.getCpf(),paciente.getEmail());
        }
        }
