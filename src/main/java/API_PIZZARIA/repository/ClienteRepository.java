package API_PIZZARIA.repository;

/*
Responsável: Mariana
*/

import API_PIZZARIA.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
  
}


