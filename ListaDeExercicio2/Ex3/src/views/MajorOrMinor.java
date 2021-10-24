package views;

import javax.swing.JOptionPane;

public class MajorOrMinor extends javax.swing.JFrame {
    
    private double num1;
    private double num2;

    public MajorOrMinor() {
        initComponents();
    }
    
    private void getInputs() {
        try {
            this.num1 = Double.parseDouble(jtfNumber1.getText());
            this.num2 = Double.parseDouble(jtfNumber2.getText());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Número inválido", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    private int compareNumbers(double n1, double n2) {
        // 0 - Empate, 1 - n1 Maior, 2 - n2 Maior
        int result = 0;
        
        if (n1 > n2) {
            result = 1;
        } else if (n2 > n1) {
            result = 2;
        } else {
            result = 0;
        }
        
        return result;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbMajor = new javax.swing.JButton();
        jbMinor = new javax.swing.JButton();
        jtfNumber1 = new javax.swing.JTextField();
        jtfNumber2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maior ou menor?");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jbMajor.setBackground(new java.awt.Color(36, 22, 84));
        jbMajor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jbMajor.setForeground(new java.awt.Color(255, 255, 255));
        jbMajor.setText("Maior");
        jbMajor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMajor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMajor.setFocusable(false);
        jbMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMajorActionPerformed(evt);
            }
        });

        jbMinor.setBackground(new java.awt.Color(36, 22, 84));
        jbMinor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jbMinor.setForeground(new java.awt.Color(255, 255, 255));
        jbMinor.setText("Menor");
        jbMinor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMinor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMinor.setFocusable(false);
        jbMinor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMinorActionPerformed(evt);
            }
        });

        jtfNumber1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfNumber1.setForeground(new java.awt.Color(51, 51, 51));
        jtfNumber1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfNumber1.setCaretColor(new java.awt.Color(51, 51, 51));

        jtfNumber2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfNumber2.setForeground(new java.awt.Color(51, 51, 51));
        jtfNumber2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfNumber2.setCaretColor(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMinor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jtfNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMinor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
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

    private void jbMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMajorActionPerformed
        this.getInputs();
        int result = this.compareNumbers(this.num1, this.num2);
        
        if (result == 0) {
            JOptionPane.showMessageDialog(this, "Números iguais");
        } else if (result == 1) {
            JOptionPane.showMessageDialog(this, String.format("Maior número: %f", this.num1));
        } else {
            JOptionPane.showMessageDialog(this, String.format("Maior número: %f", this.num2));
        }
    }//GEN-LAST:event_jbMajorActionPerformed

    private void jbMinorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMinorActionPerformed
        this.getInputs();
        int result = this.compareNumbers(this.num1, this.num2);
        
        if (result == 0) {
            JOptionPane.showMessageDialog(this, "Números iguais");
        } else if (result == 1) {
            JOptionPane.showMessageDialog(this, String.format("Menor número: %.2f", this.num2));
        } else {
            JOptionPane.showMessageDialog(this, String.format("Menor número: %.2f", this.num1));
        }
    }//GEN-LAST:event_jbMinorActionPerformed

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
            java.util.logging.Logger.getLogger(MajorOrMinor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MajorOrMinor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MajorOrMinor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MajorOrMinor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MajorOrMinor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbMajor;
    private javax.swing.JButton jbMinor;
    private javax.swing.JTextField jtfNumber1;
    private javax.swing.JTextField jtfNumber2;
    // End of variables declaration//GEN-END:variables
}
