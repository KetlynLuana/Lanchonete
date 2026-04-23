package Model;

public class Pedido {


    private Cliente cliente;
    private Hamburguer Lanche;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hamburguer getLanche() {
        return Lanche;
    }

    public void setLanche(Hamburguer lanche) {
        Lanche = lanche;
    }

    public Pedido(Cliente cliente, Hamburguer lanche) {
        this.cliente = cliente;
        Lanche = lanche;
    }

    public String getstatus() {
        retrun(cliente.getNomeInteiro + "" + getCliente());

    }

}
