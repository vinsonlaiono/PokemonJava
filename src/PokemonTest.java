
public class PokemonTest {
	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		
		
		Pokemon pikachu = pokedex.createPokemon("Pikachu", 100, "Electric");
		Pokemon charmander = pokedex.createPokemon("Charmander", 100, "Fire");
		
//		System.out.println(pikachu);
//		pikachu.pokemonInfo();
//		charmander.pokemonInfo();
		
		pokedex.pokemonInfo(pikachu);
		
		charmander.attackPokemon(pikachu);
		pikachu.pokemonInfo();
		
		
	}
}
