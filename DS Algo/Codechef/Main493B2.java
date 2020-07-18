import java.util.*;
import java.io.*;
//267630EY
public class Main493B2
{
  static PrintWriter out=new PrintWriter(System.out);

        
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Vector<Integer> first=new Vector<Integer>();
    Vector<Integer> second=new Vector<Integer>();
    boolean last=true;
    long fi=0;
    long se=0;
    
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt();
      if(x<0)
      {
        second.add(-x);
        se+=(long)(-x);
      }
      else
      {
        first.add(x);
        fi+=(long)x;
      }
      if(i==n-1)
      {
        if(x<0)
          last=false;
      }
    }
    if(fi>se)
      out.println("first");
    else if(fi<se)
      out.println("second");
    else{
      boolean f=false;
      boolean s=false;
      for(int i=0;i<Math.min(first.size(),second.size());i++)
      {
        if(first.elementAt(i)>second.elementAt(i))
        {
          f=true;
          break;
        }
        if(second.elementAt(i)>first.elementAt(i))
        {
          s=true;
          break;
        }
      }
      if(f)
        out.println("first");
      else if(s)
        out.println("second");
      else
      {
        if(first.size()>second.size())
          out.println("first");
        else if(first.size()<second.size())
          out.println("second");
        else
        {
          if(last)
            out.println("first");
          else
            out.println("second");
        }
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