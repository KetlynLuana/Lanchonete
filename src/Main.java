import model.Cliente;
import model.Hamburguer;
import model.Pedido;

import java.util.ArrayList;

//METAS DE HOJE:
//1 - Preço do Hamburguer
//2- Remover Ingrediente
//3- Adicionar Ingrediente
//4- Calculo Total do Pedido
model.Cliente;
import model.Hamburguer;
import model.Pedido;

import java.util.ArrayList;
im
public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingredientesList = new ArrayList<>();
        ingredientesList.add("pão");
        ingredientesList.add("hamburguer");
        ingredientesList.add("queijo");
        ingredientesList.add("bacon");
        ingredientesList.add("jiló");
        ingredientesList.add("ovo");

        Hamburguer hamburguer = new Hamburguer(ingredientesList, 19);

        System.out.println("Antes de tirar: " + hamburguer.getIngredientes());
        hamburguer.tirarIngrediente("jiló");
        System.out.println("Depois de tirar: " + hamburguer.getIngredientes());

        //Cliente cliente = new Cliente("Ketlyn", "Luana");
        //Preco


        //remover da Lista
        //ingredienteList.remover("jiló");
        //Sytem.out.println(ingredienteList);

        //varrer Lista ( COM WHILE
        //Integer cont = 0;
        //Inter cont_ing= 0;
        //while (cont < 6){
        //     cont_ing += 1;
        //     System.out.println(ingredienteList.get(cont));
        //     cont = cont + 1;
        //}
        //System.out.println("A quantidade de ingredientes é: " + cont_i");

        //Varrer Lista com
        //"1"for
        int cont_ing = 0;
        for(int cont = 0 ; cont<6 ;cont++){
            cont_ing += 1;
            System.out.println(ingredienteList.get(cont));
        }

        Cliente cliente = new Cliente("Kelyn", "Luana");
        Hamburguer simples = new Hamburguer(ingredientesList,20);

        System.out.println(simples.getPreco());

        Pedido pedido1 = new Pedido(cliente, simples);

        System.out.println(simples.getingredientes());
    }
}
