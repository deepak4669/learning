import java.util.*;
import java.io.*;
//267630EY
public class Maini2
{
  static PrintWriter out=new PrintWriter(System.out);

  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      HashMap<String,Integer> map0=new HashMap<String,Integer>();
      HashMap<String,Integer> map1=new HashMap<String,Integer>();
      HashMap<String,Integer> map=new HashMap<String,Integer>();
      int n=sc.nextInt();
      int count=0;
      for(int i=0;i<n;i++)
      {
        String s=sc.next();
        int x=sc.nextInt();
        if(map.containsKey(s))
        {
          if(x==0)
          {
            if(map0.containsKey(s))
              map0.put(s,map0.get(s)+1);
            else
              map0.put(s,1);
          }
          else
          {
            if(map1.containsKey(s))
              map1.put(s,map1.get(s)+1);
            else
              map1.put(s,1);
          }
          int cnt=0;
          if(map1.containsKey(s))
            cnt=map1.get(s);
          if(map0.containsKey(s))
            cnt=Math.max(cnt,map0.get(s));
          map.put(s,cnt);
        }
        else
        {
          if(x==0)
            map0.put(s,1);
          if(x==1)
            map1.put(s,1);
          map.put(s,1);
        }
          
          
      }
      for(String key:map.keySet())
      {
        count+=map.get(key);
      }
      out.println(count);
      out.flush();
    }
   
      
      
                
    
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

