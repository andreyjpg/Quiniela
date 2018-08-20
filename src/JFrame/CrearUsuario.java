
package JFrame;

import javax.swing.JOptionPane;
import quiniela.Usuario;

public class CrearUsuario extends javax.swing.JFrame {
    
    quiniela.Arrays array = new quiniela.Arrays();
    
    public CrearUsuario( quiniela.Campeon[] camp,quiniela.Curiosidad[] curi,
            quiniela.Equipos[] equi, quiniela.Goleador[] gole,quiniela.Marcadores[]marc,
            quiniela.Partido[] part ,quiniela.Usuario[] usua ) {
      initComponents();
      array.setArray(camp);
      array.setArray(curi);
      array.setArray(equi);
      array.setArray(gole);
      array.setArray(marc);
      array.setArray(part);
      array.setArray(usua);
        this.setLocationRelativeTo(null);
    }
    
    public void agregarMarcadores(quiniela.Usuario datos){
        for(int count=0; count < array.getArray().length; count++){
            if(array.get(count) != null){
                quiniela.Marcadores marcador = new quiniela.Marcadores();
                marcador.setUsuario(datos.getIdUsuario());
                marcador.setIdPartido(array.get(count).getIdPartido());
                marcador.setEquipoLocal(array.get(count).getEquipoLocal());
                marcador.setFecha(array.get(count).getFecha());
                marcador.setHora(array.get(count).getHora());
                marcador.setMarcadorLocal(0);
                marcador.setMarcadorVisitante(0);
                marcador.setEquipoVisitante(array.get(count).getEquipoVisitante());

                array.add(marcador);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Carrera = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        Password = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registrarse");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Carrera:");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosActionPerformed(evt);
            }
        });

        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });

        Carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarreraActionPerformed(evt);
            }
        });

        BtnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Apellidos)
                                    .addComponent(Correo)
                                    .addComponent(Nombre)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosActionPerformed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void CarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarreraActionPerformed
public void RegistrarUsuario(){
        int x =1;
        Usuario user=new Usuario();
        user.setNombre(Nombre.getText());
        user.setApellido(Apellidos.getText());
        user.setCorreo(Correo.getText());
        user.setContraseña(Password.getText());
        user.setCarrera(Carrera.getText());
        user.setIdUsuario((int)(Math.random()*9999999));
        array.add(user);
        JOptionPane.showMessageDialog(null,
         "***DATOS GUARDADOS DEL PERFIL***\n\nNombre: "
         +user.getNombre()+"\nApellidos: "
         +user.getApellido()+"\nCorreo: "
         +user.getCorreo()+"\nContraseña: "
         +user.getContraseña()+"\nCarrera: "
                 +user.getCarrera()+"\nId.: "
                 +user.getIdUsuario());
        x++;
        agregarMarcadores(user);
    }
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        MainPanel m=new MainPanel(array.getArrayCampeon(), array.getArrayCuriosidad(),
          array.getArrayEquipos(),array.getArrayGoleador(),array.getArrayMarcadores(),
          array.getArray(), array.getArrayUsuario());
        RegistrarUsuario();
        this.setVisible(false);
        m.setVisible(true); 
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        MainPanel sesion = new MainPanel(array.getArrayCampeon(), array.getArrayCuriosidad(),
            array.getArrayEquipos(),array.getArrayGoleador(),array.getArrayMarcadores(),
            array.getArray(), array.getArrayUsuario());
        sesion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Apellidos;
    private javax.swing.JButton BtnGuardar;
    public static javax.swing.JTextField Carrera;
    public static javax.swing.JTextField Correo;
    public static javax.swing.JTextField Nombre;
    public static javax.swing.JTextField Password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
