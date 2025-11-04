# Projeto Gestão de Vagas

API para um sistema de gestão de vagas, onde empresas podem publicar oportunidades e candidatos podem se candidatar.

## ✨ Tecnologias Utilizadas

*   Java 17+
*   Spring Boot 3
*   Spring Web
*   Spring Security (para autenticação e autorização)
*   Spring Data JPA (para persistência de dados)
*   Maven (gerenciador de dependências)
*   Jakarta Bean Validation (para validação de dados de entrada)

## 🚀 Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/seu-usuario/gestao_vagas.git
    cd gestao_vagas
    ```

2.  **Configure o Banco de Dados:**
    *   Configure suas credenciais de banco de dados no arquivo `src/main/resources/application.properties`.

3.  **Instale as dependências e execute:**
    *   Utilize o Maven para rodar a aplicação:
    ```bash
    ./mvnw spring-boot:run
    ```
    A API estará disponível em `http://localhost:8080`.

## 📂 Estrutura do Projeto

O projeto está organizado em módulos para separar as responsabilidades:

*   `modules/company`: Contém toda a lógica relacionada às empresas (controllers, entidades, casos de uso, repositórios).
*   `modules/candidate`: Contém toda a lógica relacionada aos candidatos.

## Endpoints da API

A seguir estão os endpoints disponíveis na API.

### Autenticação

*   **Empresa:** `POST /company/auth`
*   **Candidato:** `POST /candidate/auth`

### Empresa

*   `POST /company/`: Cria uma nova empresa.
*   `POST /company/job/`: Cria uma nova vaga (requer autenticação de empresa).

### Candidato

*   `POST /candidate/`: Cria um novo candidato.
*   `GET /candidate/`: Retorna o perfil do candidato (requer autenticação de candidato).

