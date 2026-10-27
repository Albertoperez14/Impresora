package Pojos;

import Enums.TipoCursos;

import java.util.ArrayList;

public class DAOCola {
    private static DAOCola instancia;
    private ArrayList<Trabajo> trabajos;
    private DAOCola() {
        trabajos = new ArrayList<>();
        Trabajo trabajo = new Trabajo(new Alumno("Juan","213213d", TipoCursos.Primero),new DocuHistorico(2,"dsadsadsad"));
    }

    public static DAOCola getInstancia() {
        if (instancia == null) {
            instancia = new DAOCola();
        }
        return instancia;
    }

    public void agregar(Trabajo trabajo) {
        trabajos.add(trabajo);
    }

    public Trabajo sacarSiguienteTrabajo() {
        if (!trabajos.isEmpty()) {
            for (int i = 0; i < trabajos.size(); i++) {
                Trabajo trabajo = trabajos.get(i);
                if (trabajo.getCliente() instanceof Profesor){
                    trabajos.remove(i);
                    return trabajo;
                }
            }
            Trabajo trabajo = trabajos.get(0);
            trabajos.remove(0);
            return trabajo;
        }
        return null;
    }
    public ArrayList<Trabajo> getTrabajos() {
        return trabajos;
    }

}
