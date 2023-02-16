package view;

import model.Regions;

/**
 * Classe que representa a interface gráfica de edição de treinadores.
 */
public class ViewEditTrainer extends javax.swing.JFrame {

    public ViewEditTrainer() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Editar Treinador");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        AgeLabel = new javax.swing.JLabel();
        AgeTextField = new javax.swing.JTextField();
        BadgesLabel = new javax.swing.JLabel();
        BagdesTextField = new javax.swing.JTextField();
        RegionsLabel = new javax.swing.JLabel();
        RegionsComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TrainedPokemonsTable = new javax.swing.JTable();
        ExitButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        PokemonsLabel = new javax.swing.JLabel();
        PartyLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        PokemonPartyTable = new javax.swing.JTable();
        addToPartyButton = new javax.swing.JButton();
        removeFromPartyButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TitleLabel.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Editar Treinador");

        NameLabel.setText("Nome:");

        NameTextField.setEditable(false);
        NameTextField.setToolTipText("Digite o nome do treinador");

        AgeLabel.setText("Idade:");

        AgeTextField.setToolTipText("Informe a idade do treinador");

        BadgesLabel.setText("Insígnias:");

        BagdesTextField.setToolTipText("OBS: o número máx. de insígnias são 6 por treinador");

        RegionsLabel.setText("Região:");

        RegionsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {Regions.KANTO.toString(), Regions.JOHTO.toString(), Regions.HOENN.toString(), Regions.SINNOH.toString(), Regions.UNOVA.toString(), Regions.KALOS.toString(), Regions.ALOLA.toString(), Regions.GALAR.toString(), Regions.UNKNOWN.toString()}));

        TrainedPokemonsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo 1", "Tipo 2", "Total"
            }
        ) {
            Class<Object>[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class<Object> getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TrainedPokemonsTable);
        if (TrainedPokemonsTable.getColumnModel().getColumnCount() > 0) {
            TrainedPokemonsTable.getColumnModel().getColumn(0).setMinWidth(30);
            TrainedPokemonsTable.getColumnModel().getColumn(0).setMaxWidth(30);
            TrainedPokemonsTable.getColumnModel().getColumn(1).setMinWidth(125);
            TrainedPokemonsTable.getColumnModel().getColumn(1).setMaxWidth(125);
        }

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/exit.png"))); // NOI18N
        ExitButton.setText("Sair");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/save.png"))); // NOI18N
        SaveButton.setText("Salvar");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        PokemonsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PokemonsLabel.setText("Pokémons");

        PartyLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PartyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PartyLabel.setText("Time");

        PokemonPartyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Tipo 1", "Tipo 2", "Total"
            }
        ) {
            Class<Object>[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class<Object> getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(PokemonPartyTable);
        if (PokemonPartyTable.getColumnModel().getColumnCount() > 0) {
            PokemonPartyTable.getColumnModel().getColumn(0).setMinWidth(30);
            PokemonPartyTable.getColumnModel().getColumn(0).setMaxWidth(30);
            PokemonPartyTable.getColumnModel().getColumn(1).setMinWidth(125);
            PokemonPartyTable.getColumnModel().getColumn(1).setMaxWidth(125);
        }

        addToPartyButton.setText("Enviar para o Time ->");
        addToPartyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToPartyButtonActionPerformed(evt);
            }
        });

        removeFromPartyButton.setText("<- Guardar Pokémon");
        removeFromPartyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromPartyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AgeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BadgesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BagdesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RegionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RegionsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(94, 94, 94))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(243, 243, 243))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(PokemonsLabel)
                        .addGap(126, 126, 126)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addToPartyButton)
                            .addComponent(removeFromPartyButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PartyLabel)
                        .addGap(192, 192, 192))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(ExitButton)
                        .addGap(59, 59, 59)
                        .addComponent(SaveButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegionsLabel)
                    .addComponent(RegionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeLabel)
                    .addComponent(BagdesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BadgesLabel))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PartyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PokemonsLabel))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(addToPartyButton)
                                .addGap(18, 18, 18)
                                .addComponent(removeFromPartyButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton)
                    .addComponent(SaveButton))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Remove um pokemon do grupo do treinador
     * @param evt
     */
    private void removeFromPartyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromPartyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeFromPartyButtonActionPerformed
    
    /**
     * Adiciona um pokemon ao grupo do treinador
     * @param evt
     */
    private void addToPartyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToPartyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addToPartyButtonActionPerformed
    
    /**
     * Salva as alterações feitas no treinador
     * @param evt
     */
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed
    
    /**
     * Fecha a janela
     * @param evt
     */
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JLabel BadgesLabel;
    private javax.swing.JTextField BagdesTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PartyLabel;
    private javax.swing.JTable PokemonPartyTable;
    private javax.swing.JLabel PokemonsLabel;
    private javax.swing.JComboBox<String> RegionsComboBox;
    private javax.swing.JLabel RegionsLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTable TrainedPokemonsTable;
    private javax.swing.JButton addToPartyButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton removeFromPartyButton;
    // End of variables declaration//GEN-END:variables
}
