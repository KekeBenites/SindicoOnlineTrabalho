package br.com.sindicoonline.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BlocoDAO {

//private static BlocoDAO instance;
//
//    static {
//        instance = new BlocoDAO();
//    }
//
//    public BlocoDAO() {
//    }
//
//    public static BlocoDAO getInstance() {
//        return instance;
//    }
    public void adicionarBloco(Bloco bloco) {

        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "INSERT INTO bloco (nomeBloco, valorBloco, idPredio) VALUES (?, ?, ?)");

            pstmt.setString(1, bloco.getNumeroBloco());
            pstmt.setDouble(2, bloco.getValorCondominio());
            pstmt.setInt(3, bloco.getPredio().getIdPredio());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void deleteBloco(Bloco bloco) {
        Connection conn = Conexao.getConnection();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM bloco WHERE idBloco = " + bloco.getIdBloco());
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir");
            ex.printStackTrace();
        }
    }

    public void updateBloco(Bloco bloco) {
        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "UPDATE bloco SET "
                    + "idBloco = ?, nomeBloco = ?, valorBloco = ?, idPredio = ? "
                    + "WHERE idBloco = " + bloco.getIdBloco());
            pstmt.setInt(1, bloco.getIdBloco());
            pstmt.setString(2, bloco.getNumeroBloco());
            pstmt.setDouble(3, bloco.getValorCondominio());
            pstmt.setInt(4, bloco.getPredio().getIdPredio());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

      
    public List<Bloco> readBlocoListaComNome(Bloco bloco) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        List<Bloco> blocos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select predio.nomePredio,bloco.idBloco, bloco.nomeBloco, bloco.valorBloco from "
                    + "bloco inner join predio on bloco.idPredio = predio.idPredio");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Bloco blocoo = new Bloco();
                Predio p = new Predio();

                blocoo.setIdBloco(rs.getInt("idBloco"));
                blocoo.setNumeroBloco(rs.getString("nomeBloco"));
                blocoo.setValorCondominio(rs.getDouble("valorBloco"));
                p.setNomePredio(rs.getString("nomePredio"));
                blocoo.setPredio(p);
                blocos.add(blocoo);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return blocos;
    }

}
