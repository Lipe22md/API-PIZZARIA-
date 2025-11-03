````markdown
# API Pizzaria

## Sobre
Projeto desenvolvido na disciplina de Análise Orientada a Objetos da UniJorge.  
É uma API REST para gerenciar pizzas, clientes, pedidos e itens de pedido, desenvolvida em **Java** com **Spring Boot** e banco **MySQL**.

---

## Estrutura do Projeto
- `model/` → Classes de entidade (Pizza, Cliente, Pedido, ItemPedido)  
- `repository/` → Interfaces JPA Repository  
- `controller/` → Controladores REST  
- `DemoApplication.java` → Classe principal para iniciar a aplicação  

---

## Equipe e Responsabilidades

| Integrante | Classes |
|------------|---------|
| Vinícius | Pizza (Model, Repository, Controller) |
| Lucas | Pizza (Model, Repository, Controller) |
| Mariana | Cliente (Model, Repository, Controller) |
| Patríc | Cliente (Model, Repository, Controller) |
| Robert | Pedido (Model, Repository, Controller) + DemoApplication.java |
| Raul | ItemPedido (Model, Repository, Controller) |

---

## Tecnologias e Dependências
- Java 17  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Maven  
- Lombok  
- Spring Boot DevTools  

---

## Configuração do Banco
No arquivo `application.properties`, configure o MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/pizzaria
spring.datasource.username=root
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
````

---

## Como Executar

1. Clonar o repositório:

   ```bash
   git clone https://github.com/seuusuario/API_PIZZARIA.git
   ```
2. Abrir na IDE (IntelliJ, Eclipse ou VS Code)
3. Executar `DemoApplication.java`
4. Testar endpoints via navegador ou Postman:

   ```
   http://localhost:8080
   ```

---

## Observações

* Cada integrante é responsável por suas classes.
* A aplicação funciona totalmente quando todas as classes do grupo estiverem implementadas.
* O método `calcularValorTotal()` da classe `Pedido` soma automaticamente os valores dos itens.

---

## Licença

Projeto acadêmico desenvolvido para fins de estudo na UniJorge. Todos os direitos reservados aos integrantes do grupo.

```
