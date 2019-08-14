/**
 * JFrame para interaçao do usuario
 */
package eucliedesEstendido.view;

import euclidesestendido.model.ChavePublica;
import euclidesestendido.model.EuclidesEstendido;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis
 */
public class JFEuclidesEstendido extends javax.swing.JFrame {
    private static JFEuclidesEstendido tela; 
    ChavePublica chaves = new ChavePublica(); 
    EuclidesEstendido euclidesEstendido = new EuclidesEstendido();  
    ArrayList<Integer> divisao =  new ArrayList<Integer>();
    ArrayList<Long> numeros = new ArrayList<Long>();
    /**
     * Inicializa os componentes
     */
    public JFEuclidesEstendido() {
        initComponents();
    }
    /**
     * Faz a fatoração dos numero primo passado e imprime os numeros primos que 
     * foram usados, para o usuario escolher um outro numero que nao sejam os mesmos
     */
    public void printFatoracao(long num){
    
        for(int i =2; num!= 1; i++){
            if(num % i ==0){
                divisao.add(i);
                num = num/i;
                numeros.add(num);
                i=1;}

        }
            //txtAFtrPrimos.insert(String.valueOf(chaves.getX())+"|"+String.valueOf(numeros), txtAFtrPrimos.getCaretPosition());
            //txtAFtrPrimos.append("\n");
     
            txtAFtrPrimos.insert(""+String.valueOf(divisao), txtAFtrPrimos.getCaretPosition());
            txtAFtrPrimos.append("\n");
            

    }     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRSA = new javax.swing.JLabel();
        lblFirstPrimo = new javax.swing.JLabel();
        txtFirstPrimo = new javax.swing.JTextField();
        lblSecondPrimo = new javax.swing.JLabel();
        txtSecondPrimo = new javax.swing.JTextField();
        lblFistKeyPublic = new javax.swing.JLabel();
        txtFirstKeyPublic = new javax.swing.JTextField();
        btnFtotiente = new javax.swing.JButton();
        lblFuncaoTotiente = new javax.swing.JLabel();
        txtFuncaoTotiente = new javax.swing.JTextField();
        lblFtrPrimos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAFtrPrimos = new javax.swing.JTextArea();
        lblPrimoEscolha = new javax.swing.JLabel();
        txtNumeroPrimoE = new javax.swing.JTextField();
        btnPrivateKey = new javax.swing.JButton();
        lblChavesPublicas = new javax.swing.JLabel();
        txtPublicKeys = new javax.swing.JTextField();
        txtPublicKeys1 = new javax.swing.JTextField();
        lblChavesPrivadas = new javax.swing.JLabel();
        txtPrivateKey2 = new javax.swing.JTextField();
        txtPrivateKey1 = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnProva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Euclides Estendido(Chave Privada)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        lblRSA.setText("O RSA consiste de dois numeros com modulos e expoentes, calculando o publico se usa dois numeros primos.");

        lblFirstPrimo.setText("Digite o primeiro numero primo:");

        txtFirstPrimo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFirstPrimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFirstPrimoMousePressed(evt);
            }
        });

        lblSecondPrimo.setText("Digite o Segundo numero primo:");

        txtSecondPrimo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSecondPrimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSecondPrimoMousePressed(evt);
            }
        });

        lblFistKeyPublic.setText("Esta e a sua primeira chave publica :");

        txtFirstKeyPublic.setEditable(false);
        txtFirstKeyPublic.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnFtotiente.setText("Calcular");
        btnFtotiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFtotienteActionPerformed(evt);
            }
        });

        lblFuncaoTotiente.setText("Apos o uso da função Totiente este e o resultado:");

        txtFuncaoTotiente.setEditable(false);
        txtFuncaoTotiente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblFtrPrimos.setText("Podendo ser fatorado pelos seguintes numeros primos:");

        txtAFtrPrimos.setEditable(false);
        txtAFtrPrimos.setColumns(20);
        txtAFtrPrimos.setRows(5);
        jScrollPane1.setViewportView(txtAFtrPrimos);

        lblPrimoEscolha.setText("Sabendo disso use um numero primo que nao seja divivel por nenhum deles:");

        txtNumeroPrimoE.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNumeroPrimoE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroPrimoEMousePressed(evt);
            }
        });

        btnPrivateKey.setText("Calcular");
        btnPrivateKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrivateKeyActionPerformed(evt);
            }
        });

        lblChavesPublicas.setText("Suas chaves Publicas: ");

        txtPublicKeys.setEditable(false);
        txtPublicKeys.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPublicKeys1.setEditable(false);
        txtPublicKeys1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblChavesPrivadas.setText("Suas chaves Privadas: ");

        txtPrivateKey2.setEditable(false);
        txtPrivateKey2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPrivateKey1.setEditable(false);
        txtPrivateKey1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnClear.setText("Novo");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnProva.setText("Prova Real");
        btnProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSecondPrimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFtotiente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblChavesPrivadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrivateKey1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblChavesPublicas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPublicKeys, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrivateKey2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPublicKeys1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFuncaoTotiente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFirstKeyPublic, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPrimoEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNumeroPrimoE, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblFirstPrimo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSecondPrimo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFirstPrimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblRSA, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblFtrPrimos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(lblFistKeyPublic, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFuncaoTotiente, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 1, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnProva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrivateKey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRSA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecondPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSecondPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFtotiente))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFistKeyPublic)
                    .addComponent(txtFirstKeyPublic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuncaoTotiente)
                    .addComponent(txtFuncaoTotiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFtrPrimos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroPrimoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrivateKey)
                    .addComponent(lblPrimoEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChavesPublicas)
                    .addComponent(txtPublicKeys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPublicKeys1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChavesPrivadas)
                    .addComponent(txtPrivateKey2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrivateKey1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnProva)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Caso o usuario mude de ideia do numero seta o jtext
 */
    private void txtFirstPrimoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstPrimoMousePressed
        txtFirstPrimo.setText("");
    }//GEN-LAST:event_txtFirstPrimoMousePressed
