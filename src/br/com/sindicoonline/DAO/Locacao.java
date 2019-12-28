/*
create table locacao(
idLocacao int auto_increment not null primary key,
descricaoLocacao varchar(50) not null,
valorLocacao decimal(10,2) not null,
idBloco int not null,
foreign key (idBloco) references blocos(idBloco)
);
 */
package br.com.sindicoonline.DAO;
public class Locacao {
    
    int idLocacao;
    String descricaoLocacao;
    double valorLocacao;
    int idBloco;

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public String getDescricaoLocacao() {
        return descricaoLocacao;
    }

    public void setDescricaoLocacao(String descricaoLocacao) {
        this.descricaoLocacao = descricaoLocacao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public int getIdBloco() {
        return idBloco;
    }

    public void setIdBloco(int idBloco) {
        this.idBloco = idBloco;
    }

    
    
}
