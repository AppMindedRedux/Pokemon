package be.intecbrussel.Services;

import java.util.Random;

import be.intecbrussel.Pokemon.Pokemon;

public class DayCareService {

	private Random rand = new Random();

	public Pokemon train(Pokemon pokemon) throws NullPointerException {

		if (pokemon != null) {

			for (int i = 0; i < 20; i++) {

				pokemon.setHp(pokemon.getHp() + (rand.nextInt(2)));
				pokemon.setHp(pokemon.getAtk() + (rand.nextInt(2)));
				pokemon.setHp(pokemon.getDef() + (rand.nextInt(2)));
			}
			return pokemon;
		}
		
		throw new NullPointerException();
	}

}