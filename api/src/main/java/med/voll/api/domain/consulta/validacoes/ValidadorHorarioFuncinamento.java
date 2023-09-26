package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
@Component
public class ValidadorHorarioFuncinamento  implements ValidadorAgendamentoDeConsulta{
    public void validar(DadosAgendamentoConsulta dados){
        var dataConsulta = dados.data();
        var domingo= dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaabertura = dataConsulta.getHour() < 7;
        var DecpoisdoEncerramento = dataConsulta.getHour() > 18;

        if(domingo || antesDaabertura || DecpoisdoEncerramento){
            throw new ValidacaoException("Consulta fora do horario permitido");
        }
    }
}
