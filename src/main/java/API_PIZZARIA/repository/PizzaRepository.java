package API_PIZZARIA.repository;

import API_PIZZARIA.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
Responsável: Robert
*/

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

  
}
