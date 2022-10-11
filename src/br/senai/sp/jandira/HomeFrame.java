
package br.senai.sp.jandira;

import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagem/calendario.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema para Agendamento de Consultas");
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(null);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 770, 110);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/nova-pagina.png"))); // NOI18N
        jButton1.setText("Novo");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(700, 250, 90, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/lapis.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(590, 250, 90, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/x (1).png"))); // NOI18N
        jButton3.setText("Excluir");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(480, 250, 90, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 200, 800, 310);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/calendario.png"))); // NOI18N
        jLabel1.setText("SISTEMA PARA AGENDAMENTO DE CONSULTAS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(25, 11, 577, 64);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 840, 101);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/pular.png"))); // NOI18N
        jButton5.setText("Sair");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(740, 120, 80, 50);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/gestao.png"))); // NOI18N
        jButton6.setText("Especialidadades");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(540, 120, 150, 50);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/do-utilizador.png"))); // NOI18N
        jButton7.setText("Médicos");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(260, 120, 110, 50);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/cartao-de-credito.png"))); // NOI18N
        jButton8.setText("Plano de Saúde");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(380, 120, 150, 50);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/contrato (1).png"))); // NOI18N
        jButton9.setText("Agenda");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jButton9);
        jButton9.setBounds(20, 120, 110, 50);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/publico.png"))); // NOI18N
        jButton10.setText("Paciente");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(140, 120, 110, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

private void preencherTabela() {
    String [][] dados = {
        {"100", "Jandira","SP"},
        {"200", "Itapevi","SP"},
        {"300", "Cotia","SP"},
        {"400", "Barueri","SP"},
        {"500", "Curitiba","PR"},
        {"500", "Foetaleza","CE"},
    };
    
    String[] titulos = {"Código", "Nome da Cidade","Estado"};
    DefaultTableModel modelo= new DefaultTableModel(dados, titulos);
    
    
}








}
