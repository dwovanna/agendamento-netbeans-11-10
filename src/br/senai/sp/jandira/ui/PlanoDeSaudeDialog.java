package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {
    
   
    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;

    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        
       super(parent, true);
       
        initComponents();
        this.operacao = operacao;

        preencherTitulo();
    }
    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal, PlanoDeSaude p, OperacaoEnum operacao) {
        super(parent, true);
        initComponents();

        planoDeSaude = p;
        this.operacao = operacao;
        preencherFormulario();
        preencherTitulo();

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelPlanoDeSaude = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        TextFieldCodigo = new javax.swing.JTextField();
        labelNumeroDoPlano = new javax.swing.JLabel();
        TextFieldNumero = new javax.swing.JTextField();
        labelOperadoraDoPlano = new javax.swing.JLabel();
        TextFieldCategoria = new javax.swing.JTextField();
        labelCategoriaDoPlano = new javax.swing.JLabel();
        TextFieldOperadora = new javax.swing.JTextField();
        labelValidadeDoPlano = new javax.swing.JLabel();
        TextFieldValidade = new javax.swing.JTextField();
        ButtonSalvar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        labelPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/cartoes-de-credito.png"))); // NOI18N
        labelPlanoDeSaude.setText("Plano De Saúde");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelPlanoDeSaude)
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelPlanoDeSaude)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Plano de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel2.setToolTipText("");

        labelCodigo.setText("Código:");

        labelNumeroDoPlano.setText("Número do Plano:");

        labelOperadoraDoPlano.setText("Operadora do Plano:");

        TextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCategoriaActionPerformed(evt);
            }
        });

        labelCategoriaDoPlano.setText("Categoria do Plano:");

        TextFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldOperadoraActionPerformed(evt);
            }
        });

        labelValidadeDoPlano.setText("Validade do Plano:");

        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/importar.png"))); // NOI18N
        ButtonSalvar.setText("Salvar");

        ButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/x (1).png"))); // NOI18N
        ButtonExcluir.setText("Excluir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo)
                            .addComponent(TextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNumeroDoPlano)
                            .addComponent(TextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCategoriaDoPlano)
                            .addComponent(TextFieldCategoria)
                            .addComponent(labelValidadeDoPlano)
                            .addComponent(TextFieldValidade, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addGap(148, 148, 148))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TextFieldOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelOperadoraDoPlano)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonSalvar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(labelCategoriaDoPlano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelValidadeDoPlano)
                        .addGap(5, 5, 5)
                        .addComponent(TextFieldValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(labelNumeroDoPlano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(labelOperadoraDoPlano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldOperadoraActionPerformed

    private void TextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JTextField TextFieldCategoria;
    private javax.swing.JTextField TextFieldCodigo;
    private javax.swing.JTextField TextFieldNumero;
    private javax.swing.JTextField TextFieldOperadora;
    private javax.swing.JTextField TextFieldValidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCategoriaDoPlano;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNumeroDoPlano;
    private javax.swing.JLabel labelOperadoraDoPlano;
    private javax.swing.JLabel labelPlanoDeSaude;
    private javax.swing.JLabel labelValidadeDoPlano;
    // End of variables declaration//GEN-END:variables

    private void preencherFormulario() {
        TextFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        TextFieldOperadora.setText(planoDeSaude.getOperadora());
        TextFieldCategoria.setText(planoDeSaude.getCategoria());
        TextFieldNumero.setText(planoDeSaude.getNumero());
        TextFieldValidade.setText(planoDeSaude.getValidade().toString());
    }

    private void preencherTitulo() {
        labelPlanoDeSaude.setText("Plano De Saúde - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/editar.png")));
        } else {
            labelPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/adicionar.png")));
        }

    }
    
      private void editar() {
        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
        novoPlanoDeSaude.setOperadora(TextFieldOperadora.getText());
        novoPlanoDeSaude.setCategoria(TextFieldCategoria.getText());
        novoPlanoDeSaude.setNumero(TextFieldNumero.getText());
        novoPlanoDeSaude.setValidade(LocalDate.parse(TextFieldValidade.getText(), DateTimeFormatter.ISO_DATE));

        PlanoDeSaudeDAO.atualizar(novoPlanoDeSaude);
        JOptionPane.showMessageDialog(null, "Plano de Saúde gravada com sucesso", "Especialidade", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void adicionar() {
        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
        novoPlanoDeSaude.setOperadora(TextFieldOperadora.getText());
        novoPlanoDeSaude.setCategoria(TextFieldCategoria.getText());
        novoPlanoDeSaude.setNumero(TextFieldNumero.getText());
        novoPlanoDeSaude.setValidade(LocalDate.parse(TextFieldValidade.getText(), DateTimeFormatter.ISO_DATE));

        PlanoDeSaudeDAO.gravar(novoPlanoDeSaude);
        JOptionPane.showMessageDialog(null, "Plano de Saúde gravada com sucesso", "Especialidade", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
}
