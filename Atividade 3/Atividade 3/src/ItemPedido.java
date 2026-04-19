public class ItemPedido {

    //criação das variaveis
    private String produto;
    private int quantidade;
    private double precoUnitario;

    //Construtor com validação de valores inválidos
    public ItemPedido(String produto, int quantidade, double precoUnitario) {
        if (produto == null || produto.isEmpty()) {
            throw new IllegalArgumentException("Produto inválido");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        if (precoUnitario < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }

        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    //Getters e Setters
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade){ if(quantidade > 0) {
        this.quantidade = quantidade;
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) { if (precoUnitario >=0) {
        this.precoUnitario = precoUnitario;
        }
    }

    //metodo calcular Subtotal
    public double calcularSubtotal() {
        double subTotal = precoUnitario * quantidade;
        return subTotal;
    }
}
