package model;

import java.util.ArrayList;

public class Hamburguer {

    private ArrayList<String> ingredientes;

    public ArrayList<String> getIngredientes() {
          return ingredientes;
}
    public void setIngredientes(ArrayList<String> ingredientes) {
         this.ingredientes = ingredientes;
}
    public double getPreco() {
         return preco;
}
    public void setPreco(double preco) {
         this.preco = preco;
}
    private double preco;

    public Hamburguer(ArrayList<String> ingredientes, double preco) {
         this.ingredientes = ingredientes;
         this.preco = preco;
}








