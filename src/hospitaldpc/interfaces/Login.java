/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitaldpc.interfaces;

import hospitaldpc.managers.UsersManager;
import hospitaldpc.interfaces.ReadPatient_Main;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dapec
 */
public class Login extends javax.swing.JFrame {

    private UsersManager manager;
    
    public Login() {
        initComponents();
        this.manager = new UsersManager();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mailField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        joinButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/LoginLogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        mailField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(mailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 300, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Usuario o correo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        passField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 300, 30));

        joinButton.setBackground(new java.awt.Color(244, 245, 249));
        joinButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/AccessButton.png"))); // NOI18N
        joinButton.setBorder(null);
        joinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });
        jPanel1.add(joinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 40));

        registerButton.setBackground(new java.awt.Color(244, 245, 249));
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/CreateAccountButton.png"))); // NOI18N
        registerButton.setBorder(null);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/LoginBackground.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 525));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        validateAccess();
    }//GEN-LAST:event_joinButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        new Register().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerButtonActionPerformed

    public void validateAccess(){
        if(mailField.getText().equals("") || String.valueOf(passField.getPassword()).equals("")){
            JOptionPane.showMessageDialog(this, "Llena todos los campos", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
        }//end if
        else{
            try{
                String[] datos = this.manager.selectPassByUserameOrEmail(mailField.getText());
                if(checkRegisteredAccount(datos) && checkCredentials(datos)){
                    new ReadPatient_Main().setVisible(true);
                    this.dispose();
                }//end else checks true
                else{
                    JOptionPane.showMessageDialog(this, "Esta cuenta no está registrada o los datos son incorrectos...\nVerifica tus credenciales", "Credenciales incorrectas", JOptionPane.WARNING_MESSAGE);
                }//end else checks false
            }//end try
            catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Hubo un error al traer datos del usuario.\nERROR: " + e.getMessage());
            }//end catch
        }//end else
        
    }//end validateAccess
    
    public boolean checkRegisteredAccount(String[] datos){
        return Integer.parseInt(datos[0]) > 0 && !datos[3].equals("N/A") && !datos[4].equals("N/A");
    }//end checkRegisteredAccount
    
    public boolean checkCredentials(String[] datos){
        return (datos[3].equals(mailField.getText()) || datos[4].equals(mailField.getText())) && datos[5].equals(String.valueOf(passField.getPassword()));
    }//end creckCredentials
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton joinButton;
    private javax.swing.JTextField mailField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
