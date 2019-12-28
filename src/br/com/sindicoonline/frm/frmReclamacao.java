/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sindicoonline.frm;

import br.com.sindicoonline.DAO.Conexao;
import br.com.sindicoonline.DAO.Morador;
import br.com.sindicoonline.DAO.MoradorDAO;
import br.com.sindicoonline.DAO.Reclamacao;
import br.com.sindicoonline.DAO.ReclamacaoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmReclamacao extends javax.swing.JInternalFrame {

    String opSalvarEditar = "editar";

    /**
     * Creates new form frmReclamacao
     */
    public frmReclamacao(String usuario, String idMorador) {
        initComponents();

        txtNome.setText(usuario);
        txtIdMorador.setText(idMorador);

        lerTabela();

    }

    public void lerTabela() {

        DefaultTableModel modelo = (DefaultTableModel) jtReclamacao.getModel();
        modelo.setNumRows(0);
        Reclamacao reclamacao = new Reclamacao();

        ReclamacaoDAO daoReclamacao = new ReclamacaoDAO();

        for (Reclamacao r : daoReclamacao.readReclamacaoListaComNome(reclamacao, Integer.valueOf(txtIdMorador.getText()))) {
            modelo.addRow(new Object[]{
                r.getIdReclamacao(),
                r.getDescricaoReclamacao()

            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReclamacao = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtIdMorador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdReclamacao = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReclamacao = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Sindico Online - Reclamação");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/add4545.png"))); // NOI18N
        btnNovo.setToolTipText("Nova reclamação");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        txtNome.setEditable(false);

        jLabel1.setText("Nome:");

        jLabel4.setText("Reclamação:");

        txtReclamacao.setColumns(20);
        txtReclamacao.setRows(5);
        txtReclamacao.setEnabled(false);
        jScrollPane1.setViewportView(txtReclamacao);

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/salvar4545.png"))); // NOI18N
        btnEnviar.setToolTipText("Enviar a reclamação");
        btnEnviar.setEnabled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/edit4545.png"))); // NOI18N
        btnEditar.setToolTipText(" Editar reclamação.");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/delete4545.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir reclamação.");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtIdMorador.setEditable(false);

        jLabel3.setText("Id:");

        txtIdReclamacao.setEnabled(false);

        jtReclamacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo Reclamacao", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtReclamacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtReclamacaoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtReclamacao);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/cancelar Original.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar ação.");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(86, 86, 86)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdReclamacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdMorador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviar)
                        .addGap(86, 86, 86))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovo)
                        .addComponent(btnEditar)
                        .addComponent(btnExcluir))
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdMorador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdReclamacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEnviar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtReclamacao.setEditable(true);
        txtReclamacao.requestFocus();
        btnEnviar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtReclamacao.setEnabled(true);
        btnNovo.setEnabled(false);
        opSalvarEditar = "salvar";
        btnCancelar.setEnabled(true);
     
        txtReclamacao.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        Reclamacao reclama = new Reclamacao();
        ReclamacaoDAO daoReclama = new ReclamacaoDAO();

        reclama.setIdReclamacao(Integer.valueOf(txtIdReclamacao.getText()));

        try {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", title, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {

                daoReclama.deleteReclamacao(reclama);
                txtReclamacao.setText("");
                txtIdReclamacao.setText("");
            }
        } catch (Exception e) {
        }

        lerTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        Reclamacao reclama = new Reclamacao();
        ReclamacaoDAO daoREclama = new ReclamacaoDAO();
        Morador morador = new Morador();

        morador.setIdMorador(Integer.valueOf(txtIdMorador.getText()));
        reclama.setMorador(morador);
        reclama.setDescricaoReclamacao(txtReclamacao.getText());

        if (txtReclamacao.equals("")) {
            JOptionPane.showMessageDialog(null, "Escreva algo.");
        } else {

            try {

                if (opSalvarEditar.equals("salvar")) {
                    daoREclama.adicionarBloco(reclama);
                    JOptionPane.showMessageDialog(null, "Reclamacao SALVA com sucesso.");
                    txtReclamacao.setEditable(false);
                    btnNovo.setEnabled(true);
                    btnNovo.requestFocus();
                    btnEnviar.setEnabled(false);
                    btnEditar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    txtReclamacao.setEnabled(false);
                    opSalvarEditar = "editar";
                    btnCancelar.setEnabled(false);
                   
                    txtIdReclamacao.setText("");
                    txtNome.setText("");
                    txtReclamacao.setText("");

                } else {
                    reclama.setIdReclamacao(Integer.valueOf(txtIdReclamacao.getText()));
                    daoREclama.updateReclamacao(reclama);
                    JOptionPane.showMessageDialog(null, "Reclamacao ALTERADA com sucesso.");
                    txtReclamacao.setEditable(false);
                    btnNovo.setEnabled(true);
                    btnNovo.requestFocus();
                    btnEnviar.setEnabled(false);
                    btnEditar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    txtReclamacao.setEnabled(false);
                    opSalvarEditar = "editar";
                    btnCancelar.setEnabled(false);
                    
                    txtIdReclamacao.setText("");
                    txtNome.setText("");
                    txtReclamacao.setText("");

                }
            } catch (Exception e) {
            }

        }
        lerTabela();

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void jtReclamacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtReclamacaoMouseClicked
        txtIdReclamacao.setText(jtReclamacao.getValueAt(jtReclamacao.getSelectedRow(), 0).toString());
        txtReclamacao.setText(jtReclamacao.getValueAt(jtReclamacao.getSelectedRow(), 1).toString());
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_jtReclamacaoMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnCancelar.setEnabled(true);
        txtReclamacao.setEnabled(true);
        btnEnviar.setEnabled(true);
        txtReclamacao.setEnabled(true);
        txtReclamacao.setEditable(true);
        opSalvarEditar = "editar";

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {

            btnCancelar.setEnabled(false);
            btnNovo.setEnabled(true);
            btnExcluir.setEnabled(false);
            btnEditar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnEnviar.setEnabled(false);

            txtIdMorador.setText("");
            txtIdReclamacao.setText("");
            txtNome.setText("");
            txtReclamacao.setText("");

            txtIdMorador.setEnabled(false);
            txtIdReclamacao.setEnabled(false);
            txtNome.setEnabled(false);
            txtReclamacao.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtReclamacao;
    private javax.swing.JTextField txtIdMorador;
    private javax.swing.JTextField txtIdReclamacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtReclamacao;
    // End of variables declaration//GEN-END:variables
}
