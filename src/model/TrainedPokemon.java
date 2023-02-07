package model;

public class TrainedPokemon extends WildPokemon {
    private Trainer trainer;

    public TrainedPokemon(int id, String name, Types firstType, Types secondType, int hp, int attack, int defense, int speed, int spAttack, int spDefense) {
        super(id, name, firstType, secondType, hp, attack, defense, speed, spAttack, spDefense);
        this.isWild = false;
    }

    public Trainer getTrainer(){
        return this.trainer;
    }

    public void setTrainer(Trainer trainer){
        this.trainer = trainer;
    }
}