import java.util.Random;
public class Initialize
{
	public Initialize()
	{
		new GameMaster();
	}
	
	@Override
	public String toString()
	{
		if (GameMaster.black.turnorder == Player.TurnOrder.first)
			return "Black is going first";
		else return "White is going first";

	}
}