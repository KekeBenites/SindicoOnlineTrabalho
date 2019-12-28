/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sindicoonline.Utilits;

import br.com.sindicoonline.DAO.Conexao;
import br.com.sindicoonline.frm.frmPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author klebe
 */
public class Utilidades {

    public int nPredio = 0;

    public int achaCodigoPredio(String nome) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT idPredio FROM predio where nomePredio = '" + nome + "'");
            rs = stmt.executeQuery();
            while (rs.next()) {
//                Esse funciona q é um abeleza.
                int n = (int) rs.getObject(1);
                return n;
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public void achaNomePredio(String id) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT nomePredio FROM predio where idPredio = '" + id + "'");
            rs = stmt.executeQuery();
            while (rs.next()) {
//                Esse funciona q é um abeleza.
                nPredio = (int) rs.getObject(1);
            }
        } catch (Exception e) {
        }
    }

    public int achaCodigoBloco(String nome, int codPredio) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT idBloco FROM bloco where nomeBloco = '" + nome + "' and idPredio = " + codPredio);
            rs = stmt.executeQuery();
            while (rs.next()) {
//                Esse funciona q é um abeleza.
                int n = (int) rs.getObject(1);
                return n;
            }
        } catch (Exception e) {

        }
        return 0;
    }

    public int achaCodigoApto(int numeroAPTO, int codBloco) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        
        int n = 0;
        try {
            stmt = con.prepareStatement("SELECT idApto FROM apto where numeroApto = '" + numeroAPTO + "' and idBloco = " + codBloco);
            rs = stmt.executeQuery();
            while (rs.next()) {
//                Esse funciona q é um abeleza.
                n = (int) rs.getObject(1);
                return n;
            }
            
        } catch (Exception e) {
            
            
        }
        
         return n;
    
    }

    public int achaCodigoPredioParaAviso(int id) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        Integer n = null;
        try {
            stmt = con.prepareStatement("select predio.idPredio from predio inner join bloco on bloco.idPredio = predio.idPredio inner join apto on apto.idBloco = bloco.idBloco inner join morador on apto.idApto = morador.idApto where idMorador = '" + id + "'");
            
            rs = stmt.executeQuery();
        System.out.println(rs.first());
            System.out.println(rs.getObject(1));
//            while (rs.first()) {
            
//                Esse funciona q é uma beleza.
                n = (int) rs.getObject(1);

//            }
        } catch (Exception e) {
            return 99999;
        }
        return n;
    }

}
