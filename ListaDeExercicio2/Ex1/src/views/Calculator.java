package views;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;

public class Calculator extends javax.swing.JFrame {

    private boolean isPressEqual;
    private boolean isPressOperation;

    public Calculator() {
        initComponents();
        
        this.isPressEqual = false;
        this.isPressOperation = false;
    }

    private void clearScreen() {
        jtfScreen.setText("");
    }

    private String executeOperation(String op) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");

        try {
            Object r = engine.eval(op);
            return r.toString();
        } catch (ScriptException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Erro ao executar operação", "Erro Cod 1", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Erro ao executar operação", "Erro Cod 2", JOptionPane.WARNING_MESSAGE);
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfScreen = new javax.swing.JTextField();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jbDivision = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jbMultiplication = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jbSubtract = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jbEquals = new javax.swing.JButton();
        jbAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setName("calculator"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jtfScreen.setEditable(false);
        jtfScreen.setBackground(new java.awt.Color(255, 255, 255));
        jtfScreen.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jtfScreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfScreen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        jtfScreen.setCaretColor(new java.awt.Color(51, 153, 255));

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

        jbDivision.setBackground(new java.awt.Color(36, 22, 84));
        jbDivision.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jbDivision.setForeground(new java.awt.Color(255, 255, 255));
        jbDivision.setText("/");
        jbDivision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbDivision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbDivision.setFocusable(false);
        jbDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDivisionActionPerformed(evt);
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

        jbMultiplication.setBackground(new java.awt.Color(36, 22, 84));
        jbMultiplication.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jbMultiplication.setForeground(new java.awt.Color(255, 255, 255));
        jbMultiplication.setText("*");
        jbMultiplication.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMultiplication.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMultiplication.setFocusable(false);
        jbMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultiplicationActionPerformed(evt);
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

        jbSubtract.setBackground(new java.awt.Color(36, 22, 84));
        jbSubtract.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jbSubtract.setForeground(new java.awt.Color(255, 255, 255));
        jbSubtract.setText("-");
        jbSubtract.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSubtract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSubtract.setFocusable(false);
        jbSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubtractActionPerformed(evt);
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

        jbEquals.setBackground(new java.awt.Color(36, 22, 84));
        jbEquals.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jbEquals.setForeground(new java.awt.Color(255, 255, 255));
        jbEquals.setText("=");
        jbEquals.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEquals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEquals.setFocusable(false);
        jbEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEqualsActionPerformed(evt);
            }
        });

        jbAdd.setBackground(new java.awt.Color(36, 22, 84));
        jbAdd.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jbAdd.setForeground(new java.awt.Color(255, 255, 255));
        jbAdd.setText("+");
        jbAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdd.setFocusable(false);
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfScreen)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEqualsActionPerformed
        if (!this.isPressOperation) {
            String operation = jtfScreen.getText();
            String res = this.executeOperation(operation);
            
            if (res == null) {
                jtfScreen.setText("Erro!");
                this.isPressEqual = true;
            } else if (res.equals("Infinity")) {
                jtfScreen.setText("Erro de sintaxe");
                this.isPressEqual = true;
            } else {
                jtfScreen.setText(res);
                this.isPressEqual = true;
            }
        } else {
            jtfScreen.setText("Erro de operação");
            this.isPressEqual = true;
        }
    }//GEN-LAST:event_jbEqualsActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        if (this.isPressEqual) {
            this.clearScreen();
            jtfScreen.setText("1");
            this.isPressEqual = false;
            this.isPressOperation = false;
        } else {
            jtfScreen.setText(jtfScreen.getText() + "1");
            this.isPressOperation = false;
        }
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        if (this.isPressEqual) {
            this.clearScreen();
            jtfScreen.setText("2");
            this.isPressEqual = false;
            this.isPressOperation = false;
        } else {
            jtfScreen.setText(jtfScreen.getText() + "2");
            this.isPressOperation = false;
        }
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        if (this.isPressEqual) {
            this.clearScreen();
            jtfScreen.setText("3");
            this.isPressEqual = false;
            this.isPressOperation = false;
        } else {
            jtfScreen.setText(jtfScreen.getText() + "3");
            this.isPressOperation = false;
        }
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        if (this.isPressEqual) {
            this.clearScreen();
            jtfScreen.setText("4");
            this.isPressEqual = false;
            this.isPressOperation = false;
        } else {
            jtfScreen.setText(jtfScreen.getText() + "4");
            this.isPressOperation = false;
        }
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        if (this.isPressEqual) {
            this.clearScreen();
            jtfScreen.setText("5");
            this.isPressEqual = false;
            this.isPressOperation = false;
        } else {
            jtfScreen.setText(jtfScreen.getText() + "5");
            this.isPressOperation = false;
        }
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        if (this.isPressEqual) {
            this.clearScreen();
            jtfScreen.setText("6");
            this.isPressEqual = false;
            this.isPressOperation = false;
        } else {
            jtfScreen.setText(jtfScreen.getText() + "6");
            this.isPressOperation = false;
        }
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        if (this.isPressEqual) {
            this.clearScreen();
            jtfScreen.setText("7");
            this.isPressEqual = false;
            this.isPressOperation = false;
        } else {
            jtfScreen.setText(jtfScreen.getText() + "7");
            this.isPressOperation = false;
        }
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        if (this.isPressEqual) {
            this.clearScreen();
            jtfScreen.setText("8");
            this.isPressEqual = false;
            this.isPressOperation = false;
        } else {
            jtfScreen.setText(jtfScreen.getText() + "8");
            this.isPressOperation = false;
        }
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        if (this.isPressEqual) {
            this.clearScreen();
            jtfScreen.setText("9");
            this.isPressEqual = false;
            this.isPressOperation = false;
        } else {
            jtfScreen.setText(jtfScreen.getText() + "9");
            this.isPressOperation = false;
        }
    }//GEN-LAST:event_jb9ActionPerformed

    private void jbDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDivisionActionPerformed
        if (!this.isPressOperation && !(jtfScreen.getText().length() == 0)) {
            jtfScreen.setText(jtfScreen.getText() + "/");
            this.isPressOperation = true;
            this.isPressEqual = false;
        }
    }//GEN-LAST:event_jbDivisionActionPerformed

    private void jbMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiplicationActionPerformed
        if (!this.isPressOperation && !(jtfScreen.getText().length() == 0)) {
            jtfScreen.setText(jtfScreen.getText() + "*");
            this.isPressOperation = true;
            this.isPressEqual = false;
        }
    }//GEN-LAST:event_jbMultiplicationActionPerformed

    private void jbSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubtractActionPerformed
        if (!this.isPressOperation) {
            jtfScreen.setText(jtfScreen.getText() + "-");
            this.isPressOperation = true;
            this.isPressEqual = false;
        }
    }//GEN-LAST:event_jbSubtractActionPerformed

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        if (!this.isPressOperation && !(jtfScreen.getText().length() == 0)) {
            jtfScreen.setText(jtfScreen.getText() + "+");
            this.isPressOperation = true;
            this.isPressEqual = false;
        }
    }//GEN-LAST:event_jbAddActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        if (this.isPressEqual) {
            this.clearScreen();
            jtfScreen.setText("0");
            this.isPressEqual = false;
            this.isPressOperation = false;
        } else {
            jtfScreen.setText(jtfScreen.getText() + "0");
            this.isPressOperation = false;
        }
    }//GEN-LAST:event_jb0ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDivision;
    private javax.swing.JButton jbEquals;
    private javax.swing.JButton jbMultiplication;
    private javax.swing.JButton jbSubtract;
    private javax.swing.JTextField jtfScreen;
    // End of variables declaration//GEN-END:variables
}
