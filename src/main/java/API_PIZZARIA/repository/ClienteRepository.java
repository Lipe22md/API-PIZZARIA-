package API_PIZZARIA.repository;

/*
Responsável: Mariana
*/

import org.springframework.data.jpa.repository.JpaRepository;
import com.API_PIZZARIA.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
  
}


