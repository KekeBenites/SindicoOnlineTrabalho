package br.com.sindicoonline.DAO;


/*
idSindico int auto_increment primary key,
nomeSindico varchar(50) not null,
loginsindico varchar(50) not null,
senhaSindico varchar(50) not null,
ativo boolean not null,
idPredio int not null,

*/
public class Sindico {
    private int idSindico;
    private String nomeSindico;
    private String loginSindico ;
    private String senhaSindico ;
    private Boolean ativo;
    Predio Predio;

    public int getIdSindico() {
        return idSindico;
    }

    public void setIdSindico(int idSindico) {
        this.idSindico = idSindico;
    }

    public String getNomeSindico() {
        return nomeSindico;
    }

    public void setNomeSindico(String nomeSindico) {
        this.nomeSindico = nomeSindico;
    }

    public String getLoginSindico() {
        return loginSindico;
    }

    public void setLoginSindico(String loginSindico) {
        this.loginSindico = loginSindico;
    }

    public String getSenhaSindico() {
        return senhaSindico;
    }

    public void setSenhaSindico(String senhaSindico) {
        this.senhaSindico = senhaSindico;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Predio getPredio() {
        return Predio;
    }

    public void setPredio(Predio Predio) {
        this.Predio = Predio;
    }


    

    
  
}