/**
 * Caso o usuario mude de ideia do numero seta o jtext
 */
    private void txtSecondPrimoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSecondPrimoMousePressed
        txtSecondPrimo.setText("");
    }//GEN-LAST:event_txtSecondPrimoMousePressed
/**
 * Este botao calcula a chave publica e a função totiente as setando nas jtext 
 * correspondentes, em caso de nenhum dos campos terem sido permidos dispara caixa 
 * de dialogo alertando.
 */
    private void btnFtotienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFtotienteActionPerformed
        
    
    try{    
        
        long q = Long.parseLong(txtFirstPrimo.getText());
        long p = Long.parseLong(txtSecondPrimo.getText()); 
        chaves.chavePublica(q, p);
        txtFirstKeyPublic.setText(String.valueOf(chaves.getN()));
        chaves.funcaoTotiente(q, p);
        txtFuncaoTotiente.setText(String.valueOf(chaves.getX()));
        printFatoracao(Long.parseLong(txtFuncaoTotiente.getText()));
            if(btnFtotiente.isEnabled()){
                btnFtotiente.setEnabled(false);
            }
    }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Selecione um dos campos\n"
           +ex.getMessage() + "\n");
    } 
        
        
    }//GEN-LAST:event_btnFtotienteActionPerformed
/**
 * Caso o usuario mude de ideia do numero seta o jtext
 */
    private void txtNumeroPrimoEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroPrimoEMousePressed
        txtNumeroPrimoE.setText("");
    }//GEN-LAST:event_txtNumeroPrimoEMousePressed
/**
 * Botão que faz uso do metodo da classe euclides estendido e seta os resultados
 * nas respectivas jtext, em caso de nenhum dos campos terem sido permidos dispara caixa 
 * de dialogo alertando.
 */
    private void btnPrivateKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrivateKeyActionPerformed
    try{    
        long e = Long.parseLong(txtNumeroPrimoE.getText());
     
        txtPublicKeys.setText(txtFirstKeyPublic.getText());
        txtPublicKeys1.setText(txtNumeroPrimoE.getText());
 
        txtPrivateKey1.setText(txtFirstKeyPublic.getText());
        txtPrivateKey2.setText(String.valueOf(euclidesEstendido.calculo(e, chaves.getX())));
        if(btnFtotiente.isEnabled()){
                btnFtotiente.setEnabled(false);
            }
        if(btnPrivateKey.isEnabled()){
                btnPrivateKey.setEnabled(false);
            }
    }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Selecione um dos campos\n"
           +ex.getMessage() + "\n");
    }     
    }//GEN-LAST:event_btnPrivateKeyActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        btnFtotiente.setEnabled(true);
        btnPrivateKey.setEnabled(true);
 
        txtFirstPrimo.setText("");
        txtSecondPrimo.setText("");   
        txtNumeroPrimoE.setText("");
        txtPublicKeys.setText("");
        txtFirstKeyPublic.setText("");
        txtPrivateKey1.setText("");
        txtPrivateKey2.setText("");
        txtPublicKeys1.setText("");
        txtFuncaoTotiente.setText("");
        txtAFtrPrimos.setText("");
       
       
       tela = new JFEuclidesEstendido();
       tela.setLocationRelativeTo(null);
       tela.setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvaActionPerformed
        
        long e = Long.parseLong(txtNumeroPrimoE.getText());
        long d = Long.parseLong(txtPrivateKey2.getText());
        long n = Long.parseLong(txtFuncaoTotiente.getText());
        long p = (d*e)% n;
        
        if(p == 1){  
          JOptionPane.showMessageDialog(null, "Para a prova real se usa:\n"
          + "o expoente privado vezes expoente publico mod o modulo\n"
            + " que sendo igual 1 a chave privada esta correta.\n");
        }else{
          JOptionPane.showMessageDialog(null, "Algo saiu errado confira novamente\n");
        }
        

    }//GEN-LAST:event_btnProvaActionPerformed

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFEuclidesEstendido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEuclidesEstendido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEuclidesEstendido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEuclidesEstendido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEuclidesEstendido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFtotiente;
    private javax.swing.JButton btnPrivateKey;
    private javax.swing.JButton btnProva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChavesPrivadas;
    private javax.swing.JLabel lblChavesPublicas;
    private javax.swing.JLabel lblFirstPrimo;
    private javax.swing.JLabel lblFistKeyPublic;
    private javax.swing.JLabel lblFtrPrimos;
    private javax.swing.JLabel lblFuncaoTotiente;
    private javax.swing.JLabel lblPrimoEscolha;
    private javax.swing.JLabel lblRSA;
    private javax.swing.JLabel lblSecondPrimo;
    private javax.swing.JTextArea txtAFtrPrimos;
    private javax.swing.JTextField txtFirstKeyPublic;
    private javax.swing.JTextField txtFirstPrimo;
    private javax.swing.JTextField txtFuncaoTotiente;
    private javax.swing.JTextField txtNumeroPrimoE;
    private javax.swing.JTextField txtPrivateKey1;
    private javax.swing.JTextField txtPrivateKey2;
    private javax.swing.JTextField txtPublicKeys;
    private javax.swing.JTextField txtPublicKeys1;
    private javax.swing.JTextField txtSecondPrimo;
    // End of variables declaration//GEN-END:variables
}
