import java.util.*;
import java.io.*;
//267630EY
public class Main445B
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<Integer>[] graph;
  static boolean marked[];
  static int count=0;
  
  static void dfs(int s)
  {
    marked[s]=true;
    count++;
    for(int w:graph[s])
    {
      if(!marked[w])
      {
        dfs(w);
      }
    }
  }
        
      
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    
    graph=(Vector<Integer>[]) new Vector[n];
    for(int i=0;i<n;i++)
      graph[i]=new Vector<Integer>();
    marked=new boolean[n];
    long ans=1;
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      x--;
      y--;
      graph[x].add(y);
      graph[y].add(x);
    }
    int[] size=new int[n];
    for(int i=0;i<n;i++)
    {
      if(!marked[i])
      {
        count=0;
        dfs(i);
        size[i]=count;
      }
    }
    Arrays.sort(size);
    
    for(int i=0;i<n;i++)
    {
      if(size[i]==0)
        continue;
      else
      {
        ans*=(long)Math.pow(2,size[i]-1);
      }
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

