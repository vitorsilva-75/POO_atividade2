/*3 - Relacionamentos e Encapsulamento
Exercício: E-commerce (Cliente -> Pedido -> ItemPedido).
Detalhes: Modelar um Pedido que pertence a um Cliente e contém uma Lista de
ItemPedido.
Regra de Negócio:
- Calcular o Frete: Criar um método fecharPedido(). Se o valor total dos itens for superior
a R$250,00, o frete é grátis. Caso contrário, cobrar uma taxa fixa de R$25,00. Imprimir o
recibo detalhado.*/
public class Main {
    public static void main(String[] args) {

        //Criação da instância do cliente
        Cliente cliente1 = new Cliente(1, "Vitor", "vitor@email.com","123.456.789-11");

        //Criação da instância dos produtos
        ItemPedido item1 = new ItemPedido("Televisão", 1, 1500.00);
        ItemPedido item2 = new ItemPedido("Computador",1,2000.00);
        ItemPedido item3 = new ItemPedido("PS5",1,3000.00);

        //Criação do pedido
        Pedido pedido1 = new Pedido(1, cliente1);

        //Modelagem do pedido com metodos
        //Adicionando itens ao pedido
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);
        pedido1.adicionarItem(item3);

        //Calculando o total
        pedido1.calcularTotal();

        //Conclusão do pedido com a apresentação do recibo
        pedido1.fecharPedido();

    }
}
