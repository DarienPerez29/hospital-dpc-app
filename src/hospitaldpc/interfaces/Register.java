
package hospitaldpc.interfaces;

import hospitaldpc.managers.UsersManager;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    private UsersManager manager;
    
    public Register() {
        initComponents();
        this.manager = new UsersManager();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        joinButton = new javax.swing.JButton();
        lastNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mailField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 245, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/LoginLogo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("REGISTRARSE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        nameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 300, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        passField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 300, 30));

        joinButton.setBackground(new java.awt.Color(244, 245, 249));
        joinButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/RegisterButton.png"))); // NOI18N
        joinButton.setBorder(null);
        joinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });
        jPanel1.add(joinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, 40));

        lastNameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 300, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        usernameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 300, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Nombre de usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        mailField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(mailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 300, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Correo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        cancelButton.setBackground(new java.awt.Color(244, 245, 249));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/CancelRegisterButton.png"))); // NOI18N
        cancelButton.setBorder(null);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, 40));

        jLabel7.setForeground(new java.awt.Color(244, 245, 249));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/LoginBackground.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        registrarUsuario();
    }//GEN-LAST:event_joinButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    public void registrarUsuario(){
        if(checkFilledFields() && verifyNamesFormat() && verifyUsernameFormat() && verifyEmailFormat()){
            String[] data = new String[5];
            
            data[0] = this.nameField.getText();
            data[1] = this.lastNameField.getText();
            data[2] = this.usernameField.getText();
            data[3] = this.mailField.getText();
            data[4] = String.valueOf(this.passField.getPassword());
            
            try {
                if(this.manager.createUser(data) > 0){
                    JOptionPane.showMessageDialog(this, "Se ha registrado exitosamente el usuario.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                    new Login().setVisible(true);
                    this.dispose();
                }//end if registro exitoso
            }//end try
            catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Hubo un error al registrar el usuario.\nERROR: " + ex.getMessage());
            }//end catch exception
        }//end if validaciones
    }//end registrarUsuario
    
    public boolean checkFilledFields(){
        if(nameField.getText().equals("") || lastNameField.getText().equals("") || 
                usernameField.getText().equals("") || mailField.getText().equals("") ||
                String.valueOf(passField.getPassword()).equals("")){
        JOptionPane.showMessageDialog(this, "Verifica que los campos esten llenos.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
        return false;
        }//end if campos vacios
        
        return true;
    }//end checkFilledFields
    
    public boolean verifyEmailFormat(){
        //RFC 5322 corregido:
        String emailRegex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*"
                + "+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21"
                + "\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])"
                + "*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9]"
                + "(?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])"
                + "|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])"
                + "|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08"
                + "\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09"
                + "\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher m = emailPattern.matcher(mailField.getText());
        
        if(m.find()) return true;
        
        JOptionPane.showMessageDialog(this, "Ingresa una dirección de correo válida", "Correo inválido", JOptionPane.WARNING_MESSAGE);
        return false;
    }//end verifyEmailFormat
    
    public boolean verifyNamesFormat(){
        String namesRegex = "^([a-zA-Z]+\\s)*[a-zA-Z]+$";
         
        Pattern namesPattern = Pattern.compile(namesRegex);
        Matcher mName = namesPattern.matcher(nameField.getText());
        Matcher mLastName = namesPattern.matcher(lastNameField.getText());
        
        if(mName.find() && mLastName.find()) return true;
        
        JOptionPane.showMessageDialog(this, "Ingresa nombres y apellidos válidos", "Nombres inválidos", JOptionPane.WARNING_MESSAGE);
        return false;
    }//end verifyNamesFormat
    
    public boolean verifyUsernameFormat(){
        String usernameRegex = "^[a-zA-Z].*";
        
        Pattern namesPattern = Pattern.compile(usernameRegex);
        Matcher m = namesPattern.matcher(usernameField.getText());
        
        if(m.find()) return true;
        
        JOptionPane.showMessageDialog(this, "Ingresa nombres y apellidos válidos", "Nombres inválidos", JOptionPane.WARNING_MESSAGE);
        return false;
    }//end verifyNamesFormat
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton joinButton;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField mailField;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
