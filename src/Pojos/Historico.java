package Pojos;

import java.util.ArrayList;

public class Historico {
    private ArrayList<DocuHistorico> docuHistoricos;
    private Cliente cliente;

    public Historico(ArrayList<DocuHistorico> docuHistoricos, Cliente cliente) {
        this.cliente = cliente;
        this.docuHistoricos = new ArrayList<>(docuHistoricos);
    }
}
