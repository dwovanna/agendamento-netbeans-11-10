package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Frame;
import java.awt.TextField;
import javax.swing.JOptionPane;

public class EspecialidadeDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;

    public EspecialidadeDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, true);
        initComponents();

        this.operacao = operacao;

        preencherTitulo();

    }

    public EspecialidadeDialog(java.awt.Frame parent, boolean modal, Especialidade e, OperacaoEnum operacao) {
        super(parent, true);
        initComponents();

        especialidade = e;
        this.operacao = operacao;
        preencherFormulario();
        preencherTitulo();

    }

    private void preencherFormulario() {
        TextFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNomeEspecialidade.setText(especialidade.getNome());
        textFieldDescricaoEspecialidade.setText(especialidade.getDescricao());

    }

    private void preencherTitulo() {
        labelEspecialidade.setText("Especialidade - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/editar.png")));
        } else {
            labelEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/adicionar.png")));
        }
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelEspecialidade = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        NomeCodigo = new javax.swing.JLabel();
        TextFieldCodigo = new javax.swing.JTextField();
        NomeEspecialidade = new javax.swing.JLabel();
        textFieldNomeEspecialidade = new javax.swing.JTextField();
        DescricaoEspecialidade = new javax.swing.JLabel();
        textFieldDescricaoEspecialidade = new javax.swing.JTextField();
        ButtonCancelar = new javax.swing.JButton();
        ButtonSalvar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        labelEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/adicionar (1).png"))); // NOI18N
        labelEspecialidade.setText("ESPECIALIDADES - ADICONAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEspecialidade, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NomeCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeCodigo.setText("Código");

        TextFieldCodigo.setEditable(false);
        TextFieldCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCodigoActionPerformed(evt);
            }
        });

        NomeEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeEspecialidade.setText("Nome da Especialidade");

        textFieldNomeEspecialidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textFieldNomeEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeEspecialidadeActionPerformed(evt);
            }
        });

        DescricaoEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DescricaoEspecialidade.setText("Descrição da Especialidade");

        textFieldDescricaoEspecialidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textFieldDescricaoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescricaoEspecialidadeActionPerformed(evt);
            }
        });

        ButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/x (1).png"))); // NOI18N
        ButtonCancelar.setText("CANCELAR");
        ButtonCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/importar.png"))); // NOI18N
        ButtonSalvar.setText("SALVAR");
        ButtonSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescricaoEspecialidade)
                    .addComponent(NomeEspecialidade)
                    .addComponent(NomeCodigo)
                    .addComponent(TextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNomeEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDescricaoEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(338, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonCancelar)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(NomeCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(NomeEspecialidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNomeEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(DescricaoEspecialidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldDescricaoEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(ButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoActionPerformed

    }//GEN-LAST:event_TextFieldCodigoActionPerformed

    private void textFieldNomeEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeEspecialidadeActionPerformed

    }//GEN-LAST:event_textFieldNomeEspecialidadeActionPerformed

    private void textFieldDescricaoEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescricaoEspecialidadeActionPerformed

    }//GEN-LAST:event_textFieldDescricaoEspecialidadeActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        dispose();

    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed
    private void editar() {
        especialidade.setNome(textFieldNomeEspecialidade.getText());
        especialidade.setDescricao(textFieldDescricaoEspecialidade.getText());

        EspecialidadeDAO.atualizar(especialidade);
        JOptionPane.showMessageDialog(null, "Especialidade atualizada com sucesso!", "Especialidades", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

    private void adicionar() {
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNomeEspecialidade.getText());
        novaEspecialidade.setDescricao(textFieldDescricaoEspecialidade.getText());

        EspecialidadeDAO.gravar(novaEspecialidade);
        JOptionPane.showMessageDialog(null, "Especialidade gravada com sucesso", "Especialidade", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel DescricaoEspecialidade;
    private javax.swing.JLabel NomeCodigo;
    private javax.swing.JLabel NomeEspecialidade;
    private javax.swing.JTextField TextFieldCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelEspecialidade;
    private javax.swing.JTextField textFieldDescricaoEspecialidade;
    private javax.swing.JTextField textFieldNomeEspecialidade;
    // End of variables declaration//GEN-END:variables

    private static class TextFieldNomedaEspecialidade {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public TextFieldNomedaEspecialidade() {
        }
    }
}
