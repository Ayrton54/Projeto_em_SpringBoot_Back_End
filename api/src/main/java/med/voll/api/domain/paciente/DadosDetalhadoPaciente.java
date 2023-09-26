package med.voll.api.domain.paciente;

public record DadosDetalhadoPaciente(Long id,String nome,
                                     String email,
                                     String telefone,
                                     String cpf) {
    public DadosDetalhadoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(),paciente.getEmail(),paciente.getTelefone(), paciente.getCpf());
    }
}
