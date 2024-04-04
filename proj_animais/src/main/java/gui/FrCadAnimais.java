package gui;

import classes.Animais;
import classes.GerenciadorAnimais;
import javax.swing.JOptionPane;

/**
 *
 * @author kfrural
 */
public class FrCadAnimais extends javax.swing.JFrame {

    private boolean editando;
    private String nomeEscolhido;
    private GerenciadorAnimais gerente;
    
    public FrCadAnimais() {
        this.gerente = new GerenciadorAnimais();
        
        initComponents();
        this.editando = false;
        this.nomeEscolhido = "";
        this.habilitarCampos(false);
        this.limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        panButton = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtEspecie = new javax.swing.JTextField();
        lblEspecie = new javax.swing.JLabel();
        edtIdade = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        edtPeso = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        lblRaca = new javax.swing.JLabel();
        edtRaca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cadastro de Animais");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo_32x32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        panButton.add(btnNovo);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit3_32x32.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panButton.add(btnEditar);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panButton.add(btnCancelar);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del_32x32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        panButton.add(btnExcluir);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_32x32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panButton.add(btnSalvar);

        lblNome.setText("Nome:");

        edtEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEspecieActionPerformed(evt);
            }
        });

        lblEspecie.setText("Especie:");

        lblIdade.setText("Idade:");

        lblPeso.setText("Peso:");

        lblRaca.setText("Raca: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEspecie))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdade)
                        .addGap(18, 18, 18)
                        .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblRaca)
                        .addGap(18, 18, 18)
                        .addComponent(edtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPeso)
                        .addGap(18, 18, 18)
                        .addComponent(edtPeso))
                    .addComponent(edtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspecie)
                    .addComponent(edtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeso)
                    .addComponent(edtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaca)
                    .addComponent(edtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        edtListagem.setColumns(20);
        edtListagem.setRows(5);
        jScrollPane1.setViewportView(edtListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.limparCampos();
        this.habilitarCampos(true);
        this.editando = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.nomeEscolhido = JOptionPane.showInputDialog("Fala ai o nome do animal  q ce quer editar", "");

        Animais animaisEdit = this.gerente.buscarAnimais(nomeEscolhido);

        if(animaisEdit != null){
            this.editando = true;
            this.limparCampos();
            this.habilitarCampos(true);

            this.objParaCampos(animaisEdit);

        }else{
            JOptionPane.showMessageDialog(this, "nao tem esse animal ai nao");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        this.nomeEscolhido = JOptionPane.showInputDialog("Fala ai o nome da animal  q ce quer cancelar", "");

        Animais c = this.gerente.buscarAnimais(nomeEscolhido);

        if(c == null)
        JOptionPane.showMessageDialog(this, "nao tem esse animal ai nao");
        else{
            this.gerente.removeAnimais(nomeEscolhido);
            JOptionPane.showMessageDialog(this, "cancelou o animalzin bunitin");
        }

        String listagem = this.gerente.toString();
        edtListagem.setText(listagem);

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Animais animaisNova = this.camposParaObj();

        if(this.editando == true)
        gerente.atualizaAnimais(this.nomeEscolhido, animaisNova);
        else
        this.gerente.addAnimais(animaisNova);

        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;

        String listagem = gerente.toString();
        edtListagem.setText(listagem);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void edtEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEspecieActionPerformed

    public Animais camposParaObj(){
        Animais animais = new Animais();
        animais.setNome(edtNome.getText());
        animais.setEspecie(edtEspecie.getText());
        animais.setRaca(edtRaca.getText());
        
        String idadeStr = edtIdade.getText();
        int idade = Integer.parseInt(idadeStr);
        animais.setIdade(idade);
        
        String pesoStr = edtPeso.getText();
        double peso = Double.parseDouble(pesoStr);
        animais.setPeso(peso);
        
        return animais;
    }
    
    public void objParaCampos(Animais animais){
        edtNome.setText(animais.getNome());
        edtEspecie.setText(animais.getEspecie());
        edtIdade.setText(animais.getIdade() + "");
        edtPeso.setText(animais.getPeso() + "");
        edtRaca.setText(animais.getRaca());
    }
    
    public void habilitarCampos(boolean flag){
        this.edtNome.setEnabled(flag);
        this.edtEspecie.setEnabled(flag);
        this.edtIdade.setEnabled(flag);
        this.edtPeso.setEnabled(flag);
        this.edtRaca.setEnabled(flag);
    }
    
    public void limparCampos(){
        this.edtNome.setText("");
        this.edtEspecie.setText("");
        this.edtIdade.setText("");
        this.edtPeso.setText("");
        this.edtRaca.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtEspecie;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtPeso;
    private javax.swing.JTextField edtRaca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panButton;
    // End of variables declaration//GEN-END:variables
}
