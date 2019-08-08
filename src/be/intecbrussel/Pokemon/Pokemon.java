package be.intecbrussel.Pokemon;

import java.util.Random;

public class Pokemon {

	private String name;
	private PokeType pokeType;

	private int hp;
	private int atk;
	private int def;

	private Random rand = new Random();

	public Pokemon(String name) {
		this.name = name;
	}

	public Pokemon(String name, PokeType pokeType) {
		this.name = name;
		this.pokeType = pokeType;
		this.hp = generateStat();
		this.atk = generateStat();
		this.def = generateStat();
	}

	private int generateStat() {
		return rand.nextInt(50) + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PokeType getPokeType() {
		return pokeType;
	}

	public void setPokeType(PokeType pokeType) {
		this.pokeType = pokeType;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + atk;
		result = prime * result + def;
		result = prime * result + hp;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pokeType == null) ? 0 : pokeType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (atk != other.atk)
			return false;
		if (def != other.def)
			return false;
		if (hp != other.hp)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pokeType != other.pokeType)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Pokemon name: " + name + "\n" +
				"Pokemon type: " + pokeType + "\n" +
				"Pokemon HP: " + hp + "\n" +
				"Pokemon ATTACK: " + atk + "\n" +
				"Pokemon DEF: " + def + "\n";
				
				
	}





}
