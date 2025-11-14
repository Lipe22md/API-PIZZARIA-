package API_PIZZARIA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import API_PIZZARIA.model.Cliente;
import API_PIZZARIA.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
  
    @Autowired
    private ClienteRepository clienteRepository;

    //CREATE
    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    //READ - listar todos
    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    //READ - buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Long id, @RequestBody Cliente dadosAtualizados) {
        return clienteRepository.findById(id)
                .map(cliente -> {
                    cliente.setNome(dadosAtualizados.getNome());
                    cliente.setEndereco(dadosAtualizados.getEndereco());
                    cliente.setTelefone(dadosAtualizados.getTelefone());
                    cliente.setEmail(dadosAtualizados.getEmail());
                    return ResponseEntity.ok(clienteRepository.save(cliente));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

