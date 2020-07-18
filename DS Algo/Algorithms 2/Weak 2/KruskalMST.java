import java.util.MinMaxPriorityQueue;
import java.util.Stack;
public class KruskalMST
{
  private Stack<Edge> mst=new Stack<Edge>();
  
  public KruskalMST(EdgeWeightedGraph G)
  {
    MinMaxPriorityQueue<Edge> pq=new MinMaxPriorityQueue<Edge>();
    for(Edge e:G.edges())
      pq.add(e);
    UF uf=new UF(G.V());
    while(!pq.isEmpty&&mst.size()<G.V()-1)
    {
      Edge e=pq.removeFirst();
      int v=e.either();
      int w=r.other(v);
      if(!uf.connected(v,w))
      {
        uf.union(v,w);
        mst.push(e);
      }
    }
  }
  public Iterable<Edge> edges()
  {
    return mst;
  }
}


        