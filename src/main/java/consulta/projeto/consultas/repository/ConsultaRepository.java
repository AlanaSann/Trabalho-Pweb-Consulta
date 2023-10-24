package consulta.projeto.consultas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import consulta.projeto.consultas.model.Consulta;
// Conecta o banco com a aplicação
@Repository
public interface ConsultaRepository extends JpaRepository<Consulta,Long>{
    
}
