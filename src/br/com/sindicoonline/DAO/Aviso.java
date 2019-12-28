
package br.com.sindicoonline.DAO;
public class Aviso {

    private int idAviso;
    private String descricaoAviso;
    String nomeSindico;
    Predio predio;

    public int getIdAviso() {
        return idAviso;
    }

    public void setIdAviso(int idAviso) {
        this.idAviso = idAviso;
    }

    public String getDescricaoAviso() {
        return descricaoAviso;
    }

    public void setDescricaoAviso(String descricaoAviso) {
        this.descricaoAviso = descricaoAviso;
    }

    public String getNomeSindico() {
        return nomeSindico;
    }

    public void setNomeSindico(String nomeSindico) {
        this.nomeSindico = nomeSindico;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }

  


}
