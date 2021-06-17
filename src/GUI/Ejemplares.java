/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entidades.Libro;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author giani
 */
public class Ejemplares extends javax.swing.JInternalFrame {

    BD.EjemplarData ed = new BD.EjemplarData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    BD.LibroData ld = new BD.LibroData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    /**
     * Creates new form Ejemplares
     */
    public Ejemplares() {
        initComponents();
        actualizarCBLibros();
        actualizarCBEstado();
    }

    public void actualizarCBLibros() {
        cbLibro.removeAllItems();
        cbLibro.addItem(new Libro());
        cbLibro.setSelectedIndex(0);
        BD.LibroData ld = new BD.LibroData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
        List<Libro> lista = ld.obtenerLibros();
        for (Libro libro : lista) {
            cbLibro.addItem(libro);
        }
    }

    public void actualizarCBEstado() {
        comboEstado.removeAllItems();
        comboEstado.addItem("");
        comboEstado.setSelectedIndex(0);
        comboEstado.addItem("Prestado");
        comboEstado.addItem("Retraso");
        comboEstado.addItem("Reparacion");
        comboEstado.addItem("Disponible");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbLibro = new javax.swing.JComboBox<>();
        bBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        bCrearEjemplar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Registro de Ejemplares");

        jLabel2.setText("ID:");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Prestado", "Retraso", "Reparacion", "Disponible" }));

        jLabel3.setText("Estado:");

        jLabel4.setText("Libro:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");

        bActualizar.setText("Actualizar estado");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bCrearEjemplar.setText("Crear Ejemplar");
        bCrearEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearEjemplarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tfId)
                                .addGap(18, 18, 18)
                                .addComponent(bBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bCrearEjemplar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboEstado, 0, 183, Short.MAX_VALUE)
                                        .addComponent(cbLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addComponent(bActualizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 142, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(132, 132, 132))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(bActualizar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bCrearEjemplar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        if (tfId.getText() == "") {
            JOptionPane.showMessageDialog(this, "No se ha ingresado un ID, por favor, ingrese uno.");
            return;
        }
        if (!(tfId.getText().chars().allMatch(Character::isDigit))) {
            JOptionPane.showMessageDialog(this, "El ID debe ser de tipo numerico, por favor, ingreseló nuevamente");
            return;
        }
        Entidades.Ejemplar ejemplar = ed.buscarEjemplar(Integer.parseInt(tfId.getText()));
        if (ejemplar == null) {
            JOptionPane.showMessageDialog(this, "No se encontró un ejemplar con ese ID.");
            return;
        }
        comboEstado.setSelectedIndex(ejemplar.getEstado()+1);
        cbLibro.setSelectedIndex(ejemplar.getLibro().getId());
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        if (tfId.getText() == "") {
            JOptionPane.showMessageDialog(this, "No se ha ingresado un ID, por favor, ingrese uno.");
            return;
        }
        if (!(tfId.getText().chars().allMatch(Character::isDigit))) {
            JOptionPane.showMessageDialog(this, "El ID debe ser de tipo numerico, por favor, ingreseló nuevamente");
            return;
        }
        Entidades.Ejemplar ejemplar = ed.buscarEjemplar(Integer.parseInt(tfId.getText()));
        ejemplar.setEstado(comboEstado.getSelectedIndex()+1);
        ed.cambiarEstado(ejemplar);
    }//GEN-LAST:event_bActualizarActionPerformed

    private void bCrearEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearEjemplarActionPerformed
        Entidades.Ejemplar ejemplar = new Entidades.Ejemplar();
        ejemplar.setEstado(comboEstado.getSelectedIndex()+1);
        ejemplar.setLibro(ld.buscarLibroXId(cbLibro.getSelectedIndex()));
        int aux=ed.guardar(ejemplar);
        tfId.setText(aux+"");
        JOptionPane.showMessageDialog(this, "El ejemplar se ha creado con exito con el ID:"+aux);
    }//GEN-LAST:event_bCrearEjemplarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCrearEjemplar;
    private javax.swing.JComboBox<Libro> cbLibro;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfId;
    // End of variables declaration//GEN-END:variables
}
