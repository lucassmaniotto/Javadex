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
 * @author Lucas Smaniotto e Valtemir Junior
 */
public class ViewEditTrainer extends javax.swing.JFrame {
    //Declaração de componentes da interface gráfica.
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel badgesLabel;
    private javax.swing.JTextField bagdesTextField;
    private static javax.swing.JButton exitButton;
    private javax.swing.JLabel iDLabel;
    private javax.swing.JTextField iDTextField;
    private javax.swing.JLabel imageTrainerLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel partyLabel;
    private static javax.swing.JTable pokemonPartyTable;
    private javax.swing.JLabel pokemonsLabel;
    private javax.swing.JComboBox<String> regionsComboBox;
    private javax.swing.JLabel regionsLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLabel;
    private static javax.swing.JTable trainedPokemonsTable;
    private javax.swing.JButton addToPartyButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton removeFromPartyButton;

    //Declaração de variáveis e objetos da classe de controle.
    ControllerTrainer controllerTrainer = new ControllerTrainer();
    Trainer trainer = new Trainer("", 0, 0, Regions.UNKNOWN.toString());
    
    static ControllerPokemon controllerPokemon = new ControllerPokemon();
    static List<TrainedPokemon> trainedPokemons = new ArrayList<>();

    static ControllerTrainerParty controllerTrainerParty = new ControllerTrainerParty();

