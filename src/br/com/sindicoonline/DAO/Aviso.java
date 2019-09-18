/*
create table avisos(
idAviso int auto_increment primary key not null,
descricaoAviso varchar(50),
idSindico int not null,
idPredio int not null,
foreign key (idSindico) references sindico(idSindico),
foreign key(idPredio) references predio(idPredio));
 */
package br.com.sindicoonline.DAO;

/**
 *
 * @author klebe
 */
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
