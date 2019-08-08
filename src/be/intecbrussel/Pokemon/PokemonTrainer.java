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

		if (pokemon != null) {
			for (int i = 0; i < team.length; i++) {

				if (pokemon.equals(team[i])) {
					team[i] = null;
					return true;
				}
			}
		}

		return false;
	}

	public Pokemon getPokemonByName(String name) throws NoPokemonFoundException, NoValidSearchException {

		if (name != null && name.replace(" ", "").length() != 0) {
			for (int i = 0; i < team.length; i++) {
				if (name.equals(team[i].getName())) {
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

	public void searchStat(PokeStatFilter filter, Pokemon pokemon) {

		if (filter.filterStat(pokemon)) {
			System.out.println("Pokemon meets the requirements.");
		} else {
			System.out.println("Pokemon does not meet the requirements.");
		}
	}

	public void searchPokeType(PokeTypeFilter filter) {

		Pokemon[] filteredTeam = filter.filterType(team);

		if (filteredTeam != null) {
			System.out.println("Pokemon type is found!\n");
			for (Pokemon p : filteredTeam) {

				if (p != null) {
					System.out.println(p);
				} 
			} 
		} else {
			System.out.println("No Pokemon in your team has this type!");
		}

	}

	@Override
	public String toString() {
		return "PokemonTrainer [nickName=" + nickName + ", team=" + Arrays.toString(team) + "]";
	}

	
	public void train(Handler handler, Pokemon pokemon) {
		
		
		handler.handle(pokemon);
		
	}

}
