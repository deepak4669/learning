/* DEPTH FIRST SEARCH
 * 
 *mark v as visited:
 *recursively visit all unmarked vertices 
 *adjacent to v.*/
import java.util.Stack;
public class DepthFirstPaths
{
  private boolean[] marked;//marked[v]=true if v is connected to s
  private int[] edgeTo;//edgeTo[v] = previous vertex to v on path from s to v
  private int s;
  
  public DepthFirstPaths(Graph G,int s)
  {
    marked=new boolean[G.V()];
    edgeTo=new int[G.V()];
    this.s=s;
    dfs(G,s);//Find vertices connected to s
  }
  private void dfs(Graph G, int v)
  {
    marked[v]=true;
    for(int w:G.adj(v))
    {
      if(!marked[w])
      {
        dfs(G,w);//recursive
        edgeTo[w]=v;
      }
    }
  }
  public boolean hasPathTo(int v)
  {
    return marked[v];//Constant time for finding if v is connected to s
  }
  public Iterable<Integer> pathTo(int v)//Finding path takes time proportional to its length
  {
    if(!hasPathTo(v)) return null;
    Stack<Integer> path=new Stack<Integer>();
    for(int i=v;i!=s;i=edgeTo[i])
      path.push(i);
    path.push(s);
    return path;
  }
}