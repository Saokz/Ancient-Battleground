
public class Tile {

	private TileType type;
	
	public Tile(TileType type)
	{
		this.type = type;
	}
	
	public TileType getTileType() { return this.type; }
	public String toString() { return type.toString(); }
	
	public void changeTiletype(TileType type)
	{
		this.type = type;
	}
}
