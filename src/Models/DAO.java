/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gabriel
 */
public class DAO {
      public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazenar informações do banco
   
        //String url =TelaLogin.teste.getText();
        
        String url = "jdbc:mysql:// localhost:3306/DBCeasa?characterEncoding=utf-8";
       
        //String user = TelaLogin.user.getText();
        String user = "dba"; // ativar linha quando o padronizador não funionar
        //String password = TelaLogin.senha.getText();
        String password = "123456"; // ativar linha quando o padronizador não funionar
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            //System.out.println(conexao);
            return conexao;
        } catch (Exception e) {
            //a linha abaixo serve para o desenvolvedor identificar erros de conexão com banco de dados 
            //System.out.println(e);
            return null;
        }
    }

    
}
