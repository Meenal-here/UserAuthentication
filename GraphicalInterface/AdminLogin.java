package GraphicalInterface;
import DataAccessObject.*;
import javax.swing.JOptionPane;
import model.*;

public class AdminLogin extends javax.swing.JFrame {
    UserLoginFormBean data = null;
    String username;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminLogin.class.getName());

    public AdminLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
     public AdminLogin(String UserName) {
        initComponents();
        setLocationRelativeTo(null);
        username = UserName;
        data = new UserLoginFormAction().searchRecords(UserName);
        txtUserName.setText(data.getUserName());
        txtEmail.setText(data.getEmail());
        txtContactNumber.setText(String.valueOf(data.getContactName()));
                if(data.getGender().equalsIgnoreCase("male"))
                {
                    rdMale.setSelected(true);
                }
                
                if(data.getGender().equalsIgnoreCase("female"))
                {
                    rdFemale.setSelected(true);
                }
                if(data.getGender().equalsIgnoreCase("other"))
                {
                    rdOther.setSelected(true);
                }
                if(data.getGender().equalsIgnoreCase("rather not say"))
                {
                    rdNotSay.setSelected(true);
                }
                          
            cbSecurityKey.setSelectedItem(data.getSecurityKey());
            txtSecurityAnswer.setText(data.getSecurityAnswer());
            txtPassword.setText(data.getPassword());
            txtConfirmPassword.setText(data.getPassword());
            txtRoleType.setText(data.getRoletype());
        
    }
    
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        rdOther = new javax.swing.JRadioButton();
        rdNotSay = new javax.swing.JRadioButton();
        cbSecurityKey = new javax.swing.JComboBox<>();
        txtSecurityAnswer = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtRoleType = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnUpdateRecord = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jbConfirmPassword = new javax.swing.JCheckBox();
        jbPassword = new javax.swing.JCheckBox();
        btnChangePassword = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        jTextField5.setText("jTextField5");

        jFormattedTextField1.setText("ewj");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 3));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN LOGIN");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Username");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Contact Number");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Email");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Gender");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Security key");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Security Answer");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Password");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Confirm Password");

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 51, 204));
        btnSave.setText("SAVE RECORD");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        rdMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdMale);
        rdMale.setText("male");

        rdFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdFemale);
        rdFemale.setText("female");

        rdOther.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdOther);
        rdOther.setText("other");

        rdNotSay.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdNotSay);
        rdNotSay.setText("rather not say");

        cbSecurityKey.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your pet name?", "What was the name of your first school?", "Who was your school best friend?", "Who was your favourite teaacher in school?" }));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Role Type");

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 51, 204));
        btnSearch.setText("SEARCH RECORD");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdateRecord.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUpdateRecord.setForeground(new java.awt.Color(0, 51, 204));
        btnUpdateRecord.setText("UPDATE RECORD");
        btnUpdateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRecordActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 51, 204));
        btnDelete.setText("DELETE RECORD");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jbConfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        jbConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmPasswordActionPerformed(evt);
            }
        });

        jbPassword.setBackground(new java.awt.Color(255, 255, 255));
        jbPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPasswordActionPerformed(evt);
            }
        });

        btnChangePassword.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 51, 51));
        btnChangePassword.setText("CHANGE PASSWORD");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdateRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(rdOther, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdNotSay, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbSecurityKey, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSecurityAnswer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRoleType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPassword)
                            .addComponent(jbConfirmPassword))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(437, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rdMale)
                            .addComponent(rdFemale)
                            .addComponent(rdOther)
                            .addComponent(rdNotSay))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbSecurityKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSecurityAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbConfirmPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtRoleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnChangePassword)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jLabel4)
                    .addContainerGap(471, Short.MAX_VALUE)))
        );

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try
       { 
        UserLoginFormBean data = new UserLoginFormAction().searchRecords(txtUserName.getText());
        if(data != null)
        {
            txtUserName.setText(data.getUserName());
            txtEmail.setText(data.getEmail());
            txtContactNumber.setText(String.valueOf(data.getContactName()));
                if(data.getGender().equalsIgnoreCase("male"))
                {
                    rdMale.setSelected(true);
                }
                
                if(data.getGender().equalsIgnoreCase("female"))
                {
                    rdFemale.setSelected(true);
                }
                if(data.getGender().equalsIgnoreCase("other"))
                {
                    rdOther.setSelected(true);
                }
                if(data.getGender().equalsIgnoreCase("rather not say"))
                {
                    rdNotSay.setSelected(true);
                }
                          
            cbSecurityKey.setSelectedItem(data.getSecurityKey());
            txtSecurityAnswer.setText(data.getSecurityAnswer());
            txtPassword.setText(data.getPassword());
            txtConfirmPassword.setText(data.getPassword());
            txtRoleType.setText(data.getRoletype());
            
                
        }
        else
        {
            JOptionPane.showMessageDialog(null,"RECORD NOT FOUND","NO RECORD FOUND",JOptionPane.ERROR_MESSAGE);
        }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
     
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRecordActionPerformed
        try
        {   UserLoginFormBean data = new UserLoginFormBean();
        
            String gender = "";
            data.setUserName(txtUserName.getText());
            data.setEmail(txtEmail.getText());
            data.setContactName(Long.parseLong(txtContactNumber.getText()));

        if (rdMale.isSelected()) {
            gender = rdMale.getText();
        } else if (rdFemale.isSelected()) {
            gender = rdFemale.getText();
        } else if (rdOther.isSelected()) {
            gender = rdOther.getText();
        } else if (rdNotSay.isSelected()) {
            gender = rdNotSay.getText();
        }

        data.setGender(gender);
        data.setSecurityKey(String.valueOf(cbSecurityKey.getSelectedItem()));
        data.setSecurityAnswer(txtSecurityAnswer.getText());
        data.setRoletype(txtRoleType.getText());

        if (txtPassword.getText().equals(txtConfirmPassword.getText())) {
            data.setPassword(txtPassword.getText());

            int result = JOptionPane.showConfirmDialog(null, "WANT TO UPDATE THE DATA?", "UPDATE RECORD", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) 
            {
                    boolean saved = new UserLoginFormAction().updateRecords(data);
                    if (saved) {
                        JOptionPane.showMessageDialog(null, "Record updates...");
                        // Clear fields
                        txtUserName.setText("");
                        txtEmail.setText("");
                        txtContactNumber.setText("");
                        cbSecurityKey.setSelectedIndex(0);
                        txtSecurityAnswer.setText("");
                        txtPassword.setText("");
                        txtConfirmPassword.setText("");
                        rdMale.setSelected(false);
                        rdFemale.setSelected(false);
                        rdOther.setSelected(false);
                        rdNotSay.setSelected(false);
                        txtRoleType.setText("");
                        txtUserName.grabFocus();
                      } 
                    else 
                     {
                        JOptionPane.showMessageDialog(null, "Record not updated...");
                     }
             }
            else 
            {
                JOptionPane.showMessageDialog(null, "Data not updated", "Not updated", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "ERROR", "PASSWORD NOT MATCHING", JOptionPane.ERROR_MESSAGE);
        }

    } 
    catch(Exception ex)
    {
        System.out.println(ex);
        
    }      
            
    }//GEN-LAST:event_btnUpdateRecordActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try
        {   int result = JOptionPane.showConfirmDialog(null,"WANT TO DELETE THE DATA?","SAVE RECORD",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
           if(result == JOptionPane.YES_OPTION) 
           { if(new UserLoginFormAction().deleteRecords(txtUserName.getText()))
            {
                JOptionPane.showMessageDialog(null,"Record deleted...");
                txtUserName.setText("");
                txtEmail.setText("");
                txtContactNumber.setText("");
                
                rdMale.setSelected(false);
                rdFemale.setSelected(false);
                rdOther.setSelected(false);
                rdNotSay.setSelected(false);
                cbSecurityKey.setSelectedItem(null);
                txtSecurityAnswer.setText("");
                txtPassword.setText("");
                txtConfirmPassword.setText("");
                txtRoleType.setText("");
                        
                
                txtUserName.grabFocus();
            }
            else
            {
                 JOptionPane.showMessageDialog(null,"Record not deleted...");
            }
           }  
           else
           {
               JOptionPane.showMessageDialog(null, "Data not deleted","not deleted",JOptionPane.INFORMATION_MESSAGE);
           }
        }
        catch(Exception e)
        {
            
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try 
    {
        UserLoginFormBean data = new UserLoginFormBean();
        String gender = "";

        data.setUserName(txtUserName.getText());
        data.setEmail(txtEmail.getText());
        data.setContactName(Long.parseLong(txtContactNumber.getText()));

        if (rdMale.isSelected()) {
            gender = rdMale.getText();
        } else if (rdFemale.isSelected()) {
            gender = rdFemale.getText();
        } else if (rdOther.isSelected()) {
            gender = rdOther.getText();
        } else if (rdNotSay.isSelected()) {
            gender = rdNotSay.getText();
        }

        data.setGender(gender);
        data.setSecurityKey(String.valueOf(cbSecurityKey.getSelectedItem()));
        data.setSecurityAnswer(txtSecurityAnswer.getText());
        data.setRoletype(txtRoleType.getText());

        if (txtPassword.getText().equals(txtConfirmPassword.getText())) {
            data.setPassword(txtPassword.getText());

            int result = JOptionPane.showConfirmDialog(null, "WANT TO SAVE THE DATA?", "SAVE RECORD", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) 
            {
                    boolean saved = new UserLoginFormAction().insertRecords(data);
                    if (saved) {
                        JOptionPane.showMessageDialog(null, "Record Saved...");
                        // Clear fields
                        txtUserName.setText("");
                        txtEmail.setText("");
                        txtContactNumber.setText("");
                        cbSecurityKey.setSelectedIndex(0);
                        txtSecurityAnswer.setText("");
                        txtPassword.setText("");
                        txtConfirmPassword.setText("");
                        rdMale.setSelected(false);
                        rdFemale.setSelected(false);
                        rdOther.setSelected(false);
                        rdNotSay.setSelected(false);
                        txtRoleType.setText("");
                        txtUserName.grabFocus();
                      } 
                    else 
                     {
                        JOptionPane.showMessageDialog(null, "Record not Saved...");
                     }
             }
            else 
            {
                JOptionPane.showMessageDialog(null, "Data not Saved", "Not Saved", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "ERROR", "PASSWORD NOT MATCHING", JOptionPane.ERROR_MESSAGE);
        }

    } 
    catch(Exception ex)
    {
        System.out.println(ex);
        
    }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jbConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmPasswordActionPerformed
        if (jbConfirmPassword.isSelected()) {
            txtConfirmPassword.setEchoChar((char) 0); // Show characters
        } else {
            txtConfirmPassword.setEchoChar('*'); // Mask characters
        }
    }//GEN-LAST:event_jbConfirmPasswordActionPerformed

    private void jbPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPasswordActionPerformed
        if (jbPassword.isSelected()) {
                txtPassword.setEchoChar((char) 0); // Show characters
            } else {
                txtPassword.setEchoChar('*'); // Mask characters
            }
    
    }//GEN-LAST:event_jbPasswordActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        ChangePassword obj = new ChangePassword(username);
        obj.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnChangePasswordActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AdminLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateRecord;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbSecurityKey;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JCheckBox jbConfirmPassword;
    private javax.swing.JCheckBox jbPassword;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JRadioButton rdNotSay;
    private javax.swing.JRadioButton rdOther;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRoleType;
    private javax.swing.JTextField txtSecurityAnswer;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

