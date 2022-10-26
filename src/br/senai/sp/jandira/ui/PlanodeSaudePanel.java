
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PlanodeSaudePanel extends javax.swing.JPanel {
    
    private int linha;

    public PlanodeSaudePanel() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanoDeSaude();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        PanelPlanoDeSaude = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        buttonNovo = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        tableEspecialidades.setToolTipText("");
        jScrollPane1.setViewportView(tableEspecialidades);

        setPreferredSize(new java.awt.Dimension(800, 310));
        setLayout(null);

        PanelPlanoDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plano de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePlanoDeSaude.setToolTipText("");
        jScrollPane2.setViewportView(tablePlanoDeSaude);

        javax.swing.GroupLayout PanelPlanoDeSaudeLayout = new javax.swing.GroupLayout(PanelPlanoDeSaude);
        PanelPlanoDeSaude.setLayout(PanelPlanoDeSaudeLayout);
        PanelPlanoDeSaudeLayout.setHorizontalGroup(
            PanelPlanoDeSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        PanelPlanoDeSaudeLayout.setVerticalGroup(
            PanelPlanoDeSaudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPlanoDeSaudeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(PanelPlanoDeSaude);
        PanelPlanoDeSaude.setBounds(20, 10, 800, 240);

        buttonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/nova-pagina.png"))); // NOI18N
        buttonNovo.setText("Novo");
        buttonNovo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });
        add(buttonNovo);
        buttonNovo.setBounds(710, 260, 80, 30);

        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/editar.png"))); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        add(buttonEditar);
        buttonEditar.setBounds(620, 260, 80, 30);

        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/x (1).png"))); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        add(buttonExcluir);
        buttonExcluir.setBounds(530, 260, 80, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed

        if(getLinha() != -1) {
            editarPlanoDeSaude();

        }else{
            JOptionPane.showConfirmDialog(this, "Por Favor selecione o Plano de Saúde que voce deseja editar.",
                "Plano de Saúde",
                JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
         linha = tablePlanoDeSaude.getSelectedRow();
        if (getLinha() != -1) {
            excluirPlanoDeSaude();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o Plano de Saúde que voce deseja exccluir!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPlanoDeSaude;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableEspecialidades;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        tablePlanoDeSaude.setModel(PlanoDeSaudeDAO.getPlanoDeSaudeModel());
        ajustarTabela();
    }
    
     private void ajustarTabela() {
        // impedir que o usuário movimente as colunas 
        tablePlanoDeSaude.getTableHeader().setReorderingAllowed(false);
        // bloquear a edição das celulas da tabela
        tablePlanoDeSaude.setDefaultEditor(Object.class, null);
        
        // Definir largura das colunas
        tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(250);
        tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(427);
        
    }
    


   


    private void excluirPlanoDeSaude() {
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, planoDeSaude, OperacaoEnum.EDITAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }

    private void editarPlanoDeSaude() {
         PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, planoDeSaude, OperacaoEnum.EDITAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }

    private Integer getCodigo() {
    String codigoStr = tablePlanoDeSaude.getValueAt(getLinha(), 0).toString();
           Integer codigo = Integer.valueOf(codigoStr);
           return codigo;
    


    
}

    private int getLinha() {
          linha = tablePlanoDeSaude.getSelectedRow();
        return linha;
    }
}
