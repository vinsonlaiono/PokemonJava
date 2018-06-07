
public class Pokemon extends AbstractPokemon{
	
	public String name;
	public int health;
	public String type;
	private static int count = 0;
	
//	public Pokemon() {
//		createPokemon();
//	}
	
	// Constructor to set name health and type
	public Pokemon(String name, int health, String type) {
		setCount(getCount() + 1);
	}

	// Getter for count
	public static int getCount() {
		return count;
	}
	// Setter for count
	public static void setCount(int count) {
		Pokemon.count = count;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	
}
