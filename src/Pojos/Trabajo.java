package Pojos;

public class Trabajo implements Comparable<Trabajo>{
    private Cliente cliente;
    private Documento documento;
    private int id;
    private static int contador=0;

    public Trabajo(Cliente cliente, Documento documento) {
        this.cliente = cliente;
        this.documento = documento;
        this.id = contador++;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Documento getDocumento() {
        return documento;
    }
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    public String toString() {
        return "Trabajo{" + "cliente=" + cliente + ", documento=" + documento + '}';
    }


    @Override
    public int compareTo(Trabajo o) {
        return Integer.compare(this.id, o.id);
    }
}
