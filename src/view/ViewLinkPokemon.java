package view;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controller.ControllerPokemon;
import controller.ControllerTrainer;
import model.Regions;
import model.TrainedPokemon;
import model.Trainer;
import model.Types;
import model.WildPokemon;

/**
 * Classe que representa a interface gráfica de vincular um pokémon selvagem a um treinador.
 */
public class ViewLinkPokemon extends javax.swing.JFrame {
    Trainer trainer = new Trainer("", 0, 0, Regions.UNKNOWN.toString(), 0);
    static ControllerTrainer controllerTrainer = new ControllerTrainer();
    static List<Trainer> trainersList = new ArrayList<>();

    static ControllerPokemon controllerPokemon = new ControllerPokemon();

    WildPokemon pokemon = new WildPokemon("", Types.NONE.toString(), Types.NONE.toString(), 0, 0, 0, 0, 0, 0, 0, 0);
    static List<WildPokemon> pokemonsList = new ArrayList<>();

    TrainedPokemon trainedPokemon = new TrainedPokemon("", Types.NONE.toString(), Types.NONE.toString(), 0, 0, 0, 0, 0, 0, 0, 0);
    static List<TrainedPokemon> trainedPokemonsList = new ArrayList<>();
    
    public ViewLinkPokemon(int idTrainer) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Vincular Pokémon");
        loadTrainerData(idTrainer);
        loadWildPokemons();
        loadTrainedPokemons(idTrainer);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        WildPokemonsTable = new javax.swing.JTable();
        TitleLabel = new javax.swing.JLabel();
        TrainersPokemonLabel = new javax.swing.JLabel();
        PokemonsLabel = new javax.swing.JLabel();
        LinkPokemonButton = new javax.swing.JButton();
        RemovePokemonButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        TrainerPokemonsTable = new javax.swing.JTable();
        IDLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        WildPokemonsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    WildPokemonTableMouseClicked(evt);
                }
            }
        });

        TrainerPokemonsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    TrainerPokemonTableMouseClicked(evt);
                }
            }
        });

        LinkPokemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkPokemonButtonActionPerformed(evt);
            }
        });

        RemovePokemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovePokemonButtonActionPerformed(evt);
            }
        });


        WildPokemonsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(WildPokemonsTable);
        if (WildPokemonsTable.getColumnModel().getColumnCount() > 0) {
            WildPokemonsTable.getColumnModel().getColumn(0).setMinWidth(40);
            WildPokemonsTable.getColumnModel().getColumn(0).setMaxWidth(40);
            WildPokemonsTable.getColumnModel().getColumn(1).setMinWidth(100);
            WildPokemonsTable.getColumnModel().getColumn(1).setMaxWidth(100);
            WildPokemonsTable.getColumnModel().getColumn(4).setMinWidth(60);
            WildPokemonsTable.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        TitleLabel.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Vincular Pokémons com Treinadores");

        TrainersPokemonLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        TrainersPokemonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrainersPokemonLabel.setText("Pokémons do Treinador");

        PokemonsLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        PokemonsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokemonsLabel.setText("Pokémons Selvagens");

        LinkPokemonButton.setText("Capturar Pokémon ->");

        RemovePokemonButton.setText("<- Soltar Pokémon");

        TrainerPokemonsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TrainerPokemonsTable);
        if (TrainerPokemonsTable.getColumnModel().getColumnCount() > 0) {
            TrainerPokemonsTable.getColumnModel().getColumn(0).setMinWidth(40);
            TrainerPokemonsTable.getColumnModel().getColumn(0).setMaxWidth(40);
            TrainerPokemonsTable.getColumnModel().getColumn(1).setMinWidth(100);
            TrainerPokemonsTable.getColumnModel().getColumn(1).setMaxWidth(100);
            TrainerPokemonsTable.getColumnModel().getColumn(4).setMinWidth(60);
            TrainerPokemonsTable.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        IDLabel.setText("ID:");

        IDTextField.setEditable(false);

        NameLabel.setText("Nome:");

        NameTextField.setEditable(false);
        NameTextField.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(PokemonsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TrainersPokemonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LinkPokemonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RemovePokemonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(NameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TrainersPokemonLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PokemonsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LinkPokemonButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemovePokemonButton)
                        .addGap(160, 160, 160))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
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
     * Carrega os dados do treinador nos campos
     * @param id ID do treinador
     */
    private void loadTrainerData(int id){
        trainer = controllerTrainer.getTrainerByIDController(id);
        IDTextField.setText(String.valueOf(trainer.getId()));
        NameTextField.setText(trainer.getName());
    }

    /*
     * Carrega os pokemons selvagens do banco de dados
     */
    private void loadWildPokemons(){
        DefaultTableModel model = (DefaultTableModel) WildPokemonsTable.getModel();
        model.setRowCount(0);

        pokemonsList = controllerPokemon.getWildPokemonsController();

        for(WildPokemon pokemon : pokemonsList){
            model.addRow(new Object[]{
                pokemon.getId(),
                pokemon.getName(),
                pokemon.getFirstType(),
                pokemon.getSecondType(),
                pokemon.getTotal()
            });
        } 
    }

    /*
     * Carrega os pokemons do treinador do banco de dados
     * @param id ID do treinador
     */
    private void loadTrainedPokemons(int id){
        DefaultTableModel model = (DefaultTableModel) TrainerPokemonsTable.getModel();
        model.setRowCount(0);

        trainedPokemonsList = controllerPokemon.getTrainedPokemonsController(id);

        for(TrainedPokemon pokemon : trainedPokemonsList){
            model.addRow(new Object[]{
                pokemon.getId(),
                pokemon.getName(),
                pokemon.getFirstType(),
                pokemon.getSecondType(),
                pokemon.getTotal()
            });
        }
    }

    /**
     * Método que quando clicado na linha selecionada da tabela WildPokemonsTable
     * abre a tela ViewPokemonDetails do pokemon selecionado
     * @param evt
     */
    private void WildPokemonTableMouseClicked(MouseEvent evt) {
        //pega o valor da string id na coluna ID da linha selecionada e manda para a tela de detalhes
        int id = (int) WildPokemonsTable.getValueAt(WildPokemonsTable.getSelectedRow(), 0);
        ViewPokemonDetails viewPokemonDetails = new ViewPokemonDetails(id);
        viewPokemonDetails.setVisible(true);
    }
    /**
     * Método que quando clicado na linha selecionada da tabela TrainerPokemonsTable
     * abre a tela ViewPokemonDetails do pokemon selecionado
     * @param evt
     */
    private void TrainerPokemonTableMouseClicked(MouseEvent evt) {
        int id = (int) TrainerPokemonsTable.getValueAt(TrainerPokemonsTable.getSelectedRow(), 0);
        ViewPokemonDetails viewPokemonDetails = new ViewPokemonDetails(id);
        viewPokemonDetails.setVisible(true);
    }

    /**
     * Método que pega a linha selecionada da tabela WildPokemonsTable e adiciona na tabela TrainerPokemonsTable
     * utilizando o método linkPokemonController e o valor da string ID no IDTextField
     * @param evt
     */
    private void LinkPokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkPokemonButtonActionPerformed
        int idPokemon = (int) WildPokemonsTable.getValueAt(WildPokemonsTable.getSelectedRow(), 0);
        int idTrainer = Integer.parseInt(IDTextField.getText());
        if(controllerPokemon.setWildPokemonToTrainedPokemonController(idPokemon, idTrainer)){
            JOptionPane.showMessageDialog(this, "Pokemon capturado na Pokébola com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            loadTrainedPokemons(idTrainer);
            loadWildPokemons();
            ViewPokedex.updateTable();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar pokemon!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LinkPokemonButtonActionPerformed

    /**
     * Método que pega a linha selecionada da tabela TrainerPokemonsTable e remove da tabela TrainerPokemonsTable
     * utilizando o método removePokemonController e o valor da string ID no IDTextField
     * @param evt
     */
    private void RemovePokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovePokemonButtonActionPerformed
        int idPokemon = (int) TrainerPokemonsTable.getValueAt(TrainerPokemonsTable.getSelectedRow(), 0);
        int idTrainer = Integer.parseInt(IDTextField.getText());
        if(controllerPokemon.setTrainedPokemonToWildPokemonController(idPokemon)){
            JOptionPane.showMessageDialog(this, "O Pokémon foi solto na natureza com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            loadTrainedPokemons(idTrainer);
            loadWildPokemons();
            ViewPokedex.updateTable();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao libertar o pokemon!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RemovePokemonButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JButton LinkPokemonButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PokemonsLabel;
    private javax.swing.JButton RemovePokemonButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTable TrainerPokemonsTable;
    private javax.swing.JLabel TrainersPokemonLabel;
    private javax.swing.JTable WildPokemonsTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
