/**
 * Depth First Search on Undirected Graph.
 * Runs in O(E+V) time.
 */

public class DepthFirstSearch
{
  private boolean[] marked; 
  private int count;         //number of vertices connected to s
  
  public DepthFirstSearch(Graph G, int s)
  {
    marked=new boolean[G.V()];
    assert s>=0&&s<G.V();
    dfs(G,s);
  }
  
  private void dfs(Graph G, int v){
    count++;
    marked[v]=true;
    for(int w:G.adj(v))
    {
      if(!marked[w])
        dfs(G,w);
    }
  }
  public boolean marked(int v)
  {
    assert v>=0&&v<marked.length;
    return marked[v];
  }
  
  public int count()
  {
    return count;
  }
  
  public static void main(String[] args)
  {
  }
}