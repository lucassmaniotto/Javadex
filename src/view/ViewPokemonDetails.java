package view;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import controller.ControllerPokemon;
import model.WildPokemon;

/**
 * Classe que representa a interface gráfica de detalhes de um Pokémon.
 * @author Lucas Smaniotto e Valtemir Junior
 */
public class ViewPokemonDetails extends javax.swing.JFrame {
    //Declaração de componentes da interface gráfica.
    private javax.swing.JLabel aTQLabel;
    private javax.swing.JProgressBar aTQProgressBar;
    private javax.swing.JLabel aTQValueLabel;
    private javax.swing.JLabel dEFLabel;
    private javax.swing.JProgressBar dEFProgressBar;
    private javax.swing.JLabel dEFValueLabel;
    private javax.swing.JLabel firstTypeLabel;
    private javax.swing.JLabel firstTypeValueLabel;
    private javax.swing.JLabel hPLabel;
    private javax.swing.JProgressBar hPProgressBar;
    private javax.swing.JLabel hPValueLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel heightValueLabel;
    private javax.swing.JLabel pokemonImageLabel;
    private javax.swing.JLabel pokemonNameLabel;
    private javax.swing.JLabel secondTypeLabel;
    private javax.swing.JLabel secondTypeValueLabel;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JProgressBar speedProgressBar;
    private javax.swing.JLabel speedValueLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalValueLabel;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JLabel weightValueLabel;
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

    //Declaração de variáveis e objetos da classe de controle.
    WildPokemon wildPokemon = new WildPokemon("", "", "", 0, 0, 0, 0, 0, 0, 0, 0);
    static ControllerPokemon controllerPokemon = new ControllerPokemon();
    static List<WildPokemon> wildPokemonsList = new ArrayList<>();

