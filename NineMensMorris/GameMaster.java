public class GameMaster {
	public Player black, white; 
	public GameMaster() {
		InitializeBoard();
		InitializePlayers();
		DetermineWhoGoesFirst();
	}
	private void InitializeBoard()
	{

	}
	private void InitializePlayers()
	{
		black = new Player();
		white = new Player();
	}
	private void DetermineWhoGoesFirst()
	{
		Random rand = new Random();
		int constant = rand.nextInt(50)+1;
		if(constant > 25)
		{
			black.AssignTurnOrder(Player.TurnOrder.first);
			white.AssignTurnOrder(Player.TurnOrder.last);
		}
		else {
			black.AssignTurnOrder(Player.TurnOrder.last);
			white.AssignTurnOrder(Player.TurnOrder.first);
		}


	}
	@Override
	public String toString()
	{
		if (black.turnorder == Player.TurnOrder.first)
			return "Black is going first";
		else return "White is going first";

	}
}