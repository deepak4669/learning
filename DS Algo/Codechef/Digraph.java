import java.util.Vector;
public class Digraph
{
  private final int V;
  private final Vector<Integer>[] adj;
  
  public Digraph(int V)
  {
    this.V=V;
    adj=(Vector<Integer>[]) new Vector[V];
    for(int i=0;i<V;i++)
    {
      adj[i]=new Vector<Integer>();
    }
  }
  public void addEdge(int v,int w)
  {
    adj[v].add(w);
  }
  
  public Iterable<Integer> adj(int v)
  {
    return adj[v];
  }
  public int V()
  {
    return V;
  }
}
  