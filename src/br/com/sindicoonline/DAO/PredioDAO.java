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

public class PredioDAO {

    private static PredioDAO instance;

    static {
        instance = new PredioDAO();
    }

    public PredioDAO() {
    }

    public static PredioDAO getInstance() {
        return instance;
    }

    public void adicionarPredio(Predio predio) {

        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "INSERT INTO predio (nomePredio) VALUES (?)");

            pstmt.setString(1, predio.getNomePredio());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void deletePredio(Predio predio) {
        Connection conn = Conexao.getConnection();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM predio WHERE idPredio = " + predio.getIdPredio());
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir");
            ex.printStackTrace();
        }
    }

    public void updatePredio(Predio predio) {
        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "UPDATE predio SET "
                    + "idPredio = ?,nomePredio = ?"
                    + "WHERE idPredio = " + predio.getIdPredio());
            pstmt.setInt(1, predio.getIdPredio());
            pstmt.setString(2, predio.getNomePredio());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Predio readPredio(Predio predio) {
        PreparedStatement pstmt = null;
        int updateQuery = 0;
        Predio dadosAux = new Predio();
        Connection conn = Conexao.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM predio WHERE idPredio ='" + predio.getIdPredio() + "'");
            if (rs.next()) {
                dadosAux = carregaPredio(predio, rs);
            } else {
                predio = null;
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return predio;
    }

    public List<Predio> readPredioLista(Predio predio) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        List<Predio> predios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM predio");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Predio predioo = new Predio();
                predioo.setIdPredio(rs.getInt("idPredio"));
                predioo.setNomePredio(rs.getString("nomePredio"));
                predios.add(predioo);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return predios;
    }

    private Predio carregaPredio(Predio dadosAux, ResultSet rs) throws SQLException {

        dadosAux.setIdPredio(rs.getInt("idPredio"));
        dadosAux.setNomePredio(rs.getString("nomePredio"));

        return dadosAux;

    }

    public Predio readPredio1(Predio predio) {
       
        PreparedStatement pstmt = null;       
        Connection conn = Conexao.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM predio");
            if (rs.next()) {
                
                predio.setNomePredio(predio.getNomePredio());
                
            } else {
                predio = null;
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return predio;
    }
    
    

}
