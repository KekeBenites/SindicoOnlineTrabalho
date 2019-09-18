package br.com.sindicoonline.DAO;
public class Reclamacao {
    
    /*
    create table reclamacao (
idReclamacao int auto_increment primary key not null,
idMorador int not null,
descricaoReclamacao varchar(255),
foreign key (idMorador)references morador(idMorador)
);
    */
   
    
    private int idReclamacao;
    private Morador morador;
    private String descricaoReclamacao;
   

    public int getIdReclamacao() {
        return idReclamacao;
    }

    public void setIdReclamacao(int idReclamacao) {
        this.idReclamacao = idReclamacao;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public String getDescricaoReclamacao() {
        return descricaoReclamacao;
    }

    public void setDescricaoReclamacao(String descricaoReclamacao) {
        this.descricaoReclamacao = descricaoReclamacao;
    }

    



   
    
    
}
