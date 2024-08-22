package gui;

import gui.dialogs.DlgCadAluno;
import gui.dialogs.DlgCadDisciplina;
import gui.dialogs.DlgCadProfessor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FrHome extends javax.swing.JFrame {

    public FrHome() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        panBotoes = new javax.swing.JPanel();
        btnCadProf = new javax.swing.JButton();
        btnCadAluno = new javax.swing.JButton();
        btnCadDisciplina = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();
        mnCadastros = new javax.swing.JMenu();
        mnPedidos = new javax.swing.JMenuItem();
        mnCadProdutos = new javax.swing.JMenuItem();
        mnCadClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Fira Sans", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Escolinha");

        btnCadProf.setText("Cad Prof");
        btnCadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProfActionPerformed(evt);
            }
        });

        btnCadAluno.setText("Cad Aluno");
        btnCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAlunoActionPerformed(evt);
            }
        });

        btnCadDisciplina.setText("Cad Disciplina");
        btnCadDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotoesLayout = new javax.swing.GroupLayout(panBotoes);
        panBotoes.setLayout(panBotoesLayout);
        panBotoesLayout.setHorizontalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadProf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnCadAluno)
                .addGap(31, 31, 31)
                .addComponent(btnCadDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panBotoesLayout.setVerticalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadAluno)
                    .addComponent(btnCadDisciplina)
                    .addComponent(btnCadProf))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnSair);

        jMenuBar1.add(jMenu1);

        mnCadastros.setText("Cadastros");

        mnPedidos.setText("Novo Prof");
        mnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPedidosActionPerformed(evt);
            }
        });
        mnCadastros.add(mnPedidos);

        mnCadProdutos.setText("Cad Aluno");
        mnCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadProdutosActionPerformed(evt);
            }
        });
        mnCadastros.add(mnCadProdutos);

        mnCadClientes.setText("Cad Disciplina");
        mnCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadClientesActionPerformed(evt);
            }
        });
        mnCadastros.add(mnCadClientes);

        jMenuBar1.add(mnCadastros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 232, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProfActionPerformed
        DlgCadProfessor cadProfessor = null;
        try {
            cadProfessor = new DlgCadProfessor();
        } catch (SQLException ex) {
            Logger.getLogger(FrHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        cadProfessor.setVisible(true);
    }//GEN-LAST:event_btnCadProfActionPerformed

    private void btnCadDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadDisciplinaActionPerformed
        DlgCadDisciplina cadProduto = null;
        try {
            cadProduto = new DlgCadDisciplina();
        } catch (SQLException ex) {
            Logger.getLogger(FrHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        cadProduto.setVisible(true);
    }//GEN-LAST:event_btnCadDisciplinaActionPerformed

    private void btnCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAlunoActionPerformed
       DlgCadAluno cadAluno = null;
       try{
           cadAluno = new DlgCadAluno();
       } catch (SQLException ex) {
           Logger.getLogger(FrHome.class.getName()).log(Level.SEVERE, null, ex);
       }
       cadAluno.setVisible(true);
    }//GEN-LAST:event_btnCadAlunoActionPerformed

    private void mnCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadProdutosActionPerformed
        btnCadAlunoActionPerformed(evt);
    }//GEN-LAST:event_mnCadProdutosActionPerformed

    private void mnCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadClientesActionPerformed
        btnCadDisciplinaActionPerformed(evt);
    }//GEN-LAST:event_mnCadClientesActionPerformed

    private void mnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPedidosActionPerformed
        btnCadProfActionPerformed(evt);
    }//GEN-LAST:event_mnPedidosActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadAluno;
    private javax.swing.JButton btnCadDisciplina;
    private javax.swing.JButton btnCadProf;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnCadClientes;
    private javax.swing.JMenuItem mnCadProdutos;
    private javax.swing.JMenu mnCadastros;
    private javax.swing.JMenuItem mnPedidos;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JPanel panBotoes;
    // End of variables declaration//GEN-END:variables
}
