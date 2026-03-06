package model;

public class Hamburguer {

    private String Ingrediente1;
    private String Ingrediente2;
    private String Ingrediente3;
    private String Ingrediente4;

    public Hamburguer(String ingrediente1, String ingrediente4, String ingrediente3, String ingrediente2) {
        Ingrediente1 = ingrediente1;
        Ingrediente4 = ingrediente4;
        Ingrediente3 = ingrediente3;
        Ingrediente2 = ingrediente2;
    }
    public String getTodosIn(){
        return Ingrediente1 + " " + Ingrediente2 + " " + Ingrediente3 + " " + Ingrediente4;
    }

    public void setIngrediente1(String ingrediente1) {
        Ingrediente1 = ingrediente1;
    }

    public void setIngrediente2(String ingrediente2) {
        Ingrediente2 = ingrediente2;
    }

    public void setIngrediente3(String ingrediente3) {
        Ingrediente3 = ingrediente3;
    }

    public void setIngrediente4(String ingrediente4) {
        Ingrediente4 = ingrediente4;
    }

    public String getIngrediente1() {
        return Ingrediente1;
    }

    public String getIngrediente2() {
        return Ingrediente2;
    }

    public String getIngrediente3() {
        return Ingrediente3;
    }

    public String getIngrediente4() {
        return Ingrediente4;
    }
}

