/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.ImageIcon;

/**
 *
 * @author gbarrosn
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/resources/estoque.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonDevedor = new javax.swing.JButton();
        jButtonCadastrarCarga = new javax.swing.JButton();
        jButtonConsultarEstoque = new javax.swing.JButton();
        jButtonCadastrarCaixa = new javax.swing.JButton();
        jButtonFazerVenda = new javax.swing.JButton();
        jButtonConsultarVendas = new javax.swing.JButton();
        jButtonCadastrarDevedor = new javax.swing.JButton();
        jButtonCadastrarProdutos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconapp.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("Bem vindo(a) ao Sistema de Controle de Estoque e Vendas!");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel3.setText("O que você gostaria de fazer hoje?");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDevedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/caixasasfd.png"))); // NOI18N
        jButtonDevedor.setText("Consultar Devedores");
        jButtonDevedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonDevedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevedorActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDevedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 211, 200, 47));

        jButtonCadastrarCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/extoque chegandoIcone.png"))); // NOI18N
        jButtonCadastrarCarga.setText("Cadastrar Carga");
        jButtonCadastrarCarga.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCadastrarCarga.setIconTextGap(15);
        jButtonCadastrarCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarCargaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCadastrarCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 16, 200, 47));

        jButtonConsultarEstoque.setIcon(new javax.swing.ImageIcon("/home/gbarrosn/NetBeansProjects/SistemaCeasa/src/resources/estoqueIcone.png")); // NOI18N
        jButtonConsultarEstoque.setText("Consultar Estoque");
        jPanel2.add(jButtonConsultarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 146, 200, 47));

        jButtonCadastrarCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/caixaIcone.png"))); // NOI18N
        jButtonCadastrarCaixa.setText("Cadastrar Galéia");
        jButtonCadastrarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarCaixaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCadastrarCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 81, 200, 47));

        jButtonFazerVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/VendedorIcon.png"))); // NOI18N
        jButtonFazerVenda.setText("Realizar Venda");
        jPanel2.add(jButtonFazerVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, 200, 47));

        jButtonConsultarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/vendaIcon.png"))); // NOI18N
        jButtonConsultarVendas.setText("Consultar Vendas");
        jPanel2.add(jButtonConsultarVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 81, 200, 47));

        jButtonCadastrarDevedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/caminhaoIcone.png"))); // NOI18N
        jButtonCadastrarDevedor.setText("Cadastrar Devedor");
        jPanel2.add(jButtonCadastrarDevedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 146, 200, 47));

        jButtonCadastrarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/estoqueazulIcon.png"))); // NOI18N
        jButtonCadastrarProdutos.setText("Cadastrar Produtos");
        jPanel2.add(jButtonCadastrarProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 211, 200, 47));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDevedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDevedorActionPerformed

    private void jButtonCadastrarCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarCargaActionPerformed

    private void jButtonCadastrarCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarCaixaActionPerformed
        // TODO add your handling code here:
       CadastrarCaixa telaCaixa = new CadastrarCaixa();
       telaCaixa.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonCadastrarCaixaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarCaixa;
    private javax.swing.JButton jButtonCadastrarCarga;
    private javax.swing.JButton jButtonCadastrarDevedor;
    private javax.swing.JButton jButtonCadastrarProdutos;
    private javax.swing.JButton jButtonConsultarEstoque;
    private javax.swing.JButton jButtonConsultarVendas;
    private javax.swing.JButton jButtonDevedor;
    private javax.swing.JButton jButtonFazerVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}