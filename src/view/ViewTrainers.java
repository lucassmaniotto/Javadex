package view;

public class ViewTrainers extends javax.swing.JFrame {

    public ViewTrainers() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TrainersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "IDADE", "REGIÃO"
            }
        ) {
            Class<Object>[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class<Object> getColumnClass(int columnIndex) {
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
        FilterTextField.setActionCommand("<Not Set>");

        FilterComboBox.setForeground(new java.awt.Color(102, 102, 102));
        FilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "ID", "Nome", "Idade", "Região" }));

        FilterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/filter.png"))); // NOI18N
        FilterButton.setText("FILTRAR");

        FilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterButtonActionPerformed(evt);
            }
        });

        EditTrainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit-trainer.png"))); // NOI18N
        EditTrainerButton.setText("EDITAR TREINADOR");
        EditTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTrainerButtonActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        RegisterTrainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add-trainer.png"))); // NOI18N
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

        LinkPokemonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/link-pokemon.png"))); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FilterButton))
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

    /**
     * Abre a tela de cadastro de treinadores
     * @param evt
     */
    private void RegisterTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterTrainerButtonActionPerformed
        ViewRegisterTrainer viewRegisterTrainer = new ViewRegisterTrainer();
        viewRegisterTrainer.setVisible(true);
    }//GEN-LAST:event_RegisterTrainerButtonActionPerformed

    /**
     * Abre a tela de edição de treinadores
     * @param evt
     */
    private void EditTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTrainerButtonActionPerformed
        ViewEditTrainer viewEditTrainer = new ViewEditTrainer();
        viewEditTrainer.setVisible(true);
    }//GEN-LAST:event_EditTrainerButtonActionPerformed

    /**
     * Abre a tela de vinculação de pokemons aos treinadores
     * @param evt
     */
    private void LinkPokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkPokemonButtonActionPerformed
        ViewLinkPokemon viewLinkPokemon = new ViewLinkPokemon();
        viewLinkPokemon.setVisible(true);
    }//GEN-LAST:event_LinkPokemonButtonActionPerformed

    /**
     * Filtra os treinadores
     * @param evt
     */
    private void FilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterButtonActionPerformed

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
