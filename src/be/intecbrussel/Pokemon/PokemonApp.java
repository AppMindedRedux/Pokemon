package be.intecbrussel.Pokemon;

import be.intecbrussel.Services.DayCareService;

public class PokemonApp {

	public static void main(String[] args) {

		Pokemon bulBassur = new Pokemon("Bulbassur", PokeType.GRASS);
		Pokemon charMander = new Pokemon("Charmander", PokeType.FIRE);
		Pokemon squirtle = new Pokemon("Squirtle", PokeType.WATER);
		
		
		PokemonTrainer alex = new PokemonTrainer("Mr. Robot");
		
		
		// save all 3 created Pokemons to the PokemonTrainer alex
		if(alex.savePokemon(bulBassur)) {
			System.out.println("Pokemon is saved!");
		} else {
			System.out.println("Something went wrong ... ");
		}
		alex.savePokemon(charMander);
		alex.savePokemon(squirtle);
		
		
		Pokemon searchResult = alex.getPokemonByName("Bulbassur");
		System.out.println("\nPokemon that was found:\n" + searchResult);
		
		
//		alex.deletePokemon(searchResult);
		
		System.out.println(alex);
		
		
		alex.searchStat(new PokeStatFilter() {
			
			@Override
			public boolean filterStat(Pokemon pokemon) {
				return pokemon.getAtk() > 25;
			}
		}, bulBassur);
		
		alex.searchStat(new PokeStatFilter() {
			
			@Override
			public boolean filterStat(Pokemon pokemon) {
				return pokemon.getHp() > 20;
			}
		}, bulBassur);
		
		alex.searchStat(pokemon -> pokemon.getAtk() > 25, bulBassur);
		alex.searchStat(pokemon -> pokemon.getHp() > 20, bulBassur);
		
		
//		alex.searchPokeType(new PokeTypeFilter() {
//			
//			@Override
//			public Pokemon[] filterType(Pokemon... team) {
//				
//				Pokemon[] filteredTeam = new Pokemon[6];
//				boolean isEmpty = true;
//				
//				for (int i = 0, index = 0; i < team.length; i++) {
//					if(team[i] != null && team[i].getPokeType() == PokeType.GRASS) {
//						filteredTeam[index++] = team[i];
//						isEmpty = false;
//					}
//				}
//				
//				return isEmpty ? null : filteredTeam;
//			}
//		});
		
		alex.searchPokeType((Pokemon[] team) -> {
			

				Pokemon[] filteredTeam = new Pokemon[6];
				boolean isEmpty = true;
				
				for (int i = 0, index = 0; i < team.length; i++) {
					if(team[i] != null && team[i].getPokeType() == PokeType.GRASS) {
						filteredTeam[index++] = team[i];
						isEmpty = false;
					}
				}
				
				return isEmpty ? null : filteredTeam;
		
		});
		
		
		// STATIC METHOD reference ::
		// static methode van HyperTrainer class oproepen
		alex.train(HyperTrainer::train, charMander);
		
		
		// BOUND METHOD REFERENCE
		DayCareService service = new DayCareService();
		alex.train(service::train, squirtle);
		
		//UNBOUND METHOD REFERENCE
		alex.train(Pokemon::evolve, bulBassur);
		
//		Pokemon[] temp = alex.getTeam();
//		Stream.of(temp).filter().forEach(System.out.println);
	}

}
