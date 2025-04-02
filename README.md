# Chatbot com GPT e Java

**Chatbot com GPT e Java** é um projeto que integra a inteligência artificial do GPT com uma aplicação Java, proporcionando funcionalidades avançadas de chatbot, incluindo fluxo contínuo de mensagens, modo assistente, histórico de conversas, recuperação de conhecimento e chamadas de função.

## Funcionalidades

- **Fluxo Contínuo de Mensagens**: Permite interações em tempo real com o chatbot.
- **Modo Assistente**: Oferece suporte proativo e personalizado aos usuários.
- **Histórico de Conversas**: Mantém registro das interações para referência futura.
- **Recuperação de Conhecimento**: Capacidade de buscar informações relevantes para enriquecer as respostas.
- **Chamadas de Função**: Integração com funções específicas para executar tarefas dentro do contexto da conversa.

## Tecnologias Utilizadas

- **Java**: Linguagem principal para o desenvolvimento da aplicação.
- **GPT**: Modelo de linguagem avançado para processamento de linguagem natural.
- **CSS**: Estilização da interface do usuário.
- **JavaScript**: Funcionalidades dinâmicas no frontend.
- **HTML**: Estruturação das páginas web.

## Estrutura do Projeto

O repositório está organizado da seguinte forma:

- **.mvn/wrapper**: Arquivos relacionados ao Maven Wrapper para facilitar a construção do projeto.
- **others**: Outros arquivos e recursos do projeto.
- **src/main**: Código-fonte principal da aplicação.
- **.gitignore**: Especifica arquivos e diretórios que devem ser ignorados pelo Git.
- **mvnw e mvnw.cmd**: Scripts para execução do Maven Wrapper em ambientes Unix e Windows, respectivamente.
- **pom.xml**: Arquivo de configuração do Maven contendo as dependências e configurações do projeto.

## Configuração e Execução

### Pré-requisitos

- **Java 8 ou superior**: Necessário para compilar e executar a aplicação.
- **Maven**: Utilizado para gerenciar as dependências e construir o projeto.

### Passos para Execução

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/williammian/chatbot.git
   ```

2. **Navegue até o diretório do projeto**:

   ```bash
   cd chatbot
   ```

3. **Instale as dependências e compile o projeto**:

   ```bash
   ./mvnw clean install
   ```

4. **Execute a aplicação**:

   ```bash
   java -jar target/nome-do-artefato.jar
   ```

   Substitua `nome-do-artefato.jar` pelo nome real do arquivo JAR gerado na etapa de compilação.


## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---
