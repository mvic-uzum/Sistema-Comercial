package javaapplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TelaComanda extends javax.swing.JFrame {
    
    int F = 0;
    
    public TelaComanda() {
        initComponents();
    }
    
    public void Registra(String Nome_Aux,String Pedido_Aux,float PrecoT){
        jTextField1.setText(Nome_Aux);      
        jTextField2.setText("R$"+Float.toString(PrecoT));
        jTextArea1.setText(Pedido_Aux);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAbrirComanda = new javax.swing.JButton();
        jButtonConfirmarPagamento = new javax.swing.JButton();
        jButtonRecalcular = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comanda");
        setResizable(false);

        jLabel1.setText("Nome do Cliente:");

        jLabel2.setText("Pedido:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Preço Total: ");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButtonConfirmar.setText("Confirmar Pedido");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAbrirComanda.setText("Abrir Comanda");
        jButtonAbrirComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirComandaActionPerformed(evt);
            }
        });

        jButtonConfirmarPagamento.setText("Confirmar Pagamento");
        jButtonConfirmarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarPagamentoActionPerformed(evt);
            }
        });

        jButtonRecalcular.setText("Recalcular");
        jButtonRecalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecalcularActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConfirmarPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonAbrirComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonRecalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAbrirComanda)
                    .addComponent(jButtonRecalcular)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonConfirmarPagamento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(F==1){
            dispose();
        }
        else{
            JFileChooser salvar = new JFileChooser();
            salvar.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = salvar.showSaveDialog(null);
            if(result==JFileChooser.CANCEL_OPTION){
                return;
            }
            else if(result==JFileChooser.APPROVE_OPTION){
                File arquivo = salvar.getSelectedFile();
                try{
                    FileWriter novo = new FileWriter(arquivo);
                    BufferedWriter gravar = new BufferedWriter(novo);
                    String Texto = "--" + " " + jTextField1.getText() + "\n" + "--" + " " + jTextArea1.getText() + "\n" + "CANCELADO!" + "--" + " " + jTextField2.getText();
                    gravar.write(Texto);
                    gravar.flush();
                    gravar.close();
                    JOptionPane.showMessageDialog(rootPane,"Pedido cancelado com sucesso!");
                    jTextArea1.setText(jTextArea1.getText() + "\n" + "CANCELADO!");
                    jTextArea1.setEditable(false);
                    jTextField1.setEditable(false);
                    jTextField2.setEditable(false);
                    jButtonConfirmarPagamento.setEnabled(false);
                    jButtonRecalcular.setEnabled(false);
                    jButtonCancelar.setEnabled(false);
                    jButton2.setEnabled(true);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane,"Impossível cancelar o pedido!");
                }
            }
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        JFileChooser salvar = new JFileChooser();
        salvar.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = salvar.showSaveDialog(null);
        if(result==JFileChooser.CANCEL_OPTION){
            return;
        }
        else if(result==JFileChooser.APPROVE_OPTION){
            File arquivo = salvar.getSelectedFile();
            try{
                FileWriter novo = new FileWriter(arquivo);
                BufferedWriter gravar = new BufferedWriter(novo);
                String Texto = "--" + " " + jTextField1.getText() + "\n" + "--" + " " + jTextArea1.getText() + "--" + " " + jTextField2.getText();
                gravar.write(Texto);
                gravar.flush();
                gravar.close();
                JOptionPane.showMessageDialog(rootPane,"Pedido realizado com sucesso!");
                dispose();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane,"Impossível realizar o pedido!");
                dispose();
            }
        }
        
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonConfirmarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarPagamentoActionPerformed
        JFileChooser salvar = new JFileChooser();
        salvar.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = salvar.showSaveDialog(null);
        if(result==JFileChooser.CANCEL_OPTION){
            return;
        }
        else if(result==JFileChooser.APPROVE_OPTION){
            File arquivo = salvar.getSelectedFile();
            try{
                FileWriter novo = new FileWriter(arquivo);
                BufferedWriter gravar = new BufferedWriter(novo);
                String Texto = "--" + " " + jTextField1.getText() + "\n" + "--" + " " + jTextArea1.getText() + "\n" + "PAGO!" + "--" + " " + jTextField2.getText();
                gravar.write(Texto);
                gravar.flush();
                gravar.close();
                JOptionPane.showMessageDialog(rootPane,"Pagamento confirmado com sucesso!");
                jTextArea1.setText(jTextArea1.getText() + "\n" + "PAGO!");
                jTextArea1.setEditable(false);
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
                jButtonConfirmarPagamento.setEnabled(false);
                jButtonRecalcular.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButton2.setEnabled(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane,"Impossível confirmar o pagamento!");
            }
        }
    }//GEN-LAST:event_jButtonConfirmarPagamentoActionPerformed

    private void jButtonAbrirComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirComandaActionPerformed
        JFileChooser abrir = new JFileChooser();
        int opcao = abrir.showOpenDialog(null);
        if(opcao == JFileChooser.APPROVE_OPTION){
            File arquivo = abrir.getSelectedFile();
            Scanner escrever;
            try{
                escrever = new Scanner((arquivo)).useDelimiter("-- ");
                while(escrever.hasNext()){
                    jTextField1.setText(escrever.next());
                    jTextArea1.setText(escrever.next());
                    jTextField2.setText(escrever.next());
                }
                jTextArea1.setEditable(true);
                jTextField1.setEditable(true);
                jTextField2.setEditable(true);
                jButtonConfirmarPagamento.setEnabled(true);
                jButtonRecalcular.setEnabled(true);
                jButtonCancelar.setEnabled(true);
                jButton2.setEnabled(true);
            }
                catch(FileNotFoundException | NumberFormatException exe){
                JOptionPane.showMessageDialog(rootPane,"Erro ao abrir a comanda!");
            }
        }
        for(int i=0;i<jTextArea1.getText().length();i++){
            if(jTextArea1.getText().charAt(i)=='!'){
                JOptionPane.showMessageDialog(rootPane,"Pedido finalizado! Apenas será possível visualizá-lo!");
                jTextArea1.setEditable(false);
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
                jButtonConfirmarPagamento.setEnabled(false);
                jButtonRecalcular.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButton2.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButtonAbrirComandaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextArea1.setText("");
        jTextField2.setText("");
        jTextArea1.setEditable(false);
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jButtonConfirmarPagamento.setEnabled(false);
        jButtonRecalcular.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        TelaLogin L = new TelaLogin();
        L.setLocationRelativeTo(null);
        L.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRecalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecalcularActionPerformed
        String quantidade_aux = "";
        String opcao = "";
        int qt1_aux = 0, qt2_aux = 0, qt3_aux = 0, qt4_aux = 0, qt5_aux = 0, qt6_aux = 0, qt7_aux = 0, qt8_aux = 0, qt9_aux = 0;
        int pos_aux=0,pos_aux2=0,pos_aux_num=0,fim=0;
        int i,i2;
        int cont=0;
        for(i2=pos_aux_num+1;i2<jTextArea1.getText().length();){
            opcao = "";
            for(i=pos_aux_num+1;i<jTextArea1.getText().length();i++){
                if(jTextArea1.getText().charAt(i)=='0' || jTextArea1.getText().charAt(i)=='1' || jTextArea1.getText().charAt(i)=='2' || jTextArea1.getText().charAt(i)=='3' || jTextArea1.getText().charAt(i)=='4' || jTextArea1.getText().charAt(i)=='5' || jTextArea1.getText().charAt(i)=='6' || jTextArea1.getText().charAt(i)=='7' || jTextArea1.getText().charAt(i)=='8' || jTextArea1.getText().charAt(i)=='9'){
                    quantidade_aux = quantidade_aux + jTextArea1.getText().charAt(i);
                    pos_aux_num = i;
                    if(jTextArea1.getText().charAt(i+1)!='0' || jTextArea1.getText().charAt(i+1)!='1' || jTextArea1.getText().charAt(i+1)!='2' || jTextArea1.getText().charAt(i+1)!='3' || jTextArea1.getText().charAt(i+1)!='4' || jTextArea1.getText().charAt(i+1)!='5' || jTextArea1.getText().charAt(i+1)!='6' || jTextArea1.getText().charAt(i+1)!='7' || jTextArea1.getText().charAt(i+1)!='8' || jTextArea1.getText().charAt(i+1)!='9'){
                        pos_aux2 = i;
                        break;
                    }
                }
                else if(i+1==jTextArea1.getText().length() && jTextArea1.getText().charAt(i)!='0' || i+1==jTextArea1.getText().length() && jTextArea1.getText().charAt(i)!='1' || i+1==jTextArea1.getText().length() && jTextArea1.getText().charAt(i)!='2' || i+1==jTextArea1.getText().length() && jTextArea1.getText().charAt(i)!='3' || i+1==jTextArea1.getText().length() && jTextArea1.getText().charAt(i)!='4' || i+1==jTextArea1.getText().length() && jTextArea1.getText().charAt(i)!='5' || i+1==jTextArea1.getText().length() && jTextArea1.getText().charAt(i)!='6' || i+1==jTextArea1.getText().length() && jTextArea1.getText().charAt(i)!='7' || i+1==jTextArea1.getText().length() && jTextArea1.getText().charAt(i)!='8' || i+1==jTextArea1.getText().length() && jTextArea1.getText().charAt(i)!='9'){
                    fim = 1;
                    break;
                }
            }
            if(fim==1){
                break;
            }
            for(cont=pos_aux2;;cont=cont-1){
                if(cont-2>=0 && jTextArea1.getText().charAt(cont-2)=='>'){
                    break;
                }
            }
            for(pos_aux=cont;;pos_aux++){
                opcao = opcao + jTextArea1.getText().charAt(pos_aux);
                if(jTextArea1.getText().charAt(pos_aux+4)=='Q'){
                    break;
                }
            }
            if(opcao.trim().equals("Suco de Laranja")){
                qt1_aux = Integer.parseInt(quantidade_aux);
                quantidade_aux = "";
            }
            else if(opcao.trim().equals("Suco de Abacaxi")){
                qt2_aux = Integer.parseInt(quantidade_aux);
                quantidade_aux = "";
            }
            else if(opcao.trim().equals("Suco de Melancia")){
                qt3_aux = Integer.parseInt(quantidade_aux);
                quantidade_aux = "";
            }
            else if(opcao.trim().equals("Sorvete de Chocolate")){
                qt4_aux = Integer.parseInt(quantidade_aux);
                quantidade_aux = "";
            }
            else if(opcao.trim().equals("Sorvete de Baunilha")){
                qt5_aux = Integer.parseInt(quantidade_aux);
                quantidade_aux = "";
            }
            else if(opcao.trim().equals("Sorvete de Morango")){
                qt6_aux = Integer.parseInt(quantidade_aux);
                quantidade_aux = "";
            }
            else if(opcao.trim().equals("Shake de Leite Ninho")){
                qt7_aux = Integer.parseInt(quantidade_aux);
                quantidade_aux = "";
            }
            else if(opcao.trim().equals("Shake de Morango")){
                qt8_aux = Integer.parseInt(quantidade_aux);
                quantidade_aux = "";
            }
            else if(opcao.trim().equals("Shake Trufado")){
                qt9_aux = Integer.parseInt(quantidade_aux);
                quantidade_aux = "";
            }
        }
        Produtos P = new Produtos(jTextField1.getText(),jTextArea1.getText(),qt1_aux,qt2_aux,qt3_aux,qt4_aux,qt5_aux,qt6_aux,qt7_aux,qt8_aux,qt9_aux);
        jTextField2.setText("R$"+Float.toString(P.Calcula(qt1_aux,qt2_aux,qt3_aux,qt4_aux,qt5_aux,qt6_aux,qt7_aux,qt8_aux,qt9_aux))); 
    }//GEN-LAST:event_jButtonRecalcularActionPerformed
     
    public void Funcionario(boolean eFuncionario){
        if(eFuncionario){
            jButtonAbrirComanda.setEnabled(false);
            jButtonConfirmarPagamento.setEnabled(false);
            jButtonRecalcular.setEnabled(false);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jTextArea1.setEditable(false);
            jTextField1.setEditable(false);
            jTextField2.setEditable(false);
            F = 1;
        }
        else{
            jButtonConfirmar.setEnabled(false);
            jTextArea1.setEditable(false);
            jTextField1.setEditable(false);
            jTextField2.setEditable(false);
            jButtonConfirmarPagamento.setEnabled(false);
            jButtonRecalcular.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButton2.setEnabled(false);
        }
    }
    
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
            java.util.logging.Logger.getLogger(TelaComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAbrirComanda;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonConfirmarPagamento;
    private javax.swing.JButton jButtonRecalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
