import java.util.*;
import java.io.*;
import java.util.PriorityQueue;
//267630EY
public class Main1106D
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<Integer>[] graph;
  static boolean marked[];
  static Vector<Integer> sol;
  static void dfs()
  {
    marked[0]=true;
    //sol.add(s);
   // Vector<Integer> adj=new Vector<Integer>();
    //System.out.println(s);
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
    //MaxPQ pq=new MaxPQ(marked.length);
    pq.add(0);
    while(pq.size()!=0)
    {
      int f=pq.poll();
      sol.add(f);
      //System.out.println(f);
      for(int j:graph[f])
      {
        if(!marked[j])
        {
          pq.add(j);
          marked[j]=true;
        }
      }
    }
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    graph=(Vector<Integer>[]) new Vector[n];
    marked=new boolean[n];
    sol=new Vector<Integer>();
    for(int i=0;i<n;i++)
      graph[i]=new Vector<Integer>();
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      x--;
      y--;
      graph[x].add(y);
      graph[y].add(x);
    }
    dfs();
    for(int j:sol)
    {
      out.print((j+1)+" ");
    }
    out.flush();
        
        
    
    
    
    
  }
  static  class MaxPQ
  {
    public int[] pq;
    public int N;
    
    public MaxPQ(int n)
    {
      this.N=0;
      pq=new int[n+1];
      Arrays.fill(pq,10000000);
      
    }
    public void swim(int k)
    {
      while(k>1&&less(k,k/2))
      {
        exch(k,k/2);
        k/=2;
      }
    }
    public void exch(int i,int j)
    {
      int temp=pq[i];
      pq[i]=temp;
      pq[j]=temp;
    }
    public  boolean less(int i,int j)
    {
      return pq[i]<pq[j];
    }
    public void insert(int x)
    {
      pq[++N]=x;
      swim(N);
    }
    public void sink(int k)
    {
      while(2*k<=N)
      {
        int j=2*k;
        if(j<N&&less(j+1,j)) j++;
        if(!less(j,k)) break;
        exch(k,j);
        k=j;
      }
    }
    public int delMax()
    {
      int max=pq[1];
      exch(1,N--);
      sink(1);
      return max;
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

