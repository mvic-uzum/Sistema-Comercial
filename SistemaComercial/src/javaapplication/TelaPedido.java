package javaapplication;

public class TelaPedido extends javax.swing.JFrame {
    
    String nome_aux = "", pedido_aux = "";
    int qt1_aux = 0,qt2_aux = 0, qt3_aux = 0, qt4_aux = 0, qt5_aux = 0, qt6_aux = 0, qt7_aux = 0, qt8_aux = 0, qt9_aux = 0;
    TelaComanda T =  new TelaComanda();

    public TelaPedido() {
        initComponents();
    }
    
    public void Limpa(){
        jTextField1.setText("");
        jTextField2.setText("");
        jComboBox1.setSelectedIndex(0);
        qt1_aux = 0;
        qt2_aux = 0;
        qt3_aux = 0;
        qt4_aux = 0;
        qt5_aux = 0;
        qt6_aux = 0;
        qt7_aux = 0;
        qt8_aux = 0;
        qt9_aux = 0;
        pedido_aux = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jBotaoConfirmar = new javax.swing.JButton();
        jBotaoCancelar = new javax.swing.JButton();
        jButtonFinalizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedido");
        setResizable(false);

        jLabel1.setText("Nome do Cliente:");

        jLabel2.setText("Produto:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suco de Laranja", "Suco de Abacaxi", "Suco de Melancia", "Sorvete de Chocolate", "Sorvete de Baunilha", "Sorvete de Morango", "Shake de Leite Ninho", "Shake de Morango", "Shake Trufado" }));

        jBotaoConfirmar.setText("Confirmar");
        jBotaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoConfirmarActionPerformed(evt);
            }
        });

        jBotaoCancelar.setText("Cancelar");
        jBotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoCancelarActionPerformed(evt);
            }
        });

        jButtonFinalizar.setText("Finalizar Pedido");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade:");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBotaoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBotaoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                            .addComponent(jButtonFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotaoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButtonFinalizar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jBotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoCancelarActionPerformed
        Limpa();
    }//GEN-LAST:event_jBotaoCancelarActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        nome_aux = jTextField1.getText();
        Produtos P = new Produtos(nome_aux,pedido_aux,qt1_aux,qt2_aux,qt3_aux,qt4_aux,qt5_aux,qt6_aux,qt7_aux,qt8_aux,qt9_aux);
        P.Calcula(qt1_aux,qt2_aux,qt3_aux,qt4_aux,qt5_aux,qt6_aux,qt7_aux,qt8_aux,qt9_aux);
        P.Valida(nome_aux);
        Limpa();
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        TelaLogin L = new TelaLogin();
        L.setLocationRelativeTo(null);
        L.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBotaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoConfirmarActionPerformed
        Produtos P = new Produtos(nome_aux,pedido_aux,qt1_aux,qt2_aux,qt3_aux,qt4_aux,qt5_aux,qt6_aux,qt7_aux,qt8_aux,qt9_aux);
        if(P.ValidaQuantidade(jTextField2.getText())){
            if(jComboBox1.getSelectedIndex()==0){
                qt1_aux = Integer.parseInt(jTextField2.getText());
                pedido_aux = pedido_aux + "> " + jComboBox1.getSelectedItem() + "\n" + "   " + "Quantidade: " + Integer.toString(qt1_aux) + "\n";
            }
            if(jComboBox1.getSelectedIndex()==1){
                qt2_aux = Integer.parseInt(jTextField2.getText());
                pedido_aux = pedido_aux + "> " + jComboBox1.getSelectedItem() + "\n" + "   " + "Quantidade: " + Integer.toString(qt2_aux) + "\n";
            }
            if(jComboBox1.getSelectedIndex()==2){
                qt3_aux = Integer.parseInt(jTextField2.getText());
                pedido_aux = pedido_aux + "> " + jComboBox1.getSelectedItem() + "\n" + "   " + "Quantidade: " + Integer.toString(qt3_aux) + "\n";
            }
            if(jComboBox1.getSelectedIndex()==3){
                qt4_aux = Integer.parseInt(jTextField2.getText());
                pedido_aux = pedido_aux + "> " + jComboBox1.getSelectedItem() + "\n" + "   " + "Quantidade: " + Integer.toString(qt4_aux) + "\n";
            }
            if(jComboBox1.getSelectedIndex()==4){
                qt5_aux = Integer.parseInt(jTextField2.getText());
                pedido_aux = pedido_aux + "> " + jComboBox1.getSelectedItem() + "\n" + "   " + "Quantidade: " + Integer.toString(qt5_aux) + "\n";
            }
            if(jComboBox1.getSelectedIndex()==5){
                qt6_aux = Integer.parseInt(jTextField2.getText());
                pedido_aux = pedido_aux + "> " + jComboBox1.getSelectedItem() + "\n" + "   " + "Quantidade: " + Integer.toString(qt6_aux) + "\n";
            }
            if(jComboBox1.getSelectedIndex()==6){
                qt7_aux = Integer.parseInt(jTextField2.getText());
                pedido_aux = pedido_aux + "> " + jComboBox1.getSelectedItem() + "\n" + "   " + "Quantidade: " + Integer.toString(qt7_aux) + "\n";
            }
            if(jComboBox1.getSelectedIndex()==7){
                qt8_aux = Integer.parseInt(jTextField2.getText());
                pedido_aux = pedido_aux + "> " + jComboBox1.getSelectedItem() + "\n" + "   " + "Quantidade: " + Integer.toString(qt8_aux) + "\n";
            }
            if(jComboBox1.getSelectedIndex()==8){
                qt9_aux = Integer.parseInt(jTextField2.getText());
                pedido_aux = pedido_aux + "> " + jComboBox1.getSelectedItem() + "\n" + "   " + "Quantidade: " + Integer.toString(qt9_aux) + "\n";
            }
            jTextField2.setText("");
        }
        else{
            Limpa();
        }
    }//GEN-LAST:event_jBotaoConfirmarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoCancelar;
    private javax.swing.JButton jBotaoConfirmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
