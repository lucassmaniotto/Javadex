package model;

/**
 * Classe que representa um pokemon treinado por um treinador. 
 * Ela herda de WildPokemon, pois um pokemon selvagem pode se tornar um pokemon treinado.
 * @author Lucas Smaniotto e Valtemir Junior
 */
public class TrainedPokemon extends WildPokemon {
    private Trainer trainer;
    
    public TrainedPokemon(String name, String firstType, String secondType, int hp, int attack, int defense, int speed, int spAttack, int spDefense, float height, float weight) {
        super(name, firstType, secondType, hp, attack, defense, speed, spAttack, spDefense, height, weight);
        this.isWild = false;
    }

    public Trainer getTrainer(){
        return this.trainer;
    }

    public void setTrainer(Trainer trainer){
        this.trainer = trainer;
    }

    public int getTrainerId(){
        return this.trainer.getId();
    }

    public void setTrainerId(int idTrainer){
        this.trainer.setId(idTrainer);
    }
}