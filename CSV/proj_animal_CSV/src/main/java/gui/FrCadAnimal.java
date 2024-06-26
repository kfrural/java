/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import classes.Gerenciador;
import classes.Animal;
import javax.swing.JOptionPane;

/**
 *
 * @author kfrural
 */
public class FrCadAnimal extends javax.swing.JFrame {
    
    public boolean editando;
    public String nomeAntigo;
    public Gerenciador gerenciador;
    
    public FrCadAnimal() {
        this.editando = false;
        this.nomeAntigo = "";
        this.gerenciador = new Gerenciador();
        
        initComponents();
        
        this.habilitarCampos(false);
        this.limparCampos();
        
        gerenciador.carregarArquivo("ListagemAnimals.csv");
        edtListagem.setText(gerenciador.toString());
        
    }
    
    public void habilitarCampos(boolean flag){
        edtCod.setEnabled(flag);
        edtEspecie.setEnabled(flag);
        edtRaca.setEnabled(flag);
        edtIdade.setEnabled(flag);
        edtPeso.setEnabled(flag);
    }
    
    public void limparCampos(){
        edtCod.setText("");
        edtEspecie.setText("");
        edtRaca.setText("");
        edtIdade.setText("");
        edtPeso.setText("");
    }
    
    public void objParaCampos(Animal animal){
        edtCod.setText(animal.getCod());
        edtEspecie.setText(animal.getEspecie());
        edtRaca.setText(animal.getRaca());
        edtIdade.setText(animal.getIdade() + "");
        edtPeso.setText(animal.getPeso() + "");
    }
    
    public Animal camposParaObj(){
        Animal a = new Animal();
        a.setEspecie(edtEspecie.getText());
        a.setRaca(edtRaca.getText());
        String idadeStr = edtIdade.getText();
        int i = 0;
        if(!idadeStr.isEmpty())
            i = Integer.parseInt(idadeStr);
        a.setIdade(i);
        
        String pesoStr = edtPeso.getText();
        double peso = 0;
        if(!pesoStr.isEmpty())
            peso = Double.parseDouble(pesoStr);
        a.setPeso(peso);
        
        return a;   
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
        btnNovo = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        panCampos = new javax.swing.JPanel();
        lblEspecie = new javax.swing.JLabel();
        lblRaca = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        edtEspecie = new javax.swing.JTextField();
        edtRaca = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        edtPeso = new javax.swing.JTextField();
        lblCod = new javax.swing.JLabel();
        edtCod = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cadastro de Animais");

        javax.swing.GroupLayout panTitleLayout = new javax.swing.GroupLayout(panTitle);
        panTitle.setLayout(panTitleLayout);
        panTitleLayout.setHorizontalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panTitleLayout.setVerticalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitleLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo_32x32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        panButton.add(btnNovo);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit3_32x32.png"))); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panButton.add(btnEdit);

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

        lblEspecie.setText("Especie:");

        lblRaca.setText("Raca: ");

        lblIdade.setText("Idade: ");

        lblPeso.setText("Peso:");

        edtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtIdadeActionPerformed(evt);
            }
        });

        edtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPesoActionPerformed(evt);
            }
        });

        lblCod.setText("Cod: ");

        javax.swing.GroupLayout panCamposLayout = new javax.swing.GroupLayout(panCampos);
        panCampos.setLayout(panCamposLayout);
        panCamposLayout.setHorizontalGroup(
            panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCamposLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEspecie)
                    .addComponent(lblCod)
                    .addComponent(lblRaca)
                    .addComponent(lblIdade)
                    .addComponent(lblPeso))
                .addGap(18, 18, 18)
                .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edtIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(edtEspecie)
                    .addComponent(edtRaca)
                    .addComponent(edtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(edtCod))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panCamposLayout.setVerticalGroup(
            panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCamposLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(edtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspecie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaca))
                .addGap(35, 35, 35)
                .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdade))
                .addGap(29, 29, 29)
                .addGroup(panCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(edtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
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
                    .addComponent(panTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panButton, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtIdadeActionPerformed

    private void edtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPesoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String codEscolhido = JOptionPane.showInputDialog("Informe o cod q ce quer editar: ");
        
        Animal aEditando = gerenciador.buscarAnimal(codEscolhido);
        
        if(aEditando == null){
            JOptionPane.showMessageDialog(this, "Nao tem essa animal");
            this.editando = false;
        } else{
            this.limparCampos();
            this.habilitarCampos(true);
            this.objParaCampos(aEditando);
            this.editando = true;
            this.nomeAntigo = aEditando.getEspecie();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String animalEscolhida = JOptionPane.showInputDialog("Informe o cod que vc deseja remover");
        
        Animal p = gerenciador.buscarAnimal(animalEscolhida);
        
        if(p == null)
            JOptionPane.showMessageDialog(this, "Nao tem essa animal");
        else{
            gerenciador.removerAnimal(animalEscolhida);
            JOptionPane.showMessageDialog(this, "Animal excluida com sucesso");
        }
        String listagem = gerenciador.toString();
        edtListagem.setText(listagem);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Animal p = this.camposParaObj();
        
        if(this.editando)
            gerenciador.atualizarAnimal(nomeAntigo, p);
        else
            gerenciador.adicionarAnimal(p);
        
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
        
        String listagem = gerenciador.toString();
        edtListagem.setText(listagem);
        
        gerenciador.salvarArquivo("ListagemAnimal.csv");
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCod;
    private javax.swing.JTextField edtEspecie;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtPeso;
    private javax.swing.JTextField edtRaca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panButton;
    private javax.swing.JPanel panCampos;
    private javax.swing.JPanel panTitle;
    // End of variables declaration//GEN-END:variables
}
