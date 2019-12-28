package br.com.sindicoonline.DAO;

/**
 * idApto int auto_increment primary key, numeroApto int not null, idBloco int
 * not null,
 */
public class Apto {

    private int idApto;
    private int numeroApto;
    private Predio predio;
    private Bloco bloco;

    public int getIdApto() {
        return idApto;
    }

    public void setIdApto(int idApto) {
        this.idApto = idApto;
    }

    public int getNumeroApto() {
        return numeroApto;
    }

    public void setNumeroApto(int numeroApto) {
        this.numeroApto = numeroApto;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }

}
