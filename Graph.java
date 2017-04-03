class Node {
	public boolean occupied;
	public String name; 
	public List<Edge> Connections; 
	public Node(String name)
	{
		occupied = false;
		this.name = name; 
	}
	@Override
	public String toString()
	{
		return name; 
	}
}
class Edge {
	private Node start;
	private Node end; 
	public Node GetStart()
	{
		return start;
	}
	public Node GetEnd()
	{
		return end;
	}
	@Override 
	public String toString()
	{
		return GetStart().toString() + GetEnd().toString();
	}
}
public class Graph {
	public Graph()
	{

	}
	public void drawGraph()
	{

	}
	public void AddEdge(int v, int w)
	{

	}




}