package API_PIZZARIA.controller;
import API_PIZZARIA.model.Pizza;
import API_PIZZARIA.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
Responsáveis: Vinícius, Lucas
*/

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    

    @GetMapping
    public List<Pizza> listarTodas() {
        return pizzaRepository.findAll();                                           // Retorna todas as pizzas cadastradas no banco de dados
    }

  

    @GetMapping("/{id}")
    public ResponseEntity<Pizza> buscarPorId(@PathVariable Long id) {
        Optional<Pizza> pizza = pizzaRepository.findById(id);
        return pizza.map(ResponseEntity::ok)                                        // Busca uma pizza específica por ID
                .orElse(ResponseEntity.notFound().build());
    }

   

    @PostMapping
    public ResponseEntity<Pizza> criarPizza(@RequestBody Pizza novaPizza) {
        Pizza salvaPizza = pizzaRepository.save(novaPizza);                         // Cria uma nova pizza através do RequestBody
        return ResponseEntity.ok(salvaPizza);
    }

   

    @PutMapping("/{id}")
    public ResponseEntity<Pizza> atualizarPizza(@PathVariable Long id, @RequestBody Pizza pizzaAtualizada) {
        return pizzaRepository.findById(id)
                .map(pizzaExistente -> {
                    pizzaExistente.setNome(pizzaAtualizada.getNome());
                    pizzaExistente.setTamanho(pizzaAtualizada.getTamanho());
                    pizzaExistente.setPreco(pizzaAtualizada.getPreco());            // Atualiza a lista de pizzas caso os campos Nome,Tamanho,Preço,Descrição existam
                    pizzaExistente.setDescricao(pizzaAtualizada.getDescricao());
                    Pizza pizzaSalva = pizzaRepository.save(pizzaExistente);
                    return ResponseEntity.ok(pizzaSalva);
                })
                .orElse(ResponseEntity.notFound().build());
    }

   

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPizza(@PathVariable Long id) {
        if (pizzaRepository.existsById(id)) {
            pizzaRepository.deleteById(id);
            return ResponseEntity.noContent().build();                              // Verifica se a pizza existe e a deleta
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
