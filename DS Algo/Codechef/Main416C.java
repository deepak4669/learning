import java.util.*;
import java.io.*;
//267630EY
public class Main416C
{
  static PrintWriter out=new PrintWriter(System.out);
  public static class pair implements Comparable<pair>
  {
    int c;
    int p;
    int id;
    public pair(int c,int p,int id)
    {
      this.c=c;
      this.p=p;
      this.id=id;
    }
    public int compareTo(pair that)
    {
      if(this.p<that.p) return -1;
      else if(this.p>that.p) return +1;
      else if(this.c>that.c) return -1;
      else if(this.c<that.c) return +1;
      else return 0;
    }
  }
  public static class pair2 implements Comparable<pair2>
  {
    int cap;
    int id;
    boolean avail;
    public pair2(int cap,int id)
    {
      this.cap=cap;
      this.id=id;
      this.avail=true;
    }
    public int compareTo(pair2 that)
    {
      if(this.cap<that.cap) return -1;
      else if(this.cap>that.cap) return +1;
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
      int c=sc.nextInt();
      int p=sc.nextInt();
      a[i]=new pair(c,p,i+1);
    }
    int k=sc.nextInt();
    pair2[] r=new pair2[k];
    
    
    for(int i=0;i<k;i++)
    {
      int x=sc.nextInt();
      r[i]=new pair2(x,i+1);
    }
    
    
    Arrays.sort(r);
    Arrays.sort(a);
    
    Vector<Vector<Integer>> ans=new Vector<Vector<Integer>>();
    int money=0;
    for(int i=a.length-1;i>=0;i--)
    {
      int req=a[i].c;
      boolean get=false;
      int table=k;
      for(int j=0;j<k;j++)
      {
        if(r[j].avail&&r[j].cap>=req)
        {
          get=true;
          table=r[j].id;
          r[j].avail=false;
          break;
          
        }
      }
      if(get)
      {
        Vector<Integer> v=new Vector<Integer>();
        v.add(a[i].id);
        v.add(table);
        ans.add(v);
        money+=a[i].p;
      }
    }
    out.println(ans.size()+" "+money);
    for(Vector<Integer> v:ans)
    {
      out.println(v.elementAt(0)+" "+v.elementAt(1));
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

