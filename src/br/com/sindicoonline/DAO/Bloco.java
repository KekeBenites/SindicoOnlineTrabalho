package br.com.sindicoonline.DAO;

public class Bloco {

    private int idBloco;
    private String numeroBloco;
    private Double valorCondominio;
    private Predio predio;

    public int getIdBloco() {
        return idBloco;
    }

    public void setIdBloco(int idBloco) {
        this.idBloco = idBloco;
    }

    public String getNumeroBloco() {
        return numeroBloco;
    }

    public void setNumeroBloco(String numeroBloco) {
        this.numeroBloco = numeroBloco;
    }

    public Double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(Double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }

}
