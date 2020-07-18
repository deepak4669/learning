import java.util.*;
import java.io.*;

public class Main463C2
{
  static PrintWriter out=new PrintWriter(System.out);
  static int n;
  static int mid(int i,int j)
  {
    return i+j-1;
  }
  static int sid(int i,int j)
  {
    return n-(i-j);
  }
  static boolean black(int i,int j)
  {
    return (i+j)%2==0;
  }
  
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[][] a=new int[n+1][n+1];
    long[] m=new long[2*n];
    long[] s=new long[2*n];
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        a[i][j]=sc.nextInt();
        m[mid(i,j)]+=a[i][j];
        s[sid(i,j)]+=a[i][j];
      }
    }
    int bx=1;
    int by=1;
    int wx=1;
    int wy=2;
    long bmax=m[mid(1,1)]+s[sid(1,1)]-a[1][1];
    long wmax=m[mid(1,2)]+s[sid(1,2)]-a[1][2];
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<n;j++)
      {
        long val=m[mid(i,j)]+s[sid(i,j)]-a[i][j];
        if(black(i,j))
        {
          if(bmax<val)
          {
            bx=i;
            by=j;
            bmax=val;
          }
        }
        else 
        {
          if(wmax<val)
          {
            wx=i;
            wy=j;
            wmax=val;
          }
        }
      }
    }
    out.println(wmax+bmax);
    out.println(bx+" "+by+" "+wx+" "+wy);
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

