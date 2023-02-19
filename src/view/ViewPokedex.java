package view;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

import controller.ControllerPokemon;
import model.WildPokemon;

/**
 * Classe que representa a interface gráfica da Pokedex
 * @author Lucas Smaniotto & Valtemir Junior
 */
public class ViewPokedex extends javax.swing.JFrame {
    WildPokemon wildPokemon = new WildPokemon("", "", "", 0, 0, 0, 0, 0, 0, 0, 0);
    static ControllerPokemon controllerPokemon = new ControllerPokemon();
    static List<WildPokemon> wildPokemonsList = new ArrayList<>();

    public ViewPokedex() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Pokedex");
        setResizable(false);
        setFocusable(rootPaneCheckingEnabled);
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WildPokemonTable = new javax.swing.JTable();
        TitleLabel = new javax.swing.JLabel();
        FilterTextField = new javax.swing.JTextField();
        FilterButton = new javax.swing.JButton();
        FilterComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        RegisterPokemonButton = new javax.swing.JButton();
        ViewTrainersButton = new javax.swing.JButton();
        PokemonImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FilterTextField.addFocusListener(new java.awt.event.FocusAdapter(){
            public void focusGained(java.awt.event.FocusEvent evt){
                FilterTextFieldFocusGaned(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                FilterTextFieldFocusLost(evt);
            }
        });

        WildPokemonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "TIPO 1", "TIPO 2"
            }
        ) {
            Class<Object>[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(WildPokemonTable);
        if (WildPokemonTable.getColumnModel().getColumnCount() > 0) {
            WildPokemonTable.getColumnModel().getColumn(0).setMinWidth(60);
            WildPokemonTable.getColumnModel().getColumn(0).setMaxWidth(60);
            WildPokemonTable.getColumnModel().getColumn(2).setMinWidth(100);
            WildPokemonTable.getColumnModel().getColumn(2).setMaxWidth(100);
            WildPokemonTable.getColumnModel().getColumn(3).setMinWidth(100);
            WildPokemonTable.getColumnModel().getColumn(3).setMaxWidth(100);
        }
        
        WildPokemonTable.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ChangePokemonImage(evt);
            }
        });

        WildPokemonTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    WildPokemonTableMouseClicked(evt);
                }
            }
        });
        
        TitleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("POKÉDEX");
        
        FilterTextField.setForeground(new java.awt.Color(102, 102, 102));
        FilterTextField.setText("O que você procura?");
        FilterTextField.setToolTipText("Digite o valor que deseja buscar conforme o a caixa de seleção ao lado");
        FilterTextField.setActionCommand("<Not Set>");
        FilterTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        
        FilterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/filter.png"))); // NOI18N
        FilterButton.setText("FILTRAR");
        FilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterButtonActionPerformed(evt);
            }
        });
        
        FilterComboBox.setForeground(new java.awt.Color(102, 102, 102));
        FilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "ID", "Nome", "Tipo" }));
        
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        
        RegisterPokemonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add-wild-pokemon.png"))); // NOI18N
        RegisterPokemonButton.setText("ADICIONAR POKEMON");
        RegisterPokemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterPokemonButtonActionPerformed(evt);
            }
        });
        
        ViewTrainersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/view-trainers.png"))); // NOI18N
        ViewTrainersButton.setText("VISUALIZAR TREINADORES");
        ViewTrainersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTrainersButtonActionPerformed(evt);
            }
        });
        
        PokemonImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokemonImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(FilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(FilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(FilterButton)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(RegisterPokemonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewTrainersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PokemonImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        jPanel1Layout.setVerticalGroup(
                            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(21, Short.MAX_VALUE)
            .addComponent(TitleLabel)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(FilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ViewTrainersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RegisterPokemonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(PokemonImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(15, 15, 15))
                            );
                        
                        FilterTextField.getAccessibleContext().setAccessibleName("");
                        ViewTrainersButton.getAccessibleContext().setAccessibleName("TREINADORES");
                        
                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                        getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(
                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                            );
                            layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    /**
     * Abre a tela de vizualização de treinadores
     * @param evt
     */
    private void ViewTrainersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTrainersButtonActionPerformed
        ViewTrainers viewTrainers = new ViewTrainers();
        viewTrainers.setVisible(true);
    }//GEN-LAST:event_ViewTrainersButtonActionPerformed
    
    /**
     * Abre a tela de registro de pokemons
     * @param evt
     */
    private void RegisterPokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterPokemonButtonActionPerformed
        ViewRegisterPokemon viewRegisterPokemon = new ViewRegisterPokemon();
        viewRegisterPokemon.setVisible(true);
    }//GEN-LAST:event_RegisterPokemonButtonActionPerformed

    /**
     * Altera a imagem do pokemon quando a linha da tabela recebe foco
     * @param evt
     */
    private void ChangePokemonImage(ListSelectionEvent evt) {
        try {
            PokemonImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokemon/" + WildPokemonTable.getValueAt(WildPokemonTable.getSelectedRow(), 1) +".png")));
        } catch (Exception e) {
            PokemonImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokemon/missingno.png")));
        }
    }
    
    /**
     * Abre a tela de detalhes do pokemon selecionado quando a linha da tabela é clicada duas vezes
     * @param evt
     */
    private void WildPokemonTableMouseClicked(MouseEvent evt) {
        ViewPokemonDetails viewPokemonDetails = new ViewPokemonDetails((int) WildPokemonTable.getValueAt(WildPokemonTable.getSelectedRow(), 0));
        viewPokemonDetails.setVisible(true);
    }

    /**
     * Filtra os pokemons selvagens conforme o valor da ComboBox
     * @param evt
     */
    private void FilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) WildPokemonTable.getModel();
        model.setRowCount(0);

        try {
            if (FilterComboBox.getSelectedItem().equals("ID")) {
                idSearch(model, FilterTextField.getText());
            } else if (FilterComboBox.getSelectedItem().equals("Nome")) {
                nameSearch(model, FilterTextField.getText());
            } else if (FilterComboBox.getSelectedItem().equals("Tipo")) {
                typeSearch(model, FilterTextField.getText());
            } else if (FilterComboBox.getSelectedItem().equals("Todos")) {
                updateTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Filtro não encontrado! Informe no campo de texto um valor válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
        } finally {
            FilterTextField.setText("");
        }
        
    }//GEN-LAST:event_FilterButtonActionPerformed

    /**
     * Busca os pokemons selvagens pelo ID
     * @param model Tabela de pokemons selvagens
     * @param text Texto digitado no campo de filtro
     */
    private void idSearch(DefaultTableModel model, String text) {
        for (WildPokemon pokemon : wildPokemonsList) {
            if (pokemon.getId() == Integer.parseInt(text)) {
                model.addRow(new Object[] {
                    pokemon.getId(),
                    pokemon.getName(),
                    pokemon.getFirstType(),
                    pokemon.getSecondType(),
                });
            }
        }
    }

    /**
     * Busca os pokemons selvagens pelo nome
     * @param model Tabela de pokemons selvagens
     * @param text Texto digitado no campo de filtro
     */
    private void nameSearch(DefaultTableModel model, String text) {
        Pattern pattern = Pattern.compile(text, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (WildPokemon pokemon : wildPokemonsList) {
            matcher = pattern.matcher(pokemon.getName());
            if (matcher.find()) {
                model.addRow(new Object[] {
                    pokemon.getId(),
                    pokemon.getName(),
                    pokemon.getFirstType(),
                    pokemon.getSecondType(),
                });
            }
        }
    }

    /**
     * Busca os pokemons selvagens pelo tipo
     * @param model Tabela de pokemons selvagens
     * @param text Texto digitado no campo de filtro
     */
    private void typeSearch(DefaultTableModel model, String text) {
        Pattern pattern = Pattern.compile(text, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (WildPokemon pokemon : wildPokemonsList) {
            matcher = pattern.matcher(pokemon.getFirstType());
            if (matcher.find()) {
                model.addRow(new Object[] {
                    pokemon.getId(),
                    pokemon.getName(),
                    pokemon.getFirstType(),
                    pokemon.getSecondType(),
                });
            } else {
                matcher = pattern.matcher(pokemon.getSecondType());
                if (matcher.find()) {
                    model.addRow(new Object[] {
                        pokemon.getId(),
                        pokemon.getName(),
                        pokemon.getFirstType(),
                        pokemon.getSecondType(),
                    });
                }
            }
        }
    }
    
    /**
     * Atualiza a tabela de pokemons selvagens
     */
    public static void updateTable() {
        wildPokemonsList = controllerPokemon.getWildPokemonsController();
        DefaultTableModel model = (DefaultTableModel) WildPokemonTable.getModel();
        model.setRowCount(0);

        for (WildPokemon pokemon : wildPokemonsList) {
            model.addRow(new Object[]{
                pokemon.getId(),
                pokemon.getName(),
                pokemon.getFirstType(),
                pokemon.getSecondType(),
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FilterButton;
    private javax.swing.JComboBox<String> FilterComboBox;
    private javax.swing.JTextField FilterTextField;
    private javax.swing.JLabel PokemonImageLabel;
    private javax.swing.JButton RegisterPokemonButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton ViewTrainersButton;
    private static javax.swing.JTable WildPokemonTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}