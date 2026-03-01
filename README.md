# 💸 ConnectPay - API de Pagamentos

O **ConnectPay** é uma API REST robusta e simplificada desenvolvida com **Spring Boot** para gerenciar o fluxo de pagamentos. O projeto utiliza persistência de dados com JPA e um banco de dados em memória para facilitar o desenvolvimento e testes rápidos.

---

## 🚀 Tecnologias Utilizadas

* **Java 21**: Linguagem principal.
* **Spring Boot 3.2.2**: Framework para agilizar o desenvolvimento.
* **Spring Data JPA**: Para abstração da camada de persistência.
* **H2 Database**: Banco de dados em memória para desenvolvimento.
* **Lombok**: Para redução de código boilerplate (Getters/Setters).
* **Bean Validation**: Para garantir a integridade dos dados de entrada.
* **Maven**: Gerenciador de dependências.

---

## 🛠️ Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SEU_USUARIO/ConnectPay.git](https://github.com/SEU_USUARIO/ConnectPay.git)
    ```
2.  **Importe no IntelliJ:**
    * Abra o IntelliJ IDEA.
    * Vá em `File` -> `Open` e selecione o arquivo `pom.xml`.
3.  **Sincronize o Maven:**
    * Aguarde o download das dependências.
4.  **Execute a aplicação:**
    * Localize a classe `ConnectPayApplication` e clique no botão **Run**.

O servidor iniciará por padrão na porta **8080**.

---

## 🔌 Endpoints da API

Abaixo estão os principais endpoints disponíveis:

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/pagamentos` | Lista todos os pagamentos cadastrados. |
| `POST` | `/pagamentos` | Cria um novo pagamento (Status inicial: PENDENTE). |
| `DELETE` | `/pagamentos/{id}` | Remove um pagamento pelo ID. |

### Exemplo de JSON para Criação (POST):
```json
{
  "favorecido": "João Silva",
  "codigoBarras": "23793381286008301352856000063301",
  "valor": 250.75
}

![H2](https://github.com/user-attachments/assets/dc695810-aef1-49f9-85a6-2c8d0e8e275f)
![postmanResponseGet](https://github.com/user-attachments/assets/6b2ca4cd-67b4-4ae6-b6dc-23fdb6993543)
![postmanResponse](https://github.com/user-attachments/assets/f8dec6ba-adde-47d1-b170-574f60bd017d)
