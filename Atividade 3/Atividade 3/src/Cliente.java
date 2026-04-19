public class Cliente {

    //Criação dos atributos
    private Integer idcliente;
    private String nome;
    private String email;
    private String cpf;

    //Contrutor do cliente
    public Cliente(Integer id_cliente, String nome, String email, String cpf) {
        this.idcliente = id_cliente;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    //Getters e Setters
    public Integer getId_cliente() {
        return idcliente;
    }

    public void setId_cliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
