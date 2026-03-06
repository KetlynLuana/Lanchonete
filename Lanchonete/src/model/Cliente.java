package model;

public class Cliente {

    private String Nome;
    private String Sobrenome;


    public Cliente(String Nome, String Sobrenome) {
        Sobrenome = Sobrenome;
        Nome = Nome;
    }

    public void Hello() {
        System.out.println("Olá Mundo!");
    }

    public void Bye() {
        System.out.println("Bye Bye Bye!");
    }

    public String getNomeInteiro(){
        return Nome + " " + Sobrenome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }
}


