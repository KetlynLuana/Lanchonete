package Model;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cliente;

    public Cliente(String cliente, String sobrenome, String nome) {
        this.cliente = cliente;
        this.sobrenome = sobrenome;
        this.nome = nome;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Cliente(String nome, String sobrenome) {
        this.sobrenome = sobrenome;
        this.nome = nome;
    }

    public void Hello(){
        System.out.println("Olá Mundo");
    }
    public void Bye(){
        System.out.println("Bye Bye baby");
    }
    public String getNomeInteiro() {
        return nome + " " + sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}