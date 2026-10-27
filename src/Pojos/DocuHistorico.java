package Pojos;

import java.util.Date;

public class DocuHistorico extends Documento {


    Date fechaImpri;
    public DocuHistorico(int numPaginas,String texto) {
        super(numPaginas,texto);
        this.fechaImpri = new Date();
    }

    public Date getFechaImpri() {
        return fechaImpri;
    }
    public void setFechaImpri(Date fechaImpri) {
        this.fechaImpri = fechaImpri;
    }


}
