package views;

import dao.impl.AlumnoDAOImplHibernate;
import dao.impl.GrupoDAOImplHibernate;
import java.awt.Component;
import java.awt.PopupMenu;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import models.Alumno;
import models.Grupo;
import utils.SiscomException;
import viewsmodel.AlumnoTableModel;

/**
 *
 * @author MANUEL LOZA
 */
public class JFAlumno extends javax.swing.JFrame {

    private AlumnoDAOImplHibernate dao = new AlumnoDAOImplHibernate();
    private String id;
    private GrupoDAOImplHibernate gruDAO = new GrupoDAOImplHibernate();

    /**
     * Creates new form frmMain
     */
    public JFAlumno() throws SiscomException {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Alumnos");
        JLabel imagen = new JLabel();
        imagen.setBounds(0, 0, 395, 370);
        this.add(imagen);
        this.initTable();
        cargarCombo();
    }

    private void initTable() {
        try {
            List<Alumno> alumno = dao.findAll();
            AlumnoTableModel model = new AlumnoTableModel();
            for (Alumno alu : alumno) {
                model.inserData(new Object[]{alu.getCveAlu(), alu.getNomAlu(),
                    alu.getEdaAlu(), alu.getCveGru().getCveGru()});
            }
            tblAlumnos.setModel(model);
        } catch (SiscomException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos");
        }
    }

