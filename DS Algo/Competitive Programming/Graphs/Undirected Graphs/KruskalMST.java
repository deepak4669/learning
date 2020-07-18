public class KruskalMST
{
  public class UF
  {
    private int[] id;
    private int[] sz;
    
    public UF(int n)
    {
      id=new int[n];
      sz=new int[n];
      for(int i=0;i<n;i++)
        id[i]=i;
    }
    public int find(int p)
    {
      while(p!=id[p])
      {
        id[p]=find(id[p]);
      }
      return id[p];
    }
    public boolean connected(int q, int r)
    {
      return id[q]==id[r];
    }
    public void union(int p, int q)
    {
      int r=find(p);
      int s=find(q);
      if(r==s) return;
      if(sz[r]>sz[s]) id[s]=r;
      else id[r]=s;
    }
  }
  private Stack<Integer> mst=new Stack<Integer>();
  
  public KruskalMST(EdgeWeightedGraph G)
  {
    PriorityQueue<Edge> pq=new PriorityQueue<Edge>();
    for(Edge w:G)
      pq.addd(w);
    UF uf=new UF(G.V());
    while(!pq.size==0&&mst.size()<G.V()-1)
    {
      Edge e=pq.poll();
      int v=e.either();int w=e.either();
      if(!uf.connected(v,w))
        uf.union(v,w);
      mst.push(s);
      ]]