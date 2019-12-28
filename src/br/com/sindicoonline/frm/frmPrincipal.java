package br.com.sindicoonline.frm;

import br.com.sindicoonline.DAO.Conexao;
import br.com.sindicoonline.DAO.Morador;
import br.com.sindicoonline.DAO.Predio;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal(String usuario) {
        initComponents();

        lblUsuario.setText(usuario);
        if (lblUsuario.getText().equals("sindico")) {

        } else {
            frmAvisos avisos = new frmAvisos();
            painelPrincipal.add(avisos);
            avisos.setVisible(true);
        }

        Connection conn = Conexao.getConnection();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select idMorador from morador where loginMorador = '" + lblUsuario.getText() + "'");
            rs.first();
            lblIdMorador.setText(rs.getString("idMorador"));

        } catch (SQLException e) {

        }

        if (lblUsuario.getText().equals("sindico")) {
            btnSindico.setVisible(true);
        } else {
            btnSindico.setVisible(false);
        }

    }

    private frmPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        painelPrincipal = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblIdMorador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPrincipal = new javax.swing.JLabel();
        btnAgenda = new javax.swing.JLabel();
        btnFatura = new javax.swing.JLabel();
        btnBoleto = new javax.swing.JLabel();
        btnQuadroAviso = new javax.swing.JLabel();
        btnReclamacao = new javax.swing.JLabel();
        btnduvidas = new javax.swing.JLabel();
        btnSindico = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(0, 0));
        setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        painelPrincipal.setBackground(new java.awt.Color(255, 51, 102));
        painelPrincipal.setName(""); // NOI18N
        painelPrincipal.setOpaque(false);

        jButton1.setText("Sair");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblUsuario.setText("jLabel1");

        lblIdMorador.setText("id");

        jLabel1.setText("Usuario:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/background.jpg"))); // NOI18N

        painelPrincipal.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelPrincipal.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelPrincipal.setLayer(lblIdMorador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelPrincipal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblIdMorador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 778, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblIdMorador)
                        .addComponent(lblUsuario))))
        );

        btnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/icons8-icons8-novo-logotipo-64.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrincipal.setOpaque(true);
        btnPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrincipalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseReleased(evt);
            }
        });

        btnAgenda.setBackground(new java.awt.Color(255, 255, 255));
        btnAgenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/icons8-calendário-64 (1).png"))); // NOI18N
        btnAgenda.setText("Agenda");
        btnAgenda.setToolTipText("Agende sua festa");
        btnAgenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgenda.setOpaque(true);
        btnAgenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgendaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgendaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAgendaMouseReleased(evt);
            }
        });

        btnFatura.setBackground(new java.awt.Color(255, 255, 255));
        btnFatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/icons8-fatura-64.png"))); // NOI18N
        btnFatura.setText("Extrato");
        btnFatura.setToolTipText("Pegue o relatório de gastos do seu predio.");
        btnFatura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFatura.setOpaque(true);
        btnFatura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFaturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFaturaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFaturaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFaturaMouseReleased(evt);
            }
        });

        btnBoleto.setBackground(new java.awt.Color(255, 255, 255));
        btnBoleto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBoleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/icons8-notícias-64.png"))); // NOI18N
        btnBoleto.setText("Boleto");
        btnBoleto.setToolTipText("Emita seu boleto do condominio.");
        btnBoleto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBoleto.setOpaque(true);
        btnBoleto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBoletoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBoletoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBoletoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBoletoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBoletoMouseReleased(evt);
            }
        });

        btnQuadroAviso.setBackground(new java.awt.Color(255, 255, 255));
        btnQuadroAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnQuadroAviso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/icons8-sair-64.png"))); // NOI18N
        btnQuadroAviso.setText("Quadro Aviso");
        btnQuadroAviso.setToolTipText("Quadro de Aviso");
        btnQuadroAviso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuadroAviso.setOpaque(true);
        btnQuadroAviso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuadroAviso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuadroAvisoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuadroAvisoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuadroAvisoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnQuadroAvisoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnQuadroAvisoMouseReleased(evt);
            }
        });

        btnReclamacao.setBackground(new java.awt.Color(255, 255, 255));
        btnReclamacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReclamacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/icons8-homem-conversando-64.png"))); // NOI18N
        btnReclamacao.setText("Reclamação");
        btnReclamacao.setToolTipText("Faça sua reclamacao");
        btnReclamacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReclamacao.setOpaque(true);
        btnReclamacao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReclamacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReclamacaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReclamacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReclamacaoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReclamacaoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReclamacaoMouseReleased(evt);
            }
        });

        btnduvidas.setBackground(new java.awt.Color(255, 255, 255));
        btnduvidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnduvidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/icons8-pergunte-64.png"))); // NOI18N
        btnduvidas.setText("Ajuda");
        btnduvidas.setToolTipText("Tire suas duvidas");
        btnduvidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnduvidas.setOpaque(true);
        btnduvidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnduvidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnduvidasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnduvidasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnduvidasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnduvidasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnduvidasMouseReleased(evt);
            }
        });

        btnSindico.setBackground(new java.awt.Color(255, 255, 255));
        btnSindico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSindico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sindicoonline/Icones/icons8-macho-de-configurações-de-admin-64.png"))); // NOI18N
        btnSindico.setText("Sindico");
        btnSindico.setToolTipText("Área do sindico");
        btnSindico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSindico.setOpaque(true);
        btnSindico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSindico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSindicoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSindicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSindicoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSindicoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSindicoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnFatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnBoleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnQuadroAviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnReclamacao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnduvidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnSindico)
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(painelPrincipal)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrincipal)
                    .addComponent(btnAgenda)
                    .addComponent(btnFatura)
                    .addComponent(btnBoleto)
                    .addComponent(btnQuadroAviso)
                    .addComponent(btnReclamacao)
                    .addComponent(btnduvidas)
                    .addComponent(btnSindico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPrincipal))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Mouse release
    int r = 240;
    int g = 240;
    int b = 240;
    //Mouse pressed
    int rp = 102;
    int gp = 102;
    int bp = 102;

    int normal = 255;


    private void btnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseEntered
        btnPrincipal.setBackground(new Color(r, g, b));
    }//GEN-LAST:event_btnPrincipalMouseEntered

    private void btnPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseExited
        btnPrincipal.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnPrincipalMouseExited

    private void btnPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMousePressed
        btnPrincipal.setBackground(new Color(rp, gp, bp));
    }//GEN-LAST:event_btnPrincipalMousePressed

    private void btnPrincipalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseReleased
        btnPrincipal.setBackground(new Color(normal, normal, normal));        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrincipalMouseReleased

    private void btnAgendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendaMouseEntered
        btnAgenda.setBackground(new Color(r, g, b));   // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendaMouseEntered

    private void btnAgendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendaMouseExited
        btnAgenda.setBackground(new Color(normal, normal, normal)); // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendaMouseExited

    private void btnAgendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendaMousePressed
        btnAgenda.setBackground(new Color(rp, gp, bp));// TODO add your handling code here:
    }//GEN-LAST:event_btnAgendaMousePressed

    private void btnAgendaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendaMouseReleased
        btnAgenda.setBackground(new Color(normal, normal, normal)); // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendaMouseReleased


    private void btnduvidasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnduvidasMousePressed
        btnduvidas.setBackground(new Color(rp, gp, bp));
    }//GEN-LAST:event_btnduvidasMousePressed

    private void btnFaturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFaturaMouseEntered
        btnFatura.setBackground(new Color(r, g, b));
    }//GEN-LAST:event_btnFaturaMouseEntered

    private void btnFaturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFaturaMouseExited
        btnFatura.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnFaturaMouseExited

    private void btnFaturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFaturaMousePressed
        btnFatura.setBackground(new Color(rp, gp, bp));
    }//GEN-LAST:event_btnFaturaMousePressed

    private void btnFaturaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFaturaMouseReleased
        btnFatura.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnFaturaMouseReleased

    private void btnBoletoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletoMouseEntered
        // TODO add your handling code here:
        btnBoleto.setBackground(new Color(r, g, b));
    }//GEN-LAST:event_btnBoletoMouseEntered

    private void btnBoletoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletoMouseExited
        btnBoleto.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnBoletoMouseExited

    private void btnBoletoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletoMousePressed
        btnBoleto.setBackground(new Color(rp, gp, bp));
    }//GEN-LAST:event_btnBoletoMousePressed

    private void btnBoletoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletoMouseReleased
        btnBoleto.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnBoletoMouseReleased

    private void btnQuadroAvisoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuadroAvisoMouseEntered
        // TODO add your handling code here:
        btnQuadroAviso.setBackground(new Color(r, g, b));
    }//GEN-LAST:event_btnQuadroAvisoMouseEntered

    private void btnQuadroAvisoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuadroAvisoMouseExited
        btnQuadroAviso.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnQuadroAvisoMouseExited

    private void btnQuadroAvisoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuadroAvisoMousePressed
        btnQuadroAviso.setBackground(new Color(rp, gp, bp));
    }//GEN-LAST:event_btnQuadroAvisoMousePressed

    private void btnQuadroAvisoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuadroAvisoMouseReleased
        btnQuadroAviso.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnQuadroAvisoMouseReleased

    private void btnReclamacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReclamacaoMouseEntered
        // TODO add your handling code here:
        btnReclamacao.setBackground(new Color(r, g, b));
    }//GEN-LAST:event_btnReclamacaoMouseEntered

    private void btnReclamacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReclamacaoMouseExited
        btnReclamacao.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnReclamacaoMouseExited

    private void btnReclamacaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReclamacaoMousePressed
        btnReclamacao.setBackground(new Color(rp, gp, bp));
    }//GEN-LAST:event_btnReclamacaoMousePressed

    private void btnReclamacaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReclamacaoMouseReleased
        btnReclamacao.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnReclamacaoMouseReleased

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        
    }//GEN-LAST:event_jButton1MousePressed

    private void btnduvidasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnduvidasMouseEntered
        btnduvidas.setBackground(new Color(r, g, b));
    }//GEN-LAST:event_btnduvidasMouseEntered

    private void btnduvidasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnduvidasMouseExited
        btnduvidas.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnduvidasMouseExited

    private void btnduvidasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnduvidasMouseReleased
        btnduvidas.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnduvidasMouseReleased

    private void btnSindicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSindicoMouseEntered
        btnSindico.setBackground(new Color(r, g, b));    // TODO add your handling code here:
    }//GEN-LAST:event_btnSindicoMouseEntered

    private void btnSindicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSindicoMouseExited
        btnSindico.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnSindicoMouseExited

    private void btnSindicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSindicoMousePressed
        btnSindico.setBackground(new Color(rp, gp, bp));    // TODO add your handling code here:
    }//GEN-LAST:event_btnSindicoMousePressed

    private void btnSindicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSindicoMouseReleased
        btnSindico.setBackground(new Color(normal, normal, normal));
    }//GEN-LAST:event_btnSindicoMouseReleased

    private void btnBoletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletoMouseClicked
        frmBoleto painelBoleto = new frmBoleto();
        painelPrincipal.add(painelBoleto);
        painelBoleto.setVisible(true);
    }//GEN-LAST:event_btnBoletoMouseClicked

    private void btnReclamacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReclamacaoMouseClicked
        frmReclamacao painelreclamacao = new frmReclamacao(lblUsuario.getText(), lblIdMorador.getText());
        painelPrincipal.add(painelreclamacao);
        painelreclamacao.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnReclamacaoMouseClicked

    private void btnSindicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSindicoMouseClicked

        frmSindico areaSindico = new frmSindico();
        painelPrincipal.add(areaSindico);
        areaSindico.setLocation(1, 1);
        areaSindico.setVisible(true);

