/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Control.login_Control;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Login_Models {
      public String usu_model, senha_model, aut_model;

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    //recebe informação do controll
    public String db_usu() {
        login_Control pg = new login_Control();
        pg.captador_usu();
        String rec_usu = pg.usu_log;
        usu_model = rec_usu;
        //System.out.println(usu_model+"aqui1");
        return usu_model;
    }
    //recebe informação do controll

    public String db_senha() {
        login_Control pg = new login_Control();
        pg.captador_senha();
        String rec_senha = pg.senha_log;
        senha_model = rec_senha;
        //System.out.println(senha_model);
        return senha_model;
    }
//pega as infromações e checa no banco de dados e envia para o controll

    public void db_geral() {
       

        String sql = "select * from Users where (login=? and senha=?);";
        conexao = DAO.conector();
        try {

            //as linhs abaixo preparam a consulta ao banco em função do que foi
            //digitado nas caixas de texto. O ? é substituido pelo
            //conteúdo dass variáveis
            pst = conexao.prepareStatement(sql);

            pst.setString(1, usu_model);
            pst.setString(2, senha_model);
            //System.out.println(pst);

            //a linha abaixo executa a query
            rs = pst.executeQuery();
            // se existir usuário e senha correspondente
            if (rs.next()) {
              
                String Email = rs.getString(2);
                String Senha_conf = rs.getString(3);
                System.out.println(Email);
               

                if (Email.equals(usu_model)) {
                     
                    if (Senha_conf.equals(senha_model)) {
                        String aut_val = "true";
                        aut_model = aut_val;

                    } else {
                        aut_model = "false";

                    }

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
}
