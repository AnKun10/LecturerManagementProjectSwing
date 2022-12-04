/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import constant.WorkplaceConstant;
import entity.Admin;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    private Admin admin;
    private boolean LecturerSchedule;
    public HomeFrame() {
        initComponents();
    }
    
    public HomeFrame(Admin admin){
        this.admin = admin;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDichVongHau = new javax.swing.JButton();
        btnNguyenDinhChieu = new javax.swing.JButton();
        btnToHuu = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSetting = new javax.swing.JMenu();
        menuSecurity = new javax.swing.JMenuItem();
        ckbmenuDarkMode = new javax.swing.JCheckBoxMenuItem();
        menuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDichVongHau.setText("Dịch Vọng Hậu");
        btnDichVongHau.setMaximumSize(new java.awt.Dimension(138, 138));
        btnDichVongHau.setMinimumSize(new java.awt.Dimension(138, 138));
        btnDichVongHau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDichVongHauActionPerformed(evt);
            }
        });

        btnNguyenDinhChieu.setText("Nguyễn Đình Chiểu");
        btnNguyenDinhChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguyenDinhChieuActionPerformed(evt);
            }
        });

        btnToHuu.setText("Tố Hữu");
        btnToHuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToHuuActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

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
                .addGap(26, 26, 26)
                .addComponent(btnDichVongHau, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNguyenDinhChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnToHuu, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDichVongHau, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNguyenDinhChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnToHuu, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDichVongHauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDichVongHauActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClazzMangementFrame(admin, main.Main.clazzes, WorkplaceConstant.DICHVONGHAU.value).setVisible(true);
    }//GEN-LAST:event_btnDichVongHauActionPerformed

    private void btnToHuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToHuuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClazzMangementFrame(admin, main.Main.clazzes, WorkplaceConstant.TOHUU.value).setVisible(true);
    }//GEN-LAST:event_btnToHuuActionPerformed

    private void btnNguyenDinhChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguyenDinhChieuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ClazzMangementFrame(admin, main.Main.clazzes, WorkplaceConstant.NGUYENDINHCHIEU.value).setVisible(true);
    }//GEN-LAST:event_btnNguyenDinhChieuActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void menuSecurityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSecurityActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SecurityFrame(admin).setVisible(true);
    }//GEN-LAST:event_menuSecurityActionPerformed

    private void menuSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSettingActionPerformed

    private void ckbmenuDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbmenuDarkModeActionPerformed
        // TODO add your handling code here:
        if (ckbmenuDarkMode.isSelected()){
            this.getContentPane().setBackground(Color.black);
        } else {
            this.getContentPane().setBackground(Color.white);
        }
    }//GEN-LAST:event_ckbmenuDarkModeActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDichVongHau;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNguyenDinhChieu;
    private javax.swing.JButton btnToHuu;
    private javax.swing.JCheckBoxMenuItem ckbmenuDarkMode;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuItem menuSecurity;
    private javax.swing.JMenu menuSetting;
    // End of variables declaration//GEN-END:variables
}