//        System.out.println(painelPrincipal.getSize());
      


    }//GEN-LAST:event_btnSindicoMouseClicked

    private void btnQuadroAvisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuadroAvisoMouseClicked
        frmAvisos avisos = new frmAvisos();
        painelPrincipal.add(avisos);
        avisos.setVisible(true);
    }//GEN-LAST:event_btnQuadroAvisoMouseClicked

    private void btnduvidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnduvidasMouseClicked
        frmAjuda avisos = new frmAjuda();
        painelPrincipal.add(avisos);
        avisos.setVisible(true);
    }//GEN-LAST:event_btnduvidasMouseClicked

    private void btnAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendaMouseClicked
                frmAgenda agenda = new frmAgenda();
        painelPrincipal.add(agenda);
        agenda.setVisible(true);
    }//GEN-LAST:event_btnAgendaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       
       frmLogin login = new frmLogin();
       login.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgenda;
    private javax.swing.JLabel btnBoleto;
    private javax.swing.JLabel btnFatura;
    private javax.swing.JLabel btnPrincipal;
    private javax.swing.JLabel btnQuadroAviso;
    private javax.swing.JLabel btnReclamacao;
    private javax.swing.JLabel btnSindico;
    private javax.swing.JLabel btnduvidas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblIdMorador;
    public static javax.swing.JLabel lblUsuario;
    public static javax.swing.JDesktopPane painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
