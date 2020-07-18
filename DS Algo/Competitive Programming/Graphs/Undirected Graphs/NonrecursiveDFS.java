/**
 * Non-recursive depth-first-search on an undirected graph.
 * Runs in O(E+V) time.
 * Non recursive dfs with explicit Stack.
 * It uses extra space proportional to E+V.
 */

import java.util.Stack;

public class NonrecursiveDFS{
  
  private boolean[] marked;
  
  public NonrecursiveDFS(Graph G, int s)
  {
    marked=new boolean[G.V()];
    assert s>=0&&s<marked.length;
    
    Iterator<Integer>[] adj=(Iterator<Integer>[]) new Iterator[G.V()];
    for(int v=0;v<G.V();v++)
      adj[v]=G.adj(v).iterator();
    
    Stack<Integer> stack=new Stack<Integer>();
    marked[s]=true;
    stack.push(s);
    while(!stack.isEmpty()){
      int v=stack.peek();
      if(adj[v].hasNext()){
        int w=adj[v].next();
        if(!marked[w]){
          marked[w]=true;
          stack.push(w)
        }
      }
      else{
        stack.pop();
      }
    }
  }
  public boolean marked(int v)
  {
    assert v>=0&&v<V;
    return marked[v];
  }
  
  
  public static void main(String[] args)
  {
  }
}
            
      