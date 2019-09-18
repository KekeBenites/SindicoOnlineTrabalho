package br.com.sindicoonline.frm;

import br.com.sindicoonline.DAO.Bloco;
import br.com.sindicoonline.DAO.BlocoDAO;
import br.com.sindicoonline.DAO.Conexao;
import br.com.sindicoonline.DAO.Predio;
import br.com.sindicoonline.DAO.PredioDAO;
import br.com.sindicoonline.Utilits.Utilidades;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmBloco extends javax.swing.JInternalFrame {

    String opSAlvarEditar = "";
    int nPredio = 0;

    public frmBloco() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) jtBloco.getModel();
        jtBloco.setRowSorter(new TableRowSorter(modelo));

        lerTabela();
        populaCombo();

    }

    public void populaCombo() {
        PreparedStatement stmt = null;
        Connection con = Conexao.getConnection();
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM predio");
            rs = stmt.executeQuery();
            while (rs.next()) {
//                Esse funciona q é um abeleza.
                comboPredio.addItem(rs.getObject(2));
            }
        } catch (Exception e) {
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtNomeBloco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        txtIdBloco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        comboPredio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBloco = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Adicionar Blocos");
        setPreferredSize(new java.awt.Dimension(634, 558));

        btnEditar.setText("Editar Cadastro");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir Cadastro");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtNomeBloco.setEnabled(false);
        txtNomeBloco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeBlocoKeyPressed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel4.setText("Codigo:");

        btnNovo.setText("Novo Cadastro");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        txtIdBloco.setEnabled(false);

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        comboPredio.setEnabled(false);
        comboPredio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboPredioMouseClicked(evt);
            }
        });
        comboPredio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboPredioKeyPressed(evt);
            }
        });

        jLabel2.setText("Predio:");

        txtValor.setEnabled(false);
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
        });

        jLabel3.setText("Valor:");

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtIdBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtValor)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)))
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboPredio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtBloco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome Bloco", "Valor Comdominio", "Predio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtBloco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBlocoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtBloco);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        opSAlvarEditar = "editar";
        txtNomeBloco.setEnabled(true);
        comboPredio.setEnabled(true);
        btnSalvar.setEnabled(true);
        txtValor.setEnabled(true);
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtNomeBloco.requestFocus();
        btnCancelar.setEnabled(true);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Bloco bloco = new Bloco();
        BlocoDAO daoBloco = new BlocoDAO();
        try {
            if (jtBloco.getValueAt(jtBloco.getSelectedRow(), 0).toString() != "") {
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", title, JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    bloco.setIdBloco(Integer.valueOf(txtIdBloco.getText()));
                    daoBloco.deleteBloco(bloco);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Selecione algum item para excluir");
        }
        lerTabela();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtNomeBloco.setEnabled(true);
        comboPredio.setEnabled(true);
        btnSalvar.setEnabled(true);
        txtValor.setEnabled(true);
        btnNovo.setEnabled(false);
        txtNomeBloco.requestFocus();
        jtBloco.setEnabled(false);
        btnCancelar.setEnabled(true);
        txtNomeBloco.setText(null);
        txtValor.setText(null);
        txtIdBloco.setText(null);
        opSAlvarEditar = "salvar";

    }//GEN-LAST:event_btnNovoActionPerformed
//select idPredio from predio where nomePredio = "Cascavel"
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Bloco bloco = new Bloco();
        BlocoDAO daoBloco = new BlocoDAO();
        Predio p = new Predio();
        Utilidades util = new Utilidades();
        
       
        int codPredio = util.achaCodigoPredio((String)comboPredio.getSelectedItem());
        
        p.setIdPredio(codPredio);
        bloco.setNumeroBloco(txtNomeBloco.getText());
        bloco.setValorCondominio(Double.valueOf(txtValor.getText()));
        bloco.setPredio(p);

        try {
            if (opSAlvarEditar.equals("salvar")) {
                daoBloco.adicionarBloco(bloco);
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso.");
            } else {
                bloco.setIdBloco(Integer.valueOf(txtIdBloco.getText()));
                daoBloco.updateBloco(bloco);
                JOptionPane.showMessageDialog(null, "Registro editado com sucesso.");
            }
            txtNomeBloco.setEnabled(false);
            comboPredio.setEnabled(false);
            btnSalvar.setEnabled(false);
            txtValor.setEnabled(false);
            btnNovo.setEnabled(true);
            txtNomeBloco.setText(null);
            txtValor.setText(null);
            jtBloco.setEnabled(true);
           

            lerTabela();
        } catch (Exception e) {

        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeBlocoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeBlocoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtValor.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeBlocoKeyPressed

    private void comboPredioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboPredioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvar.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_comboPredioKeyPressed

    private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            comboPredio.requestFocus();
        }
    }//GEN-LAST:event_txtValorKeyPressed

    private void comboPredioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboPredioMouseClicked

    }//GEN-LAST:event_comboPredioMouseClicked

    private void jtBlocoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBlocoMouseClicked
        
        txtIdBloco.setText(jtBloco.getValueAt(jtBloco.getSelectedRow(), 0).toString());
        txtNomeBloco.setText(jtBloco.getValueAt(jtBloco.getSelectedRow(), 1).toString());
        txtValor.setText(jtBloco.getValueAt(jtBloco.getSelectedRow(), 2).toString());
        comboPredio.setSelectedItem(jtBloco.getValueAt(jtBloco.getSelectedRow(), 3).toString());
        
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);


    }//GEN-LAST:event_jtBlocoMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNomeBloco.setEnabled(false);
        comboPredio.setEnabled(false);
        btnSalvar.setEnabled(false);
        txtValor.setEnabled(false);
        btnNovo.setEnabled(true);
        txtNomeBloco.setText(null);
        txtValor.setText(null);
        btnCancelar.setEnabled(false);
        jtBloco.setEnabled(true);
      

    }//GEN-LAST:event_btnCancelarActionPerformed

    public void lerTabela() {

        DefaultTableModel modelo = (DefaultTableModel) jtBloco.getModel();
        modelo.setNumRows(0);
        BlocoDAO daoBloco = new BlocoDAO();
        Bloco bloco = new Bloco();

        for (Bloco b : daoBloco.readBlocoListaComNome(bloco)) {
            modelo.addRow(new Object[]{
                b.getIdBloco(),
                b.getNumeroBloco(),
                b.getValorCondominio(),
                b.getPredio().getNomePredio()});

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Object> comboPredio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtBloco;
    private javax.swing.JTextField txtIdBloco;
    private javax.swing.JTextField txtNomeBloco;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
