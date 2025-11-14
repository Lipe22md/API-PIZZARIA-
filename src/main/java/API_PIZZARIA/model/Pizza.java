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

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getTamanho() {
      return tamanho;
   }

   public void setTamanho(String tamanho) {
      this.tamanho = tamanho;
   }

   public Double getPreco() {
      return preco;
   }

   public void setPreco(Double preco) {
      this.preco = preco;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public Boolean getDisponivel() {
      return disponivel;
   }

   public void setDisponivel(Boolean disponivel) {
      this.disponivel = disponivel;
   }
}
