import java.util.*;
import java.io.*;

public class Main1095D
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<Integer>[] graph;
  static boolean[] marked;
  static int edgeTo[];
  static int[] sol;
  static int k=0;
  public static  void dfs(int s)
  {
    marked[s]=true;
    //out.print((s+1)+" ");
    sol[k++]=s+1;
    for(int w:graph[s])
    {
      if(!marked[w])
      {
        edgeTo[w]=s;
        dfs(w);
      }
    }
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    marked=new boolean[n];
    edgeTo=new int[n];
    k=0;
    graph=(Vector<Integer>[]) new Vector[n];
    sol=new int[n];
    for(int i=0;i<n;i++)
      graph[i]=new Vector<Integer>();
    int[] c=new int[n+1];
    int[] d=new int[n+1];
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      c[i+1]=x;
      d[i+1]=y;
      graph[x-1].add(y-1);
      graph[y-1].add(x-1);
    }
    dfs(0);
    boolean clk=true;
    for(int i=n-1;i>=1;i--)
    {
      if(sol[i-1]==c[sol[i]]||sol[i-1]==d[sol[i]])
        continue;
      else
      {
        clk=false;
        break;
      }
    }
    
    
    if(clk)
      for(int i=n-1;i>=0;i--)
      out.print(sol[i]+" ");
    else
      for(int i=0;i<n;i++)
      out.print(sol[i]+" ");
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

