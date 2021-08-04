/**
 *
 * @author Kevin Oliva
 */
package encuestasUmg;

import java.sql.*;


public class menu extends javax.swing.JFrame {


    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        labelTitulo = new javax.swing.JLabel();
        botonNuevaEncuesta = new javax.swing.JButton();
        botonDatosEncuesta = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        logoUmg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonConexion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuNuevaEncuesta = new javax.swing.JMenuItem();
        menuVerEncuestas = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuAcercaDe = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encuestas UMG");
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        labelTitulo.setText("Encuestas UMG");

        botonNuevaEncuesta.setText("Nueva encuesta");
        botonNuevaEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaEncuestaActionPerformed(evt);
            }
        });

        botonDatosEncuesta.setText("Datos Encuesta");
        botonDatosEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDatosEncuestaActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        logoUmg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen/logo umg1.png"))); // NOI18N
        logoUmg.setMaximumSize(new java.awt.Dimension(240, 241));
        logoUmg.setMinimumSize(new java.awt.Dimension(240, 241));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("2020 | Design by Kefer01");

        botonConexion.setText("Conectar BD");
        botonConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConexionActionPerformed(evt);
            }
        });

        menuArchivo.setText("Archivo");

        menuNuevaEncuesta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNuevaEncuesta.setText("Nueva encuesta");
        menuNuevaEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevaEncuestaActionPerformed(evt);
            }
        });
        menuArchivo.add(menuNuevaEncuesta);

        menuVerEncuestas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuVerEncuestas.setText("Ver encuestas");
        menuVerEncuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerEncuestasActionPerformed(evt);
            }
        });
        menuArchivo.add(menuVerEncuestas);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuSalir);

        jMenuBar1.add(menuArchivo);

        menuAyuda.setText("Ayuda");

        menuAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuAcercaDe.setText("Acerca de...");
        menuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(menuAcercaDe);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logoUmg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTitulo)
                        .addGap(20, 20, 20)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonNuevaEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonDatosEncuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonConexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoUmg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitulo))
                .addGap(24, 24, 24)
                .addComponent(botonConexion)
                .addGap(18, 18, 18)
                .addComponent(botonNuevaEncuesta)
                .addGap(18, 18, 18)
                .addComponent(botonDatosEncuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(1, 1, 1)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuNuevaEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevaEncuestaActionPerformed
        nuevaEncuesta encuesta = new nuevaEncuesta();
        encuesta.show();
    }//GEN-LAST:event_menuNuevaEncuestaActionPerformed

    private void botonNuevaEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaEncuestaActionPerformed
        nuevaEncuesta encuesta = new nuevaEncuesta();
        encuesta.show();
    }//GEN-LAST:event_botonNuevaEncuestaActionPerformed

    private void botonConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConexionActionPerformed
        conexionBD conectar = new conexionBD();
        conectar.conectarBD();
    }//GEN-LAST:event_botonConexionActionPerformed

    private void botonDatosEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosEncuestaActionPerformed
        datosEncuesta datosEnc = new datosEncuesta();
        datosEnc.show();
    }//GEN-LAST:event_botonDatosEncuestaActionPerformed

    private void menuVerEncuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerEncuestasActionPerformed
        datosEncuesta datosEnc = new datosEncuesta();
        datosEnc.show();
    }//GEN-LAST:event_menuVerEncuestasActionPerformed

    private void menuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaDeActionPerformed
        acercaDe ayuda = new acercaDe();
        ayuda.show();
    }//GEN-LAST:event_menuAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConexion;
    private javax.swing.JButton botonDatosEncuesta;
    private javax.swing.JButton botonNuevaEncuesta;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel logoUmg;
    private javax.swing.JMenuItem menuAcercaDe;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuNuevaEncuesta;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuVerEncuestas;
    // End of variables declaration//GEN-END:variables
}
