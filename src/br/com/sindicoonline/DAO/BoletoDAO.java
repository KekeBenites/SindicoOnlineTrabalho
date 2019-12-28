package br.com.sindicoonline.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoletoDAO {

    public void teste() {

        PreparedStatement stmt = null;
        PreparedStatement pstmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        Boleto boleto = new Boleto();
        Bloco b = new Bloco();
        Morador m = new Morador();

        try {
            pstmt = con.prepareStatement("select morador.idMorador, bloco.valorBloco, apto.numeroApto "
                    + "from morador inner join apto on morador.idApto = apto.idApto "
                    + "inner join bloco on apto.idBloco = bloco.idBloco");
            rs = pstmt.executeQuery();

            while (rs.next()) {

                pstmt.setInt(1, boleto.getMorador().getIdMorador());
                pstmt.setDouble(2, boleto.getValor());
                pstmt.setInt(1, boleto.getMorador().getApto().getIdApto());

                pstmt.executeUpdate();

            }

//            insert into boleto (valor,vencimento,posicao,idMorador) values (?,?,?,?);
        } catch (Exception e) {

        }

    }
}
