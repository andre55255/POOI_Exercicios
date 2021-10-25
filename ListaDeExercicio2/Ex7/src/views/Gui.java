package views;

import entities.Circle;
import entities.Figure;
import entities.Square;
import entities.Triangle;
import javax.swing.JOptionPane;

public class Gui extends javax.swing.JFrame {

    // 1 - Círculo, 2 - Quadrado, 3 - Triângulo
    private int isFigureFocus;
    private Figure[] figures = new Figure[15];
    
    public Gui() {
        initComponents();
    }
    
    private void handleEditableInputs() {
        this.clearInputs();
        jtfColor.setEditable(true);
        if (this.isFigureFocus == 1) {
            jtfRadius.setEditable(true);
            jtfBase.setEditable(false);
            jtfHeight.setEditable(false);
            jtfSide.setEditable(false);
            jbCircle.setEnabled(true);
            jbSquare.setEnabled(false);
            jbTriangle.setEnabled(false);
        } else if (this.isFigureFocus == 2) {
            jtfRadius.setEditable(false);
            jtfBase.setEditable(false);
            jtfHeight.setEditable(false);
            jtfSide.setEditable(true);
            jbCircle.setEnabled(false);
            jbSquare.setEnabled(true);
            jbTriangle.setEnabled(false);
        } else if (this.isFigureFocus == 3) {
            jtfRadius.setEditable(false);
            jtfBase.setEditable(true);
            jtfHeight.setEditable(true);
            jtfSide.setEditable(false);
            jbCircle.setEnabled(false);
            jbSquare.setEnabled(false);
            jbTriangle.setEnabled(true);
        }
    }
    
    private void clearInputs() {
        jtfBase.setText("");
        jtfColor.setText("");
        jtfHeight.setText("");
        jtfRadius.setText("");
        jtfSide.setText("");
    }

    private boolean insertCircle(Circle circle) {
        // True - Inserido com sucesso | False - Não foi possível inserir
        if (figures[figures.length-1] != null) {
            return false;
        }
        
        for (int i=0; i<figures.length; i++) {
            if (figures[i] == null) {
                figures[i] = circle;
                return true;
            }
        }
        
        return false;
    }
    
    private boolean insertSquare(Square square) {
        // True - Inserido com sucesso | False - Não foi possível inserir
        if (figures[figures.length-1] != null) {
            return false;
        }
        
        for (int i=0; i<figures.length; i++) {
            if (figures[i] == null) {
                figures[i] = square;
                return true;
            }
        }
        
        return false;
    }
    
    private boolean insertTriangle(Triangle triangle) {
        // True - Inserido com sucesso | False - Não foi possível inserir
        if (figures[figures.length-1] != null) {
            return false;
        }
        
        for (int i=0; i<figures.length; i++) {
            if (figures[i] == null) {
                figures[i] = triangle;
                return true;
            }
        }
        
        return false;
    }
    
    private void showHighestArea() {
        if (figures[0] == null) {
            JOptionPane.showMessageDialog(this, "Não há figuras cadastradas");
            return;
        }
        
        int index = 0;
        double currentValueArea = 0.0;
        
        for (int i=0; i<figures.length; i++) {
            if (figures[i] == null) {
                break;
            }
            if (currentValueArea < figures[i].area()) {
                currentValueArea = figures[i].area();
                index = i;
            }
        }
        
        JOptionPane.showMessageDialog(this, "Figura com a maior área\n"+figures[index].toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTypeFigure = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrbCircle = new javax.swing.JRadioButton();
        jrbSquare = new javax.swing.JRadioButton();
        jrbTriangle = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jtfColor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfRadius = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfSide = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfBase = new javax.swing.JTextField();
        jtfHeight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbCircle = new javax.swing.JButton();
        jbSquare = new javax.swing.JButton();
        jbTriangle = new javax.swing.JButton();
        jbShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Geometria");
        setName("gui"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 22, 84));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Figuras");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 22, 84));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escolha qual figura deseja cadastrar");

