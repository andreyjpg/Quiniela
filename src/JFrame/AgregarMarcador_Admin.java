
package JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

    public class AgregarMarcador_Admin extends javax.swing.JFrame {
        quiniela.Arrays array = new quiniela.Arrays();
        DefaultTableModel model;
        
  
    
    public AgregarMarcador_Admin( quiniela.Campeon[] camp,quiniela.Curiosidad[] curi,
            quiniela.Equipos[] equi, quiniela.Goleador[] gole,quiniela.Marcadores[]marc,
            quiniela.Partido[] part, quiniela.Usuario[] usua ) {
      initComponents();
      array.setArray(camp);
      array.setArray(curi);
      array.setArray(equi);
      array.setArray(gole);
      array.setArray(marc);
      array.setArray(part);
      array.setArray(usua);
        //CONSTRUCTOR PARA OBTENER DATOS DE JFRAME ANTERIORES
        int row = countRows();
        Object data[][]= new Object[row][7];
        addRows(data); //agregar datos a la tabla
        setModel(data);//modelo de la tabla
        
    }   

    
    public AgregarMarcador_Admin() {
        
    }
  
    private int countRows(){
        int countData = 0;
        for(int count=0; count<array.getArray().length; count++){   
            if (array.get(count) != null){
                countData++;
            } else {
                break;
            }
        }
        return countData;
    }
    private void setModel(Object[][] data){
        
        tablaPartidos.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "Iniciado", "Finalizado", "Fecha / hora", "Equipo Local", "Marcador Local", "Marcador Visitante", "Equipo Visitante"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        
    }
            
    private void addRows(Object[][] data){
        int column = 0;
        try{
            for(int count=0; count<array.getArray().length; count++){              
                data[column][0] = array.get(count).isIniciado();
                data[column][1] = array.get(count).isFinalizado();
                data[column][2] = array.get(count).getFecha()+
                                        "/"+ array.get(count).getHora();
                data[column][3] = array.get(count).getEquipoLocal();
                data[column][4] = String.valueOf(array.get(count).getMarcadorLocal());
                data[column][5] = String.valueOf(array.get(count).getMarcadorVisitante());
                data[column][6] = array.get(count).getEquipoVisitante();
                column++;
            }
        }catch (NullPointerException err){
            
        } catch( ArrayIndexOutOfBoundsException err2){
            
        }        
    }
    public void puntos(){
        try{
            for(int partido = 0; partido < array.getArray().length; partido++){
                if (array.get(partido).isFinalizado()){
                    for(int marcador = 0; marcador < array.getArrayMarcadores().length; marcador++){
                        if(array.getMarcadores(marcador) != null){
                        if(array.get(partido).getIdPartido() == array.getMarcadores(marcador).getIdPartido()){
                            if(array.get(partido).getMarcadorLocal() == array.getMarcadores(marcador).getMarcadorLocal()
                                &&  array.get(partido).getMarcadorVisitante() == array.getMarcadores(marcador).getMarcadorVisitante()){
                                    array.getMarcadores(marcador).setPuntosObtenidos(3);
                            } else if (array.get(partido).getMarcadorLocal() > array.get(partido).getMarcadorVisitante()
                                && array.getMarcadores(marcador).getMarcadorLocal() > array.getMarcadores(marcador).getMarcadorVisitante()
                                ||array.get(partido).getMarcadorLocal() < array.get(partido).getMarcadorVisitante()
                                && array.getMarcadores(marcador).getMarcadorLocal() < array.getMarcadores(marcador).getMarcadorVisitante()
                                ||array.get(partido).getMarcadorLocal() == array.get(partido).getMarcadorVisitante()
                                && array.getMarcadores(marcador).getMarcadorLocal() == array.getMarcadores(marcador).getMarcadorVisitante()){
                                    array.getMarcadores(marcador).setPuntosObtenidos(1);
                            }        
                        } 
                        suma();
                        JOptionPane.showMessageDialog(null, "Datos Guardados");
                        }else{
                            break;
                        }
                    }
                }
            }
            
        }catch(NullPointerException err){
                
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
       
        public void editarPartidos(quiniela.Partido datos){
            try{
                for( int count = 0; count< array.getArrayMarcadores().length; count++){
                    if(array.getMarcadores(count) != null){
                        if(datos.getIdPartido()== array.getMarcadores(count).getIdPartido())
                            array.getMarcadores(count).setEquipoLocal(datos.getEquipoLocal());
                            array.getMarcadores(count).setEquipoVisitante(datos.getEquipoVisitante());
                            array.getMarcadores(count).setFecha(datos.getFecha());
                            array.getMarcadores(count).setHora(datos.getHora());
                    }
                }
            } catch(NullPointerException err){

            }
        }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPartidos = new javax.swing.JTable();
        guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Partidos registrados");

        tablaPartidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaPartidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iniciado", "Fecha / hora", "Equipo Local", "Marcador Local", "Marcador Visitante", "Equipo Visitante"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaPartidos);
        if (tablaPartidos.getColumnModel().getColumnCount() > 0) {
            tablaPartidos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        guardar.setText("Guardar resultados");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(guardar)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        int count;
        boolean dateIndex = false;
        String date = "", hour = "";
        
        try {
            for( count= 0; count < tablaPartidos.getRowCount(); count++){
            
                String fecha = String.valueOf(tablaPartidos.getModel().getValueAt(count, 2));
                for ( int i = 0; i < fecha.length(); i++){

                    if( fecha.charAt(i) == '/'){
                        dateIndex= true;
                   }else if ( dateIndex && fecha.charAt(i) != ' '){
                       hour += fecha.charAt(i);
                   } else if (fecha.charAt(i) != ' ') {
                       date += fecha.charAt(i);
                   }
                }
                boolean iniciado = Boolean.parseBoolean(String.valueOf(tablaPartidos.getModel().getValueAt(count, 0)));
                boolean finalizado = Boolean.parseBoolean(String.valueOf(tablaPartidos.getModel().getValueAt(count, 1)));
                String teamL = String.valueOf(tablaPartidos.getModel().getValueAt(count, 3));
                int L = Integer.parseInt(String.valueOf(tablaPartidos.getModel().getValueAt(count, 4)));
                int V = Integer.parseInt(String.valueOf(tablaPartidos.getModel().getValueAt(count, 5)));
                String TeamV = String.valueOf(tablaPartidos.getModel().getValueAt(count, 6));
                
                array.get(count).setIniciado(iniciado);
                array.get(count).setFinalizado(finalizado);
                array.get(count).setFecha(date);
                array.get(count).setHora(hour);
                array.get(count).setEquipoLocal(teamL);
                array.get(count).setMarcadorLocal(L);
                array.get(count).setMarcadorVisitante(V);
                array.get(count).setEquipoVisitante(TeamV);
                
                quiniela.Partido partido = new quiniela.Partido();
                partido.setIdPartido(array.get(count).getIdPartido());
                partido.setIniciado(iniciado);
                partido.setFinalizado(finalizado);
                partido.setFecha(date);
                partido.setHora(hour);
                partido.setEquipoLocal(teamL);
                partido.setMarcadorLocal(L);
                partido.setMarcadorVisitante(V);
                partido.setEquipoVisitante(TeamV);
                editarPartidos(partido);
            }
           puntos();
        } 
        catch (ArrayIndexOutOfBoundsException err){
            
        }
        
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_Admin a = new Menu_Admin(array.getArrayCampeon(), array.getArrayCuriosidad(),
      array.getArrayEquipos(),array.getArrayGoleador(),array.getArrayMarcadores(),
      array.getArray(), array.getArrayUsuario());
        a.setVisible(true);
        this.setVisible(false);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPartidos;
    // End of variables declaration//GEN-END:variables
}
