package Vistas;

import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;
import trabajo_practico_6.Producto;


public class ListadoPorNombre extends javax.swing.JInternalFrame {

    //Atributos, Colecciones y Tablas
    DefaultTableModel tabla = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
        
    }; //Instancio la tabla 
    
    TreeSet <Producto> productos = new TreeSet<>(); 
    
    //Constructor
    public ListadoPorNombre(TreeSet <Producto> productos) {
        initComponents();
        this.productos = productos;                                         //Con esto conecto los TreeSet con las clases
        instanciarCabecera(); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado por Nombre");

        jLabel2.setText("Ingrese Descripción: ");

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreKeyReleased(evt);
            }
        });

        jtable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Métodos Adicionales
    
    //Listo
    public void instanciarCabecera(){
        
        tabla.addColumn("Código");
        tabla.addColumn("Descripción");
        tabla.addColumn("Precio");
        tabla.addColumn("Categoria");
        tabla.addColumn("Stock");
        
        jtable1.setModel(tabla);
    }
    
    
    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased

        //tabla.setRowCount(0);
        
        String textoIngresado = jtfNombre.getText().trim(); // el ".trim" elimina los espacios que puede haber al principio y al final del texto. (NO AFECTA LOS ESPACIOS ENTRE PALABRAS). ("  Juan   "  = "juan"), ("   hola mundo   " =  "hola mundo")
        
        
        tabla.setRowCount(0);

        for (Producto producto : productos) {
            // Verifica si el código del producto coincide con lo ingresado
            if ( producto.getDescripcion().toLowerCase().contains(textoIngresado.toLowerCase())) { //El lowercase convierte todas las letras en minúsculas. y el contains se usa para verificar si una cadena de texto contiene una secuencia específica de caracteres  o un elemento en particular
                // Agregar el producto a la tabla
                tabla.addRow(new Object[]{
                    producto.getCodigo(),
                    producto.getDescripcion(),
                    producto.getPrecio(),
                    producto.getCategoria(),
                    producto.getStock()
                });
            }
        }

        
//Tengo que ver cómo uso el KeyReleased (este método con el que me encuentro), luego programar lo mismo pero para listadoporprecio, y por último ver el botón guardar (keyReleased)
        
    }//GEN-LAST:event_jtfNombreKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable1;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
