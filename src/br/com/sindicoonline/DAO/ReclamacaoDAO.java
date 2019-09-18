package br.com.sindicoonline.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReclamacaoDAO {

    public void adicionarBloco(Reclamacao reclamacao) {

        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "INSERT INTO reclamacao (idReclamacao, idMorador, descricaoReclamacao) VALUES (?, ?, ?)");
            pstmt.setInt(1, reclamacao.getIdReclamacao());
            pstmt.setInt(2, reclamacao.getMorador().getIdMorador());
            pstmt.setString(3, reclamacao.getDescricaoReclamacao());

            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void deleteReclamacao(Reclamacao reclamacao) {
        Connection conn = Conexao.getConnection();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM reclamacao WHERE idReclamacao = " + reclamacao.getIdReclamacao());
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir");
            ex.printStackTrace();
        }
    }

    public void updateReclamacao(Reclamacao reclamacao) {
        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "UPDATE reclamacao SET "
                    + " descricaoReclamacao = ? "
                    + "WHERE idReclamacao = " + reclamacao.getIdReclamacao());
            pstmt.setString(1, reclamacao.getDescricaoReclamacao());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public List<Reclamacao> readReclamacaoListaComNome(Reclamacao reclamacao, int morador) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        List<Reclamacao> reclamacoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from reclamacao where idMorador = " + morador);
            rs = stmt.executeQuery();
            while (rs.next()) {

                Reclamacao reclamacaoo = new Reclamacao();

                reclamacaoo.setIdReclamacao(rs.getInt("idReclamacao"));
//                reclamacaoo.setIdMorador(rs.getInt("idMorador"));
                reclamacaoo.setDescricaoReclamacao(rs.getString("descricaoReclamacao"));
                reclamacoes.add(reclamacaoo);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return reclamacoes;
    }
    
    


}
