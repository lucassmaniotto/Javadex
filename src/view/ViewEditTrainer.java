package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controller.ControllerPokemon;
import controller.ControllerTrainer;
import controller.ControllerTrainerParty;
import model.Regions;
import model.TrainedPokemon;
import model.Trainer;

/**
 * Classe que representa a interface gráfica de edição de treinadores.
 */
public class ViewEditTrainer extends javax.swing.JFrame {
    ControllerTrainer controllerTrainer = new ControllerTrainer();
    Trainer trainer = new Trainer("", 0, 0, Regions.UNKNOWN.toString(), 0);
    
    static ControllerPokemon controllerPokemon = new ControllerPokemon();
    static List<TrainedPokemon> trainedPokemons = new ArrayList<>();

    static ControllerTrainerParty controllerTrainerParty = new ControllerTrainerParty();

    public ViewEditTrainer(int idTrainer) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Editar Treinador");
        loadTrainerData(idTrainer);
        loadTrainerPokemons(idTrainer);
        loadTrainerParty(idTrainer);
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
        IDLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();

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

        BagdesTextField.setToolTipText("Insira a quantidade de insígnias do treinador");

        RegionsLabel.setText("Região:");

        RegionsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {Regions.KANTO.toString(), Regions.JOHTO.toString(), Regions.HOENN.toString(), Regions.SINNOH.toString(), Regions.UNOVA.toString(), Regions.KALOS.toString(), Regions.ALOLA.toString(), Regions.GALAR.toString(), Regions.UNKNOWN.toString()}));

        TrainedPokemonsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo 1", "Tipo 2", "Poder"
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
            TrainedPokemonsTable.getColumnModel().getColumn(0).setMinWidth(40);
            TrainedPokemonsTable.getColumnModel().getColumn(0).setMaxWidth(40);
            TrainedPokemonsTable.getColumnModel().getColumn(1).setMinWidth(100);
            TrainedPokemonsTable.getColumnModel().getColumn(1).setMaxWidth(100);
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

            },
            new String [] {
                "ID", "Nome", "Tipo 1", "Tipo 2", "Poder"
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
            PokemonPartyTable.getColumnModel().getColumn(0).setMinWidth(40);
            PokemonPartyTable.getColumnModel().getColumn(0).setMaxWidth(40);
            PokemonPartyTable.getColumnModel().getColumn(1).setMinWidth(100);
            PokemonPartyTable.getColumnModel().getColumn(1).setMaxWidth(100);
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

        IDLabel.setText("ID:");

        IDTextField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(PokemonsLabel)
                        .addGap(450, 450, 450)
                        .addComponent(PartyLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addToPartyButton)
                            .addComponent(removeFromPartyButton))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgeLabel)
                            .addComponent(RegionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RegionsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BadgesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BagdesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel)
                    .addComponent(IDLabel)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegionsLabel)
                    .addComponent(RegionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeLabel)
                    .addComponent(BadgesLabel)
                    .addComponent(BagdesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PartyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PokemonsLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(addToPartyButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeFromPartyButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton)
                    .addComponent(SaveButton))
                .addGap(11, 11, 11))
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
        DefaultTableModel model = (DefaultTableModel) PokemonPartyTable.getModel();
        try {
            int idPokemon = (int) PokemonPartyTable.getValueAt(PokemonPartyTable.getSelectedRow(), 0);
            int idTrainer = Integer.parseInt(IDTextField.getText());
            model.removeRow(PokemonPartyTable.getSelectedRow());
            controllerTrainerParty.removePokemonFromTrainerPartyController(idTrainer, idPokemon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um pokemon para remover!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_removeFromPartyButtonActionPerformed
    
    /**
     * Adiciona um pokemon ao grupo do treinador
     * @param evt
     */
    private void addToPartyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToPartyButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) PokemonPartyTable.getModel();
        try{       
            int idPokemon = (int) TrainedPokemonsTable.getValueAt(TrainedPokemonsTable.getSelectedRow(), 0);
            for (int i = 0; i < model.getRowCount(); i++) {
                if (idPokemon == (int) model.getValueAt(i, 0)) {
                    JOptionPane.showMessageDialog(null, "O pokemon já está no grupo do treinador!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            
            if (model.getRowCount() < 6){
                model.addRow(new Object[]{
                    idPokemon,
                    controllerPokemon.getWildPokemonByIdController(idPokemon).getName(),
                    controllerPokemon.getWildPokemonByIdController(idPokemon).getFirstType(),
                    controllerPokemon.getWildPokemonByIdController(idPokemon).getSecondType(),
                    controllerPokemon.getWildPokemonByIdController(idPokemon).getTotal()
                });
            } else {
                JOptionPane.showMessageDialog(null, "O grupo do treinador já está completo!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um pokemon para adicionar!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addToPartyButtonActionPerformed
    
    /**
     * Salva as alterações feitas no treinador e no seu time
     * @param evt
     */
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        saveTrainerParty();
        updateTrainerParty();
        updateTrainer();
    }//GEN-LAST:event_SaveButtonActionPerformed
    
    /**
     * Fecha a janela
     * @param evt
     */
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    /**
     * Carrega os dados do treinador no formulário
     * @param idTrainer ID do treinador
     */
    private void loadTrainerData(int idTrainer){
        trainer = controllerTrainer.getTrainerByIDController(idTrainer);
        IDTextField.setText(String.valueOf(trainer.getId()));
        NameTextField.setText(trainer.getName());
        AgeTextField.setText(String.valueOf(trainer.getAge()));
        BagdesTextField.setText(String.valueOf(trainer.getBadges()));
        RegionsComboBox.setSelectedItem(trainer.getRegion());
    }

    /**
     * Carrega os pokemons do treinador na tabela de pokemons treinados
     * @param idTrainer ID do treinador
     */
    public static void loadTrainerPokemons(int idTrainer){
        DefaultTableModel model = (DefaultTableModel) TrainedPokemonsTable.getModel();
        model.setNumRows(0);

        trainedPokemons = controllerPokemon.getTrainedPokemonsController(idTrainer);
        
        for(TrainedPokemon pokemon : trainedPokemons){
            model.addRow(new Object[]{
                pokemon.getId(),
                pokemon.getName(),
                pokemon.getFirstType(),
                pokemon.getSecondType(),
                pokemon.getTotal(),
            });
        }
    }
    
    /**
     * Carrega o time do treinador na tabela de time
     * @param idTrainer ID do treinador
     */
    public static void loadTrainerParty(int idTrainer){
        DefaultTableModel model = (DefaultTableModel) PokemonPartyTable.getModel();
        model.setNumRows(0);
        
        List<TrainedPokemon> party = controllerTrainerParty.getTrainerPartyController(idTrainer);
        
        for(TrainedPokemon pokemon : party){
            model.addRow(new Object[]{
                pokemon.getId(),
                pokemon.getName(),
                pokemon.getFirstType(),
                pokemon.getSecondType(),
                pokemon.getTotal(),
            });
        }
    }

    /**
     * Atualiza informações do treinador no banco de dados
     */
    private void updateTrainer(){
        try{
            int id = Integer.parseInt(IDTextField.getText());
            String region = RegionsComboBox.getSelectedItem().toString();
            int age = Integer.parseInt(AgeTextField.getText());
            if(age < 10){
                JOptionPane.showMessageDialog(null, "Atenção, a idade mínima é 10 anos!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int badges = Integer.parseInt(BagdesTextField.getText());
            if (badges < 0){
                JOptionPane.showMessageDialog(null, "Atenção, a quantidade de medalhas não pode ser negativa!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            controllerTrainer.updateTrainerController(id, region, age, badges);
            ViewTrainers.updateTable();
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar treinador, os campos de número só podem receber valores inteiros!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Salva o time do treinador no banco de dados
     */
    private void saveTrainerParty(){
        DefaultTableModel model = (DefaultTableModel) PokemonPartyTable.getModel();
        List<TrainedPokemon> party = new ArrayList<>();
        int idTrainer = Integer.parseInt(IDTextField.getText());
        for (int i = 0; i < model.getRowCount(); i++) {
            int idPokemon = (int) model.getValueAt(i, 0);
            TrainedPokemon pokemon = controllerPokemon.getTrainedPokemonByIdController(idPokemon, idTrainer);
            party.add(pokemon);
        }
        // se o pokemon do time não estiver no banco de dados, ele é adicionado
        for (TrainedPokemon pokemon : party) {
            if (!controllerTrainerParty.checkTrainerPartyController(pokemon.getId(), idTrainer)){
                controllerTrainerParty.saveTrainerPartyController(idTrainer, party);
            }
        }
    }

    /**
     * Atualiza o time do treinador na tabela
     */
    private void updateTrainerParty(){
        DefaultTableModel model = (DefaultTableModel) PokemonPartyTable.getModel();
        model.setNumRows(0);
        loadTrainerParty(trainer.getId());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JLabel BadgesLabel;
    private javax.swing.JTextField BagdesTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PartyLabel;
    private static javax.swing.JTable PokemonPartyTable;
    private javax.swing.JLabel PokemonsLabel;
    private javax.swing.JComboBox<String> RegionsComboBox;
    private javax.swing.JLabel RegionsLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel TitleLabel;
    private static javax.swing.JTable TrainedPokemonsTable;
    private javax.swing.JButton addToPartyButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton removeFromPartyButton;
    // End of variables declaration//GEN-END:variables
}
