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
 * @author Lucas Smaniotto & Valtemir Junior
 */
public class ViewLinkPokemon extends javax.swing.JFrame {
    Trainer trainer = new Trainer("", 0, 0, Regions.UNKNOWN.toString());
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
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pokeball.svg")).getImage());
        loadTrainerData(idTrainer);
        loadWildPokemons();
        loadTrainedPokemons(idTrainer);
    }

    /**
     * Método de inicialização dos componentes da interface gráfica.
     * Criado automaticamente pelo NetBeans.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        wildPokemonsTable = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        trainersPokemonLabel = new javax.swing.JLabel();
        pokemonsLabel = new javax.swing.JLabel();
        linkPokemonButton = new javax.swing.JButton();
        removePokemonButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        trainerPokemonsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        iDTextField = new javax.swing.JTextField();
        imageTrainerLabel = new javax.swing.JLabel();
        iDLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        wildPokemonsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    wildPokemonTableMouseClicked(evt);
                }
            }
        });

        trainerPokemonsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    trainerPokemonTableMouseClicked(evt);
                }
            }
        });

        linkPokemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkPokemonButtonActionPerformed(evt);
            }
        });

        removePokemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePokemonButtonActionPerformed(evt);
            }
        });

        wildPokemonsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(wildPokemonsTable);
        if (wildPokemonsTable.getColumnModel().getColumnCount() > 0) {
            wildPokemonsTable.getColumnModel().getColumn(0).setMinWidth(40);
            wildPokemonsTable.getColumnModel().getColumn(0).setMaxWidth(40);
            wildPokemonsTable.getColumnModel().getColumn(1).setMinWidth(100);
            wildPokemonsTable.getColumnModel().getColumn(1).setMaxWidth(100);
            wildPokemonsTable.getColumnModel().getColumn(4).setMinWidth(60);
            wildPokemonsTable.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Vincular Pokémons com Treinadores");

        trainersPokemonLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        trainersPokemonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trainersPokemonLabel.setText("Pokémons do Treinador");

        pokemonsLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        pokemonsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemonsLabel.setText("Pokémons Selvagens");

        linkPokemonButton.setText("Capturar Pokémon ->");

        removePokemonButton.setText("<- Soltar Pokémon");

        trainerPokemonsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(trainerPokemonsTable);
        if (trainerPokemonsTable.getColumnModel().getColumnCount() > 0) {
            trainerPokemonsTable.getColumnModel().getColumn(0).setMinWidth(40);
            trainerPokemonsTable.getColumnModel().getColumn(0).setMaxWidth(40);
            trainerPokemonsTable.getColumnModel().getColumn(1).setMinWidth(100);
            trainerPokemonsTable.getColumnModel().getColumn(1).setMaxWidth(100);
            trainerPokemonsTable.getColumnModel().getColumn(4).setMinWidth(60);
            trainerPokemonsTable.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        nameTextField.setEditable(false);

        nameLabel.setText("Nome:");

        iDTextField.setEditable(false);

        imageTrainerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageTrainerLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        iDLabel.setText("ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageTrainerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iDLabel))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageTrainerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(pokemonsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(trainersPokemonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(linkPokemonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removePokemonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trainersPokemonLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pokemonsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(linkPokemonButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removePokemonButton)
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
        iDTextField.setText(String.valueOf(trainer.getId()));
        nameTextField.setText(trainer.getName());
        try{
            imageTrainerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trainers/" + trainer.getName() + ".png")));
        } catch (Exception e) {
            imageTrainerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trainers/BugCatcher.png")));
        }
    }

    /*
     * Carrega os pokemons selvagens do banco de dados
     */
    public static void loadWildPokemons(){
        if(wildPokemonsTable != null){        
            DefaultTableModel model = (DefaultTableModel) wildPokemonsTable.getModel();
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
    }

    /**
     * Carrega os pokemons do treinador do banco de dados
     * @param id ID do treinador
     */
    public static void loadTrainedPokemons(int id){
        if(trainerPokemonsTable != null){
            DefaultTableModel model = (DefaultTableModel) trainerPokemonsTable.getModel();
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
    }

    /**
     * Método que quando clicado na linha selecionada da tabela WildPokemonsTable
     * abre a tela ViewPokemonDetails do pokemon selecionado
     * @param evt
     */
    private void wildPokemonTableMouseClicked(MouseEvent evt) {
        //pega o valor da string id na coluna ID da linha selecionada e manda para a tela de detalhes
        int id = (int) wildPokemonsTable.getValueAt(wildPokemonsTable.getSelectedRow(), 0);
        ViewPokemonDetails viewPokemonDetails = new ViewPokemonDetails(id);
        viewPokemonDetails.setVisible(true);
    }

    /**
     * Método que quando clicado na linha selecionada da tabela TrainerPokemonsTable
     * abre a tela ViewPokemonDetails do pokemon selecionado
     * @param evt
     */
    private void trainerPokemonTableMouseClicked(MouseEvent evt) {
        int id = (int) trainerPokemonsTable.getValueAt(trainerPokemonsTable.getSelectedRow(), 0);
        ViewPokemonDetails viewPokemonDetails = new ViewPokemonDetails(id);
        viewPokemonDetails.setVisible(true);
    }

    /**
     * Método que pega a linha selecionada da tabela WildPokemonsTable e adiciona na tabela TrainerPokemonsTable
     * utilizando o método linkPokemonController e o valor da string ID no IDTextField
     * @param evt
     */
    private void linkPokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkPokemonButtonActionPerformed
        int idPokemon = (int) wildPokemonsTable.getValueAt(wildPokemonsTable.getSelectedRow(), 0);
        int idTrainer = Integer.parseInt(iDTextField.getText());
        if(controllerPokemon.setWildPokemonToTrainedPokemonController(idPokemon, idTrainer)){
            JOptionPane.showMessageDialog(this, "Pokemon capturado na Pokébola com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            loadTrainedPokemons(idTrainer);
            loadWildPokemons();
            ViewPokedex.updateTable();
            ViewEditTrainer.loadTrainerPokemons(idTrainer);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar pokemon!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LinkPokemonButtonActionPerformed

    /**
     * Método que pega a linha selecionada da tabela TrainerPokemonsTable e remove da tabela TrainerPokemonsTable
     * utilizando o método removePokemonController e o valor da string ID no IDTextField
     * @param evt
     */
    private void removePokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovePokemonButtonActionPerformed
        int idPokemon = (int) trainerPokemonsTable.getValueAt(trainerPokemonsTable.getSelectedRow(), 0);
        int idTrainer = Integer.parseInt(iDTextField.getText());
        if(controllerPokemon.setTrainedPokemonToWildPokemonController(idPokemon)){
            JOptionPane.showMessageDialog(this, "O Pokémon foi solto na natureza com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            loadTrainedPokemons(idTrainer);
            loadWildPokemons();
            ViewPokedex.updateTable();
            ViewEditTrainer.loadTrainerPokemons(idTrainer);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao libertar o pokemon!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RemovePokemonButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iDLabel;
    private javax.swing.JTextField iDTextField;
    private javax.swing.JLabel imageTrainerLabel;
    private javax.swing.JButton linkPokemonButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel pokemonsLabel;
    private javax.swing.JButton removePokemonButton;
    private javax.swing.JLabel titleLabel;
    private static javax.swing.JTable trainerPokemonsTable;
    private javax.swing.JLabel trainersPokemonLabel;
    private static javax.swing.JTable wildPokemonsTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
