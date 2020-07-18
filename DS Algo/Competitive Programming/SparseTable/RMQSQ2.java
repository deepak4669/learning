import java.util.*;
import java.io.*;

public class RMQSQ2
{
  static int k=16;
  static int N=100000;
  static int zero=1000000001;
  
  static int[][] table=new int[N][k+1];
  static int[] arr;
  static int[] log=new int[N+1];
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    //Arrays.fill(table,zero);
    
                    
    for(int i=0;i<n;i++)
    {
      //Arrays.fill(table[i][0],zero);
      table[i][0]=arr[i];
    }
    
    for(int j=1;j<=k;j++)
    {
      for(int i=0;i<=(n-(1<<j));i++)
      {
        table[i][j]=Math.min(table[i][j-1],table[i+(1<<(j-1))][j-1]);
      }
    }
    log[1]=0;
    for(int i=2;i<=N;i++)
      log[i]=log[i/2]+1;
    
    int q=sc.nextInt();
    for(int i=0;i<q;i++)
    {
      int l=sc.nextInt();
      int r=sc.nextInt();
      int j=log[r-l+1];
      int minimum=Math.min(table[l][j],table[r-(1<<j)+1][j]);
      out.println(minimum);
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
        