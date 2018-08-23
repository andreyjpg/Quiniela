/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;
import quiniela.Usuario;
import quiniela.Arrays;
/**
 *
 * @author nechoo
 */
public class MenuUsuarios extends javax.swing.JFrame {
    quiniela.Arrays array = new quiniela.Arrays();
    int usuarioActivo = 0;


    /**
     * Creates new form MenuUsuarios
     */
    public MenuUsuarios(quiniela.Campeon[] camp,quiniela.Curiosidad[] curi,
            quiniela.Equipos[] equi, quiniela.Goleador[] gole,quiniela.Marcadores[]marc,
            quiniela.Partido[] part, quiniela.Usuario[] usua, int activo ) {
      initComponents();
      array.setArray(camp);
      array.setArray(curi);
      array.setArray(equi);
      array.setArray(gole);
      array.setArray(marc);
      array.setArray(part);
      array.setArray(usua);
      usuarioActivo = activo; 
        this.setLocationRelativeTo(null);
    }
    public MenuUsuarios (){
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ranking = new javax.swing.JButton();
        goleador = new javax.swing.JButton();
        agregarMarcador = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultados.setText("Ver Resultados");
        resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Menu Principal");

        ranking.setText("Ver Ranking");
        ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingActionPerformed(evt);
            }
        });

        goleador.setText("Escoger Goleador");
        goleador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goleadorActionPerformed(evt);
            }
        });

        agregarMarcador.setText("Agregar Marcador");
        agregarMarcador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMarcadorActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        sesion.setText("Cerrar sesión");
        sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarMarcador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(goleador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sesion)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sesion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goleador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(salir)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadosActionPerformed

    private void goleadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goleadorActionPerformed
        // TODO add your handling code here:
        AgregarGoleador goleo = new AgregarGoleador(array.getArrayCampeon(), array.getArrayCuriosidad(),
            array.getArrayEquipos(),array.getArrayGoleador(),array.getArrayMarcadores(),
            array.getArray(), array.getArrayUsuario(),usuarioActivo);
        goleo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_goleadorActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void rankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingActionPerformed
        Usuario u=new Usuario();
        //u.ordenarRanking();
        //u.mostrarRanking();
    }//GEN-LAST:event_rankingActionPerformed

    private void sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionActionPerformed
       MainPanel sesion = new MainPanel(array.getArrayCampeon(), array.getArrayCuriosidad(),
            array.getArrayEquipos(),array.getArrayGoleador(),array.getArrayMarcadores(),
            array.getArray(), array.getArrayUsuario());
        sesion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sesionActionPerformed

    private void agregarMarcadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMarcadorActionPerformed
    MarcadorUsuario sesion = new MarcadorUsuario(array.getArrayCampeon(), array.getArrayCuriosidad(),
            array.getArrayEquipos(),array.getArrayGoleador(),array.getArrayMarcadores(),
            array.getArray(), array.getArrayUsuario(), usuarioActivo);
        sesion.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_agregarMarcadorActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarMarcador;
    private javax.swing.JButton goleador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ranking;
    private javax.swing.JButton resultados;
    private javax.swing.JButton salir;
    private javax.swing.JButton sesion;
    // End of variables declaration//GEN-END:variables
}
