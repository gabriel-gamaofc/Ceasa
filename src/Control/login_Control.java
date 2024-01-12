/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Models.Login_Models;
import View.TelaLogin;
import static View.TelaLogin.textSenha;
import View.TelaPrincipal;
import static groovy.ui.text.FindReplaceUtility.dispose;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class login_Control {

    public static String usu_log, senha_log;

    public String captador_usu() {
        String usu = TelaLogin.txtuser.getText();
        usu_log = usu;
        //System.out.println(usu);
        return usu_log;
    }

    //Recebendo informações do view
    public String captador_senha() {
        String senha = TelaLogin.textSenha.getText();
        senha_log = senha;
        return senha_log;
    }

    //recebe as infromações do model e envia autorização para o view
    public void receber_model() {
        Login_Models x = new Login_Models();
        x.db_senha();
        x.db_usu();
        x.db_geral();
        if ("true".equals(x.aut_model)) {
            JOptionPane.showMessageDialog(null, "Bem-vindo(a) " + x.usu_model);
           
            //System.out.println(tipo_log);
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();

        } else {
                JOptionPane.showMessageDialog(null, "Erro ao Logar, verifique a senha.");
                textSenha.setText("");
            }
    }

}
