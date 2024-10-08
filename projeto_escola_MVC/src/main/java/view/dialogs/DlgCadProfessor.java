package view.dialogs;

import controller.ProfessorController;
import connection.SQLiteConnector;
import controller.service_db.ServicoDadosProfessor;
import view.tableModels.TMCadProfessor;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.dao.IDAO;
import model.dao.ProfessorDAO;
import model.entities.Professor;

/**
 *
 * @author kfrural
 */
public class DlgCadProfessor extends javax.swing.JDialog {

    private boolean editando;
    private String cpfEscolhido;
    private Professor pessoaEditando;
    private ProfessorController gerenciadorProfessors;
    public ServicoDadosProfessor servicoDadosProf;

    public DlgCadProfessor() throws SQLException {
        this.gerenciadorProfessors = new ProfessorController();
        this.pessoaEditando = new Professor();
        this.editando = false;
        this.cpfEscolhido = "";
        
        SQLiteConnector connector = new SQLiteConnector("escola.db");
        IDAO repositorio = new ProfessorDAO(connector);
        this.servicoDadosProf = new ServicoDadosProfessor(repositorio);

        initComponents();
        this.habilitarCampos(false);
        this.limparCampos();
        this.atualizarTabela();

        this.gerenciadorProfessors.carregarDoArquivo("ListagemProfessors.csv");

    }
    
      public DlgCadProfessor(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
    }

    public void habilitarCampos(boolean flag) {
        edtNome.setEnabled(flag);
        edtMateria.setEnabled(flag);
        edtIdade.setEnabled(flag);
        edtCPF.setEnabled(flag);
    }

    public void limparCampos() {
        edtNome.setText("");
        edtMateria.setText("");
        edtIdade.setText("");
        edtCPF.setText("");
    }

    public void objetoParaCampos(Professor p) {
        edtNome.setText(p.getNome());
        edtCPF.setText(p.getCpf());
        edtMateria.setText(p.getMateria() + "");
        edtIdade.setText(p.getIdade() + "");

    }

    public Professor camposParaObjeto() {
        Professor p = new Professor();

        p.setNome(edtNome.getText());
        p.setCpf(edtCPF.getText());
        p.setMateria(edtMateria.getText());
        
        String idadeTexto = edtIdade.getText();
        int a = 0;
        if (!idadeTexto.isEmpty()) {
            a = Integer.parseInt(idadeTexto);
        }

        p.setIdade(a);

        return p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panButton = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panFields = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        edtCPF = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        edtMateria = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdProfessor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cadastro de Professor");

        javax.swing.GroupLayout panTitleLayout = new javax.swing.GroupLayout(panTitle);
        panTitle.setLayout(panTitleLayout);
        panTitleLayout.setHorizontalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panTitleLayout.setVerticalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTitleLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_32x32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del_32x32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo_32x32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit3_32x32.png"))); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panButtonLayout = new javax.swing.GroupLayout(panButton);
        panButton.setLayout(panButtonLayout);
        panButtonLayout.setHorizontalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panButtonLayout.setVerticalGroup(
            panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panButtonLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo)
                    .addComponent(btnEdit)
                    .addComponent(btnCancelar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lblNome.setText("Nome");

        lblCPF.setText("CPF");

        lblIdade.setText("Idade");

        lblMateria.setText("Materia");

        edtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFieldsLayout = new javax.swing.GroupLayout(panFields);
        panFields.setLayout(panFieldsLayout);
        panFieldsLayout.setHorizontalGroup(
            panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFieldsLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFieldsLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFieldsLayout.createSequentialGroup()
                        .addComponent(lblIdade)
                        .addGap(18, 18, 18)
                        .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFieldsLayout.createSequentialGroup()
                        .addComponent(lblMateria)
                        .addGap(18, 18, 18)
                        .addComponent(edtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFieldsLayout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addGap(18, 18, 18)
                        .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panFieldsLayout.setVerticalGroup(
            panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFieldsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panFieldsLayout.createSequentialGroup()
                        .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCPF)
                            .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblIdade)
                                .addComponent(lblMateria))
                            .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        grdProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(grdProfessor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPFActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String cpfEscolhido = JOptionPane.showInputDialog("Informe o CPF do professor que deseja excluir:", "");

        Professor p = this.gerenciadorProfessors.buscarProfessor(cpfEscolhido);

        if (p == null) {
            JOptionPane.showMessageDialog(this, "Não existe professor com este cpf.");
        } else {
            this.gerenciadorProfessors.removerProfessor(cpfEscolhido);
            this.servicoDadosProf.excluirProfessor(cpfEscolhido);
            JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
        }

        this.atualizarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Professor novaProfessor = this.camposParaObjeto();
        
        String nome = edtNome.getText();
        String cpf = edtCPF.getText();
        int idade = Integer.parseInt(edtIdade.getText());
        String materia = edtMateria.getText();

        if (this.editando) {
            this.gerenciadorProfessors.atualizarProfessor(cpfEscolhido, novaProfessor);
            this.servicoDadosProf.atualizarProfessor(cpf, nome, idade, materia);
        } else {
            this.gerenciadorProfessors.adicionarProfessor(novaProfessor);
        }

        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;

        this.atualizarTabela();
        gerenciadorProfessors.salvarNoArquivo("ListagemProfessores.csv");
        this.servicoDadosProf.adicionarProfessor(cpf, nome, idade, materia);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String cpfEscolhido = JOptionPane.showInputDialog("Informe o CPF do professor que deseja EDITAR:", "");

        this.pessoaEditando = this.gerenciadorProfessors.buscarProfessor(cpfEscolhido);

        if (pessoaEditando == null) {
            JOptionPane.showMessageDialog(this, "Não existe professor com este CPF.");
        } else {
            this.limparCampos();
            this.habilitarCampos(true);

            this.objetoParaCampos(pessoaEditando);
            this.editando = true;
            this.cpfEscolhido = pessoaEditando.getCpf();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void grdProfessorMouseClicked(java.awt.event.MouseEvent evt) {
        Professor p = this.getObjetoSelecionadoNaGrid();
        this.objetoParaCampos(p);
    }

    public Professor getObjetoSelecionadoNaGrid() {
        int linhaSelecionada = grdProfessor.getSelectedRow();

        if (linhaSelecionada >= 0) {
            TMCadProfessor tmCadAluno = (TMCadProfessor) grdProfessor.getModel();

            Professor professor = tmCadAluno.getObjetoAluno(linhaSelecionada);
            return professor;
        }

        return null;
    }

    public void atualizarTabela() {
        TMCadProfessor tmCadAluno = new TMCadProfessor(this.servicoDadosProf.obterProfessores());
        grdProfessor.setModel(tmCadAluno);
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DlgCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DlgCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DlgCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DlgCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DlgCadProfessor dialog = new DlgCadProfessor(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextField edtMateria;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTable grdProfessor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panButton;
    private javax.swing.JPanel panFields;
    private javax.swing.JPanel panTitle;
    // End of variables declaration//GEN-END:variables
}
