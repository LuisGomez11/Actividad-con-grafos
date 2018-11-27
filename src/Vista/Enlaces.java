
package Vista;

import Tablas.EstiloTablaHeader;
import Tablas.EstiloTablaRenderer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class Enlaces extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
 
    public Enlaces(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        listarEnlaces();

        this.jTable1.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable1.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo.addColumn("De");
        modelo.addColumn("Hasta");
        modelo.addColumn("Distancia");
        modelo.addColumn("Vel. Maxima");
        modelo.addColumn("Estado");
        modelo.addColumn("Tiempo de pare");
        jTable1 = new JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {

                return false; //Las celdas no son editables.

            }
        };
        btnRegresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        btnRegresar.setText("REGRESAR");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jButton1.setText("CAMBIAR ESTADO");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(btnRegresar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fs = jTable1.getSelectedRow();
        
        if (fs>=0){
            
            String estado = VistaPrincipal.getEnlaces().get(fs).getEstado();
            
            if(estado.equals("DISPONIBLE")){
                VistaPrincipal.getEnlaces().get(fs).setEstado("NO DISPONIBLE");
            } else {
                VistaPrincipal.getEnlaces().get(fs).setEstado("DISPONIBLE");
            }
            listarEnlaces();
            
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione ruta por favor", "Error", 0);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public final void listarEnlaces (){
        
        modelo.setNumRows(0);
        
        String datos [] = new String[6];
        
        VistaPrincipal.getEnlaces().stream().map((enlace) -> {
            datos[0] = enlace.getUnicacion1()+"";
            return enlace;
        }).map((enlace) -> {
            datos[1] = enlace.getUbicacion2()+"";
            return enlace;
        }).map((enlace) -> {
            datos[2] = enlace.getDistancia()+"";
            return enlace;
        }).map((enlace) -> {
            datos[3] = enlace.getVelocidadMax()+"";
            return enlace;            
        }).map((enlace) -> {
            datos[4] = enlace.getEstado()+"";
            return enlace;            
        }).map((enlace) -> {
            datos[5] = enlace.getTiempoPare()+"";
            return enlace;            
        }).forEachOrdered((_item) -> {
            modelo.addRow(datos);
        });
        
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
