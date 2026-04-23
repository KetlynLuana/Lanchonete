package Model;

public class Hamburguer {

    private String ingredientes1;
    private String ingredientes2;
    private String ingredientes3;
    private String ingredientes4;

    public Hamburguer(String ingredientes1, String ingredientes2, String ingredientes3, String ingredientes4) {
        this.ingredientes1 = ingredientes1;
        this.ingredientes2 = ingredientes2;
        this.ingredientes3 = ingredientes3;
        this.ingredientes4 = ingredientes4;
    }

    public String getIngredientes1() {
        return ingredientes1;
    }

    public void setIngredientes1(String ingredientes1) {
        this.ingredientes1 = ingredientes1;
    }

    public String getIngredientes2() {
        return ingredientes2;
    }

    public void setIngredientes2(String ingredientes2) {
        this.ingredientes2 = ingredientes2;
    }

    public String getIngredientes3() {
        return ingredientes3;
    }

    public void setIngredientes3(String ingredientes3) {
        this.ingredientes3 = ingredientes3;
    }

    public String getIngredientes4() {
        return ingredientes4;
    }

    public void setIngredientes4(String ingredientes4) {
        this.ingredientes4 = ingredientes4;
    }
}