package Pojos;

public abstract class Documento {

    private int numPaginas;

    public Documento(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public String toString() {
        return "Alumno{" + "numPaginas=" + numPaginas + '}';
    }

}
