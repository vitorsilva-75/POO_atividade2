import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //Criação dos atributos
    private Integer id_pedido;
    private Cliente cliente;
    private LocalDate dataPedido;
    private List<ItemPedido> itens;
    private double valorTotal = 0;


    //Construtor
    public Pedido(Integer id_pedido, Cliente cliente) {
        this.id_pedido = id_pedido;
        this.cliente = cliente;
        this.dataPedido = LocalDate.now();
        this.itens = new ArrayList<>();
    }

    //Getters e Setters
    public Integer getid_pedido() {
        return id_pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {return valorTotal;}


    //Criação do metodo adicionar item ao pedido
    public void adicionarItem(ItemPedido item){
        //validando se o item instanciado não é nulo, logo pode ser adicionado a lista
        if (item != null){
            itens.add(item);
        }
    }


    //Criação do metodo de calculo total da compra
    public double calcularTotal(){
        //criação da variavel total para armazenar o valor somado
        double total = 0;
        //Percorre a lista e soma os itens
        for (ItemPedido item : itens){
            total+= item.calcularSubtotal();
        }
        //O total criado nesse metodo vai atualizar o valor de toda classe
        this.valorTotal = total;
        return total;
    }

    //metodo fechar pedido
    public void fecharPedido() {
        //criação das variaveis, total pegando o valor total atualizado e frete
        double total = calcularTotal();
        double frete;

        //Condicional para aplicação de frete grátis
        if (valorTotal > 250.00) {
            frete = 0.00;
        } else {
            frete = 25.00;
        }

        double valorPedido = total + frete;

        //Apresentação do recibo
        System.out.println("Cliente: "+cliente.getNome());
        System.out.println("---------------------------------");
        for (ItemPedido item : itens) {
            System.out.println("Produto: " + item.getProduto() + " | Qtd: " + item.getQuantidade() + " | Subtotal: R$ " + item.calcularSubtotal());
        }
        System.out.println("--------------------------");
        System.out.println("Total: R$"+ valorTotal);
        System.out.println("Frete: R$"+ frete);
        System.out.println("Total do pedido: R$" + valorPedido);
    }
}
