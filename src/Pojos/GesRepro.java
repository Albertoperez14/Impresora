package Pojos;

import java.util.ArrayList;

public class GesRepro {
    private DAOCola daoCola;
    private DAOHistorial daoHistorial;

    private static GesRepro instancia;

    private GesRepro() {

        daoCola = DAOCola.getInstancia();
        daoHistorial = DAOHistorial.getInstancia();
    }

    public static GesRepro getInstancia() {
        if (instancia == null) {
            instancia = new GesRepro();
        }
        return instancia;
    }
}
