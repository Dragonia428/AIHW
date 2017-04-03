public class Player {
private int numberoftokens;
public enum TurnOrder {
	first,
	last
}

public TurnOrder turnorder;
public void AssignTurnOrder(TurnOrder order)
{
	this.turnorder = order; 
}
public Player()
{
	InitializeTokens(9);
}
private void InitializeTokens(int number)
{
	this.numberoftokens = number; 
}


}
