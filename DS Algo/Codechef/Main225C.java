import java.util.*;
import java.io.*;
//267630EY
public class Main225C
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    String[] s=new String[n];
    for(int i=0;i<n;i++)
      s[i]=sc.next();
    int[] white=new int[m+1];
    int[] black=new int[m+1];
    for(int i=0;i<m;i++)
    {
      int w=0;
      int b=0;
      for(int j=0;j<n;j++)
      {
        if(s[j].charAt(i)=='.')
          w++;
        if(s[j].charAt(i)=='#')
          b++;
      }
      white[i+1]=white[i]+(n-w);
      black[i+1]=black[i]+(n-b);
    }
    int[][] dp=new int[m+1][2];
    for(int i=1;i<=m;i++)
    {
      dp[i][0]=1000000000;
      dp[i][1]=1000000000;
      for(int j=x;j<=y;j++)
      {
        if(j<=i)
        {
          dp[i][0]=Math.min(dp[i-j][1]+black[i]-black[i-j],dp[i][0]);
          dp[i][1]=Math.min(dp[i-j][0]+white[i]-white[i-j],dp[i][1]);
        }
      }
      if(i<x)
      {
        dp[i][0]=white[i];
        dp[i][1]=black[i];
      }
    }
    out.println(Math.min(dp[m][1],dp[m][0]));
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

