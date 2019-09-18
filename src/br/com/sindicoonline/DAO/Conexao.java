package br.com.sindicoonline.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public final class Conexao {
    //Nao devem ser criadas instancias de Concexao fora desta classe.
    public Conexao(){
     PreparedStatement pstmt = null;
    }

    static {
        try {
            //Carrega o driver do banco
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco nao encontrado.");
            System.exit( -1);
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
         
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3309/sindico_online_db",
                    "root",
                    "laekle050404"
                    );
            System.out.println("Conectado com sucesso.");
        } catch (SQLException ex) {
            System.err.print("Erro ao obter conexao algo errado: " + ex.getMessage());
        }
        return conn;
    }
}
