package view;
import javax.swing.JOptionPane;

import controller.ControllerPokemon;
import model.Types;
import model.WildPokemon;

/**
 * Classe que representa a interface gráfica de registro de Pokémon selvagens.
 * @author Lucas Smaniotto & Valtemir Junior
 */
public class ViewRegisterPokemon extends javax.swing.JFrame {
    WildPokemon pokemon = new WildPokemon("", Types.NONE.toString(), Types.NONE.toString(), 0, 0, 0, 0, 0, 0, 0, 0);
    ControllerPokemon controllerPokemon = new ControllerPokemon();
    
    public ViewRegisterPokemon() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Cadastro de Pokémon");
    }

    /**
     * Método de inicialização dos componentes da interface gráfica.
     * Criado automaticamente pelo NetBeans.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        FirstTypeLabel = new javax.swing.JLabel();
        FirstTypeComboBox = new javax.swing.JComboBox<>();
        SecondTypeComboBox = new javax.swing.JComboBox<>();
        SecondTypeLabel = new javax.swing.JLabel();
        ShinyCheckBox = new javax.swing.JCheckBox();
        HeightLabel = new javax.swing.JLabel();
        WeightLabel = new javax.swing.JLabel();
        HeightTextField = new javax.swing.JTextField();
        WeightTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        HPLabel = new javax.swing.JLabel();
        ATQLabel = new javax.swing.JLabel();
        DEFLabel = new javax.swing.JLabel();
        SpeedLabel = new javax.swing.JLabel();
        sATQLabel = new javax.swing.JLabel();
        sDEFLabel = new javax.swing.JLabel();
        HPTextField = new javax.swing.JTextField();
        ATQTextField = new javax.swing.JTextField();
        DEFTextField = new javax.swing.JTextField();
        SpeedTextField = new javax.swing.JTextField();
        TotalLabel = new javax.swing.JLabel();
        TotalValueLabel = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        sATQTextField = new javax.swing.JTextField();
        sDEFTextField = new javax.swing.JTextField();
        IDLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TitleLabel.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Cadastro de Pokémon");

        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Nome:");

        NameTextField.setToolTipText("Digite o nome de seu Pokémon");

        FirstTypeLabel.setText("Tipo 1:");

        FirstTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { Types.NONE.toString(), Types.NORMAL.toString(), Types.FIRE.toString(), Types.WATER.toString(), Types.GRASS.toString(), Types.FLYING.toString(), Types.FIGHTING.toString(), Types.POISON.toString(), Types.ELECTRIC.toString(), Types.GROUND.toString(), Types.ROCK.toString(), Types.PSYCHIC.toString(), Types.ICE.toString(), Types.BUG.toString(), Types.GHOST.toString(), Types.STEEL.toString(), Types.DRAGON.toString(), Types.DARK.toString(), Types.FAIRY.toString()}));

        SecondTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { Types.NONE.toString(), Types.NORMAL.toString(), Types.FIRE.toString(), Types.WATER.toString(), Types.GRASS.toString(), Types.FLYING.toString(), Types.FIGHTING.toString(), Types.POISON.toString(), Types.ELECTRIC.toString(), Types.GROUND.toString(), Types.ROCK.toString(), Types.PSYCHIC.toString(), Types.ICE.toString(), Types.BUG.toString(), Types.GHOST.toString(), Types.STEEL.toString(), Types.DRAGON.toString(), Types.DARK.toString(), Types.FAIRY.toString()}));

        SecondTypeLabel.setText("Tipo 2:");

        ShinyCheckBox.setText("Shiny");

        HeightLabel.setText("Altura:");

        WeightLabel.setText("Peso:");

        HeightTextField.setToolTipText("Informe a altura do Pokémon");

        WeightTextField.setToolTipText("Informe o peso do Pokémon");

        HPLabel.setText("HP:");

        ATQLabel.setText("ATQ:");

        DEFLabel.setText("DEF:");

        SpeedLabel.setText("VELOC:");

        sATQLabel.setText("S. ATQ:");

        sDEFLabel.setText("S. DEF:");

        HPTextField.setToolTipText("Informe os Pontos de Vida do Pokémon");

        ATQTextField.setToolTipText("Informe os Pontos de Ataque do Pokémon");

        DEFTextField.setToolTipText("Informe os Pontos de Defesa do Pokémon");

        SpeedTextField.setToolTipText("Informe a Velocidade do Pokémon");

        TotalLabel.setText("TOTAL:");

        TotalValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalValueLabel.setText("???");
        TotalValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/save.png"))); // NOI18N
        SaveButton.setText("Salvar");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/exit.png"))); // NOI18N
        ExitButton.setText("Sair");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        sATQTextField.setToolTipText("Informe o valor do Ataque Especial do Pokémon");

        sDEFTextField.setToolTipText("Informe o valor da Defesa Especial do Pokémon");

        IDLabel.setText("ID:");

        IDTextField.setEditable(false);

        IDTextField.setToolTipText("ID do Pokémon");

        IDTextField.setText(String.valueOf(controllerPokemon.getTheNextIdToInsertController()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NameLabel)
                                    .addComponent(FirstTypeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FirstTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ShinyCheckBox))
                                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(SecondTypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SecondTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(WeightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HeightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(IDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(HeightTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addComponent(IDTextField))
                            .addComponent(WeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DEFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ATQTextField)
                                            .addComponent(DEFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ATQLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sDEFLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(sATQLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sATQTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sDEFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(HPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(SpeedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalValueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(TotalLabel)
                                .addGap(25, 25, 25))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(ExitButton)
                        .addGap(54, 54, 54)
                        .addComponent(SaveButton)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDLabel)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstTypeLabel)
                            .addComponent(ShinyCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SecondTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SecondTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HPLabel)
                            .addComponent(SpeedLabel)
                            .addComponent(HPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ATQTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ATQLabel)
                            .addComponent(sATQLabel)
                            .addComponent(sATQTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DEFLabel)
                            .addComponent(DEFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sDEFLabel)
                            .addComponent(sDEFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(TotalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalValueLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveButton)
                            .addComponent(ExitButton))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HeightLabel)
                            .addComponent(HeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WeightLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
     * Método para capturar os dados do Pokémon a serem cadastrados no formulário e enviá-los para o banco de dados.
     * @param evt
     */
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        pokemon.setName(NameTextField.getText());
        if (NameTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O Pokemón precisa de um nome!", "Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }
        pokemon.setFirstType(FirstTypeComboBox.getSelectedItem().toString());
        pokemon.setSecondType(SecondTypeComboBox.getSelectedItem().toString());
        pokemon.setShiny(ShinyCheckBox.isSelected());
        try {
            pokemon.setHp(Integer.parseInt(HPTextField.getText()));
            pokemon.setAttack(Integer.parseInt(ATQTextField.getText()));
            pokemon.setDefense(Integer.parseInt(DEFTextField.getText()));
            pokemon.setSpAttack(Integer.parseInt(sATQTextField.getText()));
            pokemon.setSpDefense(Integer.parseInt(sDEFTextField.getText()));
            pokemon.setSpeed(Integer.parseInt(SpeedTextField.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Os atributos do Pokémon devem ser números inteiros!", "Erro",JOptionPane.ERROR_MESSAGE);
            HPTextField.setText("0");
            ATQTextField.setText("0");
            DEFTextField.setText("0");
            sATQTextField.setText("0");
            sDEFTextField.setText("0");
            SpeedTextField.setText("0");
            return;
        }
        try {
            pokemon.setHeight(Float.parseFloat(HeightTextField.getText()));
            pokemon.setWeight(Float.parseFloat(WeightTextField.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "A altura e o peso do Pokémon devem ser números reais e escritos com '.'!", "Erro",JOptionPane.ERROR_MESSAGE);
            HeightTextField.setText("0.0");
            WeightTextField.setText("0.0");
            return;
        }
        pokemon.setTotal(pokemon.getHp() + pokemon.getAttack() + pokemon.getDefense() + pokemon.getSpAttack() + pokemon.getSpDefense() + pokemon.getSpeed());
        TotalValueLabel.setText(String.valueOf(pokemon.getTotal()));
        
        if(controllerPokemon.saveWildPokemonController(pokemon)){
            JOptionPane.showMessageDialog(this, "Pokemon registrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            updateFieldsOnSave();
            ViewPokedex.updateTable();
            ViewLinkPokemon.loadWildPokemons();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário!", "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    /**
     * Limpa os campos do formulário e atualiza o ID do Pokémon.
     */
    private void updateFieldsOnSave(){
        NameTextField.setText("");
        FirstTypeComboBox.setSelectedIndex(0);
        SecondTypeComboBox.setSelectedIndex(0);
        ShinyCheckBox.setSelected(false);
        HPTextField.setText("");
        ATQTextField.setText("");
        DEFTextField.setText("");
        sATQTextField.setText("");
        sDEFTextField.setText("");
        SpeedTextField.setText("");
        HeightTextField.setText("");
        WeightTextField.setText("");
        TotalValueLabel.setText("???");
        IDTextField.setText(String.valueOf(Integer.parseInt(IDTextField.getText()) + 1));
    }

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        TotalValueLabel.setText("???");
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ATQLabel;
    private javax.swing.JTextField ATQTextField;
    private javax.swing.JLabel DEFLabel;
    private javax.swing.JTextField DEFTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JComboBox<String> FirstTypeComboBox;
    private javax.swing.JLabel FirstTypeLabel;
    private javax.swing.JLabel HPLabel;
    private javax.swing.JTextField HPTextField;
    private javax.swing.JLabel HeightLabel;
    private javax.swing.JTextField HeightTextField;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox<String> SecondTypeComboBox;
    private javax.swing.JLabel SecondTypeLabel;
    private javax.swing.JCheckBox ShinyCheckBox;
    private javax.swing.JLabel SpeedLabel;
    private javax.swing.JTextField SpeedTextField;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JLabel TotalValueLabel;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JTextField WeightTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel sATQLabel;
    private javax.swing.JTextField sATQTextField;
    private javax.swing.JLabel sDEFLabel;
    private javax.swing.JTextField sDEFTextField;
    // End of variables declaration//GEN-END:variables
}
