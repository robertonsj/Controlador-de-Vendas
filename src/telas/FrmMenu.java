/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class FrmMenu extends javax.swing.JFrame {

    public String usuarioLogado;
    
    public FrmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        controleClientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        controleFuncionarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        controleFornecedores = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        controleEstoque = new javax.swing.JMenuItem();
        consultaProdutos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        abrirPDV = new javax.swing.JMenuItem();
        menuPosicao = new javax.swing.JMenuItem();
        menuControleVendas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        trocarUsuarios = new javax.swing.JMenuItem();
        btnSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Controle de Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo01.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jPanel1.setForeground(new java.awt.Color(0, 153, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Funcionário(a):");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 204, 51));
        lblUsuario.setText("Roberto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUsuario))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funcionarios.png"))); // NOI18N
        jMenu1.setText("Clientes");

        controleClientes.setText("Controle de Clientes");
        controleClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleClientesActionPerformed(evt);
            }
        });
        jMenu1.add(controleClientes);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funcionaros02.png"))); // NOI18N
        jMenu2.setText("Funcionários");

        controleFuncionarios.setText("Controle de Funcionários");
        controleFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleFuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(controleFuncionarios);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supplier.png"))); // NOI18N
        jMenu3.setText("Fornecedores");

        controleFornecedores.setText("Controle de Fornecedores");
        controleFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleFornecedoresActionPerformed(evt);
            }
        });
        jMenu3.add(controleFornecedores);

        jMenuBar1.add(jMenu3);

        jMenu6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produto02.png"))); // NOI18N
        jMenu6.setText("Produtos");

        controleEstoque.setText("Controle de Estoque");
        jMenu6.add(controleEstoque);

        consultaProdutos.setText("Consulta de Produtos");
        consultaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProdutosActionPerformed(evt);
            }
        });
        jMenu6.add(consultaProdutos);

        jMenuBar1.add(jMenu6);

        jMenu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vendas01.png"))); // NOI18N
        jMenu4.setText("Vendas");

        abrirPDV.setText("Abrir PDV");
        abrirPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirPDVActionPerformed(evt);
            }
        });
        jMenu4.add(abrirPDV);

        menuPosicao.setText("Posição do Dia");
        menuPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPosicaoActionPerformed(evt);
            }
        });
        jMenu4.add(menuPosicao);

        menuControleVendas.setText("Histórico de Vendas");
        menuControleVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuControleVendasActionPerformed(evt);
            }
        });
        jMenu4.add(menuControleVendas);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        jMenu5.setText("Configurações");

        trocarUsuarios.setText("Trocar Usuários");
        trocarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocarUsuariosActionPerformed(evt);
            }
        });
        jMenu5.add(trocarUsuarios);

        jMenuBar1.add(jMenu5);

        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_icons_exit2_1564506.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        //this.setVisible(true);
        lblUsuario.setText(usuarioLogado);
    }//GEN-LAST:event_formWindowActivated

    private void controleClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleClientesActionPerformed
        // TODO add your handling code here:
        FrmClientes tela = new FrmClientes();
        tela.setVisible(true);
    }//GEN-LAST:event_controleClientesActionPerformed

    private void controleFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleFuncionariosActionPerformed
        // TODO add your handling code here:
        FrmFuncionarios tela = new FrmFuncionarios();
        tela.setVisible(true);
    }//GEN-LAST:event_controleFuncionariosActionPerformed

    private void controleFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleFornecedoresActionPerformed
        // TODO add your handling code here:
        FrmFornecedores tela = new FrmFornecedores();
        tela.setVisible(true);
    }//GEN-LAST:event_controleFornecedoresActionPerformed

    private void abrirPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirPDVActionPerformed
        // TODO add your handling code here:
        FrmVendas tela = new FrmVendas();
        tela.setVisible(true);
    }//GEN-LAST:event_abrirPDVActionPerformed

    private void menuControleVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuControleVendasActionPerformed
        // TODO add your handling code here:
        FrmHistorico tela = new FrmHistorico();
        tela.setVisible(true);
    }//GEN-LAST:event_menuControleVendasActionPerformed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        // TODO add your handling code here:
        int op;
        
        op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?");
        if(op == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnSairMouseClicked

    private void trocarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocarUsuariosActionPerformed
        // TODO add your handling code here:
        FrmLogin tela = new FrmLogin();
        this.dispose();
        tela.setVisible(true);
        
    }//GEN-LAST:event_trocarUsuariosActionPerformed

    private void consultaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProdutosActionPerformed
        // TODO add your handling code here:
        FrmProdutos tela = new FrmProdutos();
        tela.painelComGuias.setSelectedIndex(1);
        tela.setVisible(true);
    }//GEN-LAST:event_consultaProdutosActionPerformed

    private void menuPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPosicaoActionPerformed
        // TODO add your handling code here:
        FrmTotalVenda tela = new FrmTotalVenda();
        tela.setVisible(true);
    }//GEN-LAST:event_menuPosicaoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirPDV;
    private javax.swing.JMenu btnSair;
    private javax.swing.JMenuItem consultaProdutos;
    private javax.swing.JMenuItem controleClientes;
    private javax.swing.JMenuItem controleEstoque;
    private javax.swing.JMenuItem controleFornecedores;
    private javax.swing.JMenuItem controleFuncionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JMenuItem menuControleVendas;
    public javax.swing.JMenuItem menuPosicao;
    private javax.swing.JMenuItem trocarUsuarios;
    // End of variables declaration//GEN-END:variables
}