        jrbCircle.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTypeFigure.add(jrbCircle);
        jrbCircle.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jrbCircle.setForeground(new java.awt.Color(36, 22, 84));
        jrbCircle.setText("Círculo");
        jrbCircle.setFocusable(false);
        jrbCircle.setName("circle"); // NOI18N
        jrbCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCircleActionPerformed(evt);
            }
        });

        jrbSquare.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTypeFigure.add(jrbSquare);
        jrbSquare.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jrbSquare.setForeground(new java.awt.Color(36, 22, 84));
        jrbSquare.setText("Quadrado");
        jrbSquare.setFocusable(false);
        jrbSquare.setName("square"); // NOI18N
        jrbSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSquareActionPerformed(evt);
            }
        });

        jrbTriangle.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTypeFigure.add(jrbTriangle);
        jrbTriangle.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jrbTriangle.setForeground(new java.awt.Color(36, 22, 84));
        jrbTriangle.setText("Triângulo");
        jrbTriangle.setFocusable(false);
        jrbTriangle.setName("triangle"); // NOI18N
        jrbTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTriangleActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 22, 84));
        jLabel3.setText("Cor");

        jtfColor.setEditable(false);
        jtfColor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfColor.setForeground(new java.awt.Color(36, 22, 84));
        jtfColor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfColor.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(36, 22, 84));
        jLabel4.setText("Raio");

        jtfRadius.setEditable(false);
        jtfRadius.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfRadius.setForeground(new java.awt.Color(36, 22, 84));
        jtfRadius.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfRadius.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 22, 84));
        jLabel5.setText("Lado");

        jtfSide.setEditable(false);
        jtfSide.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfSide.setForeground(new java.awt.Color(36, 22, 84));
        jtfSide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfSide.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 22, 84));
        jLabel6.setText("Base");

        jtfBase.setEditable(false);
        jtfBase.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfBase.setForeground(new java.awt.Color(36, 22, 84));
        jtfBase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfBase.setCaretColor(new java.awt.Color(36, 22, 84));

        jtfHeight.setEditable(false);
        jtfHeight.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfHeight.setForeground(new java.awt.Color(36, 22, 84));
        jtfHeight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfHeight.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 22, 84));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Altura");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 22, 84));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clique no botão correspondente para cadastrar");

        jbCircle.setBackground(new java.awt.Color(36, 22, 84));
        jbCircle.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jbCircle.setForeground(new java.awt.Color(255, 255, 255));
        jbCircle.setText("Círculo");
        jbCircle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCircle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCircle.setEnabled(false);
        jbCircle.setFocusable(false);
        jbCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCircleActionPerformed(evt);
            }
        });

        jbSquare.setBackground(new java.awt.Color(36, 22, 84));
        jbSquare.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jbSquare.setForeground(new java.awt.Color(255, 255, 255));
        jbSquare.setText("Quadrado");
        jbSquare.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSquare.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSquare.setEnabled(false);
        jbSquare.setFocusable(false);
        jbSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSquareActionPerformed(evt);
            }
        });

        jbTriangle.setBackground(new java.awt.Color(36, 22, 84));
        jbTriangle.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jbTriangle.setForeground(new java.awt.Color(255, 255, 255));
        jbTriangle.setText("Triângulo");
        jbTriangle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTriangle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbTriangle.setEnabled(false);
        jbTriangle.setFocusable(false);
        jbTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTriangleActionPerformed(evt);
            }
        });

        jbShow.setBackground(new java.awt.Color(204, 204, 204));
        jbShow.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jbShow.setForeground(new java.awt.Color(51, 51, 51));
        jbShow.setText("Exibir");
        jbShow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbShow.setBorderPainted(false);
        jbShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbShow.setFocusable(false);
        jbShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbCircle)
                                .addGap(18, 18, 18)
                                .addComponent(jrbSquare)
                                .addGap(18, 18, 18)
                                .addComponent(jrbTriangle))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfColor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfRadius)
                            .addComponent(jtfSide)
                            .addComponent(jtfBase)
                            .addComponent(jtfHeight))))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbCircle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSquare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbTriangle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbShow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCircle)
                    .addComponent(jrbSquare)
                    .addComponent(jrbTriangle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfColor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRadius, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSide, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBase, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jbShow, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jrbCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCircleActionPerformed
        this.isFigureFocus = 1;
        this.handleEditableInputs();
    }//GEN-LAST:event_jrbCircleActionPerformed

    private void jrbSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSquareActionPerformed
        this.isFigureFocus = 2;
        this.handleEditableInputs();
    }//GEN-LAST:event_jrbSquareActionPerformed

    private void jrbTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTriangleActionPerformed
        this.isFigureFocus = 3;
        this.handleEditableInputs();
    }//GEN-LAST:event_jrbTriangleActionPerformed

    private void jbCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCircleActionPerformed
        if (jtfColor.getText().length() == 0 || jtfRadius.getText().length() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Informe a cor e o raio do círculo",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
            );
            
            return;
        }
        
        String color = jtfColor.getText();
        double radius;
        try {
            radius = Double.parseDouble(jtfRadius.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Informe apenas números no campo de raio",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
            );
            
            return;
        }
        
        Circle circle = new Circle(radius, color);
        boolean result = this.insertCircle(circle);
        if (result) {
            JOptionPane.showMessageDialog(this, "Forma inserida com sucesso");
            this.clearInputs();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Número de cadastros excedido",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jbCircleActionPerformed

    private void jbSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSquareActionPerformed
        if (jtfColor.getText().length() == 0 || jtfSide.getText().length() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Informe a cor e o lado do quadrado",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
            );
            
            return;
        }
        
        String color = jtfColor.getText();
        double side;
        try {
            side = Double.parseDouble(jtfSide.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Informe apenas números no campo de lado",
                    "Erro",
                    JOptionPane.WARNING_MESSAGE
            );
            
            return;
        }
        
        Square square = new Square(side, color);
        boolean result = this.insertSquare(square);
        if (result) {
            JOptionPane.showMessageDialog(this, "Forma inserida com sucesso");
            this.clearInputs();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Número de cadastros excedido",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jbSquareActionPerformed

    private void jbTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTriangleActionPerformed
        if (jtfColor.getText().length() == 0 || jtfBase.getText().length() == 0 || jtfHeight.getText().length() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Informe a cor, base e altura do triângulo",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
            );
            
            return;
        }
        
        String color = jtfColor.getText();
        double base;
        double height;
        try {
            base = Double.parseDouble(jtfBase.getText());
            height = Double.parseDouble(jtfHeight.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Informe apenas números no campo de base e altura",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
            );
            
            return;
        }
        
        Triangle triangle = new Triangle(base, height, color);
        boolean result = this.insertTriangle(triangle);
        if (result) {
            JOptionPane.showMessageDialog(this, "Forma inserida com sucesso");
            this.clearInputs();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Número de cadastros excedido",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jbTriangleActionPerformed

    private void jbShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowActionPerformed
        this.showHighestArea();
    }//GEN-LAST:event_jbShowActionPerformed

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
    private javax.swing.ButtonGroup btnGroupTypeFigure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCircle;
    private javax.swing.JButton jbShow;
    private javax.swing.JButton jbSquare;
    private javax.swing.JButton jbTriangle;
    private javax.swing.JRadioButton jrbCircle;
    private javax.swing.JRadioButton jrbSquare;
    private javax.swing.JRadioButton jrbTriangle;
    private javax.swing.JTextField jtfBase;
    private javax.swing.JTextField jtfColor;
    private javax.swing.JTextField jtfHeight;
    private javax.swing.JTextField jtfRadius;
    private javax.swing.JTextField jtfSide;
    // End of variables declaration//GEN-END:variables
}
