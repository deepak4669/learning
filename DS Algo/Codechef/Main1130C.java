import java.util.*;
import java.io.*;
//267630EY
public class Main1130C
{
  static PrintWriter out=new PrintWriter(System.out);
  static int n;
  static String[] s;
  static boolean marked[][];
  static class set
  {
    int x;
    int y;
    public set(int x,int y)
    {
      this.x=x;
      this.y=y;
    }
  }
  static boolean valid(int i,int j,int n)
  {
    return i>=1&&i<=n&&j>=1&&j<=n;
  }
  
  
  static void dfs(int i,int j,Vector<set> v,int n)
  {
    v.add(new set(i,j));
    marked[i][j]=true;
    //System.out.println(i+" "+j);
    Vector<set> adj=new Vector<set>();
    if(valid(i-1,j,n))
    {
      //System.out.println(i+" "+j);
      adj.add(new set(i-1,j));
    }
    if(valid(i+1,j,n))
    {
      //System.out.println(i+" "+j);
      adj.add(new set(i+1,j));
    }
    if(valid(i,j-1, n))
    {
      //System.out.println(i+" "+j);
      adj.add(new set(i,j-1));
    }
    if(valid(i,j+1,n))
    {
      //System.out.println(i+" "+j);
      adj.add(new set(i,j+1));
    }
    for(set g:adj)
    {
      if(!marked[g.x][g.y]&&s[g.x-1].charAt(g.y-1)=='0')
        dfs(g.x,g.y,v,n);
    }
  }
      
    
  
  
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    s=new String[n];
    for(int i=0;i<n;i++)
      s[i]=sc.next();
    marked=new boolean[n+1][n+1];
    Vector<set> v1=new Vector<set>();
    Vector<set> v2=new Vector<set>();
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
        marked[i][j]=false;
    }
    dfs(r1,c1,v1,n);
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
        marked[i][j]=false;
    }
    dfs(r2,c2,v2,n);
    int min=1000000000;
    //System.out.println(v1.size());
    //System.out.println(v2.size());
    for(set f:v1)
    {
      for(set h:v2)
      {
        int dis=(f.x-h.x)*(f.x-h.x)+(f.y-h.y)*(f.y-h.y);
        if(dis<min)
          min=dis;
      }
    }
    out.println(min);
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

