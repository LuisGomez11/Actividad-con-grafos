
package Vista;

import Controladores.ControlMatriz;
import Modelos.Enlace;
import Modelos.Nodos;
import Modelos.Pintar;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class VistaPrincipal extends javax.swing.JFrame {

    public static ArrayList<Nodos> nodos = new ArrayList<>();
    public static ArrayList<Enlace> enlaces = new ArrayList<>();

    public static ArrayList<Nodos> getNodos() {
        return nodos;
    }

    public static void setNodos(ArrayList<Nodos> nodos) {
        VistaPrincipal.nodos = nodos;
    }

    public static ArrayList<Enlace> getEnlaces() {
        return enlaces;
    }

    public static void setEnlaces(ArrayList<Enlace> enlaces) {
        VistaPrincipal.enlaces = enlaces;
    }
    
    public  int ingresarPrioridad(String pregunta){        
        int prioridad;
        try{
            prioridad = Integer.parseInt(JOptionPane.showInputDialog(""+pregunta));
            if(prioridad<1){ JOptionPane.showMessageDialog(null,"Debe ingresar una prioridad aceptada..");
               prioridad = ingresarPrioridad(pregunta);
            }
        }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Debe ingresar una prioridad aceptada..");
            prioridad = ingresarPrioridad(pregunta);
        }
        return prioridad;
    }
    public  double ingresarVelocidadMax(String pregunta){        
        double velocidad;
        try{
            velocidad = Double.parseDouble(JOptionPane.showInputDialog(""+pregunta));
            if(velocidad<1){ JOptionPane.showMessageDialog(null,"Debe ingresar una velocidad aceptada..");
               velocidad = ingresarVelocidadMax(pregunta);
            }
        }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Debe ingresar una velocidad aceptada..");
            velocidad = ingresarVelocidadMax(pregunta);
        }
        return velocidad;
    }
    public  int ingresarTiempoPare(String pregunta){        
        int tiempo;
        try{
            tiempo = Integer.parseInt(JOptionPane.showInputDialog(""+pregunta));
            if(tiempo<1){ JOptionPane.showMessageDialog(null,"Debe ingresar un tiempo de pare aceptado aceptado..");
               tiempo = ingresarPrioridad(pregunta);
            }
        }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Debe ingresar un tiempo de pare aceptado aceptado..");
            tiempo = ingresarPrioridad(pregunta);
        }
        return tiempo;
    }
    public  double ingresarDistancia(String pregunta){        
        double distancia;
        try{
            distancia = Double.parseDouble(JOptionPane.showInputDialog(""+pregunta));
            if(distancia<1){ JOptionPane.showMessageDialog(null,"Debe ingresar una distancia aceptada..");
               distancia = ingresarDistancia(pregunta);
            }
        }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Debe ingresar una distancia aceptada..");
            distancia = ingresarDistancia(pregunta);
        }
        return distancia;
    }
    public  String ingresarEstado(String pregunta){        
        String estado;
        try{
            estado = JOptionPane.showInputDialog(""+pregunta);
            if(estado.toUpperCase().equals("Disponible".toUpperCase())||estado.toUpperCase().equals("No disponible".toUpperCase())){ 
               
            } else {
                JOptionPane.showMessageDialog(null,"Debe ingresar un estado aceptado..");
                estado = ingresarEstado(pregunta);
            }
        }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Debe ingresar una estado aceptado..");
            estado = ingresarEstado(pregunta);
        }
        return estado;
    }
    
    ControlMatriz cm = new ControlMatriz();
    
    public VistaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        
//        for (int i = 0; i < tope; i++) {
//            for (int j = 0; j < tope; j++) {
//                if(j==i){
//                    cm.setmCoeficiente(i, j, "0");
//                } else {
//                    cm.setmCoeficiente(i, j, "1");
//                }
//            }
//        }

        cbUbi1.addItem("Seleccione...");
        cbUbi2.addItem("Seleccione...");
        

    }
    
    static int tope = 0;
        
    String matriz [][] = new String[tope][tope];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        cbUbi1 = new javax.swing.JComboBox<>();
        cbUbi2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setText("UBICACION 1:");

        jLabel2.setText("UBICACION 2:");

        jButton1.setText("ENLAZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ENLACES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("UBICACIONES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("MATRIZ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestor de rutas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(1);
        jTextArea1.setRows(1);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(1);
        jTextArea2.setRows(1);
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(1);
        jTextArea3.setRows(1);
        jTextArea3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(1);
        jTextArea4.setRows(1);
        jTextArea4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(1);
        jTextArea5.setRows(1);
        jTextArea5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUbi1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUbi2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(cbUbi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUbi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Enlaces(this, true).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int p1=0, p2=0;
        
        boolean pun1=false, pun2=false;
        
        String ubi1 = cbUbi1.getSelectedItem().toString();
        String ubi2 = cbUbi2.getSelectedItem().toString();
        
        if(ubi1.equals(ubi2)){
            
            JOptionPane.showMessageDialog(null, "No puede enlazar la misma ubicacion", "Error", 0);
            
        } else {
        
            for (int i = 0; i < nodos.size(); i++) {

                if (nodos.get(i).getNombre().equals(ubi1)){

                    p1 = i;

                    pun1=true;

                }

                if (nodos.get(i).getNombre().equals(ubi2)){

                    p2 = i;

                    pun2=true;

                }

            }
        
            if(pun1==true && pun2==true){

                double distancia = ingresarDistancia("Digite la distancia");
                double velMax = ingresarVelocidadMax("Digite velocidad maxima");
                String estado = ingresarEstado("Digite estado"+"\nDisponible o no disponible");
                int tiempoPare = ingresarTiempoPare("Digite tiempo de pare");

                enlaces.add(new Enlace(distancia, velMax, estado, tiempoPare, ubi1, ubi2));

                Pintar.pintarLinea(jPanel1.getGraphics(), nodos.get(p1).getX(), nodos.get(p1).getY(), nodos.get(p2).getX(), nodos.get(p2).getY(), distancia);

                cm.setmCoeficiente(p1, p2, distancia+"");

                cbUbi1.setSelectedIndex(0);
                cbUbi2.setSelectedIndex(0);

            } else {

                JOptionPane.showMessageDialog(null, "Error al enlazar", "Error", 0);

            }
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Ubicaciones(this, true).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Matriz(this, true).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        JButton boton = new JButton();
        
        String nombre = JOptionPane.showInputDialog("Digite el nombre");
        int prioridad = ingresarPrioridad("Digite la prioridad");
        
        boton.setBounds(evt.getX()-35, evt.getY()-20, 70, 40);
        
        boton.setText(nombre);
        boton.setName(nombre);
        boton.setBackground(Color.WHITE);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jPanel2.add(boton);
        
        nodos.add(new Nodos(nombre, evt.getX(), evt.getY()+5, prioridad));
        
        
        
        cbUbi1.addItem(nombre);
        cbUbi2.addItem(nombre);

    }//GEN-LAST:event_jPanel2MouseClicked
    
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbUbi1;
    private javax.swing.JComboBox<String> cbUbi2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}