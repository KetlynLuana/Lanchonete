package Model;

public class Cliente {

    private String nome;
    private String sobrenome;


    public Cliente(String nome,String sobrenome) {
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