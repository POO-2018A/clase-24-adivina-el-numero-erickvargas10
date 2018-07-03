
package adivina_el_numero;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;


public class AdivinaNumero extends javax.swing.JFrame {
    Random numeroAleatorio = new Random();
     int numero = numeroAleatorio.nextInt(1000);

 
    public AdivinaNumero() {
        initComponents();
         this.setTitle("Tengo un numero entre 1 y 1000. Puede usted adivinarlo?");
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumero = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        lblIntentos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNumero.setText("Ingrese Numero");

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        lblIntentos.setText("Por favor escriba su primer intento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIntentos)
                        .addGap(136, 136, 136))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnJugar)
                            .addComponent(lblNumero))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addComponent(btnReiniciar)
                                .addGap(87, 87, 87)))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblIntentos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJugar)
                    .addComponent(btnReiniciar))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
      
                int numeroAdivinado = Integer.parseInt(txtNumero.getText());
        
        if(numeroAdivinado == numero){
           lblIntentos.setText("ADIVINO EL NUMERO");
           this.getContentPane().setBackground(Color.gray);
        
        }else 
            if(numeroAdivinado < numero){
            lblIntentos.setText(numeroAdivinado + " se esta ACERCANDO al numero");
            this.getContentPane().setBackground(Color.RED);
            txtNumero.setText("");
        }else
                if(numeroAdivinado > numero){
            lblIntentos.setText(numeroAdivinado + " se esta ALEJANDO del numero");
            this.getContentPane().setBackground(Color.BLUE);
            txtNumero.setText("");
        }
    
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro?", "Jugar de Nuevo", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (mensaje == 0) {
        lblIntentos.setText("");
        txtNumero.setText("");
            lblIntentos.setText("Por favor, ingrese su primer intento");
            numero= numeroAleatorio.nextInt(1000);
            txtNumero.enable();
        }
        
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(AdivinaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdivinaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdivinaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdivinaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdivinaNumero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel lblIntentos;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
