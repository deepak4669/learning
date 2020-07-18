import java.util.*;
import java.io.*;

public class Main27B
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<Integer>[] graph;
  static boolean isCycle=false;
  static boolean marked[];
  static boolean onStack[];
  
  static boolean cycle()
  {
    marked=new boolean[graph.length];
    onStack=new boolean[graph.length];
    
    
    for(int i=0;i<graph.length;i++)
    {
      if(!marked[i]&&!isCycle)
        dfs(i);
    }
    if(isCycle)
      return true;
    return false;
  }
  static void dfs(int v)
  {
    marked[v]=true;
    onStack[v]=true;
    for(int w:graph[v])
    {
      if(!marked[w])
      {
        dfs(w);
      }
      else if(onStack[w])
      {
        isCycle=true;
        break;
      }
    }
    onStack[v]=false;
  }
  
  
     
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    graph=(Vector<Integer>[]) new Vector[n];
    int[] a=new int[n];
    
    for(int i=0;i<n;i++)
      graph[i]=new Vector<Integer>();
    for(int i=0;i<(n*(n-1))/2-1;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      x-=1;
      y-=1;
      graph[x].add(y);
      a[x]++;
      a[y]++;
    }
    int[] v=new int[2];
    int k=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==n-2)
        v[k++]=i;
    }
    //out.println(cycle());
    graph[v[0]].add(v[1]);
    if(!cycle())
      out.println((v[0]+1)+" "+(v[1]+1));
    else
      out.println((v[1]+1)+" "+(v[0]+1));
    out.flush();
    
      
    
    
  }
  static class Scanner
  {
    BufferedReader br;
    StringTokenizer tk=new StringTokenizer("");
    public Scanner(InputStream is) 
        {
      br=new BufferedReader(new InputStreamReader(is));
    }
        public int nextInt() throws IOException
        {
          if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
          tk=new StringTokenizer(br.readLine());
          return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
              return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
          if(tk.hasMoreTokens())
            return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
          tk=new StringTokenizer("");
          return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
              return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
              return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
              a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
          long a[]=new long[n];
            for(int i=0;i<n;i++)
              a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
          int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
              a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
          long a[]=new long[n+1];
          for(int i=1;i<=n;i++)
                a[i]=nextLong();
          return a;
        }
  }
}

