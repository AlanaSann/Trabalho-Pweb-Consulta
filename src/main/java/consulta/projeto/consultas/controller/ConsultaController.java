package consulta.projeto.consultas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import consulta.projeto.consultas.form.ConsultaFormulario;
import consulta.projeto.consultas.model.Consulta;
import consulta.projeto.consultas.service.ConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
    @Autowired  //(injetar)"instanciar" o consulta
    private ConsultaService consultaService;

    @PostMapping("/agendar")
    public Consulta agendar(@RequestBody ConsultaFormulario consulta){ 
        consultaService.consultaValidacao(consulta);
        return consultaService.agendarConsulta(consulta);
    }
}
