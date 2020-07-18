import java.util.*;
import java.io.*;
import java.lang.*;


public class BFS
{
  public static boolean marked[];
  public static Vector<Integer>[] graph;
  public static void main(String[] args)
  {
    int n=5;
    graph=(Vector<Integer>[]) new Vector[n];
    marked=new boolean[n];
    for(int i=0;i<n;i++)
    {
      graph[i]=new Vector<Integer>();
    }
    graph[0].add(1);
    graph[1].add(0);
    graph[0].add(2);
    graph[2].add(0);
    graph[0].add(3);
    graph[3].add(0);
    graph[3].add(4);
    graph[4].add(3);
    bfs(0);
  }
  public static void bfs(int s)
  {
    Queue<Integer> q=new LinkedList<Integer>();
    q.add(s);
    marked[s]=true;
    System.out.println(s);
    while(!(q.size()==0))
    {
      int v=q.remove();
      for(int w:graph[v])
      {
        if(!marked[w])
        {
          System.out.println(w);
          q.add(w);
          marked[w]=true;
        }
      }
    }
  }
}
  