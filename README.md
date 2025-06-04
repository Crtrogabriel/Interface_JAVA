# Interface_JAVA

# Sistema de Cadastro de Produtos com Interface Gráfica e Tratamento de Exceções

Este projeto é um sistema desktop em Java que permite o cadastro, listagem e gerenciamento de produtos, desenvolvido para atender aos seguintes objetivos:

- Criar uma interface gráfica utilizando a biblioteca Swing.
- Implementar tratamento de exceções para garantir a consistência dos dados cadastrados.
- Utilizar uma lista indexada (`ArrayList`) para armazenar os produtos.

## Funcionalidades

1. **Cadastrar Produto**  
   - Informações: Nome, Preço, Quantidade.  
   - Validações:  
     - O nome não pode ser vazio.  
     - Preço e quantidade devem ser valores numéricos positivos.  
   - Tratamento de exceções para garantir entrada válida.

2. **Listar Produtos Cadastrados**  
   - Exibe os produtos cadastrados em uma área de texto na interface.

3. **Limpar Campos**  
   - Botão para limpar os campos do formulário.  
   - Após três cliques consecutivos, limpa também a lista de produtos cadastrados.

## Tecnologias Utilizadas

- Java SE
- Biblioteca Swing para criação da interface gráfica
- `ArrayList` para armazenamento dos produtos

## Como usar

1. Execute o programa.
2. Insira o nome, preço e quantidade do produto.
3. Clique em **Cadastrar** para adicionar o produto, observando as validações.
4. Clique em **Listar** para visualizar os produtos cadastrados.
5. Clique em **Limpar** para apagar os campos do formulário; após três cliques, a lista é apagada.

## Estrutura do projeto

- `CadastroProdutos.java`: classe principal que implementa a interface gráfica e a lógica do sistema.
- Classe interna `Produto`: representa os produtos com atributos nome, preço e quantidade.

## Requisitos

- JDK 8 ou superior.
- Ambiente compatível com aplicações Swing.

## Autor

Gabriel Castro
