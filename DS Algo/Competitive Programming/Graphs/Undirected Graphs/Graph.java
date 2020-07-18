/* A Graph implemented using Vector(Resizeable Array).
 * Parallel edges and self-loops allowed.
 * All Operations takes constant time per operation.
 * Iterating takes time proportional to number of such verices.
 */
 
import java.util.Vector;

public class Graph
{
  private final int V;
  private int E;
  private Vector<Integer>[] adj;
  
  public Graph(int V){
    assert V>0;
    
    this.V=V;
    this.E=0;
    adj=(Vector<Integer>[] ) new Vector[V];
    for(int v=0;v<V;v++){
      adj[v]=new Vector<Integer>();
    }
  }
  
  public int V()
  {
    return V;
  }
  public int E()
  {
    return E;
  }
  
  public void addEdge(int v, int w)
  {
    assert v>=0&&v<V&&w>=0&&w<V;
    E++;
    adj[v].add(w);
    adj[w].add(v);
  }
  public Iterable<Integer> adj(int v){
    assert v>=0&&v<V;
    return adj[v];
  }
  public int degree(int v)
  {
    assert v>=0&&v<V;
    return adj[v].size();
  }
  
  
  public static void main(String[] args)
  {
  }
}
 
    
    
  
