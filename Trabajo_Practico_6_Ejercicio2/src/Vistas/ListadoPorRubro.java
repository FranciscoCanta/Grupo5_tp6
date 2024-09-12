package Vistas;

import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;
import trabajo_practico_6.Producto;


public class ListadoPorRubro extends javax.swing.JInternalFrame {

    //Atributos, Colecciones y Tablas
    DefaultTableModel tabla = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int column) {
            return super.isCellEditable(row, column); 
        }
    }; //Instancio la tabla 
   
    private TreeSet <Producto> productos = new TreeSet<>();
    
    //Constructor 
    public ListadoPorRubro(TreeSet <Producto> productos) {
        initComponents();
        this.productos = productos;                                                      //Con esto conecto los TreeSet con las clases
        llenarComboBox();
        instanciarCabecera();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado por Rubro");

        jLabel2.setText("Rubro: ");

        jcbRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRubroActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25)
                        .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Métodos adicionales
    public void llenarComboBox() {

        String productos[] = {"Comestible", "Limpieza", "Perfumeria"};

        for (Object producto : productos) {

            jcbRubro.addItem((String) producto);
        }
        
        jcbRubro.setSelectedIndex(-1);
    }; 
    
    public void instanciarCabecera() {

            tabla.addColumn("Código");
            tabla.addColumn("Descripción");
            tabla.addColumn("Precio");
            tabla.addColumn("Categoria");
            tabla.addColumn("Stock");

            jTable1.setModel(tabla);
    }; 
    
    private void jcbRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRubroActionPerformed
        
        tabla.setRowCount(0);
        
       for (Producto producto : productos) {
         
            if (jcbRubro.getSelectedItem() == producto.getRubro()) {      
                
                    tabla.addRow(new Object[]{          //Instancio una fila y como hay que pasarle un objeto a la fila lo creo y le paso los atributos del producto indicado gracias al if de arriba.
                        producto.getCodigo(),                                         
                        producto.getDescripcion(),
                        producto.getPrecio(),
                        producto.getCategoria(),
                        producto.getStock()
                    });
            }
        }
        
    }//GEN-LAST:event_jcbRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbRubro;
    // End of variables declaration//GEN-END:variables
}
