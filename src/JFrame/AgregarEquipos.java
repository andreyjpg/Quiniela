
package JFrame;

import javax.swing.JOptionPane;


public class AgregarEquipos extends javax.swing.JFrame {
    quiniela.Arrays array = new quiniela.Arrays();

    public AgregarEquipos() {
        initComponents();
    }

    public AgregarEquipos( quiniela.Campeon[] camp,quiniela.Curiosidad[] curi,
            quiniela.Equipos[] equi, quiniela.Goleador[] gole,quiniela.Marcadores[]marc,
            quiniela.Partido[] part, quiniela.Usuario[] usua) {
      initComponents();
      array.setArray(camp);
      array.setArray(curi);
      array.setArray(equi);
      array.setArray(gole);
      array.setArray(marc);
      array.setArray(part);
      array.setArray(usua);
      setDatos();
    }
    public void setDatos(){
        int x = 0;
        while(array.getEquipos(x) != null){
           Jcampeon.addItem(array.getEquipos(x).getNombreEquipo());
          JGoleador.addItem(array.getEquipos(x).getNombreEquipo());
            x++;
        }
        if(array.getCampeon(0) != null){
          Jcampeon.setSelectedItem(array.getCampeon(0).getEquipo());
          JGoleador.setSelectedItem(array.getGoleador(0).getJugador());
        }
    }
    
    
    public void addCombobox(quiniela.Equipos x){
        Jcampeon.addItem(x.getNombreEquipo());
        JGoleador.addItem(x.getNombreEquipo());
           
    }
    
    public void puntosCampeon(){
        int count=1;
        while(array.getCampeon(count)!= null){
            if( (array.getCampeon(0).getEquipo()).equals(array.getCampeon(count).getEquipo()) ){
                array.getCampeon(count).setPuntos(3);
            }
            count++;
        }
    }
    
    public void puntosGoleador(){
        int count=1;
        while(array.getGoleador(count)!= null){
            if( (array.getGoleador(0).getJugador()).equals(array.getGoleador(count).getJugador()) ){
                array.getGoleador(count).setPuntos(3);
            }
            count++;
        }
    }
    
    public void suma(){
           int suma =0;
           try{
            for(int usuario = 1; usuario < array.getArrayUsuario().length; usuario++){
                if(array.getUsuario(usuario) != null){
                for(int marcador = 0; marcador < array.getArrayUsuario().length; marcador++){
                    if(array.getMarcadores(marcador) != null){
                        if(array.getUsuario(usuario).getIdUsuario() == array.getMarcadores(marcador).getUsuario()){
                            suma += array.getMarcadores(marcador).getPuntosObtenidos();
                        }
                        array.getUsuario(usuario).setPuntos(suma 
                        + sumaGoleador(array.getUsuario(usuario).getIdUsuario()) 
                        + sumaCampeon(array.getUsuario(usuario).getIdUsuario()) );
                    }else{
                        break;
                    }
                }
                suma = 0;
                } else {
                    break;
                }
            }
           }catch(NullPointerException err){
               
           }
    }
    
    public int sumaCampeon(int id){
           int count=1, puntos = 0;
           while ( array.getCampeon(count)!= null){
               if (array.getCampeon(count).getUsuario() == id){
                   puntos = array.getCampeon(count).getPuntos();
               }
               count++;
           }
           return puntos;
       }
       
       public int sumaGoleador(int id){
           int count=1, puntos = 0;
           while ( array.getGoleador(count)!= null){
               if (array.getGoleador(count).getUsuario() == id){
                   puntos = array.getGoleador(count).getPuntos();
               }
               count++;
           }
           return puntos;
       }
       
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nuevoEquipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Atrás = new javax.swing.JButton();
        Jcampeon = new javax.swing.JComboBox<>();
        JGoleador = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Agregar Equipos");

        jLabel2.setText("Nombre del equipo");

        jLabel3.setText("Seleción de equipo ganador");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccion de equipo con el jugador goleador");

        Atrás.setText("Atrás");
        Atrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrásActionPerformed(evt);
            }
        });

        Jcampeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcampeonActionPerformed(evt);
            }
        });

        JGoleador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JGoleadorActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar cambios");
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
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Atrás)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Jcampeon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JGoleador, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nuevoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Atrás))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jcampeon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JGoleador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       quiniela.Equipos equipo = new quiniela.Equipos();
       equipo.setNombreEquipo(nuevoEquipo.getText());
       array.add(equipo);
        JOptionPane.showMessageDialog(null, "Los datos han sido guardados correctamente");
        nuevoEquipo.setText("");
        addCombobox(equipo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrásActionPerformed
        Menu_Admin a = new Menu_Admin(array.getArrayCampeon(), array.getArrayCuriosidad(),
            array.getArrayEquipos(),array.getArrayGoleador(),array.getArrayMarcadores(),
            array.getArray(), array.getArrayUsuario());
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AtrásActionPerformed

    private void JcampeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcampeonActionPerformed

    }//GEN-LAST:event_JcampeonActionPerformed

    private void JGoleadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JGoleadorActionPerformed
         
    }//GEN-LAST:event_JGoleadorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (array.getCampeon(0) != null) {
            array.getCampeon(0).setEquipo(Jcampeon.getSelectedItem().toString());
        }else{
            quiniela.Campeon campeon= new quiniela.Campeon();
             campeon.setUsuario(1);
             campeon.setEquipo(Jcampeon.getSelectedItem().toString());
             array.add(campeon);
        }
        
        if (array.getGoleador(0) != null) {
           array.getGoleador(0).setJugador(Jcampeon.getSelectedItem().toString());
       }else{
            quiniela.Goleador goleador= new quiniela.Goleador();
            goleador.setUsuario(1);
            goleador.setJugador(JGoleador.getSelectedItem().toString());
            array.add(goleador);
       }
            
            puntosGoleador();
             puntosCampeon();
             suma();
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
            java.util.logging.Logger.getLogger(AgregarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atrás;
    private javax.swing.JComboBox<String> JGoleador;
    private javax.swing.JComboBox<String> Jcampeon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nuevoEquipo;
    // End of variables declaration//GEN-END:variables
}
