package Pojos;

import java.util.ArrayList;

import java.util.TreeMap;

public class DAOHistorial {
    private static DAOHistorial instancia;
    private TreeMap<Cliente,Historico> historial  ;
    private DAOHistorial() {
        historial = new TreeMap<>();
    }

    public static DAOHistorial getInstancia() {
        if (instancia == null) {
            instancia = new DAOHistorial();
        }
        return instancia;
    }
    public void guardarTrabajo(Trabajo trabajo) {
        String dni = trabajo.getCliente().getDni();

        if (historial.containsKey(dni)) {
            historial.get(dni).add(trabajo);
        } else {
            ArrayList<Trabajo> lista = new ArrayList<>();
            lista.add(trabajo);
            historial.put(dni, lista);
        }
    }
    public ArrayList<Trabajo> buscarPorDni(String dni) {
        return historial.get(dni);
    }
    public TreeMap<String, ArrayList<Trabajo>> getHistorial() {
        return historial;
    }


}
