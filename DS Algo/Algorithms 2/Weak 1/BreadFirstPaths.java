/* Breadth First Search
 * Put s into a Queue mark s as visited
 * Repeat until queue is empty
 *  remove the least recently added vertex v
 *  add each of v's unvisited neighbours to queue
 *  and mark them as visited.
 * */




public class BreadFirstPaths
{
  private boolean[] marked;
  private int[] edgeTo;
  private int s;
  
  public BreadFirstPaths(Graph G,int s)
  {
    marked=new boolean[G.V()];
    edgeTo=new int[G.V()];
    this.s=s;
    bfs(G,s);
  }
  
  private void bfs(Graph G, int s)
  {
    Queue<Integer> q=new Queue<Integer>();
    q.enqueue(s);
    marked[s]=true;
    while(!q.isEmpty())
    {
      int v=q.dequeue();
      for(int w:G.adj(v))
      {
        if(!marked[w])
        {
          q.enqueue(w);
          marked[w]=true;
          edgeTo[w]=v;
        }
      }
    }
  }
}