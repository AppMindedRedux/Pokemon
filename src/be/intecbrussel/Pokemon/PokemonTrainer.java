package be.intecbrussel.Pokemon;

import java.util.Arrays;

import be.intecbrussel.Exceptions.NoPokemonFoundException;
import be.intecbrussel.Exceptions.NoValidSearchException;

public class PokemonTrainer {

	private String nickName;
	private Pokemon[] team = new Pokemon[6];

	public PokemonTrainer(String nickName) {
		this.nickName = nickName;
	}

	public boolean savePokemon(Pokemon pokemon) {

		if (pokemon != null) {
			for (int i = 0; i < team.length; i++) {
				if (team[i] == null) {
					team[i] = pokemon;
					return true;
				}

			}
			System.out.println("Sorry no more place in your team for an extra Pokemon!\n" + "Make room first'");
		}

		System.out.println("Please try again with ");
		return false;
	}

	public boolean deletePokemon(Pokemon pokemon) {
		
		if(pokemon != null) {
			for (int i = 0; i < team.length; i++) {
				
				if(pokemon.equals(team[i])) {
					team[i] = null;
					return true;
				}
			}
		}

		return false;
	}

	public Pokemon getPokemonByName(String name) throws NoPokemonFoundException, NoValidSearchException {
		
		if(name != null && name.replace(" ", "").length() != 0) {
			for (int i = 0; i < team.length; i++) {
				if(name.equals(team[i].getName())) {
					return team[i];
				}
			}
			
			throw new NoPokemonFoundException(name.toUpperCase() + " not found!");
		}

		throw new NoValidSearchException("Not a valid search!");
	}

	public Pokemon[] getTeam() {

		return team;
	}

	@Override
	public String toString() {
		return "PokemonTrainer [nickName=" + nickName + ", team=" + Arrays.toString(team) + "]";
	}
	
	
	
}
