
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Bruno
 */
public class Form1 extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public Form1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        txtfValor01 = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        lblValor01 = new javax.swing.JLabel();
        lblValor02 = new javax.swing.JLabel();
        txtfValor02 = new javax.swing.JTextField();
        lblValorTotal = new javax.swing.JLabel();
        txtfValorTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Soma - by Bruno Bueno");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setToolTipText("");
        btnCalcular.setName(""); // NOI18N
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 110, -1));
        getContentPane().add(txtfValor01, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 120, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("Digite o Valor que deseja Somar:");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 290, 32));

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 110, -1));

        lblValor01.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblValor01.setText("Valor 01:");
        getContentPane().add(lblValor01, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, 30));

        lblValor02.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblValor02.setText("Valor 02:");
        getContentPane().add(lblValor02, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 100, 30));
        getContentPane().add(txtfValor02, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 120, 30));

        lblValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblValorTotal.setText("Total:");
        getContentPane().add(lblValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 60, 30));

        txtfValorTotal.setEditable(false);
        getContentPane().add(txtfValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        //Botão Limpar
        txtfValor01.setText(null);
        txtfValor02.setText(null);
        txtfValorTotal.setText(null);
        
        txtfValor01.requestFocus();
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        //1 Passo - Entrada - Receber os Valores do Usuario
        double v1, v2, total;
        
        v1 = Double.parseDouble (txtfValor01.getText());
        v2 = Double.parseDouble (txtfValor02.getText());
        
        //2 Passo - Processamento - Calculo
        total = v1 + v2;
        
        //3 Passo - Saída - Exibir o Resultado
        txtfValorTotal.setText(String.valueOf(total));
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor01;
    private javax.swing.JLabel lblValor02;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JTextField txtfValor01;
    private javax.swing.JTextField txtfValor02;
    private javax.swing.JTextField txtfValorTotal;
    // End of variables declaration//GEN-END:variables
}