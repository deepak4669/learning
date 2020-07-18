import java.util.*;
import java.io.*;
//267630EY
public class Main608B
{
  static PrintWriter out=new PrintWriter(System.out);

  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    
    String s=sc.next();
    String t=sc.next();
    int[] num1=new int[s.length()];
    int[] num2=new int[t.length()];
    int[] numz=new int[t.length()];
    int[] numo=new int[t.length()];
    for(int i=0;i<s.length();i++)
    {
      num1[i]=Integer.parseInt(s.substring(i,i+1));
      
    }
    for(int i=0;i<t.length();i++)
    {
      num2[i]=Integer.parseInt(t.substring(i,i+1));
      if(num2[i]==0)
      {
        numz[i]=0;
        numo[i]=1;
      }
      else
      {
        numz[i]=1;
        numo[i]=0;
      }
      
    }
    long[] sumz=new long[t.length()];
    long[] sumo=new long[t.length()];
    sumz[0]=numz[0];
    sumo[0]=numo[0];
      
    for(int i=1;i<t.length();i++)
    {
      sumz[i]=sumz[i-1]+(long)numz[i];
      sumo[i]=sumo[i-1]+(long)numo[i];
      
      
    }
    
//    for(int i=0;i<t.length();i++)
//    {
//      out.println(sumo[i]);
//    }
//    for(int i=0;i<t.length();i++)
//    {
//      out.println(sumz[i]);
//    }
    long ans=0;
    for(int i=0;i<s.length();i++)
    {
      if(num1[i]==0)
      {
        ans+=(i==0)?(sumz[t.length()-s.length()]):(sumz[i+t.length()-s.length()]-sumz[i-1]);
      }
      else
      {
        ans+=(i==0)?(sumo[t.length()-s.length()]):(sumo[i+t.length()-s.length()]-sumo[i-1]);
      }
    }
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

