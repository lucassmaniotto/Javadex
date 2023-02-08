/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author lucas.schuch
 */
public class ViewTrainers extends javax.swing.JFrame {

    /**
     * Creates new form ViewTrainers
     */
    public ViewTrainers() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TrainersTable = new javax.swing.JTable();
        TitleLabel = new javax.swing.JLabel();
        FilterTextField = new javax.swing.JTextField();
        FilterComboBox = new javax.swing.JComboBox<>();
        FilterButton = new javax.swing.JButton();
        EditTrainerButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        RegisterTrainerButton = new javax.swing.JButton();
        TrainerImageLabel = new javax.swing.JLabel();
        LinkPokemonButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TrainersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "IDADE", "REGIÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TrainersTable);
        if (TrainersTable.getColumnModel().getColumnCount() > 0) {
            TrainersTable.getColumnModel().getColumn(0).setMinWidth(60);
            TrainersTable.getColumnModel().getColumn(0).setMaxWidth(60);
            TrainersTable.getColumnModel().getColumn(2).setMinWidth(60);
            TrainersTable.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        TitleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("TREINADORES");

        FilterTextField.setForeground(new java.awt.Color(102, 102, 102));
        FilterTextField.setText("O que você procura?");
        FilterTextField.setToolTipText("Digite o valor que deseja buscar conforme o a caixa de seleção ao lado");
        FilterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterTextFieldActionPerformed(evt);
            }
        });

        FilterComboBox.setForeground(new java.awt.Color(102, 102, 102));
        FilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "ID", "Nome", "Idade", "Região" }));
        FilterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterComboBoxActionPerformed(evt);
            }
        });

        FilterButton.setText("FILTRAR");

        EditTrainerButton.setText("EDITAR TREINADOR");
        EditTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTrainerButtonActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        RegisterTrainerButton.setText("ADICIONAR TREINADOR");
        RegisterTrainerButton.setToolTipText("");
        RegisterTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterTrainerButtonActionPerformed(evt);
            }
        });

        TrainerImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrainerImageLabel.setText("Imagem do Treinador");
        TrainerImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LinkPokemonButton.setText("VINCULAR POKÉMON AO TREINADOR");
        LinkPokemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkPokemonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditTrainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterTrainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TrainerImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LinkPokemonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(RegisterTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(EditTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LinkPokemonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TrainerImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
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
    }// </editor-fold>//GEN-END:initComponents

    private void FilterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterTextFieldActionPerformed

    private void FilterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterComboBoxActionPerformed

    private void RegisterTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterTrainerButtonActionPerformed
        ViewRegisterTrainer viewRegisterTrainer = new ViewRegisterTrainer();
        viewRegisterTrainer.setVisible(true);
    }//GEN-LAST:event_RegisterTrainerButtonActionPerformed

    private void EditTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTrainerButtonActionPerformed
        ViewEditTrainer viewEditTrainer = new ViewEditTrainer();
        viewEditTrainer.setVisible(true);
    }//GEN-LAST:event_EditTrainerButtonActionPerformed

    private void LinkPokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkPokemonButtonActionPerformed
        ViewLinkPokemon viewLinkPokemon = new ViewLinkPokemon();
        viewLinkPokemon.setVisible(true);
    }//GEN-LAST:event_LinkPokemonButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ViewTrainers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTrainers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTrainers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTrainers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTrainers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditTrainerButton;
    private javax.swing.JButton FilterButton;
    private javax.swing.JComboBox<String> FilterComboBox;
    private javax.swing.JTextField FilterTextField;
    private javax.swing.JButton LinkPokemonButton;
    private javax.swing.JButton RegisterTrainerButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TrainerImageLabel;
    private javax.swing.JTable TrainersTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
