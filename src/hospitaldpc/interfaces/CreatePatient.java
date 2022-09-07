package hospitaldpc.interfaces;

import hospitaldpc.managers.PatientsManager;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CreatePatient extends javax.swing.JDialog {

    private PatientsManager manager;

    public CreatePatient(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.manager = new PatientsManager();
        this.setLocationRelativeTo(parent);
        this.setResizable(false);
    }//end CreatePatient

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opSexGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tempField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        opOther = new javax.swing.JRadioButton();
        opMasculine = new javax.swing.JRadioButton();
        opFemenine = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        monthMenu = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        yearSpinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        maritalMenu = new javax.swing.JComboBox<>();
        daySpinner = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        weightField = new javax.swing.JSpinner();
        heightField = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tempSlider = new javax.swing.JSlider();
        nameField = new javax.swing.JTextField();
        oxiField = new javax.swing.JTextField();
        oxiSlider = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        descField = new javax.swing.JTextArea();
        phoneField = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        createButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/AddButton.png"))); // NOI18N
        createButton.setBorder(null);
        createButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 290, 40));

        cancelButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/CancelButton.png"))); // NOI18N
        cancelButton.setBorder(null);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 290, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/AddSectionLogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        lastNameField.setBackground(new java.awt.Color(225, 225, 225));
        lastNameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 300, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 80, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("año");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 30, 20));

        tempField.setEditable(false);
        tempField.setBackground(new java.awt.Color(204, 204, 204));
        tempField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tempField.setForeground(new java.awt.Color(102, 102, 102));
        tempField.setText("32");
        jPanel1.add(tempField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 120, 40, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, 30));

        opOther.setBackground(new java.awt.Color(244, 245, 249));
        opSexGroup.add(opOther);
        opOther.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        opOther.setForeground(new java.awt.Color(51, 51, 51));
        opOther.setText("Otro");
        jPanel1.add(opOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, 30));

        opMasculine.setBackground(new java.awt.Color(244, 245, 249));
        opSexGroup.add(opMasculine);
        opMasculine.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        opMasculine.setForeground(new java.awt.Color(51, 51, 51));
        opMasculine.setText("Masculino");
        jPanel1.add(opMasculine, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, 30));

        opFemenine.setBackground(new java.awt.Color(244, 245, 249));
        opSexGroup.add(opFemenine);
        opFemenine.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        opFemenine.setForeground(new java.awt.Color(51, 51, 51));
        opFemenine.setText("Femenino");
        jPanel1.add(opFemenine, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 70, 30));

        monthMenu.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        monthMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selec. mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(monthMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 130, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Estado Marital:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 120, 30));

        yearSpinner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        yearSpinner.setModel(new javax.swing.SpinnerNumberModel(1920, 1920, 2021, 1));
        jPanel1.add(yearSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 80, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("F. Nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 30));

        maritalMenu.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        maritalMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar estado marital", "Soltero", "Casado", "Divorciado", "Unión libre", "Separado", "Viudo" }));
        jPanel1.add(maritalMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 300, 30));

        daySpinner.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        daySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanel1.add(daySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 70, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("(kg)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 40, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("mes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 30, 20));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Dirección:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 260, 80, 30));

        addressField.setBackground(new java.awt.Color(225, 225, 225));
        addressField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addressField.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 270, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Descripción:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, -1, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Email:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 190, 70, 30));

        emailField.setBackground(new java.awt.Color(225, 225, 225));
        emailField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 270, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Peso:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 40, 30));

        weightField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        weightField.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 500.0d, 1.0d));
        jPanel1.add(weightField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 100, 30));

        heightField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        heightField.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 250.0d, 1.0d));
        jPanel1.add(heightField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 100, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Altura:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 340, 70, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("día");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 30, 20));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("(cm)");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 50, 20));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Teléfono:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 70, 30));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Temperatura:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 110, 30));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Oximetría:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 110, 30));

        tempSlider.setBackground(new java.awt.Color(244, 245, 249));
        tempSlider.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tempSlider.setForeground(new java.awt.Color(102, 102, 102));
        tempSlider.setMajorTickSpacing(5);
        tempSlider.setMaximum(50);
        tempSlider.setMinimum(25);
        tempSlider.setMinorTickSpacing(5);
        tempSlider.setPaintLabels(true);
        tempSlider.setPaintTicks(true);
        tempSlider.setValue(32);
        tempSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tempSliderStateChanged(evt);
            }
        });
        jPanel1.add(tempSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 240, 50));

        nameField.setBackground(new java.awt.Color(225, 225, 225));
        nameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 300, 30));

        oxiField.setEditable(false);
        oxiField.setBackground(new java.awt.Color(204, 204, 204));
        oxiField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        oxiField.setForeground(new java.awt.Color(102, 102, 102));
        oxiField.setText("90");
        jPanel1.add(oxiField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 190, 40, 30));

        oxiSlider.setBackground(new java.awt.Color(244, 245, 249));
        oxiSlider.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        oxiSlider.setForeground(new java.awt.Color(102, 102, 102));
        oxiSlider.setMajorTickSpacing(10);
        oxiSlider.setMinimum(40);
        oxiSlider.setMinorTickSpacing(10);
        oxiSlider.setPaintLabels(true);
        oxiSlider.setPaintTicks(true);
        oxiSlider.setValue(90);
        oxiSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                oxiSliderStateChanged(evt);
            }
        });
        jPanel1.add(oxiSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 180, 240, 50));

        jScrollPane1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        descField.setColumns(20);
        descField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        descField.setRows(5);
        jScrollPane1.setViewportView(descField);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 280, 180));

        phoneField.setBackground(new java.awt.Color(225, 225, 225));
        phoneField.setForeground(new java.awt.Color(51, 51, 51));
        try {
            phoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        phoneField.setToolTipText("");
        phoneField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 270, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraphResources/Background.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 584));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        this.createPatient();
    }//GEN-LAST:event_createButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void tempSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tempSliderStateChanged
        tempField.setText(Integer.toString(tempSlider.getValue()));
    }//GEN-LAST:event_tempSliderStateChanged

    private void oxiSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_oxiSliderStateChanged
        oxiField.setText(Integer.toString(oxiSlider.getValue()));
    }//GEN-LAST:event_oxiSliderStateChanged

    public void createPatient() {
        if(verifyFullFields() && verifyEmailFormat() && verifyPhoneFormat() && verifyNamesFormat()){
            String[] data = new String[13];
            String birthdate = this.yearSpinner.getValue() + "-" + (this.monthMenu.getSelectedIndex()) + "-" + this.daySpinner.getValue();
            String sex = "";

            if(opMasculine.isSelected()){
                sex = "M";
            }//end if
            else if(opFemenine.isSelected()){
                sex = "F";
            }//end else if
            else if(opOther.isSelected()){
                sex = "O";
            }//end else if

            data[0] = this.nameField.getText();
            data[1] = this.lastNameField.getText();
            data[2] = sex;
            data[3] = this.maritalMenu.getSelectedItem().toString();
            data[4] = birthdate;
            data[5] = this.addressField.getText();
            data[6] = this.phoneField.getText();
            data[7] = this.emailField.getText();
            data[8] = this.heightField.getValue().toString();
            data[9] = this.weightField.getValue().toString();
            data[10] = this.tempField.getText();
            data[11] = this.oxiField.getText();
            data[12] = this.descField.getText();

            try {
                if (this.manager.createPatient(data) > 0) {
                    JOptionPane.showMessageDialog(this, "Se ha insertado exitosamente el paciente.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                    int decision = JOptionPane.showConfirmDialog(this, "¿Desea Agregar Otro Paciente?", "¿Agregar nuevo paciente?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (decision == 0) {
                        this.cleanFields();
                    }//end if sí decide crear otro.
                    else {
                        this.dispose();
                    }//end if decide que no se agregue
                }//end if sí inserta
            }//end try 
            catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Hubo un error al insertar el paciente.\nERROR: " + ex.getMessage());
            }//end catch exception
        }//end if validaciones
        
    }//end createPatient

    public void cleanFields() {
        this.nameField.setText("");
        this.lastNameField.setText("");
        this.opSexGroup.clearSelection();
        this.maritalMenu.setSelectedIndex(0);
        this.daySpinner.setValue(1);
        this.monthMenu.setSelectedIndex(0);
        this.yearSpinner.setValue(1920);
        this.addressField.setText("");
        this.phoneField.setText("");
        this.emailField.setText("");
        this.heightField.setValue(0.0);
        this.weightField.setValue(0.0);
        this.tempSlider.setValue(32);
        this.tempField.setText("32");
        this.oxiSlider.setValue(90);
        this.oxiField.setText("90");
        this.descField.setText("");
    }//end cleanFields
    
    public boolean verifyFullFields(){
        if(this.nameField.getText().equals("") || this.lastNameField.getText().equals("") || 
                this.opSexGroup.getSelection() == null || (int)this.maritalMenu.getSelectedIndex() == 0 ||
                (int)this.monthMenu.getSelectedIndex() == 0 ||
                this.addressField.getText().equals("") || this.phoneField.getText().equals("") || this.emailField.getText().equals("") ||
                (double)this.heightField.getValue() <= 0.0 || (double)this.weightField.getValue() <= 0.0 || 
                this.descField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Verifica que todos los campos se encuentren llenos...", "Faltan campos por llenar", JOptionPane.WARNING_MESSAGE);
            return false;
        }        
        return true;        
    }//end verifyFullFields
    
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
        Matcher m = emailPattern.matcher(emailField.getText());
        
        if(m.find()) return true;
        
        JOptionPane.showMessageDialog(this, "Ingresa una dirección de correo válida", "Correo inválido", JOptionPane.WARNING_MESSAGE);
        return false;
    }//end verifyEmailFormat
    
    public boolean verifyPhoneFormat(){
        String phoneRegex = "^\\(([0-9]){3}\\)(([0-9]){3})-(([0-9]){4})";
        
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher m = phonePattern.matcher(phoneField.getText());
        
        if(m.find()) return true;
        
        JOptionPane.showMessageDialog(this, "Ingresa un número de teléfono válido\nFormato: (000)000-0000", "Número de teléfono inválido", JOptionPane.WARNING_MESSAGE);
        return false;
    }//end verifyPhoneFormat
    
    public boolean verifyNamesFormat(){
        String namesRegex = "^([a-zA-Z]+\\s)*[a-zA-Z]+$";
        
        Pattern namesPattern = Pattern.compile(namesRegex);
        Matcher mName = namesPattern.matcher(nameField.getText());
        Matcher mLastName = namesPattern.matcher(lastNameField.getText());
        
        if(mName.find() && mLastName.find()) return true;
        
        JOptionPane.showMessageDialog(this, "Ingresa nombres y apellidos válidos", "Nombres inválidos", JOptionPane.WARNING_MESSAGE);
        return false;
    }//end verifyNamesFormat
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createButton;
    private javax.swing.JSpinner daySpinner;
    private javax.swing.JTextArea descField;
    private javax.swing.JTextField emailField;
    private javax.swing.JSpinner heightField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JComboBox<String> maritalMenu;
    private javax.swing.JComboBox<String> monthMenu;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton opFemenine;
    private javax.swing.JRadioButton opMasculine;
    private javax.swing.JRadioButton opOther;
    private javax.swing.ButtonGroup opSexGroup;
    private javax.swing.JTextField oxiField;
    private javax.swing.JSlider oxiSlider;
    private javax.swing.JFormattedTextField phoneField;
    private javax.swing.JTextField tempField;
    private javax.swing.JSlider tempSlider;
    private javax.swing.JSpinner weightField;
    private javax.swing.JSpinner yearSpinner;
    // End of variables declaration//GEN-END:variables
}
