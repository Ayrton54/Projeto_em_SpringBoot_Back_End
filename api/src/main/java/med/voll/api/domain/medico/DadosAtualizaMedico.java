package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.EnderecoAll;

public record DadosAtualizaMedico(
@NotNull
		Long id,
                String nome,
                String telefone,
                EnderecoAll endero){

                }
