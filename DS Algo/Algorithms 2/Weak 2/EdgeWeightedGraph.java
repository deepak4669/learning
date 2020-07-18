import java.util.Vector;
public class EdgeWeightedGraph{
  private final int V;
  private final Vector<Edge>[] adj;
  
  public EdgeWeightedGraph(int V)
  {
    this.V=V;
    adj=(Vector<Edge>[]) new Vector[V];
    for(int v=0;v<V;v++)
      adj[v]=new Vector<Edge>();
  }
  public void addEdge(Edge e)
  {
    int v=e.either();
    int w=e.other(v);
    adj[v].add(e);
    adj[w].add(e);
  }
  public Iterable<Edge> adj(int v)
  {
    return adj[v];
  }
}