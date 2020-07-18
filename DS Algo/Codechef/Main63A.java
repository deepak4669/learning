import java.util.*;
import java.io.*;
//267630EY
public class Main63A
{
  static PrintWriter out=new PrintWriter(System.out);
  public static class pair implements Comparable<pair>
  {
    int id;
    String name;
    int status;
    public pair(int id,String name,String status)
    {
      this.id=id;
      this.name=name;
      if(status.equals("woman"))
        this.status=1;
      if(status.equals("rat"))
        this.status=0;
      if(status.equals("man"))
        this.status=2;
      if(status.equals("captain"))
        this.status=3;
      if(status.equals("child"))
        this.status=1;
    }
    public int compareTo(pair that)
    {
      if(this.status<that.status) return -1;
      else if(this.status>that.status) return +1;
      else if(this.id<that.id) return -1;
      else if(this.id>that.id) return +1;
      else return 0;
    }
  }
         

        
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    pair[] a=new pair[n];
    for(int i=0;i<n;i++)
    {
      String s=sc.next();
      String t=sc.next();
      a[i]=new pair(i,s,t);
    }
    Arrays.sort(a);
    for(int i=0;i<n;i++)
    {
      out.println(a[i].name);
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

