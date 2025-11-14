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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Set<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(Set<Pizza> pizza) {
        this.pizza = pizza;
    }

    public ItemPedido(Long id, int quantidade, double precoUnitario, Set<Pizza> pizza) {
        this.id = id;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.pizza = pizza;
    }
}
