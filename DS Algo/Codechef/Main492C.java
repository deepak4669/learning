import java.util.*;
import java.io.*;
//267630EY
public class Main492C
{
  static PrintWriter out=new PrintWriter(System.out);
  public  static class pair implements Comparable<pair>
  {
    long a;
    long b;
    public pair(long a,long b)
    {
      this.a=a;
      this.b=b;
    }
    public int compareTo(pair that)
    {
      if(this.b<that.b) return -1;
      else if(this.b>that.b) return +1;
      else return 0;
    }
  }
    

        
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
    long avg=sc.nextLong();
    long sum=0;
    pair[] p=new pair[n];
    for(int i=0;i<n;i++)
    {
      long a=sc.nextLong();
      sum+=(long)a;
      long b=sc.nextLong();
      p[i]=new pair(a,b);
    }
    long sumavg=sum/n;
    if(sumavg>=avg)
    {
      out.println(0);
    }
    else
    {
      long rem=(n*avg-sum);
      Arrays.sort(p);
      long ans=0;
      for(int i=0;i<n&&rem>0;i++)
      {
        if(rem<=(r-p[i].a))
        {
          ans+=rem*p[i].b;
          rem=0;
        }
        else
        {
          ans+=(r-p[i].a)*p[i].b;
          rem-=(r-p[i].a);
        }
      }
      out.println(ans);
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

