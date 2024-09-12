package Vistas;

import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabajo_practico_6.Producto;


public class Productos extends javax.swing.JInternalFrame {

    //Atributos, Colecciones y Tablas
    DefaultTableModel tabla = new DefaultTableModel(){
       
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
    }; //Instancio la tabla

    private TreeSet <Producto> productos = new TreeSet<>(); 
    
    //Constructor
    public Productos(TreeSet <Producto> productos) {
        initComponents();
        this.productos = productos;                                             //Con esto conecto los TreeSet con las clases
        llenarComboBoxs(); 
        instanciarCabecera(); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jsStock = new javax.swing.JSpinner();
        jcbRubro = new javax.swing.JComboBox<>();
        jtfPrecio = new javax.swing.JTextField();
        jtfDescripcion = new javax.swing.JTextField();
        jtfCodigo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Gestión de productos");

        jLabel5.setText("Código: ");

        jLabel6.setText("Descripción: ");

        jLabel7.setText("Precio: ");

        jLabel8.setText("Rubro: ");

        jLabel9.setText("Stock:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPrecio)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jsStock)
                                    .addComponent(jcbRubro, 0, 144, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar)
                    .addComponent(btnBuscar))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(42, 42, 42))
        );

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

        jLabel2.setText("Filtrar por Categoria: ");

        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Métodos Adicionales 
    public void llenarComboBoxs(){
        
        String categoria [] = {"Comestible", "Limpieza", "Perfumeria"};
        
        for (String producto : categoria) {
            jcbCategoria.addItem(producto);  // Lleno el combo box 
        }
        
        jcbCategoria.setSelectedIndex(-1);    //Esto es para que el combo box aparezca vacío
        
        //Ahora lleno el comboBox de Rubro:
        for (String producto : categoria) {
            jcbRubro.addItem(producto);
        }
        
        jcbRubro.setSelectedIndex(-1);    //Esto es para que el combo box de Rubro aparezca vacío
        
    }; //Listo
    
    public void instanciarCabecera(){
        
        tabla.addColumn("Código");
        tabla.addColumn("Descripción");
        tabla.addColumn("Precio");
        tabla.addColumn("Categoria");
        tabla.addColumn("Stock");

        jTable1.setModel(tabla);
    }  //Listo

    //Listo
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        jtfCodigo.setText("");
        jtfDescripcion.setText("");
        jtfPrecio.setText("");
        jcbRubro.setSelectedIndex(-1);
        jsStock.setValue(0);
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    //Listo
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        dispose(); 
    }//GEN-LAST:event_btnCerrarActionPerformed

    //Listo
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

     Long codigo = Long.parseLong(jtfCodigo.getText()); //Lo utilizo en el if ya que comparo 2 datos que son de tipo long 
     
     tabla.setRowCount(0);                  //Se utiliza para limpiar todas las filas de la tabla. 
     jcbCategoria.setSelectedIndex(-1);  //Cuando utilizo el botón buscar, el combo box de categoria se resetea. 
     
     for (Producto producto : productos) {
         
            if (codigo == producto.getCodigo()) {      //Hago la comparación si el codigo ingresado en el jtf es igual al código del producto que está recorriendo el for each. 
                
                    tabla.addRow(new Object[]{          //Instancio una fila y como hay que pasarle un objeto a la fila lo creo y le paso los atributos del producto indicado gracias al if de arriba.
                        producto.getCodigo(),                                         
                        producto.getDescripcion(),
                        producto.getPrecio(),
                        producto.getCategoria(),
                        producto.getStock()
                    });
            }
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    //Listo
    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed

       //Limpiamos la tabla
        tabla.setRowCount(0);
        
        //String categoria = (String) jcbCategoria.getSelectedItem(); Creo que no sirve
        
        for (Producto producto : productos) {

            if (jcbCategoria.getSelectedItem() == producto.getRubro()) {   //Hago la comparación entre la categoria elegida y los productos que tienen esa categoría. Si la tienen entran dentro del if  
                
                    tabla.addRow(new Object[]{          //Instancio una fila y como hay que pasarle un objeto lo creo y le paso los atributos del producto indicado gracias al if de arriba.
                        producto.getCodigo(),                                         
                        producto.getDescripcion(),
                        producto.getPrecio(),
                        producto.getCategoria(),
                        producto.getStock()
                    });
            }
        }
    }//GEN-LAST:event_jcbCategoriaActionPerformed

    //Listo (falta algo pequeño)
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        //Guardamos las variables 
        long codigo = Long.parseLong(jtfCodigo.getText());
        String descripcion = jtfDescripcion.getText();
        double precio = Double.parseDouble(jtfPrecio.getText());
        String rubro = (String) jcbRubro.getSelectedItem();
         int stock = (Integer) jsStock.getValue();  
        
         
        //Guardo los productos en el TreeSet
        productos.add(new Producto(codigo, descripcion, precio, stock, rubro)); 
        
        JOptionPane.showMessageDialog(null, "El producto se guardó correctamente!");
        
        //Esto de abajo es para hacer que el botón guardar se active si se completan todos estos campos
        //jtfCodigo.getText() != null && jtfDescripcion.getText() != null && jtfPrecio.getText() != null  && jcbRubro.getSelectedItem() != null
     
        
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    //Listo
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        Long codigo = Long.parseLong(jtfCodigo.getText()); //Lo utilizo en el if ya que comparo 2 datos que son de tipo long
        
        
        for (Producto producto : productos) {
         
            if (codigo == producto.getCodigo()) {      //Hago la comparación si el codigo ingresado en el jtf es igual al código del producto que está recorriendo el for each. 
                
                  productos.remove(producto); 
                  break;                                              //Esto me permite saltarme el for una vez que ya encontró el producto a eliminar
            }
        }
        
        jtfCodigo.setText("");                              //Esto me borra el código que habia escrito para borrar en el jtfCodigo 

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

       Long codigo = Long.parseLong(jtfCodigo.getText()); // Obtener el código del campo de texto

    // Buscar el producto por código
    for (Producto producto : productos) {
        if (codigo.equals(producto.getCodigo())) { // Comparar el código ingresado con el del producto
            // Actualizar los atributos del producto
            producto.setDescripcion(jtfDescripcion.getText());
            producto.setPrecio(Double.parseDouble(jtfPrecio.getText())); 
             producto.setCategoria((String) jcbCategoria.getSelectedItem());
            producto.setStock((int)jsStock.getValue());
            
            // Opción de mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "Producto actualizado exitosamente.");
            break; // Salir del bucle una vez que se actualizó el producto
        }
    }
    }//GEN-LAST:event_btnActualizarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbRubro;
    private javax.swing.JSpinner jsStock;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables
}
