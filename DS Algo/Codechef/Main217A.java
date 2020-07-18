import java.util.*;
import java.io.*;
//267630EY
public class Main217A
{
  static PrintWriter out=new PrintWriter(System.out);
  static boolean marked[];
  static int n;
  static int[] x;
  static int[] y;
  static void dfs(int w)
  {
    marked[w]=true;
    Vector<Integer> v=new Vector<Integer>();
    for(int i=0;i<n;i++)
    {
      if(x[w]==x[i]||y[w]==y[i])
        v.add(i);
    }
    for(int j:v)
    {
      if(!marked[j])
        dfs(j);
    }
  }
  
  
  public static void main(String[] args) throws IOException
  {
    
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    x=new int[n];
    y=new int[n];
    for(int i=0;i<n;i++)
    {
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
    }
    marked=new boolean[n];
    int cnt=0;
    for(int i=0;i<n;i++)
    {
      if(!marked[i])
      {
        cnt++;
        dfs(i);
      }
    }
    out.println(cnt-1);
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

