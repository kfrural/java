package com.oo.projpedidoprodutos.gui;

import com.oo.projpedidoprodutos.classes.Pedido;
import com.oo.projpedidoprodutos.gui.dialogs.DlgCadPedido;
import com.oo.projpedidoprodutos.gui.dialogs.DlgCadPessoa;
import com.oo.projpedidoprodutos.gui.dialogs.DlgCadProduto;
import java.util.ArrayList;
import java.util.List;

public class FrHome extends javax.swing.JFrame {

    List<Pedido> listaPedidos;
           
    public FrHome() {
        initComponents();
        listaPedidos = new ArrayList<>();
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        panBotoes = new javax.swing.JPanel();
        btnPedido = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
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
        lblTitulo.setText("Mercadinho popular");

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrinho-de-compras.png"))); // NOI18N
        btnPedido.setText("Pedidos");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caixa.png"))); // NOI18N
        btnProdutos.setText("Cad Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grupo-de-usuarios.png"))); // NOI18N
        btnClientes.setText("Cad Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotoesLayout = new javax.swing.GroupLayout(panBotoes);
        panBotoes.setLayout(panBotoesLayout);
        panBotoesLayout.setHorizontalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panBotoesLayout.setVerticalGroup(
            panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProdutos)
                    .addComponent(btnClientes)
                    .addComponent(btnPedido))
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

        mnPedidos.setText("Novo Pedido");
        mnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPedidosActionPerformed(evt);
            }
        });
        mnCadastros.add(mnPedidos);

        mnCadProdutos.setText("Cad Produtos");
        mnCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadProdutosActionPerformed(evt);
            }
        });
        mnCadastros.add(mnCadProdutos);

        mnCadClientes.setText("Cad Clientes");
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
                .addGap(0, 219, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        Pedido novoPedido = new Pedido();
        DlgCadPedido telaPedidos = new DlgCadPedido(this, true, novoPedido);
        telaPedidos.setVisible(true);       
        
        System.out.println("Passei por aqui. Pedido.");
        
        if(novoPedido != null){
            listaPedidos.add(novoPedido);        
        }
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        DlgCadPessoa cadPessoas = new DlgCadPessoa();
        cadPessoas.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        DlgCadProduto cadProduto = new DlgCadProduto();
        cadProduto.setVisible(true);
        
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void mnCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadProdutosActionPerformed
        btnProdutosActionPerformed(evt);
    }//GEN-LAST:event_mnCadProdutosActionPerformed

    private void mnCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadClientesActionPerformed
        btnClientesActionPerformed(evt);
    }//GEN-LAST:event_mnCadClientesActionPerformed

    private void mnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPedidosActionPerformed
        btnPedidoActionPerformed(evt);
    }//GEN-LAST:event_mnPedidosActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnSairActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnProdutos;
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
