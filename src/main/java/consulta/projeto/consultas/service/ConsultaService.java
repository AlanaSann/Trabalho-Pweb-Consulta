package consulta.projeto.consultas.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import consulta.projeto.consultas.form.ConsultaFormulario;
import consulta.projeto.consultas.model.Consulta;
import consulta.projeto.consultas.repository.ConsultaRepository;
import consulta.projeto.consultas.validation.AgendarValidacao;
import consulta.projeto.consultas.validation.Validacao;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private ModelMapper conversor;
    
    public Consulta agendarConsulta(ConsultaFormulario consulta){
        return consultaRepository.save(conversor.map(consulta, Consulta.class));
    }

    public void consultaValidacao(ConsultaFormulario consulta){
        Validacao validacao = new AgendarValidacao(consulta);
        validacao.validar();
    }
}
