# 💳 Sistema de Caixa Eletrônico em Java

Este projeto é uma aplicação simples de terminal desenvolvida em **Java**, com foco em **Programação Orientada a Objetos (POO)**. O sistema simula operações básicas de um caixa eletrônico, como consulta de saldo, depósito e saque.

---

## 📌 Objetivo

Migrar uma lógica procedural para uma abordagem orientada a objetos, utilizando uma classe `ContaBancaria` com atributos e métodos que representam o comportamento de uma conta real.

---

## 🧱 Estrutura do Projeto

O projeto é composto por:

- `Principal.java` → Classe principal com o método `main`, responsável pela interação com o usuário  
- `ContaBancaria.java` → Classe que representa a conta bancária  

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)  
- Encapsulamento  
- Uso de construtores  
- Arrays de objetos  
- Estruturas de controle (`if`, `for`, `switch`, `do-while`)  
- Entrada de dados com `Scanner`  

---

## 🏦 Funcionalidades

Após fazer login com o número da conta, o usuário pode:

- 🔎 Consultar saldo  
- 💰 Realizar depósitos  
- 💸 Realizar saques  
- 🚪 Sair do sistema  

---

## ⚙️ Regras de Negócio

O sistema implementa as seguintes regras:

- ✅ Limite máximo de **3 saques diários**  
- 🚫 Ao tentar um 4º saque:  
  `"Limite de saques diários atingido"`  
- 💵 Valor máximo por saque: **R$ 1.000,00**  
- 🎁 Toda nova conta recebe um **bônus de R$ 50,00** automaticamente no construtor  

---

## 👤 Contas de Teste

O sistema já inicia com 3 contas cadastradas:

| Número | Titular  | Saldo Inicial |
|--------|----------|--------------|
| 1234   | Vitor    | R$ 0,00      |
| 4321   | Claudio  | R$ 100,00    |
| 2341   | Rafael   | R$ 1000,00   |

---
