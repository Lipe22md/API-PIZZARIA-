package API_PIZZARIA.model; 
 
import jakarta.persistence.*; 
import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 
 
// Responsável: VInícius, Lucas 
 
@Entity 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Table(name = "pizza") 
public class Pizza { 
 
   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
   private Long id; 
 
   // Nome da pizza (ex: Calabresa, Frango com Catupiry) 
   private String nome; 
 
   // Tamanho (ex: pequena, média, grande) 
   private String tamanho; 
 
   // Preço da pizza 
   private Double preco; 
 
   // Sabor ou descrição adicional 
   private String descricao; 
 
   // Disponível para venda ou não 
   private Boolean disponivel; 
} 
