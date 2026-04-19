public class ContaBancaria {

    //Criação dos atributos
    private int numeroConta;
    private String titular;
    private double saldoInicial;
    private int quantidadeSaques = 0;
    private int limiteSaque = 3;
    private double saldo = 0.00;

    //Construtor
    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        if (saldoInicial == 0){
            this.saldoInicial = 50;//Bonus
        } else {
            this.saldoInicial = saldoInicial;
        }
    }

    //Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }


    //Metodo sepositar
    public void depositar(double vlrDepositado) {
        //atualização do valor de saldo com o valor depositado
        saldoInicial = saldoInicial + vlrDepositado;

    }

    //Metodo sacar
    public void sacar(double valorSaque) {

        //Criação da condicional de limite de saques
        if (quantidadeSaques >= limiteSaque) {
            System.out.println("Limite de saques diários atingido.\n");
        }
        //Criação da condicional de limite valor do saque
        else if (valorSaque > 1000.00) {
            System.out.println("ERRO. Valor limite atingido por questões de segurnaça\n");
        }
        //Condicional para não realizar saques sem saldo
        else if (valorSaque > saldoInicial) {
            System.out.println("ERRO. Saldo insuficiente.\n");
        }
        //Execução do saque
        else {
            saldoInicial = saldoInicial - valorSaque;
            quantidadeSaques++;

            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu saldo atual é: " + saldoInicial + "\n");
        }
    }
}