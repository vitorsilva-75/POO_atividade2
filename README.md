# 🛒 Sistema de E-commerce (Java)

Projeto desenvolvido para praticar conceitos de Programação Orientada a Objetos (POO).

## 📌 Funcionalidades

- Cadastro de cliente
- Criação de pedidos
- Adição de itens ao pedido
- Cálculo do valor total
- Regra de frete:
  - Frete grátis para pedidos acima de R$250
  - Caso contrário, taxa fixa de R$25
- Geração de recibo detalhado

## 🧠 Conceitos aplicados

- Encapsulamento
- Relacionamentos entre classes
- Listas (`ArrayList`)
- Métodos e regras de negócio

## 📂 Estrutura do projeto

- `Cliente.java`
- `Pedido.java`
- `ItemPedido.java`
- `Main.java`

## ▶️ Como executar

1. Abra o projeto no IntelliJ
2. Execute a classe `Main`
3. Veja o resultado no console

## 💻 Exemplo de saída

```text
Cliente: Vitor
--------------------------
Produto: Televisão | Qtd: 1 | Subtotal: R$ 1500.00
Produto: Computador | Qtd: 1 | Subtotal: R$ 2000.00
--------------------------
Total: R$ 3500.00
Frete: R$ 0.00
Total do pedido: R$ 3500.00
