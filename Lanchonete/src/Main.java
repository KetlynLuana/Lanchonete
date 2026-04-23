import Model.Cliente;
import Model.Hamburguer;

public class Main {
    public static void main(String[] args){

        Cliente cliente= new Cliente("Ana", "Tavora");
        Hamburguer hamburguer = new Hamburguer("pao", "queijo","amburg", "cebola");


        System.out.println(cliente.getNomeInteiro());
        

    }
}
