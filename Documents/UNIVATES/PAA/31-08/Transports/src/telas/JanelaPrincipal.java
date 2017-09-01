/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.ConexaoBD;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


/**
 *
 * @author Tainá Fiegenbaum
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblIcone = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jpessoas = new javax.swing.JMenu();
        jclientes = new javax.swing.JMenuItem();
        jatendentes = new javax.swing.JMenuItem();
        jprodutos = new javax.swing.JMenuItem();
        jcaminhao = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        ListCadastroPromocoes = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        listagem_produtos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenuItem6.setText("jMenuItem6");

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda Barber - Sistema de barbearia");

        jToolBar1.setRollover(true);

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/transp.jpg"))); // NOI18N
        lblIcone.setMaximumSize(new java.awt.Dimension(500, 300));
        lblIcone.setMinimumSize(new java.awt.Dimension(500, 300));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(lblIcone, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Cadastros");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jpessoas.setText("Pessoas");

        jclientes.setText("Clientes");
        jclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclientesActionPerformed(evt);
            }
        });
        jpessoas.add(jclientes);

        jatendentes.setText("Atendentes");
        jatendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jatendentesActionPerformed(evt);
            }
        });
        jpessoas.add(jatendentes);

        jMenu1.add(jpessoas);

        jprodutos.setText("Produto");
        jprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprodutosActionPerformed(evt);
            }
        });
        jMenu1.add(jprodutos);

        jcaminhao.setText("Caminhão");
        jcaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcaminhaoActionPerformed(evt);
            }
        });
        jMenu1.add(jcaminhao);

        jMenuItem4.setText("Endereço");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registrar");

        jMenuItem2.setText("Agenda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setText("Pagamento");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        menuRelatorios.setText("Relatórios");

        ListCadastroPromocoes.setText("Listagem - Promoções");
        ListCadastroPromocoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListCadastroPromocoesActionPerformed(evt);
            }
        });
        menuRelatorios.add(ListCadastroPromocoes);

        jMenuItem3.setText("Relatório - Promoções - por nome");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuRelatorios.add(jMenuItem3);

        listagem_produtos.setText("Listagem - Produtos");
        listagem_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listagem_produtosActionPerformed(evt);
            }
        });
        menuRelatorios.add(listagem_produtos);

        jMenuItem1.setText("Relatório - Produtos - por descrição");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuRelatorios.add(jMenuItem1);

        jMenuBar1.add(menuRelatorios);

        menuSistema.setText("Sistema");

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuSistema.add(menuItemSair);

        jMenuBar1.add(menuSistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jcaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcaminhaoActionPerformed
IfrCaminhao IfrCaminhao = new IfrCaminhao();
        jDesktopPane1.add(IfrCaminhao);
        IfrCaminhao.setVisible(true); 

    }//GEN-LAST:event_jcaminhaoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void ListCadastroPromocoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListCadastroPromocoesActionPerformed

    }//GEN-LAST:event_ListCadastroPromocoesActionPerformed

    private void jprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprodutosActionPerformed
       IfrProduto IfrProduto = new IfrProduto();
        jDesktopPane1.add(IfrProduto);
        IfrProduto.setVisible(true);
    }//GEN-LAST:event_jprodutosActionPerformed

    private void jatendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jatendentesActionPerformed

    }//GEN-LAST:event_jatendentesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void listagem_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listagem_produtosActionPerformed
              
    }//GEN-LAST:event_listagem_produtosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclientesActionPerformed
        
    }//GEN-LAST:event_jclientesActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ListCadastroPromocoes;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jatendentes;
    private javax.swing.JMenuItem jcaminhao;
    private javax.swing.JMenuItem jclientes;
    private javax.swing.JMenu jpessoas;
    private javax.swing.JMenuItem jprodutos;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JMenuItem listagem_produtos;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSistema;
    // End of variables declaration//GEN-END:variables
}
