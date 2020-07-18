import java.util.*;
import java.io.*;
//267630EY
public class Main1030B
{
  static PrintWriter out=new PrintWriter(System.out);
  public static  boolean check(int n,int d,int x,int y)
  {
    boolean m1=(x+y-d)>=0;
    boolean m2=(x-y+d)>=0;
    boolean m3=(x-y-d)<=0;
    boolean m4=(((d>=2*n)&&(x+y+d-2*n)>=0)||((d<=2*n)&&(x+y+d-2*n)<=0));
//    System.out.println(m1+" "+m2+" "+m3+" "+m4);
    
//    System.out.println((x+y+d-2*n));
      
    if(m1&&m2&&m3&&m4)
      return true;
    return false;
  }

  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int d=sc.nextInt();
    int m=sc.nextInt();
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      if(check(n,d,x,y))
        out.println("YES");
      else
        out.println("NO");
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

