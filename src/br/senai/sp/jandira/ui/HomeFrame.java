package br.senai.sp.jandira.ui;

import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {
    
    private EspecialidadesPanel especialidadesPanel;
    
    private final int POS_X = 20;
    private final int POS_Y = 200;
    private final int LARGURA = 800;
    private final int ALTURA = 310;

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagem/calendario.png")));
        initPanels();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        ButtonEspecialidades = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        ButtonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema para Agendamento de Consultas");
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        panelHome.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Especialidades:"));
        panelHome.setToolTipText("");
        panelHome.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 51, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 255));
        jLabel2.setText("SISACON");
        panelHome.add(jLabel2);
        jLabel2.setBounds(10, 90, 120, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel3);
        jLabel3.setBounds(10, 130, 280, 20);

        jLabel4.setText("E-mail: dwovanna@hotmail.com");
        panelHome.add(jLabel4);
        jLabel4.setBounds(610, 190, 180, 16);

        jLabel5.setText("Telefone: (11) 40028922");
        panelHome.add(jLabel5);
        jLabel5.setBounds(660, 210, 130, 16);

        jLabel6.setText("www.sisacon.com.br");
        panelHome.add(jLabel6);
        jLabel6.setBounds(670, 230, 120, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Suporte Técnico:");
        panelHome.add(jLabel7);
        jLabel7.setBounds(660, 160, 120, 20);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        panelHome.add(jPanel1);
        jPanel1.setBounds(20, 80, 760, 0);

        jPanel3.setBackground(new java.awt.Color(204, 102, 255));
        panelHome.add(jPanel3);
        jPanel3.setBounds(10, 150, 770, 3);

        getContentPane().add(panelHome);
        panelHome.setBounds(20, 200, 800, 310);

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
        jButton5.setBounds(770, 110, 60, 26);

        ButtonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/gestao.png"))); // NOI18N
        ButtonEspecialidades.setText("Especialidadades");
        ButtonEspecialidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ButtonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEspecialidades);
        ButtonEspecialidades.setBounds(560, 120, 130, 50);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/do-utilizador.png"))); // NOI18N
        jButton7.setText("Médicos");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(320, 120, 90, 50);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/cartao-de-credito.png"))); // NOI18N
        jButton8.setText("Plano de Saúde");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(420, 120, 130, 50);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/contrato (1).png"))); // NOI18N
        jButton9.setText("Agenda");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jButton9);
        jButton9.setBounds(120, 120, 90, 50);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/publico.png"))); // NOI18N
        jButton10.setText("Paciente");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(220, 120, 90, 50);

        ButtonHome.setBackground(new java.awt.Color(204, 204, 255));
        ButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/casa.png"))); // NOI18N
        ButtonHome.setText("Home");
        ButtonHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonHome);
        ButtonHome.setBounds(10, 120, 100, 50);

        setBounds(0, 0, 855, 536);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ButtonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEspecialidadesActionPerformed
        ButtonEspecialidades.setBackground(new java.awt.Color(204, 204, 255));
        ButtonHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(true);
        
    }//GEN-LAST:event_ButtonEspecialidadesActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHomeActionPerformed
        ButtonHome.setBackground(new java.awt.Color(204, 204, 255));
        ButtonEspecialidades.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setVisible(true);
        especialidadesPanel.setVisible(false);
        
    }//GEN-LAST:event_ButtonHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEspecialidades;
    private javax.swing.JButton ButtonHome;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        getContentPane().add(especialidadesPanel);
        especialidadesPanel.setVisible(true);
    }

}


