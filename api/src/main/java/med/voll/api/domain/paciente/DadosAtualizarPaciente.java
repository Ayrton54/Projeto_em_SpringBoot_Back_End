package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.EnderecoAll;

public record DadosAtualizarPaciente(
@NotNull
		Long id,
                String nome,
                String email,
                String telefone,
                String cpf,
                EnderecoAll endeco
                ){

                }
