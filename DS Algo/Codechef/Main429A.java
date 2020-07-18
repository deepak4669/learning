import java.util.*;
import java.io.*;
//267630EY
public class Main429A
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<Integer>[] g;
  static int[] init;
  static int[] fi;
  static boolean[] marked;
  static int ans=0;
  static Vector<Integer> sol;
  
  static void dfs(int even,int odd,int level,int s,int in)
  {
    marked[s]=true;
    if(in!=fi[s])
    {
      //System.out.println(s);
      if(level%2==0)
      {
        even++;
      }else
        odd++;
      ans++;
      sol.add(s);
    }
    //else
      
    for(int i:g[s])
    {
      if(!marked[i])
      {
        if(level%2==0)
        {
          dfs(even,odd,level+1,i,(init[i]+odd)%2);
        }
        else
          dfs(even,odd,level+1,i,(init[i]+even)%2);
      }
    }
  }
      
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    g=(Vector<Integer>[]) new Vector[n];
    for(int i=0;i<n;i++)
      g[i]=new Vector<Integer>();
    for(int i=0;i<n-1;i++)
    {
      int u=sc.nextInt();
      int v=sc.nextInt();
      u--;
      v--;
      g[u].add(v);
      g[v].add(u);
      //if(u<v) g[u].add(v);
      //else g[v].add(u);
    }
    init=new int[n];
    fi=new int[n];
    marked=new boolean[n];
      
    init=sc.nextIntArray(n);
    fi=sc.nextIntArray(n);
    ans=0;
    sol=new Vector<Integer>();
    dfs(0,0,0,0,init[0]);
    out.println(ans);
    for(int j:sol)
      out.println(j+1);
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

