package API_PIZZARIA.controller;

import API_PIZZARIA.model.Pedido;
import API_PIZZARIA.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
Responsável: Robert
*/

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository; // repo para CRUD

    // listar todos
    @GetMapping
    public List<Pedido> listar() {
        return pedidoRepository.findAll(); // retorna tudo
    }

    // buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscar(@PathVariable Long id) {
        return pedidoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build()); // se não achar, erro.
    }

    // criar novo pedido
    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        pedido.calcularValorTotal(); // calcula total antes de salvar
        return pedidoRepository.save(pedido); // salva
    }

    // atualizar pedido
    @PutMapping("/{id}")
    public ResponseEntity<Pedido> atualizar(@PathVariable Long id, @RequestBody Pedido pedido) {
        return pedidoRepository.findById(id).map(p -> {
            p.setCliente(pedido.getCliente());
            p.setItens(pedido.getItens());
            p.setStatus(pedido.getStatus());
            p.calcularValorTotal(); // recalcula total
            pedidoRepository.save(p);
            return ResponseEntity.ok(p);
        }).orElse(ResponseEntity.notFound().build());
    }

    // deletar pedido
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return pedidoRepository.findById(id).map(p -> {
            pedidoRepository.delete(p);
            return ResponseEntity.ok().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }

}
