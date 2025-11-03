Perfeito. Aqui está o **README final completo**, formatado para GitHub e incluindo a seção de **Licença e Crédititos**, mantendo o estilo profissional, claro e sem emojis:

---

```markdown
# API Pizzaria

## Sobre o Projeto
O projeto **API Pizzaria** foi desenvolvido como parte da disciplina **Análise Orientada a Objetos**, utilizando o **Spring Boot** para criar uma API REST completa e funcional.  
O sistema simula o funcionamento de uma pizzaria, permitindo o cadastro e gerenciamento de **pizzas**, **clientes**, **pedidos** e **itens do pedido**.

O objetivo é aplicar os conceitos de **Programação Orientada a Objetos** e **arquitetura em camadas (Model, Controller e Repository)**, além de demonstrar o uso prático do Spring Boot com integração ao **banco de dados MySQL**.

---

## Estrutura do Projeto

O projeto segue o padrão de organização do Spring Boot, com as principais pastas:

```

API_PIZZARIA/
├── src/
│   └── main/
│       ├── java/API_PIZZARIA/demo/
│       │   ├── model/          → Contém as classes de modelo (entidades)
│       │   ├── repository/     → Contém as interfaces do JPA Repository
│       │   ├── controller/     → Contém as classes responsáveis pelos endpoints da API
│       │   └── DemoApplication.java  → Classe principal (Main)
│       └── resources/
│           ├── application.properties  → Configurações da aplicação
│           └── static / templates      → (opcional, se houver parte visual)
├── pom.xml
└── README.md

````

---

## Equipe e Responsabilidades

Cada integrante ficou responsável por classes específicas dentro das camadas **Model**, **Repository** e **Controller**, seguindo o padrão de organização adotado no projeto.

| Integrante | Responsabilidade | Classes |
|-------------|------------------|----------|
| Vinícius | Desenvolvimento da entidade Pizza | Pizza (Model, Repository e Controller) |
| Lucas | Desenvolvimento da entidade Pizza | Pizza (Model, Repository e Controller) |
| Mariana | Desenvolvimento da entidade Cliente | Cliente (Model, Repository e Controller) |
| Patríc | Desenvolvimento da entidade Cliente | Cliente (Model, Repository e Controller) |
| Robert | Desenvolvimento da entidade Pedido + Classe Principal (Main) | Pedido (Model, Repository e Controller) + DemoApplication.java |
| Raul | Desenvolvimento da entidade ItemPedido | ItemPedido (Model, Repository e Controller) |

---

## Dependências Utilizadas

O projeto foi configurado pelo [Spring Initializr](https://start.spring.io/) com as seguintes dependências:

- **Spring Boot Starter Web** – Criação da API REST  
- **Spring Boot Starter Data JPA** – Integração com o banco de dados  
- **MySQL Driver** – Conexão com o banco MySQL  
- **Spring Boot DevTools** – Recarregamento automático durante o desenvolvimento  
- **Spring Boot Starter Test** – Suporte para testes unitários  

---

## Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Maven  
- IDE: IntelliJ IDEA / Eclipse / VS Code  

---

## Configuração do Banco de Dados

No arquivo `application.properties`, configure as credenciais do MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/pizzaria
spring.datasource.username=root
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
````

---

## Como Executar o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seuusuario/API_PIZZARIA.git
   ```

2. Acesse a pasta do projeto:

   ```bash
   cd API_PIZZARIA
   ```

3. Abra o projeto na sua IDE (IntelliJ, Eclipse ou VS Code com plugin do Spring Boot)

4. Execute a classe principal:

   ```
   DemoApplication.java
   ```

5. Acesse a API no navegador ou via Postman:

   ```
   http://localhost:8080
   ```

---

## Endpoints (Exemplos)

| Entidade   | Método | Endpoint     | Descrição                             |
| ---------- | ------ | ------------ | ------------------------------------- |
| Pizza      | GET    | /pizzas      | Retorna todas as pizzas cadastradas   |
| Pizza      | POST   | /pizzas      | Cadastra uma nova pizza               |
| Cliente    | GET    | /clientes    | Retorna todos os clientes cadastrados |
| Pedido     | POST   | /pedidos     | Cadastra um novo pedido               |
| ItemPedido | GET    | /itenspedido | Retorna os itens de todos os pedidos  |

*(Os endpoints podem variar conforme a implementação de cada integrante.)*

---

## Observações Importantes

* O projeto segue o padrão **MVC (Model, View, Controller)**.
* Todas as classes possuem comentários curtos e diretos, indicando o responsável e a função.
* A classe `Pedido` possui o método `calcularValorTotal()`, que soma o subtotal dos itens do pedido.
* O projeto será finalizado quando todas as classes dos integrantes forem integradas e testadas em conjunto.

---

## Licença e Créditos

Este projeto foi desenvolvido para fins acadêmicos na **Universidade Unijorge**, na disciplina de **Análise Orientada a Objetos**.
Todos os direitos reservados aos integrantes do grupo.

**Autores:**

* Vinícius
* Lucas
* Mariana
* Patríc
* Robert
* Raul

```

---

Quer que eu adicione uma **imagem de estrutura visual do projeto (em ASCII ou Markdown, tipo diagrama resumido)** no início do README também, para deixar ele com aparência de documentação completa de GitHub?
```

