package views;

import entities.Car;
import entities.Motorcycle;
import entities.Truck;
import entities.Vehicle;
import javax.swing.JOptionPane;

public class Gui extends javax.swing.JFrame {

    // 1 - Carro | 2 - Moto | 3 - Caminhão
    private int focusVehicle;
    private Vehicle[] data = new Vehicle[15];
    
    public Gui() {
        initComponents();
    }

    private void clearInputs() {
        jtfAxes.setText("");
        jtfBoard.setText("");
        jtfCharge.setText("");
        jtfChassis.setText("");
        jtfColor.setText("");
        jtfDisplacement.setText("");
    }
    
    private void handleInputEditable() {
        this.clearInputs();
        jtfColor.setEditable(true);
        jtfBoard.setEditable(true);
        
        if (this.focusVehicle == 1) {
            jtfChassis.setEditable(true);
            jtfDisplacement.setEditable(false);
            jtfCharge.setEditable(false);
            jtfAxes.setEditable(false);
        } else if (this.focusVehicle == 2) {
            jtfChassis.setEditable(false);
            jtfDisplacement.setEditable(true);
            jtfCharge.setEditable(false);
            jtfAxes.setEditable(false);
        } else if (this.focusVehicle == 3) {
            jtfChassis.setEditable(false);
            jtfDisplacement.setEditable(false);
            jtfCharge.setEditable(true);
            jtfAxes.setEditable(true);
        }
    }
    
