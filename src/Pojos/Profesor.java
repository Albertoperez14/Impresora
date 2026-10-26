package Pojos;

import Enums.Departamentos;

public class Profesor extends Cliente {
    private Departamentos departamento;


    public Profesor(String nombre, String dni,Departamentos departamento) {
        super(nombre, dni);
        this.departamento = departamento;
    }
    public Departamentos getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString() {
        return super.toString() + "" + this.departamento;
    }
}
