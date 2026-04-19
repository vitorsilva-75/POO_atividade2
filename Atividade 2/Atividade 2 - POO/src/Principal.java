/*2 - Classes e Objetos
Exercício: Criando a classe ContaBancaria.*
Detalhes: Migrar a lógica do exercício anterior para uma estrutura Orientada a Objetos.
Criar a classe com os atributos numero, titular e saldo, e os métodos depositar() e sacar().
Instanciar no main.
Regra de Negócio:
- Todas as regras do exercício anterior devem ser seguidas também
{- O caixa eletrônico tem um limite máximo de 3 saques diários. Se o usuário tentar um 4o
saque, o sistema deve bloquear a operação informando "Limite de saques diários
atingido".
- O valor máximo por saque é de R$ 1.000,00, por questões de segurança.}

- Toda conta nova aberta ganha um bônus de boas-vindas de R$ 50,00 (isso deve ser
garantido no momento da criação do objeto/construtor).*/

import java.util.Scanner;

public class Principal {
    static void main(String[] args) {

        //Criação de variaveis
        int numeroOpcao = 0;

        //Instancia de contas bancárias
        ContaBancaria conta1 = new ContaBancaria(1234,"Vitor",0.0);
        ContaBancaria conta2 = new ContaBancaria(4321, "Claudio",100.00);
        ContaBancaria conta3 = new ContaBancaria(2341, "Rafael", 1000.00);


        //Array para armazenar as contas
        ContaBancaria[] contas = {conta1,conta2,conta3};

        //Login inicial
        System.out.println("*******CAIXA ELETRÔNICO*******");
        System.out.println("Digite o Nº da sua conta:");
        Scanner sc = new Scanner(System.in);
        int numconta = sc.nextInt();

        //Variavel para armazenar a conta logada
        ContaBancaria contaLogada = null;

        //Procura da conta
        for (ContaBancaria c : contas){
            if (c.getNumeroConta() == numconta) {
                contaLogada = c;
                break;
            }
        }

        //Verificação se a conta é existente
        if (contaLogada == null) {
            System.out.println("Conta inexistente");
        }


        //Menu logado
        do {
            System.out.println("*************Caixa eletrônico*************");
            System.out.println("Usuario: "+contaLogada.getTitular());
            System.out.println("Digite 1 - Para ver seu saldo.");
            System.out.println("Digite 2 - Para depositar.");
            System.out.println("Digite 3 - Para sacar.");
            System.out.println("Digite 0 - Para sair.");
            Scanner scanner = new Scanner(System.in);
            numeroOpcao = scanner.nextInt();

            //Criação do switch para navegar entre as opções do menu
            switch(numeroOpcao) {
                case 1:
                    System.out.println("O seu saldo é: " + contaLogada.getSaldoInicial() +"\n");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    Scanner scanner1 = new Scanner(System.in);
                    double vlrDepositado = scanner1.nextDouble();
                    contaLogada.depositar(vlrDepositado);
                    System.out.println("Deposito realizado com sucesso!");
                    System.out.println("Seu saldo atual é: " + contaLogada.getSaldoInicial()+"\n");
                    break;
                case 3:
                    System.out.println("Digite um valor para sacar: ");
                    Scanner scanner2 = new Scanner(System.in);
                    double valorSaque = scanner2.nextDouble();
                    contaLogada.sacar(valorSaque);
                    break;

            }

        } while(numeroOpcao != 0);
        System.out.println("Programa encerrado! obrigado por usar o caixa eletrônico.");
    }
}
