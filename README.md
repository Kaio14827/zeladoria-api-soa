# 🏙️ Zeladoria Urbana API

Uma REST API robusta desenvolvida com **Java 21** e **Spring Boot 3.2.5** para a gestão centralizada e acompanhamento do ciclo de vida de ocorrências de zeladoria urbana. A aplicação permite que cidadãos reportem e a administração pública gerencie problemas de infraestrutura da cidade — como reparos em vias públicas, manutenção de iluminação pública e serviços de limpeza.
---


## 👥Desenvolvedores
| Turma | Nome | RM |
| :--- | :--- | :--- |
| 3ESPH | Gustavo Viega Martins | RM555885 |
| 3ESPH | Gustavo Yuji Osugi | RM555034 |
| 3ESPH | Kaio Drago Lima Souza | RM556095 |
| 3ESPH | Otávio Santos de Lima Ferrão | RM556452 |
| 3ESPH | Vitor Rivas Cardoso | RM556404 |


## ✨ 2. Funcionalidades (Features)
> *Módulos essenciais, regras de negócio e requisitos implementados na API.*


## 🛠 3. Tecnologias Utilizadas
> *Tecnologias e bibliotecas que dão suporte à arquitetura e segurança do sistema.*

* **Java 21**
* **Spring Boot 3.2.5**
* **Spring Data JPA & Hibernate** (Persistência de Dados)
* **H2 Database** (Base de dados relacional em memória)
* **OpenAPI 3 / Swagger UI** (Documentação da API)
* **Maven** (Gestão de dependências e build)

## ⚙️ 4. Configuração e Instalação
> *Pré-requisitos e instruções para colocar a aplicação em funcionamento.*


### **4.1** Passos para execução

**1.** **Clonar o repositório:**
   ```bash
   git clone [https://github.com/seu-usuario/zeladoria-api.git](https://github.com/seu-usuario/zeladoria-api.git)
   cd zeladoria-api
   ```

**2.** Executar a aplicação:
Via terminal:
   ```bash
   ./mvnw spring-boot:run
   ```

## 🗄️ 5. Acesso ao Banco de Dados (H2 Console)
Para visualizar a base de dados em memória e as tabelas criadas automaticamente:

- URL: `http://localhost:8080/h2-console`

- JDBC URL: `jdbc:h2:mem:zelatoriadb`

- User: `sa`

- Password: *(deixar em branco)*



## 📚 6. Documentação da API (Swagger)
Com a aplicação em execução, podes testar todos os endpoints diretamente pelo navegador acedendo à interface do Swagger:

👉 Swagger UI: http://localhost:8080/swagger-ui.html




## 📌 6. Endpoints da API (CRUD)
| Método | Endpoint | Descrição | Status HTTP de Sucesso |
| :--- | :--- | :--- | :--- |
| **POST** | `/ocorrencias` | Cria uma nova ocorrência[cite: 1] | `201 Created` |
| **GET** | `/ocorrencias` | Lista todas as ocorrências registadas[cite: 1] | `200 OK` |
| **GET** | `/ocorrencias/{id}` | Procura uma ocorrência por ID[cite: 1] | `200 OK` |
| **PUT** | `/ocorrencias/{id}` | Atualiza os dados de uma ocorrência existente | `200 OK` |
| **DELETE** | `/ocorrencias/{id}` | Elimina uma ocorrência da base de dados[cite: 1] | `204 No Content` |

## 🧪 Testes Automatizados
