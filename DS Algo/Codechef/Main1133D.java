import java.util.*;
import java.io.*;
//267630EY
public class Main1133D
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<Integer>[] g;
  static Vector<set> s;
  static boolean marked[];
  static class set
  {
    int a;
    int b;
    public set(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
  }
  static void bfs(int d)
  {
    LinkedList<Integer> queue=new LinkedList<Integer>();
    queue.add(d);
    marked[d]=true;
    while(!(queue.size()==0))
    {
      int p=queue.pollFirst();
      //System.out.println(p);
      for(int j:g[p])
      {
        
        if(!marked[j])
        {
          //System.out.println(p+" "+j);
          
          set ad=new set(p,j);
          s.add(ad);
          marked[j]=true;
          queue.add(j);
        }
      }
    }
  }
      
    
  
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    marked=new boolean[n];
    g=(Vector<Integer>[]) new Vector[n];
    for(int i=0;i<n;i++)
      g[i]=new Vector<Integer>();
    int max=0;
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      x--;
      y--;
      g[x].add(y);
      g[y].add(x);
      if(g[x].size()>max) max=x;
      if(g[y].size()>max) max=y;
    }
    s=new Vector<set>();
    bfs(max);
    //System.out.println(s.size());
    for(int i=0;i<s.size();i++)
    {
      out.println((s.elementAt(i).a+1)+" "+(s.elementAt(i).b+1));
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