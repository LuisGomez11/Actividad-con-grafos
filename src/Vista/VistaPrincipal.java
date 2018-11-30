
package Vista;

import Controladores.ControlMatriz;
import Modelos.Enlace;
import Modelos.Nodos;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
    public  String ingresarNombre(String pregunta){        
        String nombre;
        boolean c = false;
        try{
            nombre = JOptionPane.showInputDialog(""+pregunta);
            if(nombre.isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe ingresar un nombre","Error",2);
                nombre = ingresarNombre(pregunta);
            }else {
                for (Nodos nodo : nodos) {
                    if(nombre.toUpperCase().equals(nodo.getNombre().toUpperCase())){
                        c = true;
                    }
                }
                if(c==true){
                    JOptionPane.showMessageDialog(null,"Ubicacion ya creada, ingrese una diferente","Error",2);
                    nombre = ingresarNombre(pregunta);
                }
            }
        }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Debe ingresar un nombre aceptado..");
            nombre = ingresarNombre(pregunta);
        }
        return nombre;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    ControlMatriz cm = new ControlMatriz();
    
    public VistaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        
        for (int i = 0; i < tope; i++) {
            for (int j = 0; j < tope; j++) {        
                cm.setmCoeficiente(i, j, "0");
            }
        }

        cbUbi1.addItem("Seleccione...");
        cbUbi2.addItem("Seleccione...");
        
    }
    
    public static int tope = 0;

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
        cbUbi1 = new javax.swing.JComboBox<>();
        cbUbi2 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        jButton5.setText("RECORRER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(17, 17, 17)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
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
                    .addComponent(cbUbi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
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
        
        if (cbUbi1.getSelectedIndex()==0||cbUbi2.getSelectedIndex()==0){
            
            JOptionPane.showMessageDialog(null, "Debe seleccionar dos ubicaciones", "Advertencia", 2);
            
        } else
        
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
            
            if(cm.getmCoeficiente(p1, p2)!=null){
                
                JOptionPane.showMessageDialog(null, "Enlace ya creado","Error!",2);
                
            } else {
        
                if(pun1==true && pun2==true){

                    double distancia = ingresarDistancia("Digite la distancia (metros)");
                    double velMax = ingresarVelocidadMax("Digite velocidad maxima (Km/h)");
                    String estado = ingresarEstado("Digite estado"+"\nDisponible o no disponible");
                    int tiempoPare = ingresarTiempoPare("Digite tiempo de pare (segundos)");

                    int o = JOptionPane.YES_NO_OPTION;
                    int res = JOptionPane.showConfirmDialog(null, "Enlace doble sentido?", "Opcion", o);

                    if(res==0){
                        enlaces.add(new Enlace(distancia, velMax, estado, tiempoPare, ubi1, ubi2));
                        enlaces.add(new Enlace(distancia, velMax, estado, tiempoPare, ubi2, ubi1));
                        cm.setmCoeficiente(p1, p2,distancia+"");
                        cm.setmCoeficiente(p2, p1,distancia+"");
                    } else {
                        enlaces.add(new Enlace(distancia, velMax, estado, tiempoPare, ubi1, ubi2));
                        cm.setmCoeficiente(p1, p2,distancia+"");
                    }

                    cbUbi1.setSelectedIndex(0);
                    cbUbi2.setSelectedIndex(0);

                    salida = "";
                    for (int i = 0; i < tope; i++) {
                        for (int j = 0; j < tope; j++) {
                            if (j==i){
                                salida += "0"+"\t";  
                            }
                            else if(cm.getmCoeficiente(i, j)==null){
                                salida += "XX"+"\t";
                            } else {
                                salida+=cm.getmCoeficiente(i, j)+"\t";
                            }
                        }
                        salida+="\n"+"\n";
                    } 

                } else {

                    JOptionPane.showMessageDialog(null, "Error al enlazar", "Error", 0);

                }
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
        
        String nombre = ingresarNombre("Digite el nombre");
        int prioridad = ingresarPrioridad("Digite la prioridad");
        
        boton.setBounds(evt.getX()-40, evt.getY()-20, 80, 40);
        
        boton.setText(nombre);
        boton.setName(nombre);
        boton.setBackground(Color.WHITE);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent me) {

            }

            @Override
            public void mousePressed(MouseEvent me) {
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                
            }

            @Override
            public void mouseExited(MouseEvent me) {
                
            }
        });
        
        jPanel2.add(boton);
        jPanel2.updateUI();
        
        nodos.add(new Nodos(nombre, evt.getX(), evt.getY()+5, prioridad));
        
        tope++;
        
        salida = "";
        for (int i = 0; i < tope; i++) {
            for (int j = 0; j < tope; j++) {
                if (j==i){
                    salida += "0"+"\t";  
                }
                else if(cm.getmCoeficiente(i, j)==null){
                    salida += "XX"+"\t";
                } else {
                    salida+=cm.getmCoeficiente(i, j)+"\t";
                }
            }
            salida+="\n"+"\n";
        }
        
        Matriz.ubiX = "";
        Matriz.ubiY = "";
        
        for (int i = 0; i < tope; i++) {
            Matriz.ubiX += nodos.get(i).getNombre();
            Matriz.ubiX +="\n"+"\n";
        }
        for (int i = 0; i < tope; i++) {
            Matriz.ubiY += nodos.get(i).getNombre() +"\t";
        }
        
        cbUbi1.addItem(nombre);
        cbUbi2.addItem(nombre);

    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String inicio = JOptionPane.showInputDialog("Digite inicio");
        String ubiFinal = JOptionPane.showInputDialog("Digite final");
        recorrer(inicio, ubiFinal);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    static String salida = "";

    public void recorrer(String inicio, String ubiFinal){
        
        String actualUbi = inicio;
        String siguienteUbi = "";
        String recorrido = actualUbi;
        boolean estado=false;
        double distancia = 0.0;
        
        for (int i = 0; i < enlaces.size(); i++) {
            
            if(enlaces.get(i).getUnicacion1().equals(actualUbi)){
                actualUbi = enlaces.get(i).getUnicacion1();
                siguienteUbi = enlaces.get(i).getUbicacion2();
                recorrido += " "+siguienteUbi;
                actualUbi = siguienteUbi;
                if(!actualUbi.equals(ubiFinal)){
                    recorrer(actualUbi, ubiFinal);
                }
            }
            
        }
        
        System.out.println(recorrido);
        
    }
    
    
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
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
