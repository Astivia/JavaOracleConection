/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oracle;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author AstiviaMax
 */
public class EditLibros extends javax.swing.JFrame {

    /**
     * Creates new form EditLibros
     */
    int id_libro;

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public EditLibros() {
        initComponents();
        //Llenamos el combo y seleccionamos por default un valor que no este en el combo
        Llenar_Combo();
        ComboLibros.setSelectedItem(null);

    }

    public void Llenar_Combo() {
        ComboLibros.removeAllItems(); //elimina los datos que pudieran existir previamente en el combo
        Libros obj = new Libros();
        ArrayList lista = obj.Combo_Libros();
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            Libros libro = (Libros) iter.next();
            ComboLibros.addItem(libro);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Title = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Autor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Editorial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        Pages = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ComboLibros = new javax.swing.JComboBox<>();
        btn_Seleccionar = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        btn_Cancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Titulo:");

        Title.setEnabled(false);

        jLabel4.setText("Autor:");

        Autor.setEnabled(false);

        jLabel5.setText("Editorial:");

        Editorial.setEnabled(false);

        jLabel6.setText("Descripcion:");

        Description.setColumns(20);
        Description.setRows(5);
        Description.setEnabled(false);
        jScrollPane1.setViewportView(Description);

        jLabel7.setText("Paginas:");

        Pages.setEnabled(false);

        jLabel8.setText("Precio:");

        Price.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Price.setEnabled(false);

        btn_Guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Guardar.setText("Guardar Cambios");
        btn_Guardar.setEnabled(false);
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar Libro:");

        btn_Seleccionar.setText("Cargar Datos");
        btn_Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeleccionarActionPerformed(evt);
            }
        });

        btn_Borrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Borrar.setText("Eliminar Libro");
        btn_Borrar.setEnabled(false);
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        btn_Cancela.setText("Cancelar");
        btn_Cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(Editorial))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(ComboLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_Guardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Borrar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(278, 278, 278)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(Pages, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btn_Seleccionar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Seleccionar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Pages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancela))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed

        if (Title.getText().equals("") || Autor.getText().equals("") || Editorial.getText().equals("")
            || Price.getText().equals("") || Integer.parseInt(Pages.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "Favor de capturar los datos faltantes");
        } else {
            Libros libro = new Libros();
            int r = libro.Actualizar_Libro(Title.getText(), Autor.getText(), Editorial.getText(), Description.getText(),
                Integer.parseInt(Pages.getValue().toString()), Double.parseDouble(Price.getText()),this.getId_libro());
            
            if (r != 0) {
                Title.setText("");Autor.setText("");Editorial.setText("");Description.setText("");Price.setText("");Pages.setValue(0);
                JOptionPane.showMessageDialog(null, "Datos Modificados de forma Exisosa");
                //VOLVEMOS A BLOQUEAR TODO
                Llenar_Combo();
                ComboLibros.setSelectedItem(null);
                Title.setEnabled(false);
                Autor.setEnabled(false);
                Editorial.setEnabled(false);
                Description.setEnabled(false);
                Price.setEnabled(false);
                Pages.setEnabled(false);
                this.setId_libro(0);
                btn_Guardar.setEnabled(false);
                btn_Borrar.setEnabled(false);
                
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error");
            }
        }
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeleccionarActionPerformed
        Libros Libro = (Libros) ComboLibros.getSelectedItem();
        if (Libro == null) {
            JOptionPane.showMessageDialog(null, "Porfavor, seleccione un Libro");
        } else {
            Title.setText(Libro.getTitulo());Title.setEnabled(true);
            Autor.setText(Libro.getAutor());Autor.setEnabled(true);
            Editorial.setText(Libro.getEditorial());Editorial.setEnabled(true);
            Description.setText(Libro.getDescripcion());Description.setEnabled(true);
            Price.setText(String.valueOf((float) Libro.getPrecio()));Price.setEnabled(true);
            Pages.setValue(Libro.getPaginas());Pages.setEnabled(true);
            this.setId_libro(Libro.getId());
            btn_Guardar.setEnabled(true);
            btn_Borrar.setEnabled(true);
        }


    }//GEN-LAST:event_btn_SeleccionarActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        Libros Libro = (Libros) ComboLibros.getSelectedItem();
        this.setId_libro(Libro.getId());
        int r= Libro.Elimina_Libro(this.getId_libro());
        if (r!=0) {
            JOptionPane.showMessageDialog(null, "Se Elimino el Libro Especificado");
            Llenar_Combo();
                ComboLibros.setSelectedItem(null);
                Title.setEnabled(false);
                Autor.setEnabled(false);
                Editorial.setEnabled(false);
                Description.setEnabled(false);
                Price.setEnabled(false);
                Pages.setEnabled(false);
                this.setId_libro(0);
                btn_Guardar.setEnabled(false);
                btn_Borrar.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_btn_BorrarActionPerformed

    private void btn_CancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_CancelaActionPerformed

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
            java.util.logging.Logger.getLogger(EditLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Autor;
    private javax.swing.JComboBox<Libros> ComboLibros;
    private javax.swing.JTextArea Description;
    private javax.swing.JTextField Editorial;
    private javax.swing.JSpinner Pages;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Title;
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_Cancela;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Seleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
