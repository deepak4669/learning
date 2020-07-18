import java.util.*;
import java.io.*;

class Main200A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int k=sc.nextInt();
    boolean[][] marked=new boolean[n+1][m+1];
    for(int l=0;l<k;l++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      if(!marked[x][y])
      {
        marked[x][y]=true;
        out.println(x+" "+y);
      }
      else
        
      {
        int x2=0;
        int y2=0;
        int min=1000000000;
          
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=m;j++)
          {
            if(!marked[i][j])
            {
              if(Math.abs(x-i)+Math.abs(y-j)<min)
              {
                min=Math.abs(x-i)+Math.abs(y-j);
                x2=i;
                y2=j;
              }
            }
          }
        }
        marked[x2][y2]=true;
        out.println(x2+" "+y2);
      }
    }
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
