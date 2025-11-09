package API_PIZZARIA.repository;

import API_PIZZARIA.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
Responsável: Robert, Patríc 
*/

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // JpaRepository já fornece:
    // findAll(), findById(id), save(entidade), delete(entidade)
    // Tenho que espera os outros.
}