    private void insertCar(Car car) {
        if (this.data[this.data.length-1] != null) {
            JOptionPane.showMessageDialog(this, 
                    "Número de cadastros excedido",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        for (int i=0; i<this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = car;
                JOptionPane.showMessageDialog(this, "Carro cadastrado com sucesso");
                this.clearInputs();
                break;
            }
        }
    }
    
    private void insertMotorcycle(Motorcycle motorcycle) {
        if (this.data[this.data.length-1] != null) {
            JOptionPane.showMessageDialog(this, 
                    "Número de cadastros excedido",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        for (int i=0; i<this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = motorcycle;
                JOptionPane.showMessageDialog(this, "Moto cadastrada com sucesso");
                this.clearInputs();
                break;
            }
        }
    }
    
    private void insertTruck(Truck truck) {
        if (this.data[this.data.length-1] != null) {
            JOptionPane.showMessageDialog(this, 
                    "Número de cadastros excedido",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        for (int i=0; i<this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = truck;
                JOptionPane.showMessageDialog(this, "Caminhão cadastrado com sucesso");
                this.clearInputs();
                break;
            }
        }
    }
    
    private void showAllVehicles() {
        if (this.data[0] == null) {
            JOptionPane.showMessageDialog(this, 
                    "Não há veículos cadastrados",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<this.data.length; i++) {
            if (this.data[i] == null) {
                break;
            }
            sb.append(i+1)
                    .append(" ")
                    .append(this.data[i].everyoneData())
                    .append("\n");
        }
        
        jtaShowVehicles.setText(sb.toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTypeVehicle = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrbCar = new javax.swing.JRadioButton();
        jrbMotorcycle = new javax.swing.JRadioButton();
        jrbTruck = new javax.swing.JRadioButton();
        jtfColor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfBoard = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfChassis = new javax.swing.JTextField();
        jtfDisplacement = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfAxes = new javax.swing.JTextField();
        jtfCharge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbRegister = new javax.swing.JButton();
        jbShow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaShowVehicles = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veículos");
        setName("gui"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 22, 84));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Veículos");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 22, 84));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escolha qual veículo deseja cadastrar:");

        jrbCar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTypeVehicle.add(jrbCar);
        jrbCar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jrbCar.setForeground(new java.awt.Color(36, 22, 84));
        jrbCar.setText("Carro");
        jrbCar.setFocusable(false);
        jrbCar.setName("circle"); // NOI18N
        jrbCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCarActionPerformed(evt);
            }
        });

        jrbMotorcycle.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTypeVehicle.add(jrbMotorcycle);
        jrbMotorcycle.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jrbMotorcycle.setForeground(new java.awt.Color(36, 22, 84));
        jrbMotorcycle.setText("Moto");
        jrbMotorcycle.setFocusable(false);
        jrbMotorcycle.setName("square"); // NOI18N
        jrbMotorcycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMotorcycleActionPerformed(evt);
            }
        });

        jrbTruck.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTypeVehicle.add(jrbTruck);
        jrbTruck.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jrbTruck.setForeground(new java.awt.Color(36, 22, 84));
        jrbTruck.setText("Caminhão");
        jrbTruck.setFocusable(false);
        jrbTruck.setName("triangle"); // NOI18N
        jrbTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTruckActionPerformed(evt);
            }
        });

        jtfColor.setEditable(false);
        jtfColor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfColor.setForeground(new java.awt.Color(36, 22, 84));
        jtfColor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfColor.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 22, 84));
        jLabel3.setText("Cor");

        jtfBoard.setEditable(false);
        jtfBoard.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfBoard.setForeground(new java.awt.Color(36, 22, 84));
        jtfBoard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfBoard.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(36, 22, 84));
        jLabel4.setText("Placa");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 22, 84));
        jLabel5.setText("Chassi");

        jtfChassis.setEditable(false);
        jtfChassis.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfChassis.setForeground(new java.awt.Color(36, 22, 84));
        jtfChassis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfChassis.setCaretColor(new java.awt.Color(36, 22, 84));

        jtfDisplacement.setEditable(false);
        jtfDisplacement.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfDisplacement.setForeground(new java.awt.Color(36, 22, 84));
        jtfDisplacement.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfDisplacement.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 22, 84));
        jLabel6.setText("Cilindradas");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 22, 84));
        jLabel7.setText("Eixos");

        jtfAxes.setEditable(false);
        jtfAxes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfAxes.setForeground(new java.awt.Color(36, 22, 84));
        jtfAxes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfAxes.setCaretColor(new java.awt.Color(36, 22, 84));

        jtfCharge.setEditable(false);
        jtfCharge.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfCharge.setForeground(new java.awt.Color(36, 22, 84));
        jtfCharge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfCharge.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 22, 84));
        jLabel8.setText("Carga");

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

        jtaShowVehicles.setColumns(20);
        jtaShowVehicles.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtaShowVehicles.setRows(10);
        jtaShowVehicles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 22, 84), 1, true));
        jtaShowVehicles.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtaShowVehicles.setEnabled(false);
        jScrollPane1.setViewportView(jtaShowVehicles);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(95, Short.MAX_VALUE)
                        .addComponent(jrbCar)
                        .addGap(47, 47, 47)
                        .addComponent(jrbMotorcycle)
                        .addGap(39, 39, 39)
                        .addComponent(jrbTruck)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfBoard)
                                    .addComponent(jtfColor)
                                    .addComponent(jtfChassis)
                                    .addComponent(jtfDisplacement)
                                    .addComponent(jtfAxes)
                                    .addComponent(jtfCharge)))
                            .addComponent(jbRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
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
                    .addComponent(jrbCar)
                    .addComponent(jrbMotorcycle)
                    .addComponent(jrbTruck))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfColor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfChassis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDisplacement, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAxes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbShow, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCarActionPerformed
        this.focusVehicle = 1;
        this.handleInputEditable();
    }//GEN-LAST:event_jrbCarActionPerformed

    private void jrbMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMotorcycleActionPerformed
        this.focusVehicle = 2;
        this.handleInputEditable();
    }//GEN-LAST:event_jrbMotorcycleActionPerformed

    private void jrbTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTruckActionPerformed
        this.focusVehicle = 3;
        this.handleInputEditable();
    }//GEN-LAST:event_jrbTruckActionPerformed

    private void jbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisterActionPerformed
        String color = jtfColor.getText();
        String board = jtfBoard.getText();
        String chassisStr = jtfChassis.getText();
        String displacementStr = jtfDisplacement.getText();
        String axesStr = jtfAxes.getText();
        String chargeStr = jtfCharge.getText();
        
        if (jrbCar.isSelected()) {
            if (color.length() == 0 || board.length() == 0 || chassisStr.length() == 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "Informe a cor, placa e chassis",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE
                );
                
                return;
            }
            
            long chassis;
            try {
                chassis = Long.parseLong(chassisStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        this,
                        "Informe apenas números inteiros no campo de chassi",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE
                );
                
                return;
            }
            
            Car car = new Car();
            car.setBoard(board);
            car.setColor(color);
            car.setChassis(chassis);
            
            this.insertCar(car);
        } else if (jrbMotorcycle.isSelected()) {
            if (color.length() == 0 || board.length() == 0 || displacementStr.length() == 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "Informe a cor, placa e as cilindradas",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE
                );
                
                return;
            }
            
            int displacement;
            try {
                displacement = Integer.parseInt(displacementStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        this,
                        "Informe apenas números inteiros no campo de chassi",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE
                );
                
                return;
            }
            
            Motorcycle motorcycle = new Motorcycle();
            motorcycle.setBoard(board);
            motorcycle.setColor(color);
            motorcycle.setDisplacement(displacement);
            
            this.insertMotorcycle(motorcycle);
        } else if (jrbTruck.isSelected()) {
            if (color.length() == 0 || board.length() == 0 || axesStr.length() == 0 || chargeStr.length() == 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "Informe a cor, placa, eixos e carga",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE
                );
                
                return;
            }
            
            int axes;
            double charge;
            try {
                axes = Integer.parseInt(axesStr);
                charge = Double.parseDouble(chargeStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        this,
                        "Informe apenas números nos campos de eixos e carga",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE
                );
                
                return;
            }
            
            Truck truck = new Truck();
            truck.setBoard(board);
            truck.setColor(color);
            truck.setAxes(axes);
            truck.setCharge(charge);
            
            this.insertTruck(truck);
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione uma opção e preencha os dados para cadastrar",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jbRegisterActionPerformed

    private void jbShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowActionPerformed
        this.showAllVehicles();
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
    private javax.swing.ButtonGroup btnGroupTypeVehicle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRegister;
    private javax.swing.JButton jbShow;
    private javax.swing.JRadioButton jrbCar;
    private javax.swing.JRadioButton jrbMotorcycle;
    private javax.swing.JRadioButton jrbTruck;
    private javax.swing.JTextArea jtaShowVehicles;
    private javax.swing.JTextField jtfAxes;
    private javax.swing.JTextField jtfBoard;
    private javax.swing.JTextField jtfCharge;
    private javax.swing.JTextField jtfChassis;
    private javax.swing.JTextField jtfColor;
    private javax.swing.JTextField jtfDisplacement;
    // End of variables declaration//GEN-END:variables
}
