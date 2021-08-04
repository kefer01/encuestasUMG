package encuestasUmg;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Kevin Oliva
 */
public class nuevaEncuesta extends javax.swing.JFrame {

      
    public nuevaEncuesta() {
        initComponents();
        this.setLocationRelativeTo(null);
        bloquear();
        
        
        
    }
    //bloquear las casillas del formulario
    void bloquear(){ 
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtCarnet.setEnabled(false);
        comboCarrera.setEnabled(false);
        comboSede.setEnabled(false);
        botonNuevo.setEnabled(true);
        botonGuardar.setEnabled(false);
        botonLimpiar.setEnabled(false);
        comboCurso.setEnabled(false);
    }
    
    //desbloquear las casillas del formulario
    void desbloquear(){
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtCarnet.setEnabled(true);
        comboCarrera.setEnabled(true);
        comboSede.setEnabled(true);
        botonNuevo.setEnabled(false);
        botonGuardar.setEnabled(true);
        botonLimpiar.setEnabled(true);
        comboCurso.setEnabled(true);
    }

    void limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtCarnet.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTituloNuevaEncuesta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelCarnet = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCarnet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboCarrera = new javax.swing.JComboBox<>();
        comboSede = new javax.swing.JComboBox<>();
        botonNuevo = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboCurso = new javax.swing.JComboBox<>();
        botonVerEncuestas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Encuesta");

        labelTituloNuevaEncuesta.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        labelTituloNuevaEncuesta.setText("Bienvenido al sistema de encuestas de la UMG");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>La siguiente encuesta es para saber su opinión como estudiante de la Universidad Mariano Galvez <p>y su percepcion de los cursos recibidos  en la nueva modalidad online.<p>Por favor ingresa tus datos para inicial la encuesta:<html>");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelNombre.setText("Nombre:");

        labelApellido.setText("Apellido:");

        labelCarnet.setText("Carnet:");
        labelCarnet.setMaximumSize(new java.awt.Dimension(41, 14));
        labelCarnet.setMinimumSize(new java.awt.Dimension(41, 14));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarnetActionPerformed(evt);
            }
        });

        jLabel2.setText("Carrera:");

        jLabel3.setText("Sede:");

        comboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Ingenieria en Sistemas", "Ingenieria Civil", "Ingenieria Electronica" }));

        comboSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Portales", "Central", "Villa Nueva" }));

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("Los cursos a evaluar son los siguientes:");

        comboCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Algebra", "Fisica", "Calculo", "Programacion" }));

        botonVerEncuestas.setText("Ver encuestas");
        botonVerEncuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerEncuestasActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(labelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboSede, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(botonGuardar)
                        .addGap(35, 35, 35)
                        .addComponent(botonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar)))
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(labelTituloNuevaEncuesta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonVerEncuestas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTituloNuevaEncuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(comboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonLimpiar)
                    .addComponent(botonCancelar)
                    .addComponent(botonGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVerEncuestas)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        desbloquear();
        txtNombre.requestFocus();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();//al presionar la tecla ENTER pasa a la siguiente casilla
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        txtApellido.transferFocus();//al presionar la tecla ENTER pasa a la siguiente casilla
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarnetActionPerformed
        txtCarnet.transferFocus(); //al presionar la tecla ENTER pasa a la siguiente casilla
    }//GEN-LAST:event_txtCarnetActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        String nom, ape, carnet, carrera, sede, curso,pregunta1, pregunta2, pregunta3, pregunta4, pregunta5;
        pregunta1 = JOptionPane.showInputDialog("¿Cree que el curso se ha adaptado a la nueva modalidad en linea?");
        pregunta2 = JOptionPane.showInputDialog("¿Considera que hay oportunidad de mejora en el metodo en linea?");
        pregunta3 = JOptionPane.showInputDialog("¿Se estan cumpliendo los horarios del curso?");
        pregunta4 = JOptionPane.showInputDialog("¿La plataforma virtual Blackboard es estable a la hora de recibir el curso?");
        pregunta5 = JOptionPane.showInputDialog("¿El curso se ha visto afectado por la actitud del catedratico?");
        
        conexionBD bd = new conexionBD();
        Connection conec = bd.conectarBD();
        
        nom = txtNombre.getText();
        ape = txtApellido.getText();
        carnet = txtCarnet.getText();
        carrera = (String)comboCarrera.getSelectedItem();
        sede = (String)comboSede.getSelectedItem();
        curso = (String)comboCurso.getSelectedItem();
        String sql = ""; 
        
        sql = "INSERT INTO datosestudiantes (nombre, apellido, carnet, carrera, sede, curso, pregunta1, pregunta2, pregunta3, pregunta4, pregunta5) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conec.prepareStatement(sql);
            pre.setString(1, nom);
            pre.setString(2, ape);
            pre.setString(3, carnet);
            pre.setString(4, carrera);
            pre.setString(5, sede);
            pre.setString(6, curso);
            pre.setString(7, pregunta1);
            pre.setString(8, pregunta2);
            pre.setString(9, pregunta3);
            pre.setString(10, pregunta4);
            pre.setString(11, pregunta5);
            
            int num = pre.executeUpdate();
            if(num>0){
                JOptionPane.showMessageDialog(null, "Registro Guardado Satisfactoriamente, continue con la encuesta");                
                botonGuardar.setEnabled(false);
                botonLimpiar.setEnabled(false);
                botonNuevo.setEnabled(false);
                comboCurso.setEnabled(false);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(nuevaEncuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonVerEncuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerEncuestasActionPerformed
        datosEncuesta datos = new datosEncuesta();
        datos.show();
        this.dispose();
    }//GEN-LAST:event_botonVerEncuestasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(nuevaEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevaEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevaEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevaEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevaEncuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonVerEncuestas;
    private javax.swing.JComboBox<String> comboCarrera;
    private javax.swing.JComboBox<String> comboCurso;
    private javax.swing.JComboBox<String> comboSede;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCarnet;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTituloNuevaEncuesta;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
