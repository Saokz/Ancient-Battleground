
public class TileManager {
	
	private Tile[][] Tiles = new Tile[10][10];
	
	public void createTileMap()
	{
		for (int x = 0; x < Tiles.length; x++){
		for (int y = 0; y < Tiles.length; y++){
			
			Tiles[x][y] = new Tile( randomTileType() );
			
		}
		}
	}
	
	public Tile[][] getTiles() { return Tiles; }
	
	private TileType randomTileType()
	{
		int tileType = (int)(Math.random() * 5);
		if (tileType == 0)
			return TileType.PLAINS;
		if (tileType == 1)
			return TileType.FOREST;
		if (tileType == 2)
			return TileType.FORT;
		if (tileType == 3)
			return TileType.MOUNTAIN;
		if (tileType == 4)
			return TileType.TRAP;
		else
			return null;
	}
	
}
