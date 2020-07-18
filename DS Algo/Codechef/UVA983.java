import java.util.*;
import java.io.*;
import java.lang.*;

public class UVA983
{
  static PrintWriter out=new PrintWriter(System.out);
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int cnt=0;
    
    while(sc.hasNext())
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      
      int[][] a=new int[n][n];
      
      long[][] sum=new long[n][n];
      long[][] ans=new long[n-m+1][n-m+1];
      long final_ans=0;
      
      for(int i=n-1;i>=0;i--)
      {
     
        for(int j=0;j<n;j++)
        {
          a[i][j]=sc.nextInt();
          sum[i][j]=a[i][j];
          
        }
       
      }
      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          sum[i][j]=a[i][j];
          if(i>=1)
            sum[i][j]+=sum[i-1][j];
          if(j>=1)
            sum[i][j]+=sum[i][j-1];
          if(i>=1&&j>=1)
            sum[i][j]-=sum[i-1][j-1];
        }
      }
      
      for(int i=0;i<n-m+1;i++)
      {
        for(int j=0;j<n-m+1;j++)
        {
          ans[i][j]=sum[i+m-1][j+m-1];
          if(i>=1)
            ans[i][j]-=sum[i-1][j+m-1];
          if(j>=1)
            ans[i][j]-=sum[i+m-1][j-1];
          if(i>=1&&j>=1)
            ans[i][j]+=sum[i-1][j-1];
        }
      }
      if(cnt>=1)
        out.println();
      
      for(int i=n-m;i>=0;i--)
      {
        for(int j=0;j<n-m+1;j++)
        {
          out.println(ans[i][j]);
          final_ans+=ans[i][j];
        }
      }
      
      out.println(final_ans);
      out.flush();
//      for(int i=0;i<n;i++)
//      {
//        for(int j=0;j<n;j++)
//          System.out.print(sum[i][j]+" ");
//        System.out.println();
//      }
      
      cnt++;
      
    }
  }
  /*
  static class Scanner
  {
    BufferedReader br;
    StringTokenizer tk=new StringTokenizer("");
    public Scanner(InputStream is) 
    {
      br=new BufferedReader(new InputStreamReader(is));
    }
    
    public boolean hasNext()
    {
      

      boolean result=false;
      
      try 
      {
        result = br.ready();
      } 
      catch (IOException e)
      {
        System.err.println(e);
      }
      return result;
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
  */
}
      
                             
      
        
          