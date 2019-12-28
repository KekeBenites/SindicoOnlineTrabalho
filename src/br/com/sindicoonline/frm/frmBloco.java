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
        btnNovo.requestFocus();
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
        txtNomeBloco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdBloco = new javax.swing.JTextField();
        comboPredio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBloco = new javax.swing.JTable();

        setClosable(true);
        setTitle("Adicionar Blocos");
        setMaximumSize(new java.awt.Dimension(470, 560));
        setPreferredSize(new java.awt.Dimension(470, 560));

        txtNomeBloco.setToolTipText("Digite a identificação do bloco.");
        txtNomeBloco.setEnabled(false);
        txtNomeBloco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeBlocoKeyPressed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel4.setText("Codigo:");

        txtIdBloco.setEnabled(false);

        comboPredio.setToolTipText("Informa de qual predio o bloco pertence.");
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

        txtValor.setToolTipText("Valor do condominio.");
        txtValor.setEnabled(false);
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
        });

        jLabel3.setText("Valor:");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/add4545.png"))); // NOI18N
        btnNovo.setToolTipText("Novo Cadastro");
        btnNovo.setFocusable(false);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/delete4545.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir Cadastro");
        btnExcluir.setEnabled(false);
        btnExcluir.setFocusable(false);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/edit4545.png"))); // NOI18N
        btnEditar.setToolTipText("Editar Cadastro");
        btnEditar.setEnabled(false);
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

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
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/salvar4545.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar cadastro.");
        btnSalvar.setEnabled(false);
        btnSalvar.setFocusable(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtNomeBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(comboPredio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        btnEditar.setEnabled(false);
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
        
        int codPredio = util.achaCodigoPredio((String) comboPredio.getSelectedItem());
        
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
            btnCancelar.setEnabled(false);
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
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            txtNomeBloco.setEnabled(false);
            comboPredio.setEnabled(false);
            btnSalvar.setEnabled(false);
            txtValor.setEnabled(false);
            btnNovo.setEnabled(true);
            txtNomeBloco.setText(null);
            txtValor.setText(null);
            btnCancelar.setEnabled(false);
            jtBloco.setEnabled(true);
            
        }
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
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Object> comboPredio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtBloco;
    private javax.swing.JTextField txtIdBloco;
    private javax.swing.JTextField txtNomeBloco;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
