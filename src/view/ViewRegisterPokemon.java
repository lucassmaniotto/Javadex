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
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pokeball.svg")).getImage());
    }

    /**
     * Método de inicialização dos componentes da interface gráfica.
     * Criado automaticamente pelo NetBeans.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        firstTypeLabel = new javax.swing.JLabel();
        firstTypeComboBox = new javax.swing.JComboBox<>();
        secondTypeComboBox = new javax.swing.JComboBox<>();
        secondTypeLabel = new javax.swing.JLabel();
        shinyCheckBox = new javax.swing.JCheckBox();
        heightLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        hPLabel = new javax.swing.JLabel();
        aTQLabel = new javax.swing.JLabel();
        dEFLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        sATQLabel = new javax.swing.JLabel();
        sDEFLabel = new javax.swing.JLabel();
        hPTextField = new javax.swing.JTextField();
        aTQTextField = new javax.swing.JTextField();
        dEFTextField = new javax.swing.JTextField();
        speedTextField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        totalValueLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        sATQTextField = new javax.swing.JTextField();
        sDEFTextField = new javax.swing.JTextField();
        iDLabel = new javax.swing.JLabel();
        iDTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Cadastro de Pokémon");

        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Nome:");

        nameTextField.setToolTipText("Digite o nome de seu Pokémon");

        firstTypeLabel.setText("Tipo 1:");

        firstTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { Types.NONE.toString(), Types.NORMAL.toString(), Types.FIRE.toString(), Types.WATER.toString(), Types.GRASS.toString(), Types.FLYING.toString(), Types.FIGHTING.toString(), Types.POISON.toString(), Types.ELECTRIC.toString(), Types.GROUND.toString(), Types.ROCK.toString(), Types.PSYCHIC.toString(), Types.ICE.toString(), Types.BUG.toString(), Types.GHOST.toString(), Types.STEEL.toString(), Types.DRAGON.toString(), Types.DARK.toString(), Types.FAIRY.toString()}));

        secondTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { Types.NONE.toString(), Types.NORMAL.toString(), Types.FIRE.toString(), Types.WATER.toString(), Types.GRASS.toString(), Types.FLYING.toString(), Types.FIGHTING.toString(), Types.POISON.toString(), Types.ELECTRIC.toString(), Types.GROUND.toString(), Types.ROCK.toString(), Types.PSYCHIC.toString(), Types.ICE.toString(), Types.BUG.toString(), Types.GHOST.toString(), Types.STEEL.toString(), Types.DRAGON.toString(), Types.DARK.toString(), Types.FAIRY.toString()}));

        secondTypeLabel.setText("Tipo 2:");

        shinyCheckBox.setText("Shiny");

        heightLabel.setText("Altura:");

        weightLabel.setText("Peso:");

        heightTextField.setToolTipText("Informe a altura do Pokémon");

        weightTextField.setToolTipText("Informe o peso do Pokémon");

        hPLabel.setText("HP:");

        aTQLabel.setText("ATQ:");

        dEFLabel.setText("DEF:");

        speedLabel.setText("VELOC:");

        sATQLabel.setText("S. ATQ:");

        sDEFLabel.setText("S. DEF:");

        hPTextField.setToolTipText("Informe os Pontos de Vida do Pokémon");

        aTQTextField.setToolTipText("Informe os Pontos de Ataque do Pokémon");

        dEFTextField.setToolTipText("Informe os Pontos de Defesa do Pokémon");

        speedTextField.setToolTipText("Informe a Velocidade do Pokémon");

        totalLabel.setText("TOTAL:");

        totalValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalValueLabel.setText("???");
        totalValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/save.png"))); // NOI18N
        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/exit.png"))); // NOI18N
        exitButton.setText("Sair");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        sATQTextField.setToolTipText("Informe o valor do Ataque Especial do Pokémon");

        sDEFTextField.setToolTipText("Informe o valor da Defesa Especial do Pokémon");

        iDLabel.setText("ID:");

        iDTextField.setEditable(false);

        iDTextField.setToolTipText("ID do Pokémon");

        iDTextField.setText(String.valueOf(controllerPokemon.getTheNextIdToInsertController()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameLabel)
                                    .addComponent(firstTypeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(firstTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(shinyCheckBox))
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(secondTypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(weightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(iDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(heightTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addComponent(iDTextField))
                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dEFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(aTQTextField)
                                            .addComponent(dEFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(aTQLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sDEFLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(sATQLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sATQTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sDEFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(speedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalValueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(totalLabel)
                                .addGap(25, 25, 25))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(exitButton)
                        .addGap(54, 54, 54)
                        .addComponent(saveButton)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iDLabel)
                    .addComponent(iDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstTypeLabel)
                            .addComponent(shinyCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secondTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hPLabel)
                            .addComponent(speedLabel)
                            .addComponent(hPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aTQTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aTQLabel)
                            .addComponent(sATQLabel)
                            .addComponent(sATQTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dEFLabel)
                            .addComponent(dEFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sDEFLabel)
                            .addComponent(sDEFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(totalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalValueLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveButton)
                            .addComponent(exitButton))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightLabel)
                            .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightLabel))
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
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        pokemon.setName(nameTextField.getText());
        if (nameTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O Pokemón precisa de um nome!", "Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }
        pokemon.setFirstType(firstTypeComboBox.getSelectedItem().toString());
        pokemon.setSecondType(secondTypeComboBox.getSelectedItem().toString());
        pokemon.setShiny(shinyCheckBox.isSelected());
        try {
            pokemon.setHp(Integer.parseInt(hPTextField.getText()));
            pokemon.setAttack(Integer.parseInt(aTQTextField.getText()));
            pokemon.setDefense(Integer.parseInt(dEFTextField.getText()));
            pokemon.setSpAttack(Integer.parseInt(sATQTextField.getText()));
            pokemon.setSpDefense(Integer.parseInt(sDEFTextField.getText()));
            pokemon.setSpeed(Integer.parseInt(speedTextField.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Os atributos do Pokémon devem ser números inteiros!", "Erro",JOptionPane.ERROR_MESSAGE);
            hPTextField.setText("0");
            aTQTextField.setText("0");
            dEFTextField.setText("0");
            sATQTextField.setText("0");
            sDEFTextField.setText("0");
            speedTextField.setText("0");
            return;
        }
        try {
            pokemon.setHeight(Float.parseFloat(heightTextField.getText()));
            pokemon.setWeight(Float.parseFloat(weightTextField.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "A altura e o peso do Pokémon devem ser números reais e escritos com '.'!", "Erro",JOptionPane.ERROR_MESSAGE);
            heightTextField.setText("0.0");
            weightTextField.setText("0.0");
            return;
        }
        pokemon.setTotal(pokemon.getHp() + pokemon.getAttack() + pokemon.getDefense() + pokemon.getSpAttack() + pokemon.getSpDefense() + pokemon.getSpeed());
        totalValueLabel.setText(String.valueOf(pokemon.getTotal()));
        
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
        nameTextField.setText("");
        firstTypeComboBox.setSelectedIndex(0);
        secondTypeComboBox.setSelectedIndex(0);
        shinyCheckBox.setSelected(false);
        hPTextField.setText("");
        aTQTextField.setText("");
        dEFTextField.setText("");
        sATQTextField.setText("");
        sDEFTextField.setText("");
        speedTextField.setText("");
        heightTextField.setText("");
        weightTextField.setText("");
        totalValueLabel.setText("???");
        iDTextField.setText(String.valueOf(Integer.parseInt(iDTextField.getText()) + 1));
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        totalValueLabel.setText("???");
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aTQLabel;
    private javax.swing.JTextField aTQTextField;
    private javax.swing.JLabel dEFLabel;
    private javax.swing.JTextField dEFTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox<String> firstTypeComboBox;
    private javax.swing.JLabel firstTypeLabel;
    private javax.swing.JLabel hPLabel;
    private javax.swing.JTextField hPTextField;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JLabel iDLabel;
    private javax.swing.JTextField iDTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> secondTypeComboBox;
    private javax.swing.JLabel secondTypeLabel;
    private javax.swing.JCheckBox shinyCheckBox;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JTextField speedTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalValueLabel;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel sATQLabel;
    private javax.swing.JTextField sATQTextField;
    private javax.swing.JLabel sDEFLabel;
    private javax.swing.JTextField sDEFTextField;
    // End of variables declaration//GEN-END:variables
}
