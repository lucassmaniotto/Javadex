package view;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerTrainer;
import model.Regions;
import model.Trainer;

/**
 * Classe que representa a interface gráfica de vincular um pokémon selvagem a um treinador.
 */
public class ViewLinkPokemon extends javax.swing.JFrame {
    Trainer trainer = new Trainer("", 0, 0, Regions.UNKNOWN.toString(), 0);
    static ControllerTrainer controllerTrainer = new ControllerTrainer();
    static List<Trainer> trainersList = new ArrayList<>();
    
    public ViewLinkPokemon() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Vincular Pokémon");
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
        TrainersLabel = new javax.swing.JLabel();
        javax.swing.JComboBox<String> TrainersComboBox = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TrainerPokemonsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        WildPokemonsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(WildPokemonsTable);
        if (WildPokemonsTable.getColumnModel().getColumnCount() > 0) {
            WildPokemonsTable.getColumnModel().getColumn(0).setMinWidth(30);
            WildPokemonsTable.getColumnModel().getColumn(0).setMaxWidth(30);
            WildPokemonsTable.getColumnModel().getColumn(1).setMinWidth(125);
            WildPokemonsTable.getColumnModel().getColumn(1).setMaxWidth(125);
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

        TrainersLabel.setText("Treinador: ");

        //setar os treinadores do banco de dados no combobox
        trainersList = controllerTrainer.getTrainersController();
        for (Trainer trainer : trainersList) {
            TrainersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { trainer.getName() }));
        }



        TrainerPokemonsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TrainerPokemonsTable);
        if (TrainerPokemonsTable.getColumnModel().getColumnCount() > 0) {
            TrainerPokemonsTable.getColumnModel().getColumn(0).setMinWidth(30);
            TrainerPokemonsTable.getColumnModel().getColumn(0).setMaxWidth(30);
            TrainerPokemonsTable.getColumnModel().getColumn(1).setMinWidth(125);
            TrainerPokemonsTable.getColumnModel().getColumn(1).setMaxWidth(125);
        }

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
                        .addGap(374, 374, 374)
                        .addComponent(TrainersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TrainersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TrainersLabel)
                    .addComponent(TrainersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LinkPokemonButton;
    private javax.swing.JLabel PokemonsLabel;
    private javax.swing.JButton RemovePokemonButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTable TrainerPokemonsTable;
    private javax.swing.JLabel TrainersLabel;
    private javax.swing.JLabel TrainersPokemonLabel;
    private javax.swing.JTable WildPokemonsTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
