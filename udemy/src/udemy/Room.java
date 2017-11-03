package udemy;

public class Room {
	private String name;
	private Furniture furniture;
	private Electronics electronics;
	private Dimensions dimensions;
	public Room(String name, Furniture furniture, Electronics electronics,
			Dimensions dimensions) {
		super();
		this.name = name;
		this.furniture = furniture;
		this.electronics = electronics;
		this.dimensions = dimensions;
	}
	
}
