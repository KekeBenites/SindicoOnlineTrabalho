package br.com.sindicoonline.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AptoDAO {

    public void adicionarApto(Apto apto) {

        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "INSERT INTO apto (numeroApto, idBloco) VALUES (?, ?)");
            
            pstmt.setInt(1, apto.getNumeroApto());
            pstmt.setInt(2, apto.getBloco().getIdBloco());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void deleteApto(Apto apto) {
        Connection conn = Conexao.getConnection();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM apto WHERE idApto = " + apto.getIdApto());
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir");
            ex.printStackTrace();
        }
    }

    public void updateApto(Apto apto) {
        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "UPDATE apto SET "
                    + "numeroApto = ?, idBloco = ? "
                    + "WHERE idApto = " + apto.getIdApto());
//            pstmt.setInt(1, apto.getIdBloco());
            pstmt.setInt(1, apto.getNumeroApto());
            pstmt.setInt(2, apto.getBloco().getIdBloco());

            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    public List<Apto> readAptoListaComNome(Apto apto) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        List<Apto> aptos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select apto.idApto, predio.nomePredio, bloco.nomeBloco, apto.numeroApto  from bloco inner join apto   on  bloco.idBloco = apto.idBloco  inner join predio on bloco.idPredio = predio.idPredio;");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Apto aptoo = new Apto();
                Predio p = new Predio();
                Bloco b = new Bloco();

                aptoo.setIdApto(rs.getInt("idApto"));
                p.setNomePredio(rs.getString("nomePredio"));
                b.setNumeroBloco(rs.getString("nomeBloco"));
                aptoo.setNumeroApto(rs.getInt("numeroApto"));
                
                aptoo.setBloco(b);
                aptoo.setPredio(p);
                
                               
                aptos.add(aptoo);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return aptos;
    }    


}
