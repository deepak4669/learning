import java.util.*;
import java.io.*;

class Main129B
{
  static class Graph
  {
    Vector<Integer>[] G;
    public Graph(int n)
    {
      G=(Vector<Integer>[]) new Vector[n];
      for(int i=0;i<n;i++)
        G[i]=new Vector<Integer>();
    }
    public void add(int v,int w)
    {
      G[v].add(w);
      G[w].add(v);
    }
    public Iterable<Integer> adj(int v)
    {
      return G[v];
    }
  }
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    Graph g=new Graph(n);
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      x--;
      y--;
      g.add(x,y);
    }
    boolean marked[]=new boolean[n];
    int ans=0;
    while(true)
    {
      boolean flag=false;
      int k=0;
      //int[][] w=new int[n][n];
      int[] w=new int[n];
      int[] v=new int[n];
      for(int i=0;i<n;i++)
      {       
        if(!marked[i])
        {
          for(int j:g.adj(i))
          {
            if(g.G[j].size()==1&&!marked[j])
            {
              flag=true;
              marked[j]=true;
              w[k]=j;
              v[k++]=i;
             
            }
          }
        }
      }
     
      if(!flag) break;
      for(int i=0;i<k;i++)
      {
        g.G[w[i]].remove((Integer)v[i]);
        g.G[v[i]].remove((Integer)w[i]);
      }
      ans++;

    }
    out.println(ans);
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

