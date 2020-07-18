import java.util.Vector;
public class Graph
{
  private final int V;
  private int numberOfEdges=0;
  private Vector<Integer>[] adj;//Adjacency Lists
  
  public Graph(int V)
  {
    this.V=V;
    this.numberOfEdges=0;
    adj=(Vector<Integer>[]) new Vector[V];//Empty Graph with V vertices
    for(int i=0;i<V;i++)
      adj[i]=new Vector<Integer>();
  }
  
  public void addEdge(int v,int w)
  {
    adj[v].add(w);
    adj[w].add(v);
    this.numberOfEdges++;
  }
  public Iterable<Integer> adj(int v)
  {
    return adj[v];//Iterator for vertices adjacent to v
  }
  public int V()
  {
    return V;//Number of Vertices
  }
  public int E()
  {
    return numberOfEdges;//Number of Edges
  }
    
}