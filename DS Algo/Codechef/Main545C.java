import java.util.*;
import java.io.*;
//267630EY
public class Main545C
{
  static PrintWriter out=new PrintWriter(System.out);
  static HashMap<pair,Integer> map;
  static int[] x;
  static int[] h;
  static int[][] dp;
  static class pair implements Comparable<pair>
  {
    int a;
    int b;
    public pair(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    public boolean equals(Object y)
    {
      pair that=(pair) y;
      if(this.a!=that.b) return false;
      if(this.b!=that.b) return false;
      return true;
    }
    public int compareTo(pair that)
    {
      if(this.a>that.a) return +1;
      else if(this.b>that.a) return +1;
      else if(this.a<that.a) return -1;
      else if(this.b<that.b) return -1;
      else return 0;
    }
  }
  
/*
  static int solve(int i,int min)
  {
    if(i>=x.length) return 0;
    else if(equal(min,i)) return map.get(new pair(min,i));
    else if(i==x.length-1) return 1;
    else
    {
      int ans=0;
      if(x[i]>min&&x[i]<x[i+1])
      {
        int ans1=0;
        int ans2=0;
        int ans3=0;
        if((x[i]-h[i])>min)
          ans1=1+solve(i+1,x[i]);
        if((x[i]+h[i])<x[i+1])
          ans2=1+solve(i+1,x[i]+h[i]);
        ans3=solve(i+1,x[i]);
        ans=Math.max(ans1,Math.max(ans2,ans3));
      }
      else
      {
        int val=Math.max(x[i],Math.max(x[i+1],min));
        ans=solve(i+1,val);
      }
      map.put(new pair(min,i),ans);
      return ans;
    }
  }
  public static boolean equal(int min,int i)
  {
    pair b=new pair(min,i);
    return map.containsKey(b);
  }
  
  */
  public static int solve(int i, int j,int min)
  {
    if(i>=x.length) return 0;
    else if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
    else if(i==x.length-1&&j==2) return 1;
    else if(i==x.length-1&&j==1) return 0;
    else
    {
      if(j==1)
      {
        int val=Math.max(x[i],min);
        dp[i][j]=Math.max(solve(i+1,0,val),Math.max(solve(i+1,1,val),solve(i+1,2,val)));
      }
      if(j==0)
      {
        if(x[i]-h[i]>min)
        {
          int val=Math.max(x[i],min);
          dp[i][j]=Math.max(1+solve(i+1,0,val),Math.max(1+solve(i+1,1,val),1+solve(i+1,2,val)));
        }
        else
        {
          int val=Math.max(x[i],min);
          dp[i][j]=Integer.MIN_VALUE;
        }
      }
      if(j==2)
      {
        if(x[i]>min&&x[i]+h[i]<x[i+1])
        {
          int val=x[i]+h[i];
          
          dp[i][j]=Math.max(1+solve(i+1,0,val),Math.max(1+solve(i+1,1,val),1+solve(i+1,2,val)));
        }
        else
        {
          int val=Math.max(x[i],min);
          dp[i][j]=Integer.MIN_VALUE;
        }
      }
      return dp[i][j];
    }
  }
          
        
     
    
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    x=new int[n];
    h=new int[n];
    dp=new int[n][3];
    map=new HashMap<pair,Integer>();
    for(int i=0;i<n;i++)
    {
      x[i]=sc.nextInt();
      h[i]=sc.nextInt();
      for(int j=0;j<3;j++)
        dp[i][j]=Integer.MAX_VALUE;
        
    }
    int ans=Math.max(solve(0,0,Integer.MIN_VALUE),Math.max(solve(0,1,Integer.MIN_VALUE),solve(0,2,Integer.MIN_VALUE)));
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
