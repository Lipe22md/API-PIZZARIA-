package API_PIZZARIA.model;

// Classe ItemPedido
/*
Responsável: Raul
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantidade;
    private double precoUnitario;
    @ManyToMany
    Set<Pizza> pizza;

    public double getSubtotal() {
        return precoUnitario * quantidade;
    }
}
