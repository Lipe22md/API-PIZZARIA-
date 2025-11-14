package API_PIZZARIA.repository;

/*
Responsável: Raul
*/

import API_PIZZARIA.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
