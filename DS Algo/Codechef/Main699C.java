import java.util.*;
import java.io.*;
//267630EY
public class Main699C
{
  static PrintWriter out=new PrintWriter(System.out);
  static int[][] dp;
  
  
  public static int solve(int[] a,int prev,int n)
  {
    if(n>=a.length) return 0;
    if(dp[n][prev]!=Integer.MAX_VALUE) return dp[n][prev];
    else
    {
      if(a[n]==0)
      {
        dp[n][prev]=solve(a,0,n+1)+1;
      }
      else if(a[n]==1||a[n]==2)
      {
        int curr=((prev==a[n])?0:a[n]);
        dp[n][prev]=(curr==0?(1+solve(a,curr,n+1)):solve(a,curr,n+1));
//        System.out.println(n);
      }
      else
      {
         if(prev==0)
         {
           dp[n][prev]=Math.min(solve(a,2,n+1),solve(a,1,n+1));
         }
         else if(prev==1)
         {
           dp[n][prev]=solve(a,2,n+1);
         }
         else if(prev==2)
         {
           dp[n][prev]=solve(a,1,n+1);
         }
      }
      return dp[n][prev];
    }
  }
        
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    dp=new int[n][3];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<3;j++)
        dp[i][j]=Integer.MAX_VALUE;
    }
    int[] a=sc.nextIntArray(n);
   
    
    int ans=solve(a,0,0);
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
}

