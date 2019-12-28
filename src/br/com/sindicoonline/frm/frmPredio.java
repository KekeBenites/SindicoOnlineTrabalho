package br.com.sindicoonline.frm;

import br.com.sindicoonline.DAO.Predio;
import br.com.sindicoonline.DAO.PredioDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public final class frmPredio extends javax.swing.JInternalFrame {

    public frmPredio() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTPredio.getModel();
        jTPredio.setRowSorter(new TableRowSorter(modelo));

        lerTabela();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtNomePredio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        txtIdPredio = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPredio = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Predios");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/edit4545.png"))); // NOI18N
        btnEditar.setToolTipText("Editar Cadastro");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/delete4545.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir Predio");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtNomePredio.setToolTipText("Digite o nome do predio para cadastrar.");
        txtNomePredio.setEnabled(false);
        txtNomePredio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomePredioKeyPressed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel4.setText("Codigo:");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/add4545.png"))); // NOI18N
        btnNovo.setToolTipText("Novo Cadastro");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        txtIdPredio.setToolTipText("Codigo referente ao cadastro.");
        txtIdPredio.setEnabled(false);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/salvar4545.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar predio.");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jTPredio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTPredio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPredioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTPredio);
        if (jTPredio.getColumnModel().getColumnCount() > 0) {
            jTPredio.getColumnModel().getColumn(0).setMinWidth(40);
            jTPredio.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/cancelar Original.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar ação.");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomePredio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdPredio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtNomePredio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public int testarEditarSalvar = 0;

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        txtNomePredio.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtNomePredio.requestFocus();
        btnCancelar.setEnabled(true);
        txtIdPredio.setText("");
        txtNomePredio.setText("");

    }//GEN-LAST:event_btnNovoActionPerformed


    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Predio predio = new Predio();
        PredioDAO daoPredio = new PredioDAO();
        if (testarEditarSalvar == 0) {
            try {

                predio.setNomePredio(txtNomePredio.getText());

                if (txtNomePredio.getText() == null || txtNomePredio.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite o nome do Predio");
                    txtNomePredio.requestFocus();
                } else {
                    daoPredio.adicionarPredio(predio);

                    JOptionPane.showMessageDialog(null, "Registro savo com sucesso.");

                    txtNomePredio.setEnabled(false);
                    btnSalvar.setEnabled(false);
                    btnNovo.setEnabled(true);
                    txtNomePredio.setText(null);
 
                    btnCancelar.setEnabled(false);
                    btnNovo.requestFocus();
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar");
            } catch (Exception ex) {
                System.out.println("ERRO ao SALVAR" + ex);
            }
        } else if (testarEditarSalvar == 1) {

            try {
                predio.setIdPredio(Integer.parseInt(txtIdPredio.getText()));
                predio.setNomePredio(txtNomePredio.getText());

//            double valor = Double.parseDouble(txtValorCondominioPredio.getText().replace(",", "."));
//            predio.setValorCondominio(valor);
                if (txtNomePredio.getText() == null || txtNomePredio.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite o nome do Predio");
                      txtNomePredio.requestFocus();
                } else {
                    daoPredio.updatePredio(predio);
                    System.out.println("Salvo com sucesso.");
                    JOptionPane.showMessageDialog(null, "Registro alterado com sucesso.");

                    txtNomePredio.setEnabled(false);

                    btnSalvar.setEnabled(false);
                    btnNovo.setEnabled(true);
                    btnNovo.requestFocus();
                    txtIdPredio.setText(null);

                    txtNomePredio.setText(null);
                    btnCancelar.setEnabled(false);

                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um valor valido no campo (R$).");
            } catch (Exception ex) {
                System.out.println("ERRO ao SALVAR" + ex);
            }

        }

        lerTabela();

        testarEditarSalvar = 0;
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jTPredioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPredioMouseClicked
        txtIdPredio.setText(jTPredio.getValueAt(jTPredio.getSelectedRow(), 0).toString());
        txtNomePredio.setText(jTPredio.getValueAt(jTPredio.getSelectedRow(), 1).toString());
        btnExcluir.setEnabled(true);
        btnEditar.setEnabled(true);

    }//GEN-LAST:event_jTPredioMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        testarEditarSalvar = 1;
        try {
            if (jTPredio.getValueAt(jTPredio.getSelectedRow(), 0).toString() != "") {
                // TODO add your handling code here:
                txtNomePredio.setEnabled(true);

                btnSalvar.setEnabled(true);
                btnNovo.setEnabled(false);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                txtNomePredio.requestFocus();
                btnCancelar.setEnabled(true);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Selecione algum item");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Predio predio = new Predio();
        PredioDAO daoPredio = new PredioDAO();

        try {
            if (jTPredio.getValueAt(jTPredio.getSelectedRow(), 0).toString() != "") {
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", title, JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    predio.setIdPredio(Integer.parseInt(txtIdPredio.getText()));
                    daoPredio.deletePredio(predio);
                    btnNovo.setEnabled(true);
                    btnNovo.requestFocus();
                    btnEditar.setEnabled(false);
                    btnExcluir.setEnabled(false);

                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Selecione algum item para excluir");
        }
        lerTabela();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            txtIdPredio.setText("");
            txtNomePredio.setText("");
            txtNomePredio.setEnabled(false);
            btnNovo.setEnabled(true);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnSalvar.setEnabled(false);

        }// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNomePredioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomePredioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvar.requestFocus();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtNomePredioKeyPressed

    public void lerTabela() {

        DefaultTableModel modelo = (DefaultTableModel) jTPredio.getModel();
        modelo.setNumRows(0);
        PredioDAO pdao = new PredioDAO();
        Predio predio = new Predio();

        for (Predio p : pdao.readPredioLista(predio)) {
            modelo.addRow(new Object[]{
                p.getIdPredio(),
                p.getNomePredio(),});

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPredio;
    private javax.swing.JTextField txtIdPredio;
    private javax.swing.JTextField txtNomePredio;
    // End of variables declaration//GEN-END:variables
}
