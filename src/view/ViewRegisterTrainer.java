package view;
import javax.swing.JOptionPane;

import controller.ControllerTrainer;
import model.Regions;
import model.Trainer;

/**
 * Classe que representa a interface gráfica de cadastro de treinadores.
 * @author Lucas Smaniotto & Valtemir Junior
 */
public class ViewRegisterTrainer extends javax.swing.JFrame {
    Trainer trainer = new Trainer("", 0, 0, Regions.UNKNOWN.toString());
    ControllerTrainer controllerTrainer = new ControllerTrainer();

    public ViewRegisterTrainer() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Cadastro de Treinador");
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
        AgeLabel = new javax.swing.JLabel();
        AgeTextField = new javax.swing.JTextField();
        BadgesLabel = new javax.swing.JLabel();
        BagdesTextField = new javax.swing.JTextField();
        RegionsLabel = new javax.swing.JLabel();
        RegionsComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        ExitButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        IDLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        IDTextField.setText(String.valueOf(controllerTrainer.getTheNextIdToInsertController()));
        
        TitleLabel.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Cadastro de Treinadores");

        NameLabel.setText("Nome:");

        NameTextField.setToolTipText("Digite o nome do treinador");

        AgeLabel.setText("Idade:");

        AgeTextField.setToolTipText("Informe a idade do treinador");

        BadgesLabel.setText("Insígnias:");

        BagdesTextField.setToolTipText("Insira a quantidade de insígnias do treinador");

        RegionsLabel.setText("Região:");

        RegionsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {Regions.KANTO.toString(), Regions.JOHTO.toString(), Regions.HOENN.toString(), Regions.SINNOH.toString(), Regions.UNOVA.toString(), Regions.KALOS.toString(), Regions.ALOLA.toString(), Regions.GALAR.toString(), Regions.UNKNOWN.toString()}));

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/exit.png"))); // NOI18N
        ExitButton.setText("Sair");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/save.png"))); // NOI18N
        SaveButton.setText("Salvar");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        IDLabel.setText("ID:");

        IDTextField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AgeLabel)
                            .addComponent(RegionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BadgesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BagdesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(RegionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ExitButton)
                        .addGap(54, 54, 54)
                        .addComponent(SaveButton)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BagdesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BadgesLabel)
                    .addComponent(AgeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegionsLabel)
                    .addComponent(RegionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(ExitButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Salva os dados do treinador
     * @param evt
     */
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        trainer.setName(NameTextField.getText());
        if (NameTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O Treinador precisa de um nome!", "Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }
        trainer.setRegion(RegionsComboBox.getSelectedItem().toString());
        try {
            trainer.setAge(Integer.parseInt(AgeTextField.getText()));
            if (Integer.parseInt(AgeTextField.getText()) < 10) {
                JOptionPane.showMessageDialog(this, "A idade deve ser maior que 10!", "Erro",JOptionPane.ERROR_MESSAGE);
                return;
            }
            trainer.setBadges(Integer.parseInt(BagdesTextField.getText()));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Os campos de Idade e Insígnias devem ser preenchidos com números inteiros!", "Erro",JOptionPane.ERROR_MESSAGE);
            AgeTextField.setText("10");
            BagdesTextField.setText("0");
            return;
        }
        
        if(controllerTrainer.saveTrainerController(trainer)){
            JOptionPane.showMessageDialog(this, "Treinador salvo com sucesso!", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            clearFields();
            ViewTrainers.updateTable();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o treinador!", "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    /**
     * Limpa os campos do formulário
     */
    private void clearFields() {
        NameTextField.setText("");
        RegionsComboBox.setSelectedIndex(0);
        AgeTextField.setText("");
        BagdesTextField.setText("");
        IDTextField.setText(String.valueOf(controllerTrainer.getTheNextIdToInsertController()));
    }

    /**
     * Fecha a janela
     * @param evt
     */
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JLabel BadgesLabel;
    private javax.swing.JTextField BagdesTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JComboBox<String> RegionsComboBox;
    private javax.swing.JLabel RegionsLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField IDTextField;
    // End of variables declaration//GEN-END:variables
}
