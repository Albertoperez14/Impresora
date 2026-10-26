package Pojos;

import Enums.TipoCursos;

public class Alumno extends Cliente {

    private TipoCursos curso;

    public Alumno(String nombre, String dni, TipoCursos curso) {
        super(nombre, dni);
        this.curso = curso;
    }

    public TipoCursos getCurso() {
        return curso;
    }
    public void setCurso(TipoCursos curso) {
        this.curso = curso;
    }
    @Override
    public String toString() {
        return "Pojos.Alumno{"+ super.toString() + "curso=" + curso + '}';
    }
}
