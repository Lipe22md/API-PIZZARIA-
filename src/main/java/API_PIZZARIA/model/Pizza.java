package API_PIZZARIA.model;

// Classe Pizza
/*
Responsáveis: Vinícius, Lucas
*/

import jakarta.persistence.ManyToMany;

import java.util.Set;

public class Pizza {

    @ManyToMany(mappedBy = "pizza")
    Set<ItemPedido> itemPedidoSet;
}
