package be.intecbrussel.Pokemon;

public interface HyperTrainer {

	static Pokemon train(Pokemon pokemon) {
		
		pokemon.setAtk(50);
		pokemon.setHp(50);
		pokemon.setDef(50);
		
		return pokemon;
	}

}
