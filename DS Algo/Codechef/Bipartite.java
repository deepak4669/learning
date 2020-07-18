public class Bipartite
{
  private boolean isBipartite;//
  private boolean[] color;
  private boolean[] marked;      
  public Bipartite(Graph G){
    isBipartite = true;
    color=new boolean[G.V()];
    marked=new marked[G.V()];
        
    for(int i=0;i<G.V();i++)
    {
      if(!marked[v]){
        dfs(G,v);
      }
    }
  }
  private void dfs(Graph,int v)
  {
    marked[v]=true;
    for(int w:G.adj(v))
    {
      
      if(!marked[w]){
        edgeTo[w]=v;
        color[w]=!color[v];
        dfs(G,w);}
      
      else if(color[w]==color[v]){
        isBipartite=false;
      }
    }
  }
  public boolean isBipartite(){
    return isBipartite;
  }
}
        