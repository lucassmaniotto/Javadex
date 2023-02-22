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
 * @author Lucas Smaniotto e Valtemir Junior
 */
public class ViewPokedex extends javax.swing.JFrame {
    //Declaração de componentes da interface gráfica.
    private javax.swing.JButton filterButton;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JTextField filterTextField;
    private javax.swing.JLabel pokemonImageLabel;
    private javax.swing.JButton registerPokemonButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewTrainersButton;
    private static javax.swing.JTable wildPokemonTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;

    //Declaração de variáveis e objetos da classe de controle.
    WildPokemon wildPokemon = new WildPokemon("", "", "", 0, 0, 0, 0, 0, 0, 0, 0);
    static ControllerPokemon controllerPokemon = new ControllerPokemon();
    static List<WildPokemon> wildPokemonsList = new ArrayList<>();

    public ViewPokedex() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Pokedex");
        setResizable(false);
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
        wildPokemonTable = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        filterTextField = new javax.swing.JTextField();
        filterButton = new javax.swing.JButton();
        filterComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        registerPokemonButton = new javax.swing.JButton();
        viewTrainersButton = new javax.swing.JButton();
        pokemonImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        filterTextField.addFocusListener(new java.awt.event.FocusAdapter(){
            public void focusGained(java.awt.event.FocusEvent evt){
                filterTextFieldFocusGaned(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt){
                filterTextFieldFocusLost(evt);
            }
        });

        wildPokemonTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(wildPokemonTable);
        if (wildPokemonTable.getColumnModel().getColumnCount() > 0) {
            wildPokemonTable.getColumnModel().getColumn(0).setMinWidth(60);
            wildPokemonTable.getColumnModel().getColumn(0).setMaxWidth(60);
            wildPokemonTable.getColumnModel().getColumn(2).setMinWidth(100);
            wildPokemonTable.getColumnModel().getColumn(2).setMaxWidth(100);
            wildPokemonTable.getColumnModel().getColumn(3).setMinWidth(100);
            wildPokemonTable.getColumnModel().getColumn(3).setMaxWidth(100);
        }
        
        wildPokemonTable.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                changePokemonImage(evt);
            }
        });

        wildPokemonTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    wildPokemonTableMouseClicked(evt);
                }
            }
        });
        
        titleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("POKÉDEX");
        
        filterTextField.setForeground(new java.awt.Color(102, 102, 102));
        filterTextField.setText("O que você procura?");
        filterTextField.setToolTipText("Digite o valor que deseja buscar conforme o a caixa de seleção ao lado");
        filterTextField.setActionCommand("<Not Set>");
        filterTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        
        filterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/filter.png"))); // NOI18N
        filterButton.setText("FILTRAR");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });
        
        filterComboBox.setForeground(new java.awt.Color(102, 102, 102));
        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "ID", "Nome", "Tipo" }));
        
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        
        registerPokemonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add-wild-pokemon.png"))); // NOI18N
        registerPokemonButton.setText("ADICIONAR POKEMON");
        registerPokemonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPokemonButtonActionPerformed(evt);
            }
        });
        
        viewTrainersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/view-trainers.png"))); // NOI18N
        viewTrainersButton.setText("VISUALIZAR TREINADORES");
        viewTrainersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTrainersButtonActionPerformed(evt);
            }
        });
        
        pokemonImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemonImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(filterButton)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(registerPokemonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewTrainersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pokemonImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        jPanel1Layout.setVerticalGroup(
                            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(21, Short.MAX_VALUE)
            .addComponent(titleLabel)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(viewTrainersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(registerPokemonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(pokemonImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(15, 15, 15))
                            );
                        
                        filterTextField.getAccessibleContext().setAccessibleName("");
                        viewTrainersButton.getAccessibleContext().setAccessibleName("TREINADORES");
                        
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
    }
    
    
    /**
     * Abre a tela de vizualização de treinadores
     * @param evt
     */
    private void viewTrainersButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ViewTrainers viewTrainers = new ViewTrainers();
        viewTrainers.setVisible(true);
    }
    /**
     * Abre a tela de registro de pokemons
     * @param evt
     */
    private void registerPokemonButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ViewRegisterPokemon viewRegisterPokemon = new ViewRegisterPokemon();
        viewRegisterPokemon.setVisible(true);
    }

    /**
     * Altera a imagem do pokemon quando a linha da tabela recebe foco
     * @param evt
     */
    private void changePokemonImage(ListSelectionEvent evt) {
        try {
            pokemonImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokemon/" + wildPokemonTable.getValueAt(wildPokemonTable.getSelectedRow(), 1) +".png")));
        } catch (Exception e) {
            pokemonImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokemon/missingno.png")));
        }
    }
    
    /**
     * Abre a tela de detalhes do pokemon selecionado quando a linha da tabela é clicada duas vezes
     * @param evt
     */
    private void wildPokemonTableMouseClicked(MouseEvent evt) {
        ViewPokemonDetails viewPokemonDetails = new ViewPokemonDetails((int) wildPokemonTable.getValueAt(wildPokemonTable.getSelectedRow(), 0));
        viewPokemonDetails.setVisible(true);
    }

    /**
     * Filtra os pokemons selvagens conforme o valor da ComboBox
     * @param evt
     */
    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) wildPokemonTable.getModel();
        model.setRowCount(0);

        try {
            if (filterComboBox.getSelectedItem().equals("ID")) {
                idSearch(model, filterTextField.getText());
            } else if (filterComboBox.getSelectedItem().equals("Nome")) {
                nameSearch(model, filterTextField.getText());
            } else if (filterComboBox.getSelectedItem().equals("Tipo")) {
                typeSearch(model, filterTextField.getText());
            } else if (filterComboBox.getSelectedItem().equals("Todos")) {
                updateTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Filtro não encontrado! Informe no campo de texto um valor válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
        } finally {
            filterTextField.setText("");
        }
    }

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
        DefaultTableModel model = (DefaultTableModel) wildPokemonTable.getModel();
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
}