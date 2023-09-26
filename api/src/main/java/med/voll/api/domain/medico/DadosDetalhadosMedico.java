package med.voll.api.domain.medico;

public record DadosDetalhadosMedico(Long id, String nome, String email, String crm,String telefone,
                                    EspecialidadeMedico especialidade) {
     public  DadosDetalhadosMedico(Medico medico) {
         this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getTelefone(),
                 medico.getEspecialidade());
     }
}
