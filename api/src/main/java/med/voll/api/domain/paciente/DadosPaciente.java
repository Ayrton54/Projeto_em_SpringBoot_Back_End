package med.voll.api.domain.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.EnderecoAll;

public record DadosPaciente(
@NotBlank
		String nome,
@NotBlank
@Email
        String email,

        String telefone,
@NotBlank
@Pattern(regexp = "\\d{11}")
        String cpf,

EnderecoAll endereco){

                }
