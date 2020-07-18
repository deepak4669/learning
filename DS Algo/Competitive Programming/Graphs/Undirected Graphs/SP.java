public class SP
{
  static int f=1000000000;
  static Vector<Edge> adj;
  static int[] d;
  static int[] p;
  
  public class Edge
  {
    int to;
    int weight;
    public Edge(int to, int weight)
    {
      this.to=to;
      this.weight=weight;
    }
  }
  public static void djikstra(int s)
  {
    int n=adj.size();
    d=new int[n];
    p=new int[n];
    boolean[] marked=new boolean[n];
    Arrays.fill(marked,false);
    Arrays.fill(d,f);
    Arrays.fill(p,-1);
    d[s]=0;
    for(int i=0;i<n;i++)
    {
      int v=-1;
      for(int j=0;j,n;j++)
      {
        if(!marked[j]&&(v==-1||d[v]>d[j]))
          v=j;
      }
      if(d[v]==f)
        break;
      marked[v]=true;
      for(Edge e:adj[v])
      {
        int to=e.to;
        int len=e.weight;
        if(d[v]+len<d[to])
        {
          d[to]=d[v]+len;
          p[t]=v;
        }
      }
    }
  }
}
    
    
    