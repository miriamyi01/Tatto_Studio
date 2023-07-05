/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import objects.*;
import model.*;

/**
 *
 * @author Airam
 */
public class RegistroProducto extends javax.swing.JFrame {

    private Usuario u;
    
    /**
     * Creates new form Inventario
     */
    public RegistroProducto( Usuario u ) {
        initComponents();
        this.u = u;
        setSize(841,509);
        setLocationRelativeTo(null);
        setResizable(false);
        Proveedor pr = null;
        proveedores();
    }

    private ArrayList<Proveedor> proveedores(){
        ArrayList<Proveedor> pl = new ArrayList<>();
        for(Proveedor p : Model.getProveedor()){
            if(!p.getNombre().endsWith("-P")){    
                proveedores.addItem(p.getNombre());
                pl.add(p);
            }
        }
        return pl;
    }
      
    private void limpiar(){
        modelo.setText("");
        tipo.setText("");
        costo.setText("");
        precio.setText("");
        cantidad.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        proveedores = new javax.swing.JComboBox<>();
        salir = new javax.swing.JToggleButton();
        nombre1 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modelo: ");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(288, 182, 68, 26);
        jPanel3.add(costo);
        costo.setBounds(391, 271, 137, 22);
        jPanel3.add(tipo);
        tipo.setBounds(390, 227, 138, 22);

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo: ");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(288, 226, 46, 26);

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cantidad: ");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(288, 358, 83, 26);
        jPanel3.add(modelo);
        modelo.setBounds(390, 183, 138, 22);
        jPanel3.add(precio);
        precio.setBounds(391, 315, 137, 22);

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Precio: ");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(288, 314, 57, 26);

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Costo:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(288, 270, 49, 26);
        jPanel3.add(cantidad);
        cantidad.setBounds(391, 359, 137, 22);

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Proveedor:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(288, 138, 84, 26);

        proveedores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                proveedoresItemStateChanged(evt);
            }
        });
        proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proveedoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proveedoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                proveedoresMousePressed(evt);
            }
        });
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });
        jPanel3.add(proveedores);
        proveedores.setBounds(390, 137, 138, 26);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresarboton.png"))); // NOI18N
        salir.setContentAreaFilled(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel3.add(salir);
        salir.setBounds(160, 420, 41, 39);

        nombre1.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        nombre1.setForeground(new java.awt.Color(255, 255, 255));
        nombre1.setText("Nuevo producto");
        jPanel3.add(nombre1);
        nombre1.setBounds(299, 53, 240, 38);

        registrar.setFont(new java.awt.Font("Sitka Small", 0, 20)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel3.add(registrar);
        registrar.setBounds(620, 420, 159, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoI.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, -10, 840, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
        new Inventario(this.u).setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedoresActionPerformed

    private void proveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMousePressed

    }//GEN-LAST:event_proveedoresMousePressed

    private void proveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseExited

    }//GEN-LAST:event_proveedoresMouseExited

    private void proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseClicked

    }//GEN-LAST:event_proveedoresMouseClicked

    private void proveedoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_proveedoresItemStateChanged

    }//GEN-LAST:event_proveedoresItemStateChanged

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        try{
            Producto p = new Producto(
                modelo.getText(),
                tipo.getText(),
                Integer.parseInt(cantidad.getText()),
                Double.parseDouble(precio.getText()),
                Model.buscarProveedor(proveedores.getSelectedItem().toString()),
                Double.parseDouble(costo.getText()),
                false
            );
            Model.insertarProducto(p);
            JOptionPane.showMessageDialog(null, "Se insertó un nuevo producto." );
            limpiar();
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El formato de los campos no es correcto." );
        }
    }//GEN-LAST:event_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProducto(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField costo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField modelo;
    private javax.swing.JLabel nombre1;
    private javax.swing.JTextField precio;
    private javax.swing.JComboBox<String> proveedores;
    private javax.swing.JButton registrar;
    private javax.swing.JToggleButton salir;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
}
