import java.util.*;
import java.io.*;
//267630EY
public class Main216B2
{
  static PrintWriter out=new PrintWriter(System.out);
  static public class UF
  {
    private int[] id;
    private int[] sz;
    
    public UF(int N)
    {
      id=new int[N];
      sz=new int[N];
      Arrays.fill(sz,1);
      for(int i=0;i<N;i++)
        id[i]=i;
    }
    
    public int find(int p)
    {
      int root=p;
      while(root!=id[root])
      {
        root=id[root];
      }
      while(p!=root)
      {
        int newp=id[p];
        id[p]=root;
        p=newp;
      }
      return root;
    }
    public int find_recursive(int p)
    {
      if(p!=id[p])
      {
        id[p]=find(id[p]);
      }
      return id[p];
    }
    public boolean connected(int p,int q)
    {
      return find(p)==find(q);
    }
    public void union(int p,int q)
    {
      int i=find(p);
      int j=find(q);
      if(i==j) return;
      if(sz[i]>sz[j]) { id[i]=j; sz[i]+=sz[j];}
      else{
        id[j]=id[i]; sz[j]+=sz[i];
      }
    }
  }
  
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    UF uf=new UF(n);
    int ans=0;
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      x--;
      y--;
      int p=uf.find(x);
      int q=uf.find(y);
      if(p==q)
      {
        if(uf.sz[q]%2!=0)
          ans++;
      }
      else
        uf.union(p,q);
      
    }
    
    if((n-ans)%2!=0)
      ans++;
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

