
package br.com.sindicoonline.DAO;

public class Boleto {
    
    private int idBoleto;
    private String NomeMorador;
    private double valor;
    private String posicao;
    private Morador Morador;

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getNomeMorador() {
        return NomeMorador;
    }

    public void setNomeMorador(String NomeMorador) {
        this.NomeMorador = NomeMorador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Morador getMorador() {
        return Morador;
    }

    public void setMorador(Morador Morador) {
        this.Morador = Morador;
    }

 
    
    
    
}
