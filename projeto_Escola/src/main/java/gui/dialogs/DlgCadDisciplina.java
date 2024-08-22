package gui.dialogs;
import classes.Disciplina;
import gerenciador.GerenciadorDisciplina;
import gui.tableModels.TMCadDisciplina;
import interfaces.IRepositorioDados;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import service.RepositorioDisciplina;
import service.SQLiteConnector;
import service.ServicoDadosDisciplina;

/**
 *
 * @author kfrural
 */
public class DlgCadDisciplina extends javax.swing.JDialog {
    
    public boolean editando;
    public String codAntigo;
    public GerenciadorDisciplina gerenciadorDisciplina;
    private Disciplina disciplinaEditando;
    public ServicoDadosDisciplina servicoDadosDisciplina;
    

    /**
     * Creates new form DlgCadDisciplina
     */
     public DlgCadDisciplina() throws SQLException {
        this.editando = false;
        this.codAntigo = "";
        this.gerenciadorDisciplina = new GerenciadorDisciplina();
        this.disciplinaEditando = new Disciplina();
        SQLiteConnector connector = new SQLiteConnector("disciplina.db");
        IRepositorioDados repositorio = new RepositorioDisciplina(connector);
        this.servicoDadosDisciplina = new ServicoDadosDisciplina(repositorio);

        initComponents();
        this.habilitarCampos(false);
        this.limparCampos();
        this.atualizarTabela();
        
        gerenciadorDisciplina.carregarDoArquivo("ListagemDisciplinas.csv");
        //edtListagem.setText(gerenciadorDisciplina.toString());
    }

    
    public DlgCadDisciplina(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
    }
    
     public void habilitarCampos(boolean flag) {
        edtCod.setEnabled(flag);
        edtNome.setEnabled(flag);
        edtCh.setEnabled(flag);
        edtDpto.setEnabled(flag);
    }

    public void limparCampos() {
        edtCod.setText("");
        edtNome.setText("");
        edtCh.setText("");
        edtDpto.setText("");
    }

    public void objetoParaCampos(Disciplina p) {
        edtCod.setText(p.getCod());
        edtNome.setText(p.getNome());
        edtCh.setText(p.getCh()+"");
        edtDpto.setText(p.getDpto() + "");
    }

    public Disciplina camposParaObjeto() {
        Disciplina p = new Disciplina();
        p.setCod(edtCod.getText());
        p.setNome(edtNome.getText());
        p.setCh(edtCh.getText());
        p.setDpto(edtDpto.getText());

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
        lblButton = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        panCampos = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCH = new javax.swing.JLabel();
        lblDpto = new javax.swing.JLabel();
        edtCod = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
        edtCh = new javax.swing.JTextField();
        edtDpto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdDisciplina = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cadastro de Disciplina");

        javax.swing.GroupLayout panTitleLayout = new javax.swing.GroupLayout(panTitle);
        panTitle.setLayout(panTitleLayout);
        panTitleLayout.setHorizontalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panTitleLayout.setVerticalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del_32x32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_32x32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit3_32x32.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo_32x32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblButtonLayout = new javax.swing.GroupLayout(lblButton);
        lblButton.setLayout(lblButtonLayout);
        lblButtonLayout.setHorizontalGroup(
            lblButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(133, 133, 133))
        );
        lblButtonLayout.setVerticalGroup(
            lblButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblButtonLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(lblButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnNovo))
                .addGap(19, 19, 19))
        );

        lblCod.setText("Cod");

        lblNome.setText("Nome");

        lblCH.setText("Carga-horaria");

        lblDpto.setText("Dpto");

        javax.swing.GroupLayout panCamposLayout = new javax.swing.GroupLayout(panCampos);
        panCampos.setLayout(panCamposLayout);
        panCamposLayout.setHorizontalGroup(
            panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCamposLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panCamposLayout.createSequentialGroup()
                        .addComponent(lblCH)
                        .addGap(18, 18, 18)
                        .addComponent(edtCh))
                    .addGroup(panCamposLayout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCamposLayout.createSequentialGroup()
                        .addComponent(lblDpto)
                        .addGap(18, 18, 18)
                        .addComponent(edtDpto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCamposLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        panCamposLayout.setVerticalGroup(
            panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCamposLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panCamposLayout.createSequentialGroup()
                        .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCod)
                            .addComponent(lblNome)
                            .addComponent(edtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCH)
                                .addComponent(lblDpto))
                            .addComponent(edtCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        grdDisciplina.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(grdDisciplina);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(panCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         Disciplina p = this.camposParaObjeto();

        if(this.editando){
            gerenciadorDisciplina.atualizarDisciplina(codAntigo, p);
        }else{
            gerenciadorDisciplina.adicionarDisciplina(p);
        }

        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;

        this.atualizarTabela(); 
        this.gerenciadorDisciplina.salvarNoArquivo("ListagemDisciplinas.csv");
        this.servicoDadosDisciplina.adicionarDisciplina(p);
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String codEscolhido = JOptionPane.showInputDialog("Informe o CODIGO do produto que deseja excluir:", "");

        Disciplina p = gerenciadorDisciplina.buscarDisciplina(codEscolhido);

        if (p == null) {
            JOptionPane.showMessageDialog(this, "Não existe este produto.");
        } else {
            gerenciadorDisciplina.removerDisciplina(codEscolhido);
             this.servicoDadosDisciplina.excluirDisciplina(codEscolhido);
            JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
        }
        
         this.atualizarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String cpfEscolhido = JOptionPane.showInputDialog("Informe o COd que deseja EDITAR:", "");

        this.disciplinaEditando = this.gerenciadorDisciplina.buscarDisciplina(cpfEscolhido);

        if (disciplinaEditando == null) {
            JOptionPane.showMessageDialog(this, "Não existe este CPF.");
        } else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.objetoParaCampos(disciplinaEditando);
            this.editando = true;
            this.codAntigo = disciplinaEditando.getCod();
        }
    }//GEN-LAST:event_btnEditarActionPerformed
          private void grdProfessorMouseClicked(java.awt.event.MouseEvent evt) {                                       
       Disciplina d = this.getObjetoSelecionadoNaGrid();
       this.objetoParaCampos(d);
    }

    
    public Disciplina getObjetoSelecionadoNaGrid() {
        int linhaSelecionada = grdDisciplina.getSelectedRow();

        if (linhaSelecionada >= 0) {
            TMCadDisciplina tmCadDisciplina = (TMCadDisciplina) grdDisciplina.getModel();

            Disciplina d = tmCadDisciplina.getObjetoDisciplina(linhaSelecionada);
            return d;
        }
        
        return null;
    }
    
    public void atualizarTabela() {
        TMCadDisciplina tmCadDisciplina = new TMCadDisciplina(this.gerenciadorDisciplina.getPessoas());
        grdDisciplina.setModel(tmCadDisciplina);
    }                                     

//    }    
//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(DlgCadDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DlgCadDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DlgCadDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DlgCadDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DlgCadDisciplina dialog = new DlgCadDisciplina(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCh;
    private javax.swing.JTextField edtCod;
    private javax.swing.JTextField edtDpto;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTable grdDisciplina;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel lblButton;
    private javax.swing.JLabel lblCH;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblDpto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panCampos;
    private javax.swing.JPanel panTitle;
    // End of variables declaration//GEN-END:variables
}
