import Model.Cliente;
import Model.Hamburguer;
import Model.Pedido;

import java.util.ArrayList;
//Metas para hoje
//1-Preço do Hamburguer
//2-Remover Ingredientes
//3- Adicionar ingrediente
//4-Cauculo Total do pedido
public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingredientesList = new ArrayList<String>();
        IngredientesList.add("pao");
        IngredientesList.add("hamburguer");
        IngredientesList.add("queijo");
        IngredientesList.add("bacon");
        IngredientesList.add("jiló");
        IngredientesList.add("ovo");

        //Preço

        If

        //remover da lista
        //ingredienteList.remove("jiló")
        //System.out.println(IngredientesList);


        //varrer lista ( COM WHILE
        // Integer cont = 0;
        // Inter cont-ing= 0;
        // while (cont < 6){
        //    cont-ing += 1;
        //    System.out.println( IngredienteLiat.get(cont));
        //    cont = cont +1;
        //}
        //    System.out.println("A quantidade de ingredientes é : "+ cont-i"))

        //Varrer Lista com for
        int cont_ing = 0
        for (int cont = 0; cont<6 ; cont++){
            cont_ing+= 1;
            System.out.println(ingredientesList.get(cont));
        }


        Cliente cliente= new Cliente("Ana", "Tavora");
        Hamburguer simples = new Hamburguer(ingredientesList);

        Pedido pedido1 = new Pedido(cliente, simples);

    System.out.println(hamburguer.getIngredientes());
    }
}

