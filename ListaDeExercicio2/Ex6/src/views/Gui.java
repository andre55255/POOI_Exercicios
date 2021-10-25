package views;

import entities.Month;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Gui extends javax.swing.JFrame {

    private Month[] data = new Month[100];
    
    public Gui() {
        initComponents();
    }
    
    private void clearInputs() {
        jtfMonth.setText("");
        jtfSalary.setText("");
        jtfSpending.setText("");
        jtfTaxes.setText("");
    }
    
    private boolean insertMonth(Month month) {
        // True - Inserido com sucesso | False - Inserção falhou
        boolean result = false;
        
        for (int i=0; i<data.length; i++) {
            if (data[i] == null) {
                data[i] = month;
                result = true;
                break;
            }
        }
        
        return result;
    }
    
    private void showMonths() {
        if (data[0] == null) {
            JOptionPane.showMessageDialog(this, "Não há dados cadastrados");
            return;
        } 
        
        StringBuilder sb = new StringBuilder();
        sb.append("Todos os dados\n");
        
        for (Month m : data) {
            if (m == null) {
                break;
            } else {
                sb.append(m.toStringNameBalance());
            }
        }
        
        JOptionPane.showMessageDialog(this, sb.toString());
    }
    
    private void showMonthHighestBalance() {
        if (data[0] == null) {
            JOptionPane.showMessageDialog(this, "Não há dados cadastrados");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Mês com maior saldo\n");
        
        Month monthHighestBalance = data[0];
        for (int i=1; i<data.length; i++) {
            if (data[i] == null) {
                break;
            }
            
            if (monthHighestBalance.balance() < data[i].balance()) {
                monthHighestBalance = data[i];
            }
        }
        
        sb.append(monthHighestBalance.toStringAll());
        
        JOptionPane.showMessageDialog(this, sb.toString());
    }
    
    private void averageSalaries() {
        if (data[0] == null) {
            JOptionPane.showMessageDialog(this, "Não há dados cadastrados");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("\nValor médio dos salários recebidos: R$ ");
        double totalSalary = 0.0;
        int cont = 0;
        
        for (Month m : data) {
            if (m == null) {
                break;
            } else {
                totalSalary += m.getSalary();
                cont++;
            }
        }
         
        double average = totalSalary/cont;
        DecimalFormat df = new DecimalFormat("###,###.00");
        sb.append(df.format(average));
        
        JOptionPane.showMessageDialog(this, sb.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfMonth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfSalary = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfSpending = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfTaxes = new javax.swing.JTextField();
        jbRegister = new javax.swing.JButton();
        jbCalculate = new javax.swing.JButton();
        jbShow = new javax.swing.JButton();
        jbMajorSalary = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salário");
        setName("gui"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 22, 84));
        jLabel2.setText("Mês");

        jtfMonth.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfMonth.setForeground(new java.awt.Color(36, 22, 84));
        jtfMonth.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfMonth.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 22, 84));
        jLabel3.setText("Salário");

        jtfSalary.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfSalary.setForeground(new java.awt.Color(36, 22, 84));
        jtfSalary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfSalary.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(36, 22, 84));
        jLabel4.setText("Gastos");

        jtfSpending.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfSpending.setForeground(new java.awt.Color(36, 22, 84));
        jtfSpending.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfSpending.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 22, 84));
        jLabel5.setText("Impostos");

        jtfTaxes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfTaxes.setForeground(new java.awt.Color(36, 22, 84));
        jtfTaxes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfTaxes.setCaretColor(new java.awt.Color(36, 22, 84));

        jbRegister.setBackground(new java.awt.Color(36, 22, 84));
        jbRegister.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jbRegister.setForeground(new java.awt.Color(255, 255, 255));
        jbRegister.setText("Cadastrar");
        jbRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRegister.setFocusable(false);
        jbRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisterActionPerformed(evt);
            }
        });

        jbCalculate.setBackground(new java.awt.Color(36, 22, 84));
        jbCalculate.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jbCalculate.setForeground(new java.awt.Color(255, 255, 255));
        jbCalculate.setText("Calcular");
        jbCalculate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCalculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCalculate.setFocusable(false);
        jbCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalculateActionPerformed(evt);
            }
        });

        jbShow.setBackground(new java.awt.Color(36, 22, 84));
        jbShow.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jbShow.setForeground(new java.awt.Color(255, 255, 255));
        jbShow.setText("Exibir");
        jbShow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbShow.setFocusable(false);
        jbShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbShowActionPerformed(evt);
            }
        });

        jbMajorSalary.setBackground(new java.awt.Color(36, 22, 84));
        jbMajorSalary.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jbMajorSalary.setForeground(new java.awt.Color(255, 255, 255));
        jbMajorSalary.setText("Maior Saldo");
        jbMajorSalary.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMajorSalary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMajorSalary.setFocusable(false);
        jbMajorSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMajorSalaryActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTaxes, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(jtfSpending, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(jtfSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(jtfMonth)))
                    .addComponent(jbRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMajorSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSpending, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTaxes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbShow, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMajorSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisterActionPerformed
        String name = jtfMonth.getText();
        double salary;
        double spending;
        double taxes;
        
        try {
            salary = Double.parseDouble(jtfSalary.getText());
            spending = Double.parseDouble(jtfSpending.getText());
            taxes = Double.parseDouble(jtfTaxes.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                    "Os campos de salário, gastos e impostos aceitam somente números\nGentileza verificar", 
                    "Aviso", 
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        
        Month month = new Month(name, salary, spending, taxes);
        
        boolean result = this.insertMonth(month);
        if (result) {
            JOptionPane.showMessageDialog(this, "Dados inseridos com sucesso");
            this.clearInputs();
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Erro ao inserir dados\nObs: Limite de dados extrapolado", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
            
    }//GEN-LAST:event_jbRegisterActionPerformed

    private void jbCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalculateActionPerformed
        this.averageSalaries();
    }//GEN-LAST:event_jbCalculateActionPerformed

    private void jbShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowActionPerformed
        this.showMonths();
    }//GEN-LAST:event_jbShowActionPerformed

    private void jbMajorSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMajorSalaryActionPerformed
        this.showMonthHighestBalance();
    }//GEN-LAST:event_jbMajorSalaryActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCalculate;
    private javax.swing.JButton jbMajorSalary;
    private javax.swing.JButton jbRegister;
    private javax.swing.JButton jbShow;
    private javax.swing.JTextField jtfMonth;
    private javax.swing.JTextField jtfSalary;
    private javax.swing.JTextField jtfSpending;
    private javax.swing.JTextField jtfTaxes;
    // End of variables declaration//GEN-END:variables
}
