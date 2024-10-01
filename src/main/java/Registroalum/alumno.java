package Registroalum;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author miguel
 */
public class alumno extends javax.swing.JFrame {

    // ArrayList para almacenar los registros de alumnos
    private ArrayList<Alumnos> listaAlumnos = new ArrayList<>();

    public alumno() {
        initComponents();
        this.setTitle("Registro de Alumnos");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        jNombre = new javax.swing.JLabel();
        jFecha = new javax.swing.JLabel();
        jCodigo = new javax.swing.JLabel();
        jTelefono = new javax.swing.JLabel();
        jCarrera = new javax.swing.JLabel();
        jSemestre = new javax.swing.JLabel();
        jTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jComboBoxCarrera = new javax.swing.JComboBox<>();
        jComboBoxSemestre = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        Calendario = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 102, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Codigo", "Fecha", "Telefono", "Carrera", "Semestre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistro);
        if (tblRegistro.getColumnModel().getColumnCount() > 0) {
            tblRegistro.getColumnModel().getColumn(0).setResizable(false);
            tblRegistro.getColumnModel().getColumn(1).setResizable(false);
            tblRegistro.getColumnModel().getColumn(2).setResizable(false);
            tblRegistro.getColumnModel().getColumn(3).setResizable(false);
            tblRegistro.getColumnModel().getColumn(4).setResizable(false);
            tblRegistro.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 850, 230));

        jNombre.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jNombre.setText("Nombre");
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jFecha.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jFecha.setText("Fecha");
        getContentPane().add(jFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jCodigo.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jCodigo.setText("Codigo ");
        getContentPane().add(jCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jTelefono.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jTelefono.setText("Telefono");
        getContentPane().add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jCarrera.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jCarrera.setText(" Carrera ");
        getContentPane().add(jCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jSemestre.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jSemestre.setText("Semestre");
        getContentPane().add(jSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jTitulo.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jTitulo.setText("REGISTRO DE ALUMNOS");
        getContentPane().add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 160, -1));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 160, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 160, -1));

        jComboBoxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería", "Ciencias de la Salud", "Derecho", "Educación", "Ciencias Económicas y Administrativas" }));
        getContentPane().add(jComboBoxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, -1));

        jComboBoxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1er Semestre", "2do Semestre", "3er Semestre", "4to Semestre", "5to Semestre", "6to Semestre", "7mo Semestre", "8vo Semestre", "9no Semestre", "10mo Semestre" }));
        getContentPane().add(jComboBoxSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 120, 30));

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 120, 30));

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 30));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 290, 30));
        getContentPane().add(Calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         // Obtener los valores de los campos de texto y combo box
    String nombre = txtNombre.getText();

    // Obtener la fecha desde JDateChooser
    Date fechaSeleccionada = Calendario.getDate();
    String fecha = "";  // Inicia la variable de fecha vacía
    if (fechaSeleccionada != null) {
        // Convertir la fecha a String utilizando SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  // Formato de fecha
        fecha = sdf.format(fechaSeleccionada);
    }

    String codigoEstudiante = txtCodigo.getText();
    String telefono = txtTelefono.getText();
    String carrera = jComboBoxCarrera.getSelectedItem().toString();
    String semestre = jComboBoxSemestre.getSelectedItem().toString();

    // Verificar si el registro ya existe (puedes usar el código de estudiante como identificador)
    int selectedRow = tblRegistro.getSelectedRow();
    if (selectedRow != -1) {
        // Actualizar los datos en el ArrayList
        Alumnos alumnoActualizado = listaAlumnos.get(selectedRow);
        alumnoActualizado.nombre = nombre;
        alumnoActualizado.fecha = fecha;
        alumnoActualizado.codigo = codigoEstudiante;
        alumnoActualizado.telefono = telefono;
        alumnoActualizado.carrera = carrera;
        alumnoActualizado.semestre = semestre;

        // Actualizar la tabla
        DefaultTableModel model = (DefaultTableModel) tblRegistro.getModel();
        model.setValueAt(nombre, selectedRow, 0);
        model.setValueAt(codigoEstudiante, selectedRow, 1);
        model.setValueAt(fecha, selectedRow, 2);
        model.setValueAt(telefono, selectedRow, 3);
        model.setValueAt(carrera, selectedRow, 4);
        model.setValueAt(semestre, selectedRow, 5);

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Registro actualizado con éxito");
    } else {
        // Crear un nuevo objeto Registro con los datos ingresados
        Alumnos nuevoRegistro = new Alumnos(nombre, fecha, codigoEstudiante, carrera, semestre, telefono);

        // Agregar el nuevo registro a la lista
        listaAlumnos.add(nuevoRegistro);

        // Agregar el nuevo registro a la tabla
        DefaultTableModel model = (DefaultTableModel) tblRegistro.getModel();
        model.addRow(new Object[]{nombre, codigoEstudiante, fecha, telefono, carrera, semestre});

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Registro agregado con éxito");
    }
       // Limpiar los campos después de actualizar
        txtNombre.setText("");
        Calendario.setDate(null);
        txtCodigo.setText("");
        txtTelefono.setText("");
        jComboBoxCarrera.setSelectedIndex(0);
        jComboBoxSemestre.setSelectedIndex(0);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
         // Obtener la fila seleccionada
    int selectedRow = tblRegistro.getSelectedRow();

    if (selectedRow != -1) {
        // Eliminar el registro de la lista
        listaAlumnos.remove(selectedRow);
        
        // Eliminar la fila seleccionada del modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tblRegistro.getModel();
        model.removeRow(selectedRow);

        // Mostrar mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Registro borrado con éxito");
    } else {
        // Si no hay fila seleccionada, mostrar mensaje de error
        JOptionPane.showMessageDialog(this, "Por favor selecciona un registro para borrar.");
    }
    
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       // Obtener la letra inicial del campo de texto
    String letraInicial = txtBuscar.getText().trim().toUpperCase(); // Asegúrate de tener un campo de texto para buscar

    // Limpiar la tabla antes de mostrar los resultados
    DefaultTableModel model = (DefaultTableModel) tblRegistro.getModel();
    model.setRowCount(0); // Limpiar la tabla

    // Si el campo de búsqueda está vacío, mostrar todos los registros
    if (letraInicial.isEmpty()) {
        for (Alumnos alumno : listaAlumnos) {
            model.addRow(new Object[]{
                alumno.nombre,
                alumno.codigo,
                alumno.fecha,
                alumno.telefono,
                alumno.carrera,
                alumno.semestre
            });
        }
    } else {
        // Filtrar y buscar en el ArrayList
        for (Alumnos alumno : listaAlumnos) {
            if (alumno.nombre.toUpperCase().startsWith(letraInicial)) {
                // Agregar el registro a la tabla
                model.addRow(new Object[]{
                    alumno.nombre,
                    alumno.codigo,
                    alumno.fecha,
                    alumno.telefono,
                    alumno.carrera,
                    alumno.semestre
                });
            }
        }

        // Mostrar mensaje si no se encontraron resultados
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No se encontraron registros que empiecen con la letra: " + letraInicial);
        }
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
      // Obtener la letra inicial del campo de texto
    String letraInicial = txtBuscar.getText().trim().toUpperCase(); // Asegúrate de tener un campo de texto para buscar

    // Limpiar la tabla antes de mostrar los resultados
    DefaultTableModel model = (DefaultTableModel) tblRegistro.getModel();
    model.setRowCount(0); // Limpiar la tabla

    // Si el campo de búsqueda está vacío, mostrar todos los registros
    if (letraInicial.isEmpty()) {
        for (Alumnos alumno : listaAlumnos) {
            model.addRow(new Object[]{
                alumno.nombre,
                alumno.codigo,
                alumno.fecha,
                alumno.telefono,
                alumno.carrera,
                alumno.semestre
            });
        }
    } else if (letraInicial.length() == 1) {
        // Filtrar y buscar en el ArrayList
        for (Alumnos alumno : listaAlumnos) {
            if (alumno.nombre.toUpperCase().startsWith(letraInicial)) {
                // Agregar el registro a la tabla
                model.addRow(new Object[]{
                    alumno.nombre,
                    alumno.codigo,
                    alumno.fecha,
                    alumno.telefono,
                    alumno.carrera,
                    alumno.semestre
                });
            }
        }

        // Mostrar mensaje si no se encontraron resultados
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No se encontraron registros que empiecen con la letra: " + letraInicial);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor ingresa una letra inicial válida.");
    }
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
 // Obtener la fila seleccionada
    int filaSeleccionada = tblRegistro.getSelectedRow();

    // Verificar si hay una fila seleccionada
    if (filaSeleccionada != -1) {
        // Obtener los valores actuales de la fila seleccionada
        String nombre = (String) tblRegistro.getValueAt(filaSeleccionada, 0);
        String codigo = (String) tblRegistro.getValueAt(filaSeleccionada, 1);
        String fecha = (String) tblRegistro.getValueAt(filaSeleccionada, 2);
        String telefono = (String) tblRegistro.getValueAt(filaSeleccionada, 3);
        String carrera = (String) tblRegistro.getValueAt(filaSeleccionada, 4);
        String semestre = (String) tblRegistro.getValueAt(filaSeleccionada, 5);

        // Crear una instancia de Alumnos con los datos actuales
        Alumnos alumno = new Alumnos(nombre, fecha, codigo, telefono, carrera, semestre);
        
        // Llenar los campos del formulario con los datos del alumno
        llenarCampos(alumno);
    } else {
        JOptionPane.showMessageDialog(this, "Por favor selecciona un registro para actualizar.");
    }

    }//GEN-LAST:event_btnActualizarActionPerformed
private void llenarCampos(Alumnos alumno) {
    txtNombre.setText(alumno.getNombre());
    txtCodigo.setText(alumno.getCodigo()); // Permitir modificación
    txtTelefono.setText(alumno.getTelefono());
    jComboBoxCarrera.setSelectedItem(alumno.getCarrera());
    jComboBoxSemestre.setSelectedItem(alumno.getSemestre());
    
    // No actualizamos el campo de fecha directamente, ya que requiere conversión
    // Si se desea, descomentar la siguiente línea para actualizar el JDateChooser:
    // Calendario.setDate(java.sql.Date.valueOf(alumno.getFecha()));
}
    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
    /* Set the HiFi look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If HiFi (part of JTattoo) is not available, stay with the default look and feel. */
    try {
        // Set HiFi Look and Feel from JTattoo
        javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new alumno().setVisible(true);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Calendario;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jCarrera;
    private javax.swing.JLabel jCodigo;
    private javax.swing.JComboBox<String> jComboBoxCarrera;
    private javax.swing.JComboBox<String> jComboBoxSemestre;
    private javax.swing.JLabel jFecha;
    private javax.swing.JLabel jNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSemestre;
    private javax.swing.JLabel jTelefono;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}