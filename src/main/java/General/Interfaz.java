package General;

import javax.swing.JOptionPane;



public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        Imagen = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        subtitulo1 = new javax.swing.JLabel();
        subtitulo2 = new javax.swing.JLabel();
        CBopcion = new javax.swing.JComboBox<>();
        titulo = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("general");
        setMaximumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vertical-closeup-shot-of-brown-dog.jpg"))); // NOI18N
        getContentPane().add(Imagen);
        Imagen.setBounds(0, 0, 340, 490);

        txtedad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtedad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtedad.setToolTipText("");
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        getContentPane().add(txtedad);
        txtedad.setBounds(390, 180, 280, 50);

        subtitulo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        subtitulo1.setText("Ingresa tu edad");
        getContentPane().add(subtitulo1);
        subtitulo1.setBounds(390, 140, 190, 22);

        subtitulo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        subtitulo2.setText("Elije una opcion ");
        getContentPane().add(subtitulo2);
        subtitulo2.setBounds(390, 260, 160, 20);

        CBopcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CBopcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Formula antigua", "Formula Nueva", "Ambas" }));
        CBopcion.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        CBopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBopcionActionPerformed(evt);
            }
        });
        getContentPane().add(CBopcion);
        CBopcion.setBounds(390, 300, 280, 50);

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Calcula tu edad si fueras un perro");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(titulo);
        titulo.setBounds(370, 40, 293, 60);

        btncalcular.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btncalcular.setText("Calcular");
        btncalcular.setToolTipText("");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btncalcular);
        btncalcular.setBounds(440, 390, 150, 40);

        Fondo.setBackground(new java.awt.Color(102, 0, 102));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9853.jpg"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 700, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBopcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBopcionActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        double res, res1 = 0;
        double edad = Double.parseDouble(txtedad.getText());
        String opc = CBopcion.getSelectedItem().toString();
        int opc1 = CBopcion.getSelectedIndex();
        if (opc1 == 0) {
            res = edad * 7;
            } else {
                if (opc1 == 1) {
                res = (Math.log(edad) * 16) + 31;
                } else {
                    if (opc1 == 2) {
                    res = edad * 7;
                    JOptionPane.showMessageDialog(null, "Tienes" + edad + "en años de perro");

                    res1 = (Math.log(edad) * 16) + 31;
                    JOptionPane.showMessageDialog(null, "Tienes" + edad + "en años de perro");
                }
            }
        }
    }//GEN-LAST:event_btncalcularActionPerformed


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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBopcion;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton btncalcular;
    private javax.swing.JLabel subtitulo1;
    private javax.swing.JLabel subtitulo2;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtedad;
    // End of variables declaration//GEN-END:variables
}
