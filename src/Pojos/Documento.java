package Pojos;

public class Documento {

    private int numPaginas;
    private String texto;

    public Documento(int numPaginas,String texto) {
        this.numPaginas = numPaginas;
        this.texto = texto;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public String toString() {
        return "Alumno{" + "numPaginas=" + numPaginas +"texto=" + texto + '}';
    }

}