    public ViewEditTrainer(int idTrainer) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Editar Treinador");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pokeball.svg")).getImage());
        loadTrainerData(idTrainer);
        loadTrainerPokemons(idTrainer);
        loadTrainerParty(idTrainer);
    }

    /**
     * Método de inicialização dos componentes da interface gráfica.
     * Criado automaticamente pelo NetBeans.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainedPokemonsTable = new javax.swing.JTable();
        exitButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        pokemonsLabel = new javax.swing.JLabel();
        partyLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        pokemonPartyTable = new javax.swing.JTable();
        addToPartyButton = new javax.swing.JButton();
        removeFromPartyButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        ageTextField = new javax.swing.JTextField();
        iDTextField = new javax.swing.JTextField();
        regionsComboBox = new javax.swing.JComboBox<>();
        ageLabel = new javax.swing.JLabel();
        imageTrainerLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        badgesLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        bagdesTextField = new javax.swing.JTextField();
        regionsLabel = new javax.swing.JLabel();
        iDLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        trainedPokemonsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    showPokemonDetails(evt, trainedPokemonsTable);
                }
            }
        });

        pokemonPartyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    showPokemonDetails(evt, pokemonPartyTable);
                }
            }
        });

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Editar Treinador");


        trainedPokemonsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(trainedPokemonsTable);
        if (trainedPokemonsTable.getColumnModel().getColumnCount() > 0) {
            trainedPokemonsTable.getColumnModel().getColumn(0).setMinWidth(40);
            trainedPokemonsTable.getColumnModel().getColumn(0).setMaxWidth(40);
            trainedPokemonsTable.getColumnModel().getColumn(1).setMinWidth(100);
            trainedPokemonsTable.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/exit.png"))); // NOI18N
        exitButton.setText("Sair");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/save.png"))); // NOI18N
        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        pokemonsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pokemonsLabel.setText("Pokémons");

        partyLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        partyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        partyLabel.setText("Time");

        pokemonPartyTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(pokemonPartyTable);
        if (pokemonPartyTable.getColumnModel().getColumnCount() > 0) {
            pokemonPartyTable.getColumnModel().getColumn(0).setMinWidth(40);
            pokemonPartyTable.getColumnModel().getColumn(0).setMaxWidth(40);
            pokemonPartyTable.getColumnModel().getColumn(1).setMinWidth(100);
            pokemonPartyTable.getColumnModel().getColumn(1).setMaxWidth(100);
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

        ageTextField.setToolTipText("Informe a idade do treinador");

        iDTextField.setEditable(false);

        regionsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {Regions.KANTO.toString(), Regions.JOHTO.toString(), Regions.HOENN.toString(), Regions.SINNOH.toString(), Regions.UNOVA.toString(), Regions.KALOS.toString(), Regions.ALOLA.toString(), Regions.GALAR.toString(), Regions.UNKNOWN.toString()}));

        ageLabel.setText("Idade:");

        imageTrainerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageTrainerLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nameLabel.setText("Nome:");

        badgesLabel.setText("Insígnias:");

        nameTextField.setEditable(false);
        nameTextField.setToolTipText("Digite o nome do treinador");

        bagdesTextField.setToolTipText("OBS: o número máx. de insígnias são 6 por treinador");

        regionsLabel.setText("Região:");

        iDLabel.setText("ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel)
                    .addComponent(regionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(regionsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(badgesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bagdesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(imageTrainerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel)
                            .addComponent(iDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iDLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regionsLabel)
                            .addComponent(regionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel)
                            .addComponent(badgesLabel)
                            .addComponent(bagdesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imageTrainerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(exitButton)
                        .addGap(59, 59, 59)
                        .addComponent(saveButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(pokemonsLabel)
                        .addGap(450, 450, 450)
                        .addComponent(partyLabel))
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
                        .addGap(279, 279, 279)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(partyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pokemonsLabel, javax.swing.GroupLayout.Alignment.TRAILING))
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
                    .addComponent(exitButton)
                    .addComponent(saveButton))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    
    /**
     * Remove um pokemon do grupo do treinador
     * @param evt
     */
    private void removeFromPartyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) pokemonPartyTable.getModel();
        try {
            int idPokemon = (int) pokemonPartyTable.getValueAt(pokemonPartyTable.getSelectedRow(), 0);
            int idTrainer = Integer.parseInt(iDTextField.getText());
            model.removeRow(pokemonPartyTable.getSelectedRow());
            controllerTrainerParty.removePokemonFromTrainerPartyController(idTrainer, idPokemon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um pokemon para remover!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     * Adiciona um pokemon ao grupo do treinador
     * @param evt
     */
    private void addToPartyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) pokemonPartyTable.getModel();
        try{       
            int idPokemon = (int) trainedPokemonsTable.getValueAt(trainedPokemonsTable.getSelectedRow(), 0);
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
    }
    
    /**
     * Salva as alterações feitas no treinador e no seu time
     * @param evt
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            saveTrainerParty();
            updateTrainerParty();
            updateTrainer();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados do treinador!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Fecha a janela
     * @param evt
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    /**
     * Fecha a janela caso o treinador seja excluído na
     * janela ViewTrainers
     */
    public static void closeView(){
        exitButton.doClick();
    }

    /**
     * Carrega os dados do treinador no formulário
     * @param idTrainer ID do treinador
     */
    private void loadTrainerData(int idTrainer){
        trainer = controllerTrainer.getTrainerByIDController(idTrainer);
        iDTextField.setText(String.valueOf(trainer.getId()));
        nameTextField.setText(trainer.getName());
        ageTextField.setText(String.valueOf(trainer.getAge()));
        bagdesTextField.setText(String.valueOf(trainer.getBadges()));
        regionsComboBox.setSelectedItem(trainer.getRegion());
        try{
            imageTrainerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trainers/" + trainer.getName() + ".png")));
        } catch (Exception e) {
            imageTrainerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trainers/BugCatcher.png")));
        }
    }

    /**
     * Carrega os pokemons do treinador na tabela de pokemons treinados
     * @param idTrainer ID do treinador
     */
    public static void loadTrainerPokemons(int idTrainer){
        DefaultTableModel model = (DefaultTableModel) trainedPokemonsTable.getModel();
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
        DefaultTableModel model = (DefaultTableModel) pokemonPartyTable.getModel();
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
            int id = Integer.parseInt(iDTextField.getText());
            String region = regionsComboBox.getSelectedItem().toString();
            int age = Integer.parseInt(ageTextField.getText());
            if(age < 10){
                JOptionPane.showMessageDialog(null, "Atenção, a idade mínima é 10 anos!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int badges = Integer.parseInt(bagdesTextField.getText());
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
        DefaultTableModel model = (DefaultTableModel) pokemonPartyTable.getModel();
        List<TrainedPokemon> party = new ArrayList<>();
        int idTrainer = Integer.parseInt(iDTextField.getText());
        for (int i = 0; i < model.getRowCount(); i++) {
            int idPokemon = (int) model.getValueAt(i, 0);
            TrainedPokemon pokemon = controllerPokemon.getTrainedPokemonByIdController(idPokemon, idTrainer);
            party.add(pokemon);
        }
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
        DefaultTableModel model = (DefaultTableModel) pokemonPartyTable.getModel();
        model.setNumRows(0);
        loadTrainerParty(trainer.getId());
    }

    /**
     * Abre a tela de detalhes do pokemon
     * @param Table Tabela que será verificada
     * @param evt
     */
     private void showPokemonDetails(java.awt.event.MouseEvent evt, javax.swing.JTable Table) {
        int idPokemon = (int) Table.getValueAt(Table.getSelectedRow(), 0);
        ViewPokemonDetails viewPokemonDetails = new ViewPokemonDetails(idPokemon);
        viewPokemonDetails.setVisible(true);
    }
}