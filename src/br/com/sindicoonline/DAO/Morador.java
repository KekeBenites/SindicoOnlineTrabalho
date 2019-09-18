package br.com.sindicoonline.DAO;
public class Morador {
    
    private int idMorador;
    private String nomeMorador;
    private String cpfMorador;
    private Predio predio;
    private Bloco bloco;
    private Apto apto;
    private String loginMorador;
    private String senhaMorador;

    public int getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(int idMorador) {
        this.idMorador = idMorador;
    }

    public String getNomeMorador() {
        return nomeMorador;
    }

    public void setNomeMorador(String nomeMorador) {
        this.nomeMorador = nomeMorador;
    }

    public String getCpfMorador() {
        return cpfMorador;
    }

    public void setCpfMorador(String cpfMorador) {
        this.cpfMorador = cpfMorador;
    }


    public String getLoginMorador() {
        return loginMorador;
    }

    public void setLoginMorador(String loginMorador) {
        this.loginMorador = loginMorador;
    }

    public String getSenhaMorador() {
        return senhaMorador;
    }

    public void setSenhaMorador(String senhaMorador) {
        this.senhaMorador = senhaMorador;
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

    public Apto getApto() {
        return apto;
    }

    public void setApto(Apto apto) {
        this.apto = apto;
    }


    

}
