package br.com.sindicoonline.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MoradorDAO {

    public void adicionarMorador(Morador morador) {

        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "INSERT INTO morador (nomeMorador, cpfMorador,loginMorador,senhaMorador,idApto) VALUES (?, ?, ?, ?, ?)");

            pstmt.setString(1, morador.getNomeMorador());
            pstmt.setString(2, morador.getCpfMorador());
            pstmt.setString(3, morador.getLoginMorador());
            pstmt.setString(4, morador.getSenhaMorador());
            pstmt.setInt(5, morador.getApto().getIdApto());

            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void deleteMorador(Morador morador) {
        Connection conn = Conexao.getConnection();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM morador WHERE idMorador = " + morador.getIdMorador());
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir");
            ex.printStackTrace();
        }
    }

    public void updateApto(Morador morador) {
        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "UPDATE morador SET "
                    + "nomeMorador = ?, cpfMorador = ?,loginMorador = ?,senhaMorador = ?,idApto = ? "
                    + "WHERE idMorador = " + morador.getIdMorador());

            pstmt.setString(1, morador.getNomeMorador());
            pstmt.setString(2, morador.getCpfMorador());
            pstmt.setString(3, morador.getLoginMorador());
            pstmt.setString(4, morador.getSenhaMorador());
            pstmt.setInt(5, morador.getApto().getIdApto());

            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Morador> readMoradorListaComNome(Morador morador) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        List<Morador> moradores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select morador.idMorador, morador.nomeMorador, morador.cpfMorador, apto.numeroApto, "
                    + "bloco.nomeBloco, predio.nomePredio, morador.loginMorador, morador.senhaMorador "
                    + "from morador inner join apto on morador.idApto = apto.idApto inner join bloco on "
                    + "apto.idBloco = bloco.idBloco inner join predio on bloco.idPredio = predio.idPredio order by idMorador;");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Morador moradorr = new Morador();
                Apto ap = new Apto();
                Predio p = new Predio();
                Bloco b = new Bloco();

                moradorr.setIdMorador(rs.getInt("idMorador"));
                moradorr.setNomeMorador(rs.getString("nomeMorador"));
                moradorr.setCpfMorador(rs.getString("cpfMorador"));
                ap.setNumeroApto(rs.getInt("numeroApto"));
                p.setNomePredio(rs.getString("nomePredio"));
                b.setNumeroBloco(rs.getString("nomeBloco"));
                moradorr.setApto(ap);
                moradorr.setBloco(b);
                moradorr.setPredio(p);
                moradorr.setLoginMorador(rs.getString("loginMorador"));
                moradorr.setSenhaMorador(rs.getString("senhaMorador"));
                moradores.add(moradorr);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return moradores;
    }

}
