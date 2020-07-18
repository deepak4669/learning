import java.util.Scanner;
import java.util.Vector;
public class LASTSHOT
{
  static Vector<Integer>[] adj;
  static boolean[] marked;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    adj=(Vector<Integer>[]) new Vector[n];
    marked=new boolean[n];
    for(int i=0;i<n;i++)
      adj[i]=new Vector<Integer>();
    int m=sc.nextInt();
    for(int i=0;i<m;i++)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      marked=new boolean[n];
      adj[--a].add(--b);
    }
    int max=0;
    for(int i=0;i<n;i++)
    {
      int current=dfs(i);
      if(current>max) max=current;
    }
    System.out.println(max);
  }
  public static int dfs(int a)
  {
    marked[a]=true;
    int ans=1;
    for(int w:adj[a])
    {
      if(!marked[w])
      {
        return ans=ans+dfs(w);
      }
    }
    return ans;
  }
}
    
    
      
    
                       
    
    
  