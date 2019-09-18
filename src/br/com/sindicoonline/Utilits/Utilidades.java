/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sindicoonline.Utilits;

import br.com.sindicoonline.DAO.Conexao;
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
        
         public int achaCodigoApto(int nome, int codBloco) {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT idApto FROM apto where numeroApto = '" + nome + "' and idBloco = " + codBloco);
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
  
    
    
}
