package API_PIZZARIA.controller;

/*
Responsável: Raul
*/

import API_PIZZARIA.model.ItemPedido;
import API_PIZZARIA.repository.ItemPedidoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/itempedidos")
public class ItemPedidoController {
    private ItemPedidoRepository itemPedidoRepository;

    @PostMapping
    public ItemPedido criarItemPedido(@RequestBody ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    @GetMapping
    public List<ItemPedido> listarItemPedido() {
        return itemPedidoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemPedido> buscarPorId(@PathVariable Long id) {
        Optional<ItemPedido> itemPedido = itemPedidoRepository.findById(id);
        return itemPedido.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemPedido> atualizarItemPedido(@PathVariable Long id, @RequestBody ItemPedido dadosAtualizados) {
        return itemPedidoRepository.findById(id)
                .map(itemPedido -> {
                    itemPedido.setQuantidade(dadosAtualizados.getQuantidade());
                    itemPedido.setPrecoUnitario(dadosAtualizados.getPrecoUnitario());
                    return ResponseEntity.ok(itemPedidoRepository.save(itemPedido));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarItemPedido(@PathVariable Long id) {
        if (itemPedidoRepository.existsById(id)) {
            itemPedidoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

