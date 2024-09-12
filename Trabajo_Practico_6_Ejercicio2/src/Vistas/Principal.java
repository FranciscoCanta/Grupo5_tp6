package Vistas;

import java.util.TreeSet;
import trabajo_practico_6.Producto;


public class Principal extends javax.swing.JFrame {

    //Atributos y Colecciones
    private  TreeSet <Producto> productos = new TreeSet<>();             //Con esto conecto los TreeSet con las clases
    //podría ser static para no pasar por parámetros
    //Por ejemplo: private static TreeSet <Producto> productos = new TreeSet<>();
    //Se transforma en variable global. Reemplaza el parámetro. Llamaríamos por la clase y no por instancia de clase.
     
    //Constructor 
    public Principal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiGestionProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiConsultaNombre = new javax.swing.JMenuItem();
        jmiConsultaPrecio = new javax.swing.JMenuItem();
        jmiConsultaRubro = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        jmiGestionProductos.setText("Gestión de Productos");
        jmiGestionProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiGestionProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jmiConsultaNombre.setText("Consulta por Nombre");
        jmiConsultaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jmiConsultaNombre);

        jmiConsultaPrecio.setText("Consulta por Precio");
        jmiConsultaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jmiConsultaPrecio);

        jmiConsultaRubro.setText("Consulta por Rubro");
        jmiConsultaRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jmiConsultaRubro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Métodos adicionales 
    private void jmiConsultaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaNombreActionPerformed

        Escritorio.removeAll();
        Escritorio.repaint();
        ListadoPorNombre a1 = new ListadoPorNombre(productos);    //Por acá es por donde paso el TreeSet para comunicarlo con las demás JInternalFrame
        a1.setVisible(true);
        Escritorio.add(a1);

    }//GEN-LAST:event_jmiConsultaNombreActionPerformed

    private void jmiConsultaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaRubroActionPerformed
      
        Escritorio.removeAll();
        Escritorio.repaint();
        ListadoPorRubro a1 = new ListadoPorRubro(productos);       //Por acá es por donde paso el TreeSet para comunicarlo con las demás JInternalFrame
        a1.setVisible(true);
        Escritorio.add(a1);
    }//GEN-LAST:event_jmiConsultaRubroActionPerformed

    private void jmiConsultaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaPrecioActionPerformed

        Escritorio.removeAll();
        Escritorio.repaint();
        ListadoPorPrecio a1 = new ListadoPorPrecio(productos);      //Por acá es por donde paso el TreeSet para comunicarlo con las demás JInternalFrame
        a1.setVisible(true);
        Escritorio.add(a1);
        
    }//GEN-LAST:event_jmiConsultaPrecioActionPerformed

    private void jmiGestionProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestionProductosActionPerformed
        
        Escritorio.removeAll();
        Escritorio.repaint();
        Productos a1 = new Productos(productos);                            //Por acá es por donde paso el TreeSet para comunicarlo con las demás JInternalFrame
        a1.setVisible(true);
        Escritorio.add(a1);
        
    }//GEN-LAST:event_jmiGestionProductosActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem jmiConsultaNombre;
    private javax.swing.JMenuItem jmiConsultaPrecio;
    private javax.swing.JMenuItem jmiConsultaRubro;
    private javax.swing.JMenuItem jmiGestionProductos;
    // End of variables declaration//GEN-END:variables

}
