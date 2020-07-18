import java.util.*;
import java.io.*;
//267630EY
public class Main427C
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<Integer>[] graph;
  static boolean marked[];
  static Vector<Integer> dfsOrder;
  static Vector<Integer>[] cc;
  static int cnt=0;
  static int f=1000000007;
  static HashMap<Integer,Integer> map;
  static Vector<Integer>[] rev;
  
  static void dfsO(int s)
  {
    
    marked[s]=true;
    //System.out.println(s);
    for(int j:rev[s])
    {
     
      if(!marked[j])
      {
        //System.out.println(s+" "+j);
        dfsO(j);
      }
    }
    dfsOrder.add(s);
    
  }
  static void dfs(int s)
  {
    cc[cnt].add(s);
    marked[s]=true;
    for(int j:graph[s])
    {
      if(!marked[j])
        dfs(j);
    }
  }
    
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n+1];
    graph=(Vector<Integer>[]) new Vector[n+1];
    rev=(Vector<Integer>[]) new Vector[n+1];
    cc=(Vector<Integer>[]) new Vector[n+1];
    map=new HashMap<Integer,Integer>();
    for(int i=1;i<=n;i++)
    {
      a[i]=sc.nextInt();
      
    }
    for(int i=0;i<=n;i++)
    {
      graph[i]=new Vector<Integer>();
      cc[i]=new Vector<Integer>();
      rev[i]=new Vector<Integer>();
    }
    marked=new boolean[n+1];
    int m=sc.nextInt();
    while(m-->0)
    {
      int u=sc.nextInt();
      int v=sc.nextInt();
      graph[u].add(v);
      rev[v].add(u);
    }
    dfsOrder=new Vector<Integer>();
    for(int i=1;i<=n;i++)
    {
      if(!marked[i])
      {
        dfsO(i);
      }
    }
    //for(int j:dfsOrder)
    //  System.out.print(j+" ");
    //System.out.println();
    cnt=1;
    Arrays.fill(marked,false);
    for(int i=dfsOrder.size()-1;i>=0;i--)
    {
      int j=dfsOrder.elementAt(i);
      if(!marked[j])
      {
        dfs(j);
        cnt++;
      }
    }
    /*
    for(int j:dfsOrder)
    {
      if(!marked[j])
      {
        dfs(j);
        cnt++;
      }
    }
    */
    long res=0;
    long count=1;
    long res2=0;
    for(int i=1;i<=n;i++)
    {
      //System.out.println("S"+" "+cc[i].size());
      map=new HashMap<Integer,Integer>();
      int min=1000000005;
      for(int j=0;j<cc[i].size();j++)
      {
        //System.out.println(j);
        //System.out.println(cc[i].size());
        //System.out.print(cc[i].elementAt(j)+" ");
        cc[i].setElementAt(a[cc[i].elementAt(j)],j);
        min=Math.min(cc[i].elementAt(j),min);
        if(map.containsKey(cc[i].elementAt(j)))
          map.put(cc[i].elementAt(j),map.get(cc[i].elementAt(j))+1);
        else
          map.put(cc[i].elementAt(j),1);
      }
      //System.out.println();
      Collections.sort(cc[i]);
      if(cc[i].size()>=1)
      {
        int val=cc[i].elementAt(0);
        res+=(long)val;
        res2+=(long)min;
        //System.out.println(val+" ");
        count=(count*(map.get(val)))%f;
      }
      
      
    }
    assert res==res2;
    out.println(res+" "+count);
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