    public ViewPokemonDetails(int id) {
        setLookAndFeel();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Detalhes do Pokémon");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icons/pokeball.svg")).getImage());
        loadPokemonData(id);
    }
    
    /**
     * Método de inicialização dos componentes da interface gráfica.
     * Criado automaticamente pelo NetBeans.
     */
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pokemonNameLabel = new javax.swing.JLabel();
        firstTypeLabel = new javax.swing.JLabel();
        secondTypeLabel = new javax.swing.JLabel();
        isShinyLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        hPLabel = new javax.swing.JLabel();
        hPValueLabel = new javax.swing.JLabel();
        firstTypeValueLabel = new javax.swing.JLabel();
        secondTypeValueLabel = new javax.swing.JLabel();
        isShinyValueLabel = new javax.swing.JLabel();
        aTQLabel = new javax.swing.JLabel();
        aTQValueLabel = new javax.swing.JLabel();
        dEFLabel = new javax.swing.JLabel();
        dEFValueLabel = new javax.swing.JLabel();
        sATQLabel = new javax.swing.JLabel();
        sATQValueLabel = new javax.swing.JLabel();
        sDEFLabel = new javax.swing.JLabel();
        sDEFValueLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        speedValueLabel = new javax.swing.JLabel();
        hPProgressBar = new javax.swing.JProgressBar();
        aTQProgressBar = new javax.swing.JProgressBar();
        dEFProgressBar = new javax.swing.JProgressBar();
        sATQProgressBar = new javax.swing.JProgressBar();
        sDEFProgressBar = new javax.swing.JProgressBar();
        speedProgressBar = new javax.swing.JProgressBar();
        totalLabel = new javax.swing.JLabel();
        totalValueLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        heightValueLabel = new javax.swing.JLabel();
        weightValueLabel = new javax.swing.JLabel();
        pokemonImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(233, 236, 242));

        pokemonNameLabel.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        pokemonNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemonNameLabel.setText("Nome do Pokémon");

        firstTypeLabel.setText("TIPO 1:");

        secondTypeLabel.setText("TIPO 2:");

        isShinyLabel.setText("SHINY:");

        hPLabel.setText("HP:");

        hPValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hPValueLabel.setLabelFor(hPLabel);
        hPValueLabel.setText("???");
        hPValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        hPProgressBar.setMaximum(160);
        hPProgressBar.setForeground(new java.awt.Color(255, 51, 51));

        firstTypeValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstTypeValueLabel.setText("???");
        firstTypeValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        secondTypeValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondTypeValueLabel.setText("???");
        secondTypeValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        isShinyValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isShinyValueLabel.setText("???");
        isShinyValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        aTQLabel.setText("ATQ:");

        aTQValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTQValueLabel.setLabelFor(hPLabel);
        aTQValueLabel.setText("???");
        aTQValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        aTQProgressBar.setMaximum(160);
        aTQProgressBar.setForeground(new java.awt.Color(255, 184, 77));

        dEFLabel.setText("DEF:");

        dEFValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dEFValueLabel.setLabelFor(hPLabel);
        dEFValueLabel.setText("???");
        dEFValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dEFProgressBar.setMaximum(160);
        dEFProgressBar.setForeground(new java.awt.Color(255, 214, 51));

        sATQLabel.setText("S. ATQ:");

        sATQValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sATQValueLabel.setLabelFor(hPLabel);
        sATQValueLabel.setText("???");
        sATQValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sATQProgressBar.setMaximum(160);
        sATQProgressBar.setForeground(new java.awt.Color(128, 229, 255));

        sDEFLabel.setText("S. DEF:");

        sDEFValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sDEFValueLabel.setLabelFor(hPLabel);
        sDEFValueLabel.setText("???");
        sDEFValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sDEFProgressBar.setMaximum(160);
        sDEFProgressBar.setForeground(new java.awt.Color(92, 214, 92));
        speedLabel.setText("VELOC:");

        speedValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        speedValueLabel.setLabelFor(hPLabel);
        speedValueLabel.setText("???");
        speedValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        speedProgressBar.setMaximum(160);
        speedProgressBar.setForeground(new java.awt.Color(255, 128, 255));
        
        totalLabel.setText("TOTAL:");

        totalValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalValueLabel.setLabelFor(hPLabel);
        totalValueLabel.setText("???");
        totalValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        weightLabel.setText("PESO:");

        heightLabel.setText("ALTURA:");

        heightValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heightValueLabel.setLabelFor(hPLabel);
        heightValueLabel.setText("???");
        heightValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        weightValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weightValueLabel.setLabelFor(hPLabel);
        weightValueLabel.setText("???");
        weightValueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pokemonImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemonImageLabel.setLabelFor(hPLabel);
        pokemonImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pokemonNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isShinyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstTypeValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(secondTypeValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(pokemonImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(aTQLabel)
                                            .addComponent(dEFLabel)
                                            .addComponent(sDEFLabel)
                                            .addComponent(speedLabel)
                                            .addComponent(heightLabel)
                                            .addComponent(weightLabel)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(hPLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sATQLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(hPValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(aTQValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(dEFValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(sATQValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(sDEFValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(speedValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(hPProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(aTQProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(dEFProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sATQProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sDEFProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(speedProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(heightValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(weightValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(totalLabel)
                                        .addGap(78, 78, 78)
                                        .addComponent(totalValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pokemonNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstTypeValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondTypeValueLabel))
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
                                .addComponent(hPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hPValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aTQLabel)
                            .addComponent(aTQValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dEFLabel)
                            .addComponent(dEFValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(speedValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(hPProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(aTQProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22))
                                            .addComponent(dEFProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22))
                                    .addComponent(sATQProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addComponent(sDEFProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(speedProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(totalValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLabel)
                    .addComponent(heightValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightLabel))
                .addGap(47, 47, 47)
                .addComponent(pokemonImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }
    
    /**
     * Carrega os dados do pokemon nos campos da tela
     * @param id índice do pokemon na tabela da ViewPokedex
     */
    private void loadPokemonData(int id) {
        WildPokemon wildPokemon = controllerPokemon.getWildPokemonByIdController(id);
        pokemonNameLabel.setText(wildPokemon.getName());
        firstTypeValueLabel.setText(wildPokemon.getFirstType());
        secondTypeValueLabel.setText(wildPokemon.getSecondType());
        isShinyValueLabel.setText(wildPokemon.getShiny() ? "SIM" : "NÃO");
        hPValueLabel.setText(String.valueOf(wildPokemon.getHp()));
        aTQValueLabel.setText(String.valueOf(wildPokemon.getAttack()));
        dEFValueLabel.setText(String.valueOf(wildPokemon.getDefense()));
        sATQValueLabel.setText(String.valueOf(wildPokemon.getSpAttack()));
        sDEFValueLabel.setText(String.valueOf(wildPokemon.getSpDefense()));
        speedValueLabel.setText(String.valueOf(wildPokemon.getSpeed()));
        totalValueLabel.setText(String.valueOf(wildPokemon.getTotal()));
        heightValueLabel.setText(String.valueOf(wildPokemon.getHeight()));
        weightValueLabel.setText(String.valueOf(wildPokemon.getWeight()));
        try{
            pokemonImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokemon/" + wildPokemon.getName() + ".png")));
        } catch (Exception e) {
            pokemonImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokemon/missingno.png")));
        }

        hPProgressBar.setValue(wildPokemon.getHp());
        aTQProgressBar.setValue(wildPokemon.getAttack());
        dEFProgressBar.setValue(wildPokemon.getDefense());
        sATQProgressBar.setValue(wildPokemon.getSpAttack());
        sDEFProgressBar.setValue(wildPokemon.getSpDefense());
        speedProgressBar.setValue(wildPokemon.getSpeed());
    }

    /**
     * Seta o look and feel customizado na tela
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
     * Depois da tela ser carregada, muda a look and feel para Nimbus,
     * não afetando o restante da aplicação
     * @param evt
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ViewPokemonDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
