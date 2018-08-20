
package JFrame;
import javax.swing.JOptionPane;
import quiniela.Usuario;
public class IniciarSesion extends javax.swing.JFrame {
    quiniela.Arrays array = new quiniela.Arrays ();
    public IniciarSesion(quiniela.Campeon[] camp,quiniela.Curiosidad[] curi,
            quiniela.Equipos[] equi, quiniela.Goleador[] gole,quiniela.Marcadores[]marc,
            quiniela.Partido[] part ,quiniela.Usuario[] usua  ) {
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
    public IniciarSesion(){
              initComponents();

    }
    Usuario verif=new Usuario();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        correo_is = new javax.swing.JTextField();
        contraseña_is = new javax.swing.JPasswordField();
        Verificar = new javax.swing.JButton();
        Atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Iniciar Sesión");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Correo: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        Verificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Verificar.setText("Verificar");
        Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarActionPerformed(evt);
            }
        });

        Atras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(correo_is, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contraseña_is, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Verificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(correo_is, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contraseña_is, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarActionPerformed

        Login();
        
        
    }//GEN-LAST:event_VerificarActionPerformed
 public void Login(){
        String contraIng;
        String correoIng;
        correoIng=IniciarSesion.correo_is.getText();
        contraIng=IniciarSesion.contraseña_is.getText();
        try{
            for(int count = 0; count < array.getArrayUsuario().length; count ++){
                if(correoIng.equals(array.getUsuario(count).getCorreo())){
                    if(contraIng.equals(array.getUsuario(count).getContraseña())){
                        if(array.getUsuario(count).isEsAdmin()){
                            Menu_Admin admin=new Menu_Admin(array.getArrayCampeon(), array.getArrayCuriosidad(),
                            array.getArrayEquipos(),array.getArrayGoleador(),array.getArrayMarcadores(),
                            array.getArray(), array.getArrayUsuario());
                           admin.setVisible(true);
                           this.setVisible(false);
                           break;
                        } else{
                           int usuarioActivo = count;
                           MenuUsuarios m=new MenuUsuarios(array.getArrayCampeon(), array.getArrayCuriosidad(),
                            array.getArrayEquipos(),array.getArrayGoleador(),array.getArrayMarcadores(),
                            array.getArray(), array.getArrayUsuario(), usuarioActivo);
                           m.setVisible(true);
                           this.setVisible(false);
                           break;
                        }
                    }
                }
            }//Fin for
        }catch(NullPointerException err){
            JOptionPane.showMessageDialog(null, "Datos incorrectos\n"
                    + "Por favor ingrese de nuevo los datos.");
        }
    }
    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        MainPanel a = new MainPanel(array.getArrayCampeon(), array.getArrayCuriosidad(),
      array.getArrayEquipos(),array.getArrayGoleador(),array.getArrayMarcadores(),
      array.getArray(), array.getArrayUsuario());
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AtrasActionPerformed
    
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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Verificar;
    public static javax.swing.JPasswordField contraseña_is;
    public static javax.swing.JTextField correo_is;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
