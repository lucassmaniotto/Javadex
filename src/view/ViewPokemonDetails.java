package view;

import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.WildPokemon;

public class ViewPokemonDetails extends javax.swing.JFrame {

    public ViewPokemonDetails(WildPokemon wildPokemon) {
        setLookAndFeel();
        initComponents();
        setLocationRelativeTo(null);
        loadPokemonData(wildPokemon);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PokemonNameLabel = new javax.swing.JLabel();
        FirstTypeLabel = new javax.swing.JLabel();
        SecondTypeLabel = new javax.swing.JLabel();
        isShinyLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        HPLabel = new javax.swing.JLabel();
        HPValueLabel = new javax.swing.JLabel();
        FirstTypeValueLabel = new javax.swing.JLabel();
        SecondTypeValueLabel = new javax.swing.JLabel();
        isShinyValueLabel = new javax.swing.JLabel();
        ATQLabel = new javax.swing.JLabel();
        ATQValueLabel = new javax.swing.JLabel();
        DEFLabel = new javax.swing.JLabel();
        DEFValueLabel = new javax.swing.JLabel();
        sATQLabel = new javax.swing.JLabel();
        sATQValueLabel = new javax.swing.JLabel();
        sDEFLabel = new javax.swing.JLabel();
        sDEFValueLabel = new javax.swing.JLabel();
        SpeedLabel = new javax.swing.JLabel();
        SpeedValueLabel = new javax.swing.JLabel();
        HPProgressBar = new javax.swing.JProgressBar();
        ATQProgressBar = new javax.swing.JProgressBar();
        DEFProgressBar = new javax.swing.JProgressBar();
        sATQProgressBar = new javax.swing.JProgressBar();
        sDEFProgressBar = new javax.swing.JProgressBar();
        SpeedProgressBar = new javax.swing.JProgressBar();
        TotalLabel = new javax.swing.JLabel();
        TotalValueLabel = new javax.swing.JLabel();
        WeightLabel = new javax.swing.JLabel();
        HeightLabel = new javax.swing.JLabel();
        HeightValueLabel = new javax.swing.JLabel();
        WeightValueLabel = new javax.swing.JLabel();
        PokemonImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(233, 236, 242));

        PokemonNameLabel.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        PokemonNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokemonNameLabel.setText("Nome do Pokémon");

        FirstTypeLabel.setText("TIPO 1:");
        
        SecondTypeLabel.setText("TIPO 2:");
        
        isShinyLabel.setText("SHINY:");
        
        HPLabel.setText("HP:");
        
        HPValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HPValueLabel.setLabelFor(HPLabel);
        HPValueLabel.setText("???");
        HPValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        HPProgressBar.setMaximum(160);
        HPProgressBar.setForeground(new java.awt.Color(255, 51, 51));
        
        FirstTypeValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FirstTypeValueLabel.setText("???");
        FirstTypeValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        SecondTypeValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SecondTypeValueLabel.setText("???");
        SecondTypeValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        isShinyValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isShinyValueLabel.setText("???");
        isShinyValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        ATQLabel.setText("ATQ:");

        ATQValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ATQValueLabel.setLabelFor(HPLabel);
        ATQValueLabel.setText("???");
        ATQValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ATQProgressBar.setMaximum(160);
        ATQProgressBar.setForeground(new java.awt.Color(255, 184, 77));
        
        DEFLabel.setText("DEF:");

        DEFValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DEFValueLabel.setLabelFor(HPLabel);
        DEFValueLabel.setText("???");
        DEFValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DEFProgressBar.setMaximum(160);
        DEFProgressBar.setForeground(new java.awt.Color(255, 214, 51));
        
        sATQLabel.setText("S. ATQ:");
        
        sATQValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sATQValueLabel.setLabelFor(HPLabel);
        sATQValueLabel.setText("???");
        sATQValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sATQProgressBar.setMaximum(160);
        sATQProgressBar.setForeground(new java.awt.Color(128, 229, 255));
        
        sDEFLabel.setText("S. DEF:");
        
        sDEFValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sDEFValueLabel.setLabelFor(HPLabel);
        sDEFValueLabel.setText("???");
        sDEFValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sDEFProgressBar.setMaximum(160);
        sDEFProgressBar.setForeground(new java.awt.Color(92, 214, 92));
        
        SpeedLabel.setText("VELOC:");
        
        SpeedValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SpeedValueLabel.setLabelFor(HPLabel);
        SpeedValueLabel.setText("???");
        SpeedValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SpeedProgressBar.setMaximum(160);
        SpeedProgressBar.setForeground(new java.awt.Color(255, 128, 255));
        
        TotalLabel.setText("TOTAL:");
        
        TotalValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalValueLabel.setLabelFor(HPLabel);
        TotalValueLabel.setText("???");
        TotalValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        WeightLabel.setText("PESO:");

        HeightLabel.setText("ALTURA:");
        
        HeightValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeightValueLabel.setLabelFor(HPLabel);
        HeightValueLabel.setText("???");
        HeightValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        WeightValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WeightValueLabel.setLabelFor(HPLabel);
        WeightValueLabel.setText("???");
        WeightValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        PokemonImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokemonImageLabel.setLabelFor(HPLabel);
        PokemonImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PokemonNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(FirstTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SecondTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(isShinyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FirstTypeValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(SecondTypeValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isShinyValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PokemonImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ATQLabel)
                    .addComponent(DEFLabel)
                    .addComponent(sATQLabel)
                    .addComponent(sDEFLabel)
                    .addComponent(SpeedLabel)
                    .addComponent(HPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeightLabel)
                    .addComponent(WeightLabel))
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HPValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ATQValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(DEFValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(sATQValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(sDEFValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(SpeedValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                                                        .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(HPProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(ATQProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(DEFProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sATQProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sDEFProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(SpeedProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(HeightValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(WeightValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(TotalLabel)
                                            .addGap(78, 78, 78)
                                            .addComponent(TotalValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(PokemonNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(FirstTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(FirstTypeValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(SecondTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(SecondTypeValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isShinyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isShinyValueLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(HPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HPValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ATQLabel)
                                .addComponent(ATQValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DEFLabel)
                                .addComponent(DEFValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sATQLabel)
                            .addComponent(sATQValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sDEFLabel)
                            .addComponent(sDEFValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpeedValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpeedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(HPProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(ATQProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))
                                        .addComponent(DEFProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22))
                                        .addComponent(sATQProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                                .addComponent(sDEFProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpeedProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TotalLabel)
                        .addComponent(TotalValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(HeightLabel)
                    .addComponent(HeightValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(WeightValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(WeightLabel))
                .addGap(47, 47, 47)
                .addComponent(PokemonImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
                );
                
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Carrega os dados do pokemon nos campos da tela
     * @param wildPokemon
     */
    private void loadPokemonData(WildPokemon wildPokemon) {
        PokemonNameLabel.setText(wildPokemon.getName());
        FirstTypeValueLabel.setText(wildPokemon.getFirstType());
        SecondTypeValueLabel.setText(wildPokemon.getSecondType());
        isShinyValueLabel.setText(wildPokemon.getShiny() ? "SIM" : "NÃO");
        HPValueLabel.setText(String.valueOf(wildPokemon.getHp()));
        ATQValueLabel.setText(String.valueOf(wildPokemon.getAttack()));
        DEFValueLabel.setText(String.valueOf(wildPokemon.getDefense()));
        sATQValueLabel.setText(String.valueOf(wildPokemon.getSpAttack()));
        sDEFValueLabel.setText(String.valueOf(wildPokemon.getSpDefense()));
        SpeedValueLabel.setText(String.valueOf(wildPokemon.getSpeed()));
        TotalValueLabel.setText(String.valueOf(wildPokemon.getTotal()));
        HeightValueLabel.setText(String.valueOf(wildPokemon.getHeight()));
        WeightValueLabel.setText(String.valueOf(wildPokemon.getWeight()));
        try{
            PokemonImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokemon/" + wildPokemon.getName() + ".png")));
        } catch (Exception e) {
            PokemonImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokemon/unown.png")));
        }

        HPProgressBar.setValue(wildPokemon.getHp());
        ATQProgressBar.setValue(wildPokemon.getAttack());
        DEFProgressBar.setValue(wildPokemon.getDefense());
        sATQProgressBar.setValue(wildPokemon.getSpAttack());
        sDEFProgressBar.setValue(wildPokemon.getSpDefense());
        SpeedProgressBar.setValue(wildPokemon.getSpeed());
    }

    /**
     * Seta o look and feel da tela
     */
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewPokemonDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ViewPokemonDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ViewPokemonDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ViewPokemonDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * Depois da tela ser carregada, muda a look and feel para Nimbus
     * @param evt
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ViewPokemonDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ATQLabel;
    private javax.swing.JProgressBar ATQProgressBar;
    private javax.swing.JLabel ATQValueLabel;
    private javax.swing.JLabel DEFLabel;
    private javax.swing.JProgressBar DEFProgressBar;
    private javax.swing.JLabel DEFValueLabel;
    private javax.swing.JLabel FirstTypeLabel;
    private javax.swing.JLabel FirstTypeValueLabel;
    private javax.swing.JLabel HPLabel;
    private javax.swing.JProgressBar HPProgressBar;
    private javax.swing.JLabel HPValueLabel;
    private javax.swing.JLabel HeightLabel;
    private javax.swing.JLabel HeightValueLabel;
    private javax.swing.JLabel PokemonImageLabel;
    private javax.swing.JLabel PokemonNameLabel;
    private javax.swing.JLabel SecondTypeLabel;
    private javax.swing.JLabel SecondTypeValueLabel;
    private javax.swing.JLabel SpeedLabel;
    private javax.swing.JProgressBar SpeedProgressBar;
    private javax.swing.JLabel SpeedValueLabel;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JLabel TotalValueLabel;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JLabel WeightValueLabel;
    private javax.swing.JLabel isShinyLabel;
    private javax.swing.JLabel isShinyValueLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel sATQLabel;
    private javax.swing.JProgressBar sATQProgressBar;
    private javax.swing.JLabel sATQValueLabel;
    private javax.swing.JLabel sDEFLabel;
    private javax.swing.JProgressBar sDEFProgressBar;
    private javax.swing.JLabel sDEFValueLabel;
    // End of variables declaration//GEN-END:variables
}
