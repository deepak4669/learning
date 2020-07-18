import java.util.*;
import java.io.*;

public class Main431B
{
  static PrintWriter out=new PrintWriter(System.out);
  static boolean distinct(int a,int b,int c,int d,int e)
  {
    boolean[] marked=new boolean[5];
    marked[a]=true;
    marked[b]=true;
    marked[c]=true;
    marked[d]=true;
    marked[e]=true;
    for(int i=0;i<5;i++)
    {
      if(!marked[i])
        return false;
    }
    return true;
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int[][] g=new int[5][5];
    for(int i=0;i<5;i++)
    {
      for(int j=0;j<5;j++)
      {
        g[i][j]=sc.nextInt();
      }
    }
    int ans=0;
    for(int a=0;a<5;a++)
    {
      for(int b=0;b<5;b++)
      {
        for(int c=0;c<5;c++)
        {
          for(int d=0;d<5;d++)
          {
            for(int e=0;e<5;e++)
            {
              //out.println("A");
              if(distinct(a,b,c,d,e))
              {
                int val=g[a][b]+g[b][a]+2*(g[c][d]+g[d][c])+2*(g[d][e]+g[e][d])+g[b][c]+g[c][b];
                if(val>ans)
                  ans=val;
              }
            }
          }
        }
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

