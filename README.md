# Motivation App

**Motivation** é um aplicativo simples e eficaz desenvolvido em **Kotlin** para fornecer **frases motivacionais personalizadas** aos seus usuários. O app permite que os usuários escolham categorias específicas para receber frases inspiradoras e as compartilhem para se manterem motivados ao longo do dia.

---

## Funcionalidades Principais

### Tela Inicial (MainActivity)
- **Exibição de Frases Motivacionais**: O app exibe frases motivacionais toda vez que o usuário clica no botão **"Nova Frase"**.
- **Seleção de Categorias**: O usuário pode escolher entre três categorias de frases:
  - **Todas**
  - **Feliz**
  - **Ensolarado**
  
  A categoria selecionada altera o tipo de frase exibida.

- **Boas-vindas Personalizadas**: Após o cadastro, o app exibe uma saudação personalizada ao usuário com base no nome armazenado nas **SharedPreferences**.

### Tela de Cadastro (UserActivity)
- **Armazenamento do Nome do Usuário**: O app solicita ao usuário que insira seu nome, o qual é armazenado para personalização.
- **Validação de Entrada**: Caso o campo de nome esteja vazio, o app exibe uma mensagem de erro para o usuário.
- **Redirecionamento**: Após o cadastro do nome, o usuário é redirecionado automaticamente para a tela principal (MainActivity), onde as frases motivacionais começam a ser exibidas.

---

## Como Funciona o App

1. **Cadastro do Usuário**: Ao abrir o aplicativo pela primeira vez, o usuário será direcionado para a tela de cadastro (UserActivity). O nome do usuário será armazenado localmente.
   
2. **Seleção de Categoria**: O usuário pode selecionar uma das categorias de frases disponíveis (geral, feliz ou ensolarado) ao tocar nos ícones correspondentes.
   
3. **Exibição de Frases**: O botão **"Nova Frase"** exibe uma nova frase motivacional com base na categoria selecionada.
   
4. **Persistência de Dados**: O nome do usuário é salvo nas **SharedPreferences**, e a saudação personalizada é exibida cada vez que o app for aberto.

---

## Tecnologias Utilizadas

- **Kotlin**: Linguagem utilizada para o desenvolvimento do app.
- **SharedPreferences**: Para armazenar e recuperar o nome do usuário.
- **Edge-to-Edge UI**: Interface responsiva que aproveita toda a tela do dispositivo.
- **Mock Data**: Frases motivacionais são carregadas de uma fonte de dados mock (simulando um banco de dados ou API).

---

## Fluxo de Uso

1. **Cadastro de Usuário**:
   - O usuário insere seu nome, que é armazenado para futuras interações.
   
2. **Seleção de Categoria**:
   - O usuário escolhe entre **"Todas"**, **"Feliz"** ou **"Ensolarado"** tocando nos ícones correspondentes.
   
3. **Exibição de Frases**:
   - Ao clicar em **"Nova Frase"**, o app exibe uma nova frase motivacional baseada na categoria escolhida.
   
4. **Persistência**:
   - O nome do usuário é salvo para exibir uma saudação personalizada sempre que o app for aberto.

---

## Pontos de Melhoria ou Funcionalidades Futuras

- **Integração com Banco de Dados**: A integração com um banco de dados real pode ser implementada para expandir a variedade de frases motivacionais.
  
- **Notificações Push**: Implementar notificações push para enviar uma frase motivacional para o usuário em horários específicos.
  
- **Interface Mais Interativa**: A interface pode ser aprimorada com animações e transições dinâmicas entre as categorias de frases.

---

## Screenshots

*(Adicione imagens das telas do app aqui)*

---

## Instalação e Execução

1. Clone o repositório:
    ```bash
    git clone https://github.com/usuario/motivation-app.git
    ```

2. Abra o projeto no Android Studio.

3. Compile e execute no seu dispositivo ou emulador.

---

## Contribuições

Sinta-se à vontade para contribuir com melhorias e sugestões para o aplicativo. Abra uma **issue** ou envie um **pull request**.
