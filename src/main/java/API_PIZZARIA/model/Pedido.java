package API_PIZZARIA.model;

// Classe Pedido
/*
Responsável: Robert
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // cliente dono do pedido
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // lista de itens do pedido
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemPedido> itens;

    // data do pedido
    private LocalDateTime dataHora;

    // valor total
    private Double valorTotal;

    // status do pedido
    private String status;

    // soma os valores dos itens
    public void calcularValorTotal() {
        if (itens != null) {
            valorTotal = itens.stream()
                    // getSubtotal().
                    .mapToDouble(ItemPedido::getSubtotal)
                    .sum();
        } else {
            valorTotal = 0.0;
        }
    }

    // define data e hora na criação
    @PrePersist
    public void definirDataHora() {
        this.dataHora = LocalDateTime.now();
    }


}
