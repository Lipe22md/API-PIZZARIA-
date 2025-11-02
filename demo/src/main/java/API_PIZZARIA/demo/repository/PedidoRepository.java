package API_PIZZARIA.demo.repository;

import API_PIZZARIA.demo.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
Responsável: Robert
*/

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // JpaRepository já fornece:
    // findAll(), findById(id), save(entidade), delete(entidade)
    // Tenho que espera os outros.
}

