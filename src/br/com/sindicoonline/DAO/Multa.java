/*
create table multa(
idMulta int auto_increment primary key not null,
descricaoMulta varchar(50) not null,
valorMulta decimal(10,2),
idMorador int not null,
idSindico int not null,
foreign key (idMorador) references morador(idMorador),
foreign key (idSindico) references sindico(idSindico));
 */
package br.com.sindicoonline.DAO;
public class Multa {
   int idMulta;
   String descricaoMulta;
   double valorMulta;
   int idSindico;

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    public String getDescricaoMulta() {
        return descricaoMulta;
    }

    public void setDescricaoMulta(String descricaoMulta) {
        this.descricaoMulta = descricaoMulta;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public int getIdSindico() {
        return idSindico;
    }

    public void setIdSindico(int idSindico) {
        this.idSindico = idSindico;
    }

    
}
