/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.hereford.djw9349.ui.delivery;

import java.awt.Color;
import javax.swing.Icon;
import uk.ac.hereford.djw9349.ui.users.*;
import uk.ac.hereford.djw9349.IMS;
import uk.ac.hereford.djw9349.ui.Login;
import uk.ac.hereford.djw9349.ui.home.Home;
import jiconfont.icons.font_awesome.FontAwesome;
import javax.swing.table.DefaultTableModel;
import jiconfont.swing.IconFontSwing;
import uk.ac.hereford.djw9349.enums.Role;
import uk.ac.hereford.djw9349.objects.Delivery;
import uk.ac.hereford.djw9349.ui.stock.StockManagement;
import uk.ac.hereford.djw9349.ui.supplier.SupplierManagement;

/**
 *
 * @author danwilliams
 */
public class DeliveryManagement extends javax.swing.JFrame {

    /**
     * Creates new form UserManagement
     */
    public DeliveryManagement() {
        initComponents();
        usernameLabel.setText(IMS.userManager.loggedIn.getUsername());
        if (IMS.userManager.loggedIn.getRole() == Role.STAFF) {
            userLabel.setVisible(false);
            userButton.setVisible(false);
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Delivery delivery : IMS.deliveryManager.getDeliveries()) {
            model.addRow(new Object[]{delivery.getStatus(), delivery.getDate(), delivery.getIngredients(), delivery.getSupplier()});
        }
    }
    
