import java.util.*;
import java.io.*;
//267630EY
public class Maini3
{
  static PrintWriter out=new PrintWriter(System.out);
  static class pair implements Comparable<pair>
  {
    int l;
    int r;
    public pair(int l,int r)
    {
      this.l=l;
      this.r=r;
    }
    public int compareTo(pair that)
    {
      if(this.l<that.l) return -1;
      else if(this.l>that.l) return +1;
      else if(this.r<that.r) return -1;
      else if(this.r>that.r) return +1;
      else return 0;
    }
  }
    

  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      HashMap<Integer,ArrayList<pair>> map=new HashMap<Integer,ArrayList<pair>>();
      for(int i=0;i<n;i++)
      {
        int l=sc.nextInt();
        int r=sc.nextInt();
        int v=sc.nextInt();
        pair p=new pair(l,r);
        if(map.containsKey(v))
        {
          ArrayList<pair> g=map.get(v);
          g.add(p);
          map.put(v,g);
        }
        else
        {
          ArrayList<pair> k=new ArrayList<pair>();
          k.add(p);
          map.put(v,k);
        }
      }
      boolean flag=true;
      for(Integer v: map.keySet())
      {
        ArrayList<pair> k=map.get(v);
        if(k.size()>2)
        {
          for(int i=0;i<k.size();i++)
          {
            for(int j=0;j<k.size();j++)
            {
              for(int o=0;o<k.size();o++)
              {
                if(i==j||j==o||i==o)
                  continue;
                int l1=k.get(i).l;
                int r1=k.get(i).r;
                int l2=k.get(j).l;
                int r2=k.get(j).r;
                int l3=k.get(o).l;
                int r3=k.get(o).r;
                int maxl=Math.max(l1,Math.max(l2,l3));
                int minr=Math.min(r1,Math.min(r2,r3));
                if(maxl<minr)
                {
                  flag=false;
                  break;
                }
              }
            }
          }
                    
                
                
              

          
          
          
        }
      }
      if(!flag)
        out.println("NO");
      else
        out.println("YES");
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

