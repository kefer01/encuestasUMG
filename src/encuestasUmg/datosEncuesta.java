/**
 *
 * @author Kevin Oliva
 */
package encuestasUmg;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class datosEncuesta extends javax.swing.JFrame {

    DefaultTableModel model;

    public datosEncuesta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    //mostar los datos de la base de datos
    void cargar(){
        String [] titulos={"Nombre","Apellido","Carnet","Carrera","Sede","Curso","Pregunta 1","Pregunta 2","Pregunta 3","Pregunta 4","Pregunta 5"};
        String [] registros= new String[11];
        
        String sql ="SELECT * FROM datosestudiantes";
        
        model = new DefaultTableModel(null,titulos);
        conexionBD bd = new conexionBD();
        Connection conect = bd.conectarBD();
        try {
          Statement sentencia = conect.createStatement();
          ResultSet resultado = sentencia.executeQuery(sql);
          
          while (resultado.next()){
              registros[0]=resultado.getString("nombre");
              registros[1]=resultado.getString("apellido");
              registros[2]=resultado.getString("carnet");
              registros[3]=resultado.getString("carrera");
              registros[4]=resultado.getString("sede");
              registros[5]=resultado.getString("curso");
              registros[6]=resultado.getString("pregunta1");
              registros[7]=resultado.getString("pregunta2");
              registros[8]=resultado.getString("pregunta3");
              registros[9]=resultado.getString("pregunta4");
              registros[10]=resultado.getString("pregunta5");
              model.addRow(registros);
          }
          tablaDatos.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTituloNuevaEncuesta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        botonVerDatos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTituloNuevaEncuesta.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        labelTituloNuevaEncuesta.setText("Bienvenido al sistema de encuestas de la UMG");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("Estos son los resultados de los estudiantes que realizaron la encuesta:");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        botonVerDatos.setText("Ver Datos");
        botonVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDatosActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(labelTituloNuevaEncuesta)
                        .addGap(0, 170, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonVerDatos)
                .addGap(414, 414, 414))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTituloNuevaEncuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDatosActionPerformed
        cargar();
    }//GEN-LAST:event_botonVerDatosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(datosEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datosEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datosEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datosEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datosEncuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVerDatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTituloNuevaEncuesta;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
