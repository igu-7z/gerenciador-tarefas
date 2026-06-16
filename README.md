# Gerenciador de Tarefas - API REST

## 📋 Sobre o Projeto
Esta é uma API REST funcional desenvolvida para o gerenciamento de tarefas diárias. O foco principal deste projeto foi aplicar os conceitos fundamentais de Programação Orientada a Objetos (POO), persistência de dados em um banco relacional e a estruturação de um CRUD completo.

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **PostgreSQL** (Banco de Dados Relacional)
- **Maven** (Gerenciador de Dependências)

## 🛣️ Rotas da API

As requisições devem ser feitas para o endereço local: `http://localhost:8080/tasks`

| Método | Rota | Descrição |
| :--- | :--- | :--- |
| **POST** | `/tasks` | Cria uma nova tarefa no banco de dados |
| **GET** | `/tasks` | Lista todas as tarefas cadastradas |
| **PUT** | `/tasks/{id}` | Atualiza uma tarefa existente com base no ID |
| **DELETE** | `/tasks/{id}` | Remove uma tarefa do banco com base no ID |

### 📦 Formato do JSON para Criação/Atualização
Ao enviar uma requisição do tipo `POST` ou `PUT`, o corpo (Body) deve conter o seguinte formato em JSON:

```json
{
    "title": "Título da sua tarefa",
    "description": "Descrição detalhada do que precisa ser feito"
}
```

## 🚀 Como Executar o Projeto

### Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina:
- **Java JDK 17** ou superior
- **PostgreSQL**
- Uma IDE de sua preferência (Recomendado: **IntelliJ IDEA**)

### 💻 Rodando a Aplicação
1. Clone este repositório em sua máquina local:
   ```bash
   git clone https://github.com/igu-7z/gerenciador-tarefas.git

2. Abra o projeto na sua IDE.

3. Certifique-se de que o seu PostgreSQL está ativo.

4. Abra o arquivo src/main/resources/application.properties e ajuste as credenciais do banco de dados (usuário e senha).

5. Execute a classe principal GerenciadorTarefasApplication.java.

