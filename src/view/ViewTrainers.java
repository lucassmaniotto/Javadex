package view;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

import controller.ControllerTrainer;
import controller.ControllerTrainerParty;
import model.Regions;
import model.Trainer;

/**
 * Classe que representa a interface gráfica de visualização de treinadores.
 * @author Lucas Smaniotto & Valtemir Junior
 */
public class ViewTrainers extends javax.swing.JFrame {
    //Declaração de componentes da interface gráfica.
    private javax.swing.JButton editTrainerButton;
    private javax.swing.JButton filterButton;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JTextField filterTextField;
    private javax.swing.JButton linkPokemonButton;
    private javax.swing.JButton registerTrainerButton;
    private javax.swing.JButton removeTrainerButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel trainerImageLabel;
    private static javax.swing.JTable trainersTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;

    //Declaração de variáveis e objetos da classe de controle.
    Trainer trainer = new Trainer("", 0, 0, Regions.UNKNOWN.toString());
    static ControllerTrainer controllerTrainer = new ControllerTrainer();
    static List<Trainer> trainersList = new ArrayList<>();
    static ControllerTrainerParty controllerTrainerParty = new ControllerTrainerParty();

    public ViewTrainers() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Treinadores");
        setFocusable(rootPaneCheckingEnabled);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pokeball.svg")).getImage());
        updateTable();
    }
    
    /**
     * Método de inicialização dos componentes da interface gráfica.
     * Criado automaticamente pelo NetBeans.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainersTable = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        filterTextField = new javax.swing.JTextField();
        filterComboBox = new javax.swing.JComboBox<>();
        filterButton = new javax.swing.JButton();
        editTrainerButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        registerTrainerButton = new javax.swing.JButton();
        trainerImageLabel = new javax.swing.JLabel();
        linkPokemonButton = new javax.swing.JButton();
        removeTrainerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        trainersTable.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                changeTrainerImage(evt);
            }
        });

        trainersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    trainersTableMouseClicked(evt);
                }
            }
        });

        filterTextField.addFocusListener(new java.awt.event.FocusAdapter(){
            public void focusGained(java.awt.event.FocusEvent evt){
                filterTextFieldFocusGaned(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                filterTextFieldFocusLost(evt);
            }
        });

        trainersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(trainersTable);
        if (trainersTable.getColumnModel().getColumnCount() > 0) {
            trainersTable.getColumnModel().getColumn(0).setMinWidth(60);
            trainersTable.getColumnModel().getColumn(0).setMaxWidth(60);
            trainersTable.getColumnModel().getColumn(2).setMinWidth(60);
            trainersTable.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("TREINADORES");

        filterTextField.setForeground(new java.awt.Color(102, 102, 102));
        filterTextField.setText("O que você procura?");
        filterTextField.setToolTipText("Digite o valor que deseja buscar conforme o a caixa de seleção ao lado");
        filterTextField.setActionCommand("<Not Set>");

        filterComboBox.setForeground(new java.awt.Color(102, 102, 102));
        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "ID", "Nome", "Idade", "Região" }));

        filterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/filter.png"))); // NOI18N
        filterButton.setText("FILTRAR");

        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        editTrainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit-trainer.png"))); // NOI18N
        editTrainerButton.setText("EDITAR TREINADOR");
        editTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTrainerButtonActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        registerTrainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add-trainer.png"))); // NOI18N
        registerTrainerButton.setText("ADICIONAR TREINADOR");
        registerTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerTrainerButtonActionPerformed(evt);
            }
        });

        trainerImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trainerImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        linkPokemonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/link-pokemon.png"))); // NOI18N
        linkPokemonButton.setText("VINCULAR POKÉMONS AOS TREINADORES");
        linkPokemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkPokemonButtonActionPerformed(evt);
            }
        });

        removeTrainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/remove-trainer.png"))); // NOI18N
        removeTrainerButton.setText("REMOVER TREINADOR");
        removeTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTrainerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filterButton))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editTrainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerTrainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trainerImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(linkPokemonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeTrainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(registerTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(editTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(removeTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(linkPokemonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(trainerImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
    private void registerTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ViewRegisterTrainer viewRegisterTrainer = new ViewRegisterTrainer();
        viewRegisterTrainer.setVisible(true);
    }

    /**
     * Abre a tela de edição de treinadores com os dados do treinador selecionado na tabela
     * @param evt
     */
    private void editTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int id = (int) trainersTable.getValueAt(trainersTable.getSelectedRow(), 0);
            ViewEditTrainer viewEditTrainer = new ViewEditTrainer(id);
            viewEditTrainer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um treinador para editar!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * Abre a tela de vinculação de pokemons aos treinadores com os dados do treinador selecionado na tabela
     * @param evt
     */
    private void linkPokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int id = (int) trainersTable.getValueAt(trainersTable.getSelectedRow(), 0);
            ViewLinkPokemon viewLinkPokemon = new ViewLinkPokemon(id);
            viewLinkPokemon.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um treinador para vincular pokemons!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * Remove o treinador que estiver com a linha selecionada
     * @param evt
     */
    private void removeTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int id = (int) trainersTable.getValueAt(trainersTable.getSelectedRow(), 0);
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente remover o treinador?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                trainersTable.clearSelection();
                controllerTrainer.removeTrainerController(id);
                controllerTrainerParty.removeAllTrainerPartyController(id);
                updateTable();
                JOptionPane.showMessageDialog(null, "Treinador removido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                ViewEditTrainer.clearTables();
                ViewPokedex.updateTable();
                ViewLinkPokemon.loadWildPokemons();
                ViewLinkPokemon.loadTrainedPokemons(id);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Não há pokemons vinculados ao treinador!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um treinador para remover!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Filtra os treinadores conforme o valor da ComboBox
     * @param evt
     */
    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {    DefaultTableModel model = (DefaultTableModel) trainersTable.getModel();
        model.setRowCount(0);

        try {
            if (filterComboBox.getSelectedItem().equals("ID")){
                idSearch(model, filterTextField.getText());
            } else if (filterComboBox.getSelectedItem().equals("Nome")){
                nameSearch(model, filterTextField.getText());
            } else if (filterComboBox.getSelectedItem().equals("Idade")){
                ageSearch(model, filterTextField.getText());
            } else if (filterComboBox.getSelectedItem().equals("Região")){
                regionSearch(model, filterTextField.getText());
            } else if (filterComboBox.getSelectedItem().equals("Todos")){
                updateTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Filtro não encontrado! Informe no campo de texto um valor válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
        } finally {
            filterTextField.setText("");
        }

    }
    /**
     * Busca os treinadores pelo ID
     * @param model
     * @param text
     */
    private void idSearch(DefaultTableModel model, String text) {
        for (Trainer trainer : trainersList) {
            if (trainer.getId() == Integer.parseInt(text)) {
                model.addRow(new Object[]{
                    trainer.getId(),
                    trainer.getName(),
                    trainer.getAge(),
                    trainer.getRegion()
                });
            }
        }
    }

    /**
     * Busca os treinadores pelo nome
     * @param model Tabela de treinadores
     * @param text Texto digitado no campo de filtro
     */
    private void nameSearch(DefaultTableModel model, String text) {
        Pattern pattern = Pattern.compile(text, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Trainer trainer : trainersList) {
            matcher = pattern.matcher(trainer.getName());
            if (matcher.find()) {
                model.addRow(new Object[]{
                    trainer.getId(),
                    trainer.getName(),
                    trainer.getAge(),
                    trainer.getRegion()
                });
            }
        }
    }

    /**
     * Busca os treinadores pela idade
     * @param model Tabela de treinadores
     * @param text Texto digitado no campo de filtro
     */
    private void ageSearch(DefaultTableModel model, String text) {
        for (Trainer trainer : trainersList) {
            if (trainer.getAge() == Integer.parseInt(text)) {
                model.addRow(new Object[]{
                    trainer.getId(),
                    trainer.getName(),
                    trainer.getAge(),
                    trainer.getRegion()
                });
            }
        }
    }

    /**
     * Busca os treinadores pela região
     * @param model Tabela de treinadores
     * @param text Texto digitado no campo de filtro
     */
    private void regionSearch(DefaultTableModel model, String text) {
        Pattern pattern = Pattern.compile(text, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Trainer trainer : trainersList) {
            matcher = pattern.matcher(trainer.getRegion());
            if (matcher.find()) {
                model.addRow(new Object[]{
                    trainer.getId(),
                    trainer.getName(),
                    trainer.getAge(),
                    trainer.getRegion()
                });
            }
        }
    }

    /**
     * Atualiza a tabela de treinadores
     */
    public static void updateTable() {
        trainersList = controllerTrainer.getTrainersController();
        DefaultTableModel model = (DefaultTableModel) trainersTable.getModel();
        model.setRowCount(0);

        for (Trainer trainer : trainersList) {
            model.addRow(new Object[]{
                trainer.getId(),
                trainer.getName(),
                trainer.getAge(),
                trainer.getRegion()
            });
        }
    }

    /**
     * Metodo que limpa o campo de texto do filtro quando é focado.
     * @param evt
     */
    private void filterTextFieldFocusGaned(java.awt.event.FocusEvent evt){
        if(filterTextField.getText().equals("O que você procura?")){
            filterTextField.setText("");
        }
    }

    /**
     * Metodo que preenche o campo de texto do filtro quando é desfocado.
     * @param evt
     */
    private void filterTextFieldFocusLost(java.awt.event.FocusEvent evt){
        if(filterTextField.getText().equals("")){
            filterTextField.setText("O que você procura?");
        }
    }

    /**
     * Metodo que altera a imagem do treinador conforme o treinador selecionado na tabela.
     * @param evt
     */
    private void changeTrainerImage(ListSelectionEvent evt) {
        try{
            trainerImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trainers/" + trainersTable.getValueAt(trainersTable.getSelectedRow(), 1) + ".png")));   
        }
        catch (Exception e){
            trainerImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trainers/BugCatcher.png")));   
        }
    }

    /**
     * Quando clicado duas vezes na linha selecionada da TrainersTable,
     * abre a tela de edição de treinador.
     * @param evt
     */
    private void trainersTableMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            int id = (int) trainersTable.getValueAt(trainersTable.getSelectedRow(), 0);
            ViewEditTrainer editTrainer = new ViewEditTrainer(id);
            editTrainer.setVisible(true);
        }
    }
}
