
package JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    public class AgregarMarcador_Admin extends javax.swing.JFrame {
        quiniela.Arrays array = new quiniela.Arrays();
        DefaultTableModel model;
    
    public AgregarMarcador_Admin( quiniela.Partido[] data ) {
        //CONSTRUCTOR PARA OBTENER DATOS DE JFRAME ANTERIORES
        initComponents(); // Inicio de variables
        array.setArray(data);//asignar datos de los array
        setModel();//modelo de la tabla
        dataTable(); //agregar datos a la tabla
    }    
    
    public AgregarMarcador_Admin() {
        
    }
    
    private void setModel(){
        
        String cabecera[] = {"Fecha / Hora", "Equipo Local", "Marcador L", 
            "Marcador V", "Equipo Visitante"};
        String datos[][] = {};
        model = new DefaultTableModel(datos, cabecera);
        tablaPartidos.setModel(model);
        
        tablaPartidos.setEditingColumn(2);
        tablaPartidos.setEditingColumn(3);
        
    }
            
    private void dataTable(){
        String showTable[] = new String[5];
        quiniela.Partido partido = new quiniela.Partido();

        int count = 0;
        
        while ( array.get(count) != null ){
            partido = array.get(count);
            showTable[0] = partido.getFecha()+ " / "+ partido.getHora();
            showTable[1] = partido.getEquipoLocal();
            showTable[2] = String.valueOf(partido.getMarcadorLocal());
            showTable[3] = String.valueOf(partido.getMarcadorVisitante());
            showTable[4] = partido.getEquipoVisitante();
            count++;
            model.addRow(showTable);
        }
        
    }
    
    private void tableModel(){
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPartidos = new javax.swing.JTable();
        guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Partidos registrados");

        tablaPartidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaPartidos);

        guardar.setText("Guardar resultados");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(guardar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        int count = 0;
        
        try {
            
            Object L = tablaPartidos.getModel().getValueAt(count, 2);
            Object V = tablaPartidos.getModel().getValueAt(count, 3);
            array.get(count).setMarcadorLocal(Integer.parseInt(String.valueOf(L)));
            array.get(count).setMarcadorVisitante(Integer.parseInt(String.valueOf(V)));

            //array.get(count).setMarcadorLocal();
            count++;
        } 
        catch (ArrayIndexOutOfBoundsException err){
            
        }
        JOptionPane.showMessageDialog(null, "Datos Guardados");
        System.out.println(array.get(0).getMarcadorLocal());
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarMarcador_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMarcador_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMarcador_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMarcador_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMarcador_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPartidos;
    // End of variables declaration//GEN-END:variables
}
