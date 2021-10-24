package views;

import entities.Album;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Gui extends javax.swing.JFrame {
    
    private List<Album> albums = new ArrayList<>();

    public Gui() {
        initComponents();
    }
    
    private void clearInputs() {
        jtfArtists.setText("");
        jtfTitle.setText("");
        jtfTracks.setText("");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfTitle = new javax.swing.JTextField();
        jbShow = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfArtists = new javax.swing.JTextField();
        jtfTracks = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de álbuns");
        setName("gui"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 22, 84));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Álbuns");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 22, 84));
        jLabel2.setText("Título:");

        jtfTitle.setBackground(new java.awt.Color(255, 255, 255));
        jtfTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfTitle.setForeground(new java.awt.Color(36, 22, 84));
        jtfTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfTitle.setCaretColor(new java.awt.Color(36, 22, 84));

        jbShow.setBackground(new java.awt.Color(0, 124, 221));
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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 22, 84));
        jLabel3.setText("Artistas:");

        jtfArtists.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfArtists.setForeground(new java.awt.Color(36, 22, 84));
        jtfArtists.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfArtists.setCaretColor(new java.awt.Color(36, 22, 84));

        jtfTracks.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jtfTracks.setForeground(new java.awt.Color(36, 22, 84));
        jtfTracks.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jtfTracks.setCaretColor(new java.awt.Color(36, 22, 84));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(36, 22, 84));
        jLabel4.setText("N° faixas");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTracks)
                            .addComponent(jtfArtists)
                            .addComponent(jtfTitle)))
                    .addComponent(jbShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfArtists, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTracks, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbShow, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void jbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisterActionPerformed
        String title = jtfTitle.getText();
        String artist = jtfArtists.getText();
        
        if (title.length() == 0) {
            JOptionPane.showMessageDialog(this, "Informe o título do álbum", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        
        if (artist.length() == 0) {
            JOptionPane.showMessageDialog(this, "Informe o artista do álbum", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        
        int tracks;
        try {
            tracks = Integer.parseInt(jtfTracks.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O N° de faixas deve ser um número inteiro", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Album album = new Album(title, artist, tracks);
        boolean isAddList = albums.add(album);
        if (isAddList) {
            JOptionPane.showMessageDialog(this, "Álbum adicionado com sucesso!");
            this.clearInputs();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir o álbum na lista", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbRegisterActionPerformed

    private void jbShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowActionPerformed
        StringBuilder sb = new StringBuilder();
        
        sb.append("Álbuns cadastrados\n");
        
        for (Album a : albums) {
            sb.append(a.toString());
        }
        
        if (albums.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há álbums cadastrados");
        } else {
            JOptionPane.showMessageDialog(this, sb.toString());
        }
    }//GEN-LAST:event_jbShowActionPerformed

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

        java.awt.EventQueue.invokeLater(() -> {
            new Gui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbRegister;
    private javax.swing.JButton jbShow;
    private javax.swing.JTextField jtfArtists;
    private javax.swing.JTextField jtfTitle;
    private javax.swing.JTextField jtfTracks;
    // End of variables declaration//GEN-END:variables
}
