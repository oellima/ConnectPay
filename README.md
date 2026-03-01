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
```
Requisição POST (Criando Pagamento)
![postmanResponse](https://github.com/user-attachments/assets/432d4743-c1a0-4e27-a8cc-a82ab083976d)

Listagem GET (Consultando Pagamentos)
![postmanResponseGet](https://github.com/user-attachments/assets/074492c9-9318-4174-b696-281dcec051a9)

Banco de Dados H2 Console
![H2](https://github.com/user-attachments/assets/494d9f30-1f1f-4606-8868-6c8bd89c4888)
