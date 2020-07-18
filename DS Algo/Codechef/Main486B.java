import java.util.*;
import java.io.*;

class Main486B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int[][] b=new int[m][n];
    int[][] a=new int[m][n];
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=-1;
      }
    }
        
    
    
    
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        b[i][j]=sc.nextInt();
        if(b[i][j]==0)
        {
          for(int k=0;k<m;k++)
            a[k][j]=0;
          for(int k=0;k<n;k++)
            a[i][k]=0;
        }
      }
    }
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(a[i][j]==-1)
          a[i][j]=1;
        //out.print(a[i][j]+" ");
      }
      //out.println();
    }
    int[][] c=new int[m][n];
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        for(int k=0;k<m;k++)
        {
          c[i][j]=(c[i][j]|a[k][j]);
        }
        for(int k=0;k<n;k++)
        {
          c[i][j]=(c[i][j]|a[i][k]);
        }
      }
    }
    boolean flag=true;
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(c[i][j]!=b[i][j])
        {
          flag=false;
          break;
        }
      }
      if(!flag)
        break;
    }
    if(!flag)
      out.println("NO");
    else
    {
      out.println("YES");
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          out.print(a[i][j]+" ");
        }
        out.println();
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