    public void clean() {
        txtcveAlu.setText("");
        txtNomAlu.setText("");
        txtEdad.setText("");
        cmbCveGru.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcveAlu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomAlu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbCveGru = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alumnos"));

        jLabel2.setText("Cve Alumno");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 30));

        txtcveAlu.setPreferredSize(new java.awt.Dimension(300, 30));
        txtcveAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcveAluActionPerformed(evt);
            }
        });
        txtcveAlu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcveAluKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre del Alumno:");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 30));

        txtNomAlu.setPreferredSize(new java.awt.Dimension(300, 30));
        txtNomAlu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomAluKeyTyped(evt);
            }
        });

        jLabel5.setText("Edad:");
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 30));

        txtEdad.setPreferredSize(new java.awt.Dimension(300, 30));
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jLabel6.setText("Cve Grupo:");
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 30));

        cmbCveGru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCveGruActionPerformed(evt);
            }
        });
        cmbCveGru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmbCveGruKeyTyped(evt);
            }
        });

        btnSave.setText("Aceptar");
        btnSave.setPreferredSize(new java.awt.Dimension(90, 35));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.setPreferredSize(new java.awt.Dimension(90, 35));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnUpdate.setText("Actualizar");
        btnUpdate.setEnabled(false);
        btnUpdate.setPreferredSize(new java.awt.Dimension(90, 35));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcveAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCveGru, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcveAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCveGru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Alumnos"));

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cve Alumno", "Nombre ", "Edad", "Cve Grupo", "Eliminar", "Editar"
            }
        ));
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("SALIR");
        btnBack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            if (validaCampos()) {
                Alumno alumno = new Alumno();
                alumno = dao.get(txtcveAlu.getText());
                if (alumno == null) {
                    Alumno alu = new Alumno();
                    Grupo grupo = new Grupo();
                    grupo = gruDAO.get(cmbCveGru.getSelectedItem().toString());
                    alu.setCveAlu(txtcveAlu.getText());
                    alu.setNomAlu(txtNomAlu.getText());
                    alu.setEdaAlu(Integer.parseInt(txtEdad.getText()));
                    alu.setCveGru(grupo);

                    dao.saveOrUpdate(alu);
                    this.clean();
                    this.initTable();
                } else {
                    JOptionPane.showMessageDialog(null, "YA EXISTE LA CLAVE " + txtcveAlu.getText());
                }
            }
        } catch (SiscomException ex) {
            Logger.getLogger(JFAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        // TODO add your handling code here:
        this.clean();
        txtcveAlu.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //        this.setVisible(false);
        //        ViewMain main = new ViewMain();
        //        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked
        // TODO add your handling code here:
        int row = tblAlumnos.rowAtPoint(evt.getPoint());
        int col = tblAlumnos.columnAtPoint(evt.getPoint());

        if (col == 4) {
            int respuesta = JOptionPane.showConfirmDialog(this, "¿DESEAS ELIMINAR EL ALUMNO?", "ELIMINAR ALUMNO",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                try {
                    String id = String.valueOf(tblAlumnos.getValueAt(row, 0));
                    dao.delete(id);
                    this.clean();
                    this.initTable();
                } catch (SiscomException ex) {
                    JOptionPane.showMessageDialog(this, "ERROR AL TRATAR DE REALIZAR LA PETICION");
                }
            }
        }

        if (col == 5) {
            txtcveAlu.setText(tblAlumnos.getValueAt(row, 0).toString());
            txtNomAlu.setText(tblAlumnos.getValueAt(row, 1).toString());
            txtEdad.setText(tblAlumnos.getValueAt(row, 2).toString());
            cmbCveGru.setSelectedItem(tblAlumnos.getValueAt(row, 3).toString());
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
            txtcveAlu.setEnabled(false);
        }
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            if (validaCampos()) {
                Alumno alu = new Alumno();
                Grupo grupo = new Grupo();
                grupo = gruDAO.get(cmbCveGru.getSelectedItem().toString());
                alu.setCveAlu(txtcveAlu.getText());
                alu.setNomAlu(txtNomAlu.getText());
                alu.setEdaAlu(Integer.parseInt(txtEdad.getText()));
                alu.setCveGru(grupo);

                dao.saveOrUpdate(alu);
                this.clean();
                this.initTable();
                btnUpdate.setEnabled(false);
                btnSave.setEnabled(true);
            }
        } catch (SiscomException ex) {
            Logger.getLogger(JFAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbCveGruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCveGruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCveGruActionPerformed

    private void txtcveAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcveAluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcveAluActionPerformed

    private void txtcveAluKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcveAluKeyTyped
        // TODO add your handling code here:

        if (txtcveAlu.getText().length() > 0 && txtcveAlu.getText().length() >= 15) {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "SOLO SE PERMITEN 15 CARACTERES");

        }
    }//GEN-LAST:event_txtcveAluKeyTyped

    private void txtNomAluKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomAluKeyTyped
        // TODO add your handling code here:

        char validar = evt.getKeyChar();

        if (Character.isLetter(validar) || Character.isWhitespace(validar)
                || Character.isISOControl(validar)) {
            txtNomAlu.setEditable(true);

        } else {
            txtNomAlu.setEditable(false);
        }

        if (txtNomAlu.getText().length() > 0 && txtNomAlu.getText().length() >= 50) {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "SOLO SE PERMITEN 50 CARACTERES");

        }
    }//GEN-LAST:event_txtNomAluKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // TODO add your handling code here:

        if (txtEdad.getText().length() > 0 && txtEdad.getText().length() >= 2) {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Solo permite 2 carcteres");
            txtEdad.setEditable(rootPaneCheckingEnabled);

        }

        char validar = evt.getKeyChar();

        if (validar < '0' || validar > '9') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void cmbCveGruKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCveGruKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbCveGruKeyTyped

    /**
     * @param args the command line arguments
     */
    private void cargarCombo() throws SiscomException {
        List<Grupo> lgrupos = new ArrayList<>();
        lgrupos = gruDAO.findAll();
        cmbCveGru.addItem("SELECCIONA UN GRUPO");
        for (int i = 0; i < lgrupos.size(); i++) {
            cmbCveGru.addItem(lgrupos.get(i).getCveGru());

        }
    }

    private boolean validaCampos() {
        if (txtcveAlu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LA CVE ALUMNO SE ENCUENTRA VACIA.");
            txtcveAlu.requestFocus();
            return false;
        }

        if (txtNomAlu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "EL NOMBRE SE ENCUENTRA VACIA.");
            txtNomAlu.requestFocus();
            return false;
        }

        if (txtEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LA EDAD SE ENCUENTRA VACIA.");
            txtEdad.requestFocus();
            return false;
        }

        if (cmbCveGru.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO NINGUN GRUPO.");
            cmbCveGru.requestFocus();
            return false;
        }
        if (Integer.parseInt(txtEdad.getText()) >= 95 || Integer.parseInt(txtEdad.getText()) <= 3) {
            JOptionPane.showMessageDialog(null, "VALOR DE EDAD NO ACEPTADA");
            txtEdad.requestFocus();
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFAlumno().setVisible(true);
                } catch (SiscomException ex) {
                    Logger.getLogger(JFAlumno.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCveGru;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNomAlu;
    private javax.swing.JTextField txtcveAlu;
    // End of variables declaration//GEN-END:variables
}
