package consulta.projeto.consultas.config.amqp;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Mensagem implements Serializable{
    private byte[] cpf;
    private byte[] crmMedico;
    private LocalDateTime dataConsulta;

    public void setCpf(byte[] cpf) {
        this.cpf = cpf;
    }
    public void setCrmMedico(byte[] crmMedico) {
        this.crmMedico = crmMedico;
    }
    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    
}