    private void supplierLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierLabelMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        SupplierManagement.main(null);
    }//GEN-LAST:event_supplierLabelMouseClicked
    
    private void minusLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusLabelMouseClicked
        setVisible(false);
        new CancelDelivery();
    }//GEN-LAST:event_minusLabelMouseClicked
    
    private void stockButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockButtonMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        StockManagement.main(null);
    }//GEN-LAST:event_stockButtonMouseClicked

    private void deliveryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveryButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryButtonMouseClicked

    private void userButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        UserManagement.main(null);
    }//GEN-LAST:event_userButtonMouseClicked

    private void stockButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockButtonMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_stockButtonMouseEntered

    private void deliveryButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveryButtonMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_deliveryButtonMouseEntered

    private void userButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseEntered
        // TODO add your handling code here:]

    }//GEN-LAST:event_userButtonMouseEntered

    private void stockButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockButtonMouseExited
 
    }//GEN-LAST:event_stockButtonMouseExited

    private void deliveryButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveryButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryButtonMouseExited

    private void userButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_userButtonMouseExited

    private void mainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainPanelMousePressed

    private void mainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_mainPanelMouseDragged

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new Home().main(null);
    }//GEN-LAST:event_homeButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new Login();
        IMS.userManager.loggedIn = null;
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plusLabel1 = new javax.swing.JLabel();
        leftBar = new javax.swing.JPanel();
        logo = new javax.swing.JPanel();
        titleLabel1 = new javax.swing.JLabel();
        homeButton = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        stockButton = new javax.swing.JPanel();
        stockLabel = new javax.swing.JLabel();
        deliveryButton = new javax.swing.JPanel();
        deliveryLabel = new javax.swing.JLabel();
        userButton = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        minusLabel = new javax.swing.JLabel();
        graphPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        statusBar = new javax.swing.JPanel();
        loggedInLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        IconFontSwing.register(FontAwesome.getIconFont());

        Icon icon = IconFontSwing.buildIcon(FontAwesome.ADDRESS_BOOK, 40, new Color(96, 83, 150));
        supplierLabel = new javax.swing.JLabel(icon);
        plusLabel = new javax.swing.JLabel();

        plusLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        plusLabel1.setForeground(new java.awt.Color(96, 83, 150));
        plusLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plusLabel1.setText("+");
        plusLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusLabel1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftBar.setBackground(new java.awt.Color(255, 255, 255));
        leftBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel1.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(96, 83, 150));
        titleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel1.setText("IMS");

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        leftBar.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 110, -1));

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        homeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(54, 39, 120));
        homeLabel.setText("Home");
        homeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout homeButtonLayout = new javax.swing.GroupLayout(homeButton);
        homeButton.setLayout(homeButtonLayout);
        homeButtonLayout.setHorizontalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(homeLabel)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        homeButtonLayout.setVerticalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        leftBar.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 232, -1));

        stockButton.setBackground(new java.awt.Color(255, 255, 255));
        stockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stockButtonMouseExited(evt);
            }
        });

        stockLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stockLabel.setForeground(new java.awt.Color(54, 39, 120));
        stockLabel.setText("Stock Management");

        javax.swing.GroupLayout stockButtonLayout = new javax.swing.GroupLayout(stockButton);
        stockButton.setLayout(stockButtonLayout);
        stockButtonLayout.setHorizontalGroup(
            stockButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockButtonLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(stockLabel)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        stockButtonLayout.setVerticalGroup(
            stockButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stockButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        leftBar.add(stockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 227, 232, -1));

        deliveryButton.setBackground(new java.awt.Color(255, 255, 255));
        deliveryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deliveryButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deliveryButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deliveryButtonMouseExited(evt);
            }
        });

        deliveryLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deliveryLabel.setForeground(new java.awt.Color(158, 144, 219));
        deliveryLabel.setText("Delivery Management");

        javax.swing.GroupLayout deliveryButtonLayout = new javax.swing.GroupLayout(deliveryButton);
        deliveryButton.setLayout(deliveryButtonLayout);
        deliveryButtonLayout.setHorizontalGroup(
            deliveryButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryButtonLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(deliveryLabel)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        deliveryButtonLayout.setVerticalGroup(
            deliveryButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deliveryButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deliveryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        leftBar.add(deliveryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 279, 232, -1));

        userButton.setBackground(new java.awt.Color(255, 255, 255));
        userButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userButtonMouseExited(evt);
            }
        });

        userLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userLabel.setForeground(new java.awt.Color(54, 39, 120));
        userLabel.setText("User Management");

        javax.swing.GroupLayout userButtonLayout = new javax.swing.GroupLayout(userButton);
        userButton.setLayout(userButtonLayout);
        userButtonLayout.setHorizontalGroup(
            userButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userButtonLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(userLabel)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        userButtonLayout.setVerticalGroup(
            userButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        leftBar.add(userButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 331, 232, -1));

        logoutButton.setBackground(new java.awt.Color(54, 39, 120));
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutLabel.setText("Logout");

        javax.swing.GroupLayout logoutButtonLayout = new javax.swing.GroupLayout(logoutButton);
        logoutButton.setLayout(logoutButtonLayout);
        logoutButtonLayout.setHorizontalGroup(
            logoutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutButtonLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        logoutButtonLayout.setVerticalGroup(
            logoutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutButtonLayout.createSequentialGroup()
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        leftBar.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 230, -1));

        getContentPane().add(leftBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        mainPanel.setBackground(new java.awt.Color(247, 247, 247));
        mainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainPanelMouseDragged(evt);
            }
        });
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainPanelMousePressed(evt);
            }
        });
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minusLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        minusLabel.setForeground(new java.awt.Color(96, 83, 150));
        minusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minusLabel.setText("-");
        minusLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusLabelMouseClicked(evt);
            }
        });
        mainPanel.add(minusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 50, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Date", "Contents", "Supplier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        mainPanel.add(graphPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 480, 370));

        statusBar.setBackground(new java.awt.Color(237, 237, 237));

        loggedInLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loggedInLabel.setForeground(new java.awt.Color(96, 83, 150));
        loggedInLabel.setText("You are currently logged in as");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(54, 39, 120));
        usernameLabel.setText("null");

        javax.swing.GroupLayout statusBarLayout = new javax.swing.GroupLayout(statusBar);
        statusBar.setLayout(statusBarLayout);
        statusBarLayout.setHorizontalGroup(
            statusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusBarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(loggedInLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel)
                .addContainerGap(542, Short.MAX_VALUE))
        );
        statusBarLayout.setVerticalGroup(
            statusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(statusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loggedInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        mainPanel.add(statusBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 780, -1));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(96, 83, 150));
        titleLabel.setText("Inventory Management System");
        mainPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 290, 37));

        supplierLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        supplierLabel.setForeground(new java.awt.Color(96, 83, 150));
        supplierLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supplierLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierLabelMouseClicked(evt);
            }
        });
        mainPanel.add(supplierLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 40, 30));

        plusLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        plusLabel.setForeground(new java.awt.Color(96, 83, 150));
        plusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plusLabel.setText("+");
        plusLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusLabelMouseClicked(evt);
            }
        });
        mainPanel.add(plusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 50, 40));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 530, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plusLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_plusLabel1MouseClicked

    private void plusLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusLabelMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new AddDelivery();
    }//GEN-LAST:event_plusLabelMouseClicked

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
            java.util.logging.Logger.getLogger(DeliveryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliveryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliveryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliveryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliveryManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel deliveryButton;
    private javax.swing.JLabel deliveryLabel;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel leftBar;
    private javax.swing.JLabel loggedInLabel;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel logoutButton;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel minusLabel;
    private javax.swing.JLabel plusLabel;
    private javax.swing.JLabel plusLabel1;
    private javax.swing.JPanel statusBar;
    private javax.swing.JPanel stockButton;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JLabel supplierLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JPanel userButton;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
