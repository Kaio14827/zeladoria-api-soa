# 🏙️ Zeladoria Urbana API
> Uma REST API robusta desenvolvida com **Java 21** e **Spring Boot 3.2.5** para a gestão centralizada e acompanhamento do ciclo de vida de ocorrências de zeladoria urbana. A aplicação permite que cidadãos reportem e a administração pública gerencie problemas de infraestrutura da cidade — como reparos em vias públicas, manutenção de iluminação pública e serviços de limpeza.

## 👥Desenvolvedores
| Turma | Nome | RM |
| :--- | :--- | :--- |
| 3ESPH | Gustavo Viega Martins | RM555885 |
| 3ESPH | Gustavo Yuji Osugi | RM555034 |
| 3ESPH | Kaio Drago Lima Souza | RM556095 |
| 3ESPH | Otávio Santos de Lima Ferrão | RM556452 |
| 3ESPH | Vitor Rivas Cardoso | RM556404 |



## 🛠️ 1. Tecnologias Utilizadas
> *Principais tecnologias, frameworks e bibliotecas que dão suporte à arquitetura, persistência e segurança do sistema.*

* **Java 21** – Linguagem de programação principal (LTS).
* **Spring Boot 3.2.5** – Framework para construção da aplicação corporativa e web.
* **Spring Data JPA & Hibernate** – Camada de persistência e mapeamento objeto-relacional (ORM).
* **H2 Database** – Banco de dados relacional em memória para desenvolvimento e testes rápidos.
* **OpenAPI 3 / Swagger UI** – Especificação e interface gráfica para documentação interativa da API.
* **Maven** – Gerenciamento de dependências e automação de *build*.



## ⚙️ 2. Configuração e Instalação
> *Pré-requisitos e instruções passo a passo para colocar a aplicação em funcionamento localmente.*

### **2.1. Pré-requisitos**
* **Java 21** instalado e configurado nas variáveis de ambiente (`JAVA_HOME`).
* **Git** instalado para clonar o repositório.

### **2.2. Passos para Execução**

**1.** Clonar o repositório:
   ```bash
git clone [https://github.com/seu-usuario/zeladoria-api.git](https://github.com/seu-usuario/zeladoria-api.git)
cd zeladoria-api
   ```

**2.** Executar a aplicação:
Utilize o Maven Wrapper (mvnw) incluído no projeto para iniciar o Spring Boot:
   ```bash
./mvnw spring-boot:run
   ```

(Se estiver utilizando Windows no *Prompt de Comando* / *PowerShell*, utilize `mvnw.bat spring-boot:run` ou execute diretamente pela sua IDE).



## 🗄️ 3. Acesso ao Banco de Dados (H2 Console)

Para consultar e interagir com o banco de dados em memória (*in-memory*) e suas tabelas:

* **URL de Acesso:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:zelatoriadb`
* **Usuário:** `sa`
* **Senha:** *(deixar em branco)*



## 📚 4. Documentação da API (Swagger)

Com a aplicação em execução, é possível testar e interagir com todos os endpoints diretamente pelo navegador por meio da interface do Swagger UI:

* **URL de Acesso:** `http://localhost:8080/swagger-ui.html`



## 📌 5. Endpoints da API (CRUD)

A tabela abaixo resume os principais endpoints disponibilizados pela API para o gerenciamento de ocorrências:
### 🟢 5.1 Cadastrar Ocorrência (`POST /ocorrencias`)
Cadastra uma nova ocorrência no sistema.
```json
{
  "tipo": "VIALIDADE",
  "descricao": "Buraco grande na rua principal atrapalhando o trânsito.",
  "endereco": "Av. Paulista, 1000 - São Paulo",
  "status": "ABERTA"
}
```
<img width="1277" height="715" alt="post-method-log" src="https://github.com/user-attachments/assets/272a17aa-4657-4dae-a1e8-bc6fdbf43646" />

### 🔵 5.2 Listar Ocorrências (`GET /ocorrencias`)
Retorna a listagem de todas as ocorrências registradas.

<img width="1276" height="752" alt="get-method-log" src="https://github.com/user-attachments/assets/7f2eca8f-4195-4a3b-8b33-31106d19615b" />

### 🔵 5.3 Listar Ocorrências po ID (`GET /ocorrencias/{id}`)
Consulta os detalhes de uma ocorrência específica por ID.

<img width="1272" height="700" alt="get-id-method-log" src="https://github.com/user-attachments/assets/d2794f47-3543-446e-a82a-aab07200cf65" />

### 🟠 5.4 Atualizar Ocorrência (`PUT /ocorrencias/{id}`)
Atualiza os dados de uma ocorrência existente.

```json
{
  "tipo": "VIALIDADE",
  "descricao": "Buraco na via pública (Equipa no local)",
  "endereco": "Av. Paulista, 1000 - São Paulo",
  "status": "EM_ANDAMENTO"
}
```
<img width="1278" height="700" alt="put-method-log" src="https://github.com/user-attachments/assets/b8120e7a-f360-4f56-ab97-dab7e47d8fef" />

### 🔴 5.5 Remover Ocorrência (`DELETE /ocorrencias/{id}`)
Remove uma ocorrência do sistema.

<img width="1276" height="757" alt="delete-method-log" src="https://github.com/user-attachments/assets/bbcf6a4b-7e3a-4dcd-9076-694ace8d7804" />




## 🧪 6. Testes Automatizados
> *Validação da suíte de testes unitários e de integração com build aprovado (Build Successful).*

<img width="1153" height="277" alt="testes-automatizados-build" src="https://github.com/user-attachments/assets/ba6eedbd-fda9-4a57-9673-5d8cda16f748" />
