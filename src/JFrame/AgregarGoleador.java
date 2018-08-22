
package JFrame;

 class AgregarGoleador extends javax.swing.JFrame {
quiniela.Arrays array = new quiniela.Arrays();
    int usuarioActivo = 0;
    
    public AgregarGoleador() {
        initComponents();
    }
    public AgregarGoleador (quiniela.Campeon[] camp,quiniela.Curiosidad[] curi,
            quiniela.Equipos[] equi, quiniela.Goleador[] gole,quiniela.Marcadores[]marc,
            quiniela.Partido[] part, quiniela.Usuario[] usua,int usuario){
        initComponents();
        array.setArray(camp);
        array.setArray(curi);
        array.setArray(equi);
        array.setArray(gole);
        array.setArray(marc);
        array.setArray(part);
        array.setArray(usua);
        usuarioActivo=usuario;
        sincroEquip();
        
    }
    public void sincroEquip(){
        int x=0;
        while (array.getEquipos(x)!= null){
            EquipoGole.addItem(array.getEquipos(x).getNombreEquipo());
            EquipoCamp.addItem(array.getEquipos(x).getNombreEquipo());
            x++;
            
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        EquipoGole = new javax.swing.JComboBox<>();
        EquipoCamp = new javax.swing.JComboBox<>();
        ResulEquip = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ResulCamp = new javax.swing.JTextField();
        EstoySegu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        EquipoGole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipoGoleActionPerformed(evt);
            }
        });

        EquipoCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipoCampActionPerformed(evt);
            }
        });

        ResulEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResulEquipActionPerformed(evt);
            }
        });

        jLabel1.setText("Su elección: ");

        jLabel2.setText("Su elección:");

        ResulCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResulCampActionPerformed(evt);
            }
        });

        EstoySegu.setText("Estoy Seguro!");
        EstoySegu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoySeguActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione el equpo goleador y campeon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ResulEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EstoySegu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(ResulCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(EquipoGole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EquipoCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EquipoGole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EquipoCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(EstoySegu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResulEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResulCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EquipoGoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipoGoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EquipoGoleActionPerformed

    private void EquipoCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipoCampActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_EquipoCampActionPerformed

    private void EstoySeguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoySeguActionPerformed
        // TODO add your handling code here:
        int count=0;
        int indexC=0;
        int indexG=0;
        boolean existeG=false;
        boolean existeC=false;
        String s= EquipoGole.getSelectedItem().toString();
         ResulEquip.setText((EquipoGole.getSelectedItem().toString()));
         ResulCamp.setText((EquipoCamp.getSelectedItem().toString()));
         
         while(array.getGoleador(count)!=null){
            if (array.getUsuario(usuarioActivo).getIdUsuario()== 
                    array.getGoleador(count).getUsuario()){
                existeG=true; 
                indexC = count;
            }
            count++;
         }
            count=0;
         while(array.getCampeon(count)!=null){
            if (array.getUsuario(usuarioActivo).getIdUsuario()== 
                    array.getCampeon(count).getUsuario()){
                existeC=true; 
                indexG = count;
            }
            count++;
             
         }
         
         if (existeG){
             array.getGoleador(indexG).setJugador(EquipoGole.getSelectedItem().toString());
         }else {
             quiniela.Goleador golead= new quiniela.Goleador();
             golead.setUsuario(array.getUsuario(usuarioActivo).getIdUsuario());
             golead.setJugador(EquipoGole.getSelectedItem().toString());
             array.add(golead);
         }
         if (existeC){
             array.getCampeon(indexC).setEquipo(EquipoCamp.getSelectedItem().toString());
         }else {
             quiniela.Campeon campe= new quiniela.Campeon();
             campe.setUsuario(array.getUsuario(usuarioActivo).getIdUsuario());
             campe.setEquipo(EquipoCamp.getSelectedItem().toString());
             array.add(campe);
         }
         
         
         
         
    }//GEN-LAST:event_EstoySeguActionPerformed

    private void ResulEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResulEquipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResulEquipActionPerformed

    private void ResulCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResulCampActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResulCampActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(AgregarGoleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarGoleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarGoleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarGoleador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarGoleador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EquipoCamp;
    private javax.swing.JComboBox<String> EquipoGole;
    private javax.swing.JButton EstoySegu;
    private javax.swing.JTextField ResulCamp;
    private javax.swing.JTextField ResulEquip;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
