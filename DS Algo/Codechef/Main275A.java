import java.util.*;
import java.io.*;

public class Main275A
{
  static PrintWriter out=new PrintWriter(System.out);
  static boolean valid(int i,int j)
  {
    return i>=0&&i<=2&&j>=0&&j<=2;
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    
    int[][] a=new int[3][3];
    int[][] b=new int[3][3];
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        a[i][j]=sc.nextInt();
        b[i][j]=a[i][j];
      }
    }
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        if(valid(i-1,j))
          b[i-1][j]+=a[i][j];
        if(valid(i+1,j))
          b[i+1][j]+=a[i][j];
        if(valid(i,j-1))
          b[i][j-1]+=a[i][j];
        if(valid(i,j+1))
          b[i][j+1]+=a[i][j];
      }
    }
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        if(b[i][j]%2==0)
          out.print(1);
        else 
          out.print(0);
      }
      out.println();
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

