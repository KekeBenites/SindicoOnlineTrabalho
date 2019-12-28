package br.com.sindicoonline.DAO;

import br.com.sindicoonline.Utilits.Utilidades;
import br.com.sindicoonline.frm.frmPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AvisoDAO {

    Utilidades util = new Utilidades();

    public List<Aviso> readAvisoCompleto(Aviso aviso) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        List<Aviso> avisos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from avisos order by desc");

            rs = stmt.executeQuery();
            while (rs.next()) {
                Aviso avisoo = new Aviso();
                Predio p = new Predio();

                avisoo.setIdAviso(rs.getInt("idAviso"));
                avisoo.setDescricaoAviso(rs.getString("descricaoAviso"));
                p.setNomePredio("nomePredio");
                avisoo.setPredio(p);
                avisos.add(avisoo);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return avisos;
    }

    public List<Aviso> readAvisoFiltro(Aviso aviso) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        List<Aviso> avisos = new ArrayList<>();

        try {

//            stmt = con.prepareStatement("select * from avisos where (idPredio = 1) or (idPredio = '"
//                    + util.achaCodigoPredioParaAviso(Integer.valueOf(frmPrincipal.lblIdMorador.getText())) + "')");
//            
            stmt = con.prepareStatement("select avisos.idAviso, avisos.descricaoAviso, predio.nomePredio from avisos inner join predio on predio.idPredio = avisos.idPredio");

            rs = stmt.executeQuery();
            while (rs.next()) {
                Aviso avisoo = new Aviso();
                Predio p = new Predio();
//                Arrumar!!!!
//                util.achaCodigoPredioParaAviso(Integer.valueOf(frmPrincipal.lblIdMorador.getText()));

                avisoo.setIdAviso(rs.getInt("idAviso"));
                avisoo.setDescricaoAviso(rs.getString("descricaoAviso"));
                p.setNomePredio(rs.getString("nomePredio"));
                avisoo.setPredio(p);
                avisos.add(avisoo);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return avisos;
    }

    public void adicionarAviso(Aviso aviso) {

        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "INSERT INTO avisos (descricaoAviso, nomeSindico, idPredio) VALUES (?, ?, ?)");

            pstmt.setString(1, aviso.getDescricaoAviso());
            pstmt.setString(2, aviso.getNomeSindico());
            pstmt.setInt(3, aviso.getPredio().getIdPredio());

            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
            ex.printStackTrace();
        }

    }

    public void deleteAviso(Aviso aviso) {
        Connection conn = Conexao.getConnection();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM avisos WHERE idAviso = " + aviso.getIdAviso());
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir");
            ex.printStackTrace();
        }
    }

    public void updateAviso(Aviso aviso) {
        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(
                    "UPDATE avisos SET "
                    + "descricaoAviso = ?, idPredio = ? "
                    + "WHERE idAviso  = " + aviso.getIdAviso());
            pstmt.setString(1, aviso.getDescricaoAviso());
            pstmt.setInt(2, aviso.getPredio().getIdPredio());

            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Aviso> readAviso(Aviso aviso) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        List<Aviso> avisos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select avisos.idAviso, avisos.descricaoAviso, predio.nomePredio  from avisos inner join predio on predio.idPredio = avisos.idPredio");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Aviso avisoo = new Aviso();
                Predio p = new Predio();

                avisoo.setIdAviso(rs.getInt("idAviso"));
                avisoo.setDescricaoAviso(rs.getString("descricaoAviso"));
                p.setNomePredio(rs.getString("nomePredio"));
                avisoo.setPredio(p);
                avisos.add(avisoo);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return avisos;
    }

}
