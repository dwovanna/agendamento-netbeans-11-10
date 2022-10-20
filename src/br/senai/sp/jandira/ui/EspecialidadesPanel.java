package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class EspecialidadesPanel extends javax.swing.JPanel {
    
    private int linha;

    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidades();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonNovo = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de especialidades:"));
        setPreferredSize(new java.awt.Dimension(800, 310));
        setLayout(null);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 780, 210);

        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/x (1).png"))); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        add(buttonExcluir);
        buttonExcluir.setBounds(480, 250, 90, 40);

        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/lapis.png"))); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        add(buttonEditar);
        buttonEditar.setBounds(590, 250, 90, 40);

        buttonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/nova-pagina.png"))); // NOI18N
        buttonNovo.setText("Novo");
        buttonNovo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });
        add(buttonNovo);
        buttonNovo.setBounds(700, 250, 90, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
         linha = tableEspecialidades.getSelectedRow();
       if (getLinha() != -1) {
           excluirEspecialidade(linha);
       } else {
           JOptionPane.showMessageDialog(this, "Por favor, selecione a especialidade que voce deseja exccluir!", "Atenção", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_buttonExcluirActionPerformed
       
    private void excluirEspecialidade(int linha1){
            

    int resposta = JOptionPane.showConfirmDialog(this,
            "voce realmente deseja excluir?",
            "ATENÇÃO",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

            System.out.println(resposta);
  if(resposta == 0){

    EspecialidadeDAO.excluir(getCodigo());

    preencherTabela();

}
       }
       
       private Integer getCodigo() {
           String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();
           Integer codigo = Integer.valueOf(codigoStr);
           return codigo;
  
       }

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        
       if(getLinha() != -1) {
           editarEspecialidade();
           
       }else{
           JOptionPane.showConfirmDialog(this, "Por Favor selecione a especialidade que voce deseja editar.",
                   "Especialidades",
                   JOptionPane.WARNING_MESSAGE);
       }
        
        
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void editarEspecialidade() {
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, especialidade, OperacaoEnum.EDITAR);
        especialidadeDialog.setVisible(true);
        preencherTabela();
        
        
    }
    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
       EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, OperacaoEnum.ADICIONAR);
       especialidadeDialog.setVisible(true);
       preencherTabela();
    }//GEN-LAST:event_buttonNovoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
      
        tableEspecialidades.setModel(EspecialidadeDAO.getEspecialidadesModel());
        ajustarTabela();

    }
    
    private void ajustarTabela() {
        // impedir que o usuário movimente as colunas 
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);
        // bloquear a edição das celulas da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);
        
        // Definir largura das colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(250);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(427);
        
    }
    
    
    
}


