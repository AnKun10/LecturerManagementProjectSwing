/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import entity.Admin;
import entity.Clazz;
import entity.Lecturer;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.Main;

/**
 *
 * @author Admin
 */
public class LecturerMangagementFrame extends javax.swing.JFrame {

    /**
     * Creates new form LecturerMangagementFrame
     */
    private Admin admin;
    private String workplace;
    private ArrayList<Clazz> clazzes;
    
    public LecturerMangagementFrame(Admin admin, String workplace, ArrayList<Clazz> clazzes){
        initComponents();
        this.admin = admin;
        this.workplace = workplace;
        this.clazzes = clazzes;
        for (Lecturer lecturer : Main.lecturers) {
            Vector vectorRow = new Vector();
            vectorRow.add(lecturer.getId());
            vectorRow.add(lecturer.getAge());
            vectorRow.add(lecturer.getEmail());
            vectorRow.add(lecturer.getPhoneNumb());
            vectorRow.add(lecturer.isIsAssigned());
        }
        displayJTable(jTable1);
    }
    public LecturerMangagementFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackToClazzMangagementPage = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        spnAge = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnFilter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSetting = new javax.swing.JMenu();
        menuSecurity = new javax.swing.JMenuItem();
        ckbmenuDarkMode = new javax.swing.JCheckBoxMenuItem();
        menuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBackToClazzMangagementPage.setText("Back to the Previous Page");
        btnBackToClazzMangagementPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToClazzMangagementPageActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        lblAge.setText("Age:");

        lblEmail.setText("Email:");

        lblPhoneNumber.setText("Phone Number:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnFilter.setText("Filter");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "Email", "Phone Number", "Assigned"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        menuSetting.setText("Setting");
        menuSetting.setToolTipText("");
        menuSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSettingActionPerformed(evt);
            }
        });

        menuSecurity.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSecurity.setText("Security");
        menuSecurity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSecurityActionPerformed(evt);
            }
        });
        menuSetting.add(menuSecurity);

        ckbmenuDarkMode.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ckbmenuDarkMode.setSelected(true);
        ckbmenuDarkMode.setText("Dark Mode");
        ckbmenuDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbmenuDarkModeActionPerformed(evt);
            }
        });
        menuSetting.add(ckbmenuDarkMode);

        jMenuBar1.add(menuSetting);

        menuAbout.setText("About");
        jMenuBar1.add(menuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackToClazzMangagementPage)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAge)
                                .addComponent(lblName)
                                .addComponent(lblEmail)
                                .addComponent(lblPhoneNumber)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtEmail)
                                    .addComponent(txtPhoneNumber)
                                    .addComponent(spnAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(btnFilter)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBackToClazzMangagementPage)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAge)
                                .addComponent(spnAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhoneNumber)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnEdit)
                            .addComponent(btnFilter))
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSecurityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSecurityActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SecurityFrame(admin).setVisible(true);
    }//GEN-LAST:event_menuSecurityActionPerformed

    private void menuSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSettingActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String phoneNumb = txtPhoneNumber.getText();
        String email = txtEmail.getText();
        try {
            spnAge.commitEdit();
        } catch ( java.text.ParseException e ) { spnAge.setValue(0); }
        int age = (Integer) spnAge.getValue();
        Lecturer lecturer = new Lecturer(name, age, email, phoneNumb);
        Main.lecturers.add(lecturer);
        displayJTable(jTable1);
    }//GEN-LAST:event_btnAddActionPerformed

    private void ckbmenuDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbmenuDarkModeActionPerformed
        // TODO add your handling code here:
        if (ckbmenuDarkMode.isSelected()){
            this.getContentPane().setBackground(Color.black);
            lblAge.setForeground(Color.white);
            lblName.setForeground(Color.white);
            lblEmail.setForeground(Color.white);
            lblPhoneNumber.setForeground(Color.white);
        } else {
            this.getContentPane().setBackground(Color.white);
            lblAge.setForeground(Color.black);
            lblName.setForeground(Color.black);
            lblEmail.setForeground(Color.black);
            lblPhoneNumber.setForeground(Color.black);
        }
    }//GEN-LAST:event_ckbmenuDarkModeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1){
            Lecturer lecturerSelected = Main.lecturers.get(jTable1.getSelectedRow());
            txtEmail.setText(lecturerSelected.getEmail());
            txtName.setText(lecturerSelected.getName());
            txtPhoneNumber.setText(lecturerSelected.getPhoneNumb());
            spnAge.setValue(lecturerSelected.getAge());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        Lecturer lecturerSelected = Main.lecturers.get(jTable1.getSelectedRow());
        try {
            spnAge.commitEdit();
        } catch ( java.text.ParseException e ) { spnAge.setValue(0); }
        int age = (Integer) spnAge.getValue();
        lecturerSelected.setAge(age);
        lecturerSelected.setEmail(txtEmail.getText());
        lecturerSelected.setName(txtName.getText());
        lecturerSelected.setPhoneNumb(txtPhoneNumber.getText());
        displayJTable(jTable1);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackToClazzMangagementPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToClazzMangagementPageActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClazzMangementFrame(admin, clazzes, workplace).setVisible(true);
    }//GEN-LAST:event_btnBackToClazzMangagementPageActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerMangagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerMangagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerMangagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerMangagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerMangagementFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackToClazzMangagementPage;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFilter;
    private javax.swing.JCheckBoxMenuItem ckbmenuDarkMode;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuItem menuSecurity;
    private javax.swing.JMenu menuSetting;
    private javax.swing.JSpinner spnAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

    private void displayJTable(JTable jTable) {
        String col[] = {"ID","Name","Age", "Email", "Phone Number", "Assigned"};
        DefaultTableModel tableModel = new DefaultTableModel(col,0);
        for(int i=0;i<Main.lecturers.size();i++){
            Object[] obj={Main.lecturers.get(i).getId(), Main.lecturers.get(i).getName(), 
                Main.lecturers.get(i).getAge(), Main.lecturers.get(i).getEmail(), 
                Main.lecturers.get(i).getPhoneNumb(), Main.lecturers.get(i).isIsAssigned()};
            
            tableModel.addRow(obj);
        }
        jTable.setModel(tableModel);
    }
}
