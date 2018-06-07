
public interface PokemonInterface {
	
//	public Pokemon createPokemon(String name, int health, String type);	
	public static Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name, health, type);
			
		pokemon.name = name;
		pokemon.health = health;
		pokemon.type = type;
		
		return pokemon;
		
	}
	void attackPokemon(Pokemon pokemon);
	void pokemonInfo(Pokemon pokemon);
}
