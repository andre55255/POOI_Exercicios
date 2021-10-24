package views;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Gui extends javax.swing.JFrame {
    
    private boolean isFocusJtfAgency;
    private boolean isFocusJtfAccount;
    private boolean isFocusJtfPassword;
    private String getDigit;

    public Gui() {
        initComponents();
    }
    
    private void handleInputs(String s) {
        if (this.isFocusJtfAgency) {
            jtfAgency.setText(jtfAgency.getText() + s);
        } else if (this.isFocusJtfAccount) {
            jtfAccount.setText(jtfAccount.getText() + s);
        } else if (this.isFocusJtfPassword) {
            jtfPassword.setText(String.valueOf(jtfPassword.getPassword()) + s);
        }
    }
    
    private void clearInputs() {
        jtfAgency.setText("");
        jtfAccount.setText("");
        jtfPassword.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfPassword = new javax.swing.JPasswordField();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jbSend = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jtfAgency = new javax.swing.JTextField();
        jtfAccount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco");
        setName("gui"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 22, 84));
        jLabel1.setText("Agência");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 22, 84));
        jLabel2.setText("Conta");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 22, 84));
        jLabel3.setText("Senha");

        jtfPassword.setEditable(false);
        jtfPassword.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfPassword.setForeground(new java.awt.Color(36, 22, 84));
        jtfPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfPasswordFocusLost(evt);
            }
        });

        jb1.setBackground(new java.awt.Color(36, 22, 84));
        jb1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jb1.setForeground(new java.awt.Color(255, 255, 255));
        jb1.setText("1");
        jb1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb1.setFocusable(false);
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setBackground(new java.awt.Color(36, 22, 84));
        jb2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jb2.setForeground(new java.awt.Color(255, 255, 255));
        jb2.setText("2");
        jb2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb2.setFocusable(false);
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.setBackground(new java.awt.Color(36, 22, 84));
        jb3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jb3.setForeground(new java.awt.Color(255, 255, 255));
        jb3.setText("3");
        jb3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb3.setFocusable(false);
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb4.setBackground(new java.awt.Color(36, 22, 84));
        jb4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jb4.setForeground(new java.awt.Color(255, 255, 255));
        jb4.setText("4");
        jb4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb4.setFocusable(false);
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb5.setBackground(new java.awt.Color(36, 22, 84));
        jb5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jb5.setForeground(new java.awt.Color(255, 255, 255));
        jb5.setText("5");
        jb5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb5.setFocusable(false);
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb6.setBackground(new java.awt.Color(36, 22, 84));
        jb6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jb6.setForeground(new java.awt.Color(255, 255, 255));
        jb6.setText("6");
        jb6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb6.setFocusable(false);
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb7.setBackground(new java.awt.Color(36, 22, 84));
        jb7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jb7.setForeground(new java.awt.Color(255, 255, 255));
        jb7.setText("7");
        jb7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb7.setFocusable(false);
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb8.setBackground(new java.awt.Color(36, 22, 84));
        jb8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jb8.setForeground(new java.awt.Color(255, 255, 255));
        jb8.setText("8");
        jb8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb8.setFocusable(false);
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb9.setBackground(new java.awt.Color(36, 22, 84));
        jb9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jb9.setForeground(new java.awt.Color(255, 255, 255));
        jb9.setText("9");
        jb9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb9.setFocusable(false);
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jbSend.setBackground(new java.awt.Color(36, 16, 144));
        jbSend.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jbSend.setForeground(new java.awt.Color(255, 255, 255));
        jbSend.setText("Enviar");
        jbSend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSend.setFocusable(false);
        jbSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSendActionPerformed(evt);
            }
        });

        jb0.setBackground(new java.awt.Color(36, 22, 84));
        jb0.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jb0.setForeground(new java.awt.Color(255, 255, 255));
        jb0.setText("0");
        jb0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb0.setFocusable(false);
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jtfAgency.setEditable(false);
        jtfAgency.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfAgency.setForeground(new java.awt.Color(36, 22, 84));
        jtfAgency.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfAgency.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfAgencyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfAgencyFocusLost(evt);
            }
        });

        jtfAccount.setEditable(false);
        jtfAccount.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfAccount.setForeground(new java.awt.Color(36, 22, 84));
        jtfAccount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfAccount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfAccountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfAccountFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPassword)
                            .addComponent(jtfAgency)
                            .addComponent(jtfAccount, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSend, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSend, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        this.handleInputs("1");
    }//GEN-LAST:event_jb1ActionPerformed

    private void jtfAgencyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfAgencyFocusGained
        this.isFocusJtfAgency = true;
        this.isFocusJtfAccount = false;
        this.isFocusJtfPassword = false;
        jtfAgency.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jtfAgencyFocusGained

    private void jtfAgencyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfAgencyFocusLost
        this.isFocusJtfAgency = false;
        jtfAgency.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_jtfAgencyFocusLost

    private void jtfAccountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfAccountFocusGained
        this.isFocusJtfAgency = false;
        this.isFocusJtfAccount = true;
        this.isFocusJtfPassword = false;
        jtfAccount.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jtfAccountFocusGained

    private void jtfAccountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfAccountFocusLost
        this.isFocusJtfAccount = false;
        jtfAccount.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_jtfAccountFocusLost

    private void jtfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPasswordFocusGained
        this.isFocusJtfAgency = false;
        this.isFocusJtfAccount = false;
        this.isFocusJtfPassword = true;
        jtfPassword.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jtfPasswordFocusGained

    private void jtfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPasswordFocusLost
        this.isFocusJtfPassword = false;
        jtfPassword.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_jtfPasswordFocusLost

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        this.handleInputs("2");
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        this.handleInputs("3");
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        this.handleInputs("4");
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        this.handleInputs("5");
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        this.handleInputs("6");
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        this.handleInputs("7");
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        this.handleInputs("8");
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        this.handleInputs("9");
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        this.handleInputs("0");
    }//GEN-LAST:event_jb0ActionPerformed

    private void jbSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSendActionPerformed
        String agency = jtfAgency.getText();
        String account = jtfAccount.getText();
        String password = String.valueOf(jtfPassword.getPassword());
        
        if (agency.equals("10019") && account.equals("14141413") && password.equals("123456")) {
            JOptionPane.showMessageDialog(this, "Conta autenticada com sucesso!");
            this.clearInputs();
        } else {
            JOptionPane.showMessageDialog(this, "Conta não encontrada, tente novamente", "Erro de autenticação", JOptionPane.WARNING_MESSAGE);
            this.clearInputs();
        }
    }//GEN-LAST:event_jbSendActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Gui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbSend;
    private javax.swing.JTextField jtfAccount;
    private javax.swing.JTextField jtfAgency;
    private javax.swing.JPasswordField jtfPassword;
    // End of variables declaration//GEN-END:variables
}
