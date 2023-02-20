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
        updateTable();
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
        RemoveTrainerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TrainersTable.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ChangeTrainerImage(evt);
            }
        });

        TrainersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    TrainersTableMouseClicked(evt);
                }
            }
        });

        FilterTextField.addFocusListener(new java.awt.event.FocusAdapter(){
            public void focusGained(java.awt.event.FocusEvent evt){
                FilterTextFieldFocusGaned(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                FilterTextFieldFocusLost(evt);
            }
        });

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
        RegisterTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterTrainerButtonActionPerformed(evt);
            }
        });

        TrainerImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrainerImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LinkPokemonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/link-pokemon.png"))); // NOI18N
        LinkPokemonButton.setText("VINCULAR POKÉMONS AOS TREINADORES");
        LinkPokemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkPokemonButtonActionPerformed(evt);
            }
        });

        RemoveTrainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/remove-trainer.png"))); // NOI18N
        RemoveTrainerButton.setText("REMOVER TREINADOR");
        RemoveTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTrainerButtonActionPerformed(evt);
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
                    .addComponent(LinkPokemonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveTrainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(RemoveTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LinkPokemonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TrainerImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
     * Abre a tela de edição de treinadores com os dados do treinador selecionado na tabela
     * @param evt
     */
    private void EditTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTrainerButtonActionPerformed
        try {
            int id = (int) TrainersTable.getValueAt(TrainersTable.getSelectedRow(), 0);
            ViewEditTrainer viewEditTrainer = new ViewEditTrainer(id);
            viewEditTrainer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um treinador para editar!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_EditTrainerButtonActionPerformed

    /**
     * Abre a tela de vinculação de pokemons aos treinadores com os dados do treinador selecionado na tabela
     * @param evt
     */
    private void LinkPokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkPokemonButtonActionPerformed
        try {
            int id = (int) TrainersTable.getValueAt(TrainersTable.getSelectedRow(), 0);
            ViewLinkPokemon viewLinkPokemon = new ViewLinkPokemon(id);
            viewLinkPokemon.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um treinador para vincular pokemons!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_LinkPokemonButtonActionPerformed

    /**
     * Remove o treinador que estiver com a linha selecionada
     * @param evt
     */
    private void RemoveTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTrainerButtonActionPerformed
        try {
            int id = (int) TrainersTable.getValueAt(TrainersTable.getSelectedRow(), 0);
            controllerTrainer.removeTrainerController(id);
            controllerTrainerParty.removeAllTrainerPartyController(id);
            updateTable();
            ViewPokedex.updateTable();
            ViewLinkPokemon.loadWildPokemons();
            ViewLinkPokemon.loadTrainedPokemons(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um treinador para remover!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RemoveTrainerButtonActionPerformed
    
    /**
     * Filtra os treinadores conforme o valor da ComboBox
     * @param evt
     */
    private void FilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) TrainersTable.getModel();
        model.setRowCount(0);

        try {
            if (FilterComboBox.getSelectedItem().equals("ID")){
                idSearch(model, FilterTextField.getText());
            } else if (FilterComboBox.getSelectedItem().equals("Nome")){
                nameSearch(model, FilterTextField.getText());
            } else if (FilterComboBox.getSelectedItem().equals("Idade")){
                ageSearch(model, FilterTextField.getText());
            } else if (FilterComboBox.getSelectedItem().equals("Região")){
                regionSearch(model, FilterTextField.getText());
            } else if (FilterComboBox.getSelectedItem().equals("Todos")){
                updateTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Filtro não encontrado! Informe no campo de texto um valor válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
        } finally {
            FilterTextField.setText("");
        }

    }//GEN-LAST:event_FilterButtonActionPerformed


    
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
        DefaultTableModel model = (DefaultTableModel) TrainersTable.getModel();
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
    private void FilterTextFieldFocusGaned(java.awt.event.FocusEvent evt){
        if(FilterTextField.getText().equals("O que você procura?")){
            FilterTextField.setText("");
        }
    }

    /**
     * Metodo que preenche o campo de texto do filtro quando é desfocado.
     * @param evt
     */
    private void FilterTextFieldFocusLost(java.awt.event.FocusEvent evt){
        if(FilterTextField.getText().equals("")){
            FilterTextField.setText("O que você procura?");
        }
    }

    /**
     * Metodo que altera a imagem do treinador conforme o treinador selecionado na tabela.
     * @param evt
     */
    private void ChangeTrainerImage(ListSelectionEvent evt) {
        try{
            TrainerImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trainers/" + TrainersTable.getValueAt(TrainersTable.getSelectedRow(), 1) + ".png")));   
        }
        catch (Exception e){
            TrainerImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trainers/BugCatcher.png")));   
        }
    }

    /**
     * Quando clicado duas vezes na linha selecionada da TrainersTable,
     * abre a tela de edição de treinador.
     * @param evt
     */
    private void TrainersTableMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            int id = (int) TrainersTable.getValueAt(TrainersTable.getSelectedRow(), 0);
            ViewEditTrainer editTrainer = new ViewEditTrainer(id);
            editTrainer.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditTrainerButton;
    private javax.swing.JButton FilterButton;
    private javax.swing.JComboBox<String> FilterComboBox;
    private javax.swing.JTextField FilterTextField;
    private javax.swing.JButton LinkPokemonButton;
    private javax.swing.JButton RegisterTrainerButton;
    private javax.swing.JButton RemoveTrainerButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TrainerImageLabel;
    private static javax.swing.JTable TrainersTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